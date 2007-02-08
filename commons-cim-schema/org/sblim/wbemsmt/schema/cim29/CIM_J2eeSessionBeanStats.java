/** 
 * CIM_J2eeSessionBeanStats.java
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
 * Description: The J2eeSessionBeanStats class is a base class that defines the performance statistics that are provided by both stateful and stateless session beans.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_J2eeSessionBeanStats extends CIM_J2eeEJBStats  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeSessionBeanStats";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The number of bean instances in the method-ready state.
	*/
	public final static String CIM_PROPERTY_METHODREADYCOUNT = "MethodReadyCount"; //$NON-NLS-1$
	/**
	*	The highest number of bean instances in the method-ready state since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_METHODREADYHIGHWATERMARK = "MethodReadyHighWaterMark"; //$NON-NLS-1$
	/**
	*	The lowest number of bean instances in the method-ready state since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_METHODREADYLOWWATERMARK = "MethodReadyLowWaterMark"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_METHODREADYCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_METHODREADYHIGHWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_METHODREADYLOWWATERMARK);
				
		for (int i = 0; i < CIM_J2eeEJBStats.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeEJBStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_METHODREADYCOUNT)||
				((String)CIM_J2eeEJBStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_METHODREADYHIGHWATERMARK)||
				((String)CIM_J2eeEJBStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_METHODREADYLOWWATERMARK)){
				continue;
			}
			
			CIM_J2eeSessionBeanStats.CIM_PropertyNameList.add(CIM_J2eeEJBStats.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METHODREADYCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METHODREADYHIGHWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METHODREADYLOWWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_J2eeEJBStats.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeEJBStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_METHODREADYCOUNT)||
				((CIMProperty)CIM_J2eeEJBStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_METHODREADYHIGHWATERMARK)||
				((CIMProperty)CIM_J2eeEJBStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_METHODREADYLOWWATERMARK)){
				continue;
			}
			
			CIM_J2eeSessionBeanStats.CIM_PropertyList.add(CIM_J2eeEJBStats.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_J2eeEJBStats.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeEJBStats.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_J2eeEJBStats.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeSessionBeanStats() {

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
	public CIM_J2eeSessionBeanStats(Vector keyProperties){ 
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
	public CIM_J2eeSessionBeanStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeSessionBeanStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeSessionBeanStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeSessionBeanStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeSessionBeanStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeSessionBeanStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeSessionBeanStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeSessionBeanStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeSessionBeanStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeSessionBeanStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeSessionBeanStats)object).cimObjectPath)) {
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
	
	// Attribute MethodReadyCount
	
	public UnsignedInt64 get_MethodReadyCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MethodReadyCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT + " could not be found");
    		
		} else if (!CIM_J2eeSessionBeanStatsHelper.isValid_MethodReadyCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MethodReadyHighWaterMark
	
	public UnsignedInt64 get_MethodReadyHighWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MethodReadyHighWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeSessionBeanStatsHelper.isValid_MethodReadyHighWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MethodReadyLowWaterMark
	
	public UnsignedInt64 get_MethodReadyLowWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MethodReadyLowWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeSessionBeanStatsHelper.isValid_MethodReadyLowWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeSessionBeanStats.CIM_PROPERTY_METHODREADYLOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
