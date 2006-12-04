/** 
 * CIM_FCPortRateStatistics.java
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
 * Description: FCPortRateStatistics is the performance rates for the FCPort. The Frame and Byte rates report the average of a counter change per second and the maximum counter change per second over a specified interval, the SampleInterval, which is defined in the parent class, StatisticalData.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_FCPortRateStatistics extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_FCPortRateStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	MaxRxFrameRate is the maximum receive frame rate achieved.
	*/
	public final static String CIM_PROPERTY_MAXRXFRAMERATE = "MaxRxFrameRate"; //$NON-NLS-1$
	/**
	*	MaxTxFrameRate is the maximum transmit frame rate achieved.
	*/
	public final static String CIM_PROPERTY_MAXTXFRAMERATE = "MaxTxFrameRate"; //$NON-NLS-1$
	/**
	*	PeakRxRate is the maximum receive byte rate achieved.
	*/
	public final static String CIM_PROPERTY_PEAKRXRATE = "PeakRxRate"; //$NON-NLS-1$
	/**
	*	PeakTxRate is the maximum transmit byte rate achieved.
	*/
	public final static String CIM_PROPERTY_PEAKTXRATE = "PeakTxRate"; //$NON-NLS-1$
	/**
	*	RxFrameRate is the instantaneous receive frame rate.
	*/
	public final static String CIM_PROPERTY_RXFRAMERATE = "RxFrameRate"; //$NON-NLS-1$
	/**
	*	RxRate is the instantaneous receive byte rate.
	*/
	public final static String CIM_PROPERTY_RXRATE = "RxRate"; //$NON-NLS-1$
	/**
	*	TxFrameRate is the instantaneous transmit frame rate.
	*/
	public final static String CIM_PROPERTY_TXFRAMERATE = "TxFrameRate"; //$NON-NLS-1$
	/**
	*	TxRate is the instantaneous transmit byte rate.
	*/
	public final static String CIM_PROPERTY_TXRATE = "TxRate"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXRXFRAMERATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXTXFRAMERATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PEAKRXRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PEAKTXRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RXFRAMERATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RXRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TXFRAMERATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TXRATE);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXRXFRAMERATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXTXFRAMERATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PEAKRXRATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PEAKTXRATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RXFRAMERATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RXRATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TXFRAMERATE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TXRATE)){
				continue;
			}
			
			CIM_FCPortRateStatistics.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXRXFRAMERATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXTXFRAMERATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PEAKRXRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PEAKTXRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RXFRAMERATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RXRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TXFRAMERATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TXRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXRXFRAMERATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXTXFRAMERATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PEAKRXRATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PEAKTXRATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RXFRAMERATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RXRATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TXFRAMERATE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TXRATE)){
				continue;
			}
			
			CIM_FCPortRateStatistics.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
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
	public CIM_FCPortRateStatistics() {

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
	public CIM_FCPortRateStatistics(Vector keyProperties){ 
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
	public CIM_FCPortRateStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FCPortRateStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FCPortRateStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FCPortRateStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FCPortRateStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FCPortRateStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FCPortRateStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FCPortRateStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FCPortRateStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FCPortRateStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FCPortRateStatistics)object).cimObjectPath)) {
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
	
	// Attribute MaxRxFrameRate
	
	public UnsignedInt64 get_MaxRxFrameRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxRxFrameRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_MaxRxFrameRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXRXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxTxFrameRate
	
	public UnsignedInt64 get_MaxTxFrameRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxTxFrameRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_MaxTxFrameRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_MAXTXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PeakRxRate
	
	public UnsignedInt64 get_PeakRxRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PeakRxRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_PeakRxRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKRXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PeakTxRate
	
	public UnsignedInt64 get_PeakTxRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PeakTxRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_PeakTxRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_PEAKTXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RxFrameRate
	
	public UnsignedInt64 get_RxFrameRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RxFrameRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_RxFrameRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RxRate
	
	public UnsignedInt64 get_RxRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RxRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_RxRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_RXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TxFrameRate
	
	public UnsignedInt64 get_TxFrameRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TxFrameRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_TxFrameRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXFRAMERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TxRate
	
	public UnsignedInt64 get_TxRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TxRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE + " could not be found");
    		
		} else if (!CIM_FCPortRateStatisticsHelper.isValid_TxRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortRateStatistics.CIM_PROPERTY_TXRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
