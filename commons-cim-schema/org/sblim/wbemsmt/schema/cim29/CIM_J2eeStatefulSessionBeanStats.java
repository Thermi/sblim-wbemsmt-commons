/** 
 * CIM_J2eeStatefulSessionBeanStats.java
 *
 * � Copyright IBM Corp. 2005
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
 * Description: The J2eeStatefulSessionBeanStats class defines the performance statistics that are provided by a stateful session bean.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_J2eeStatefulSessionBeanStats extends CIM_J2eeSessionBeanStats  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeStatefulSessionBeanStats";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The number of bean instances in a passive state.
	*/
	public final static String CIM_PROPERTY_PASSIVECOUNT = "PassiveCount"; //$NON-NLS-1$
	/**
	*	The highest number of bean instances in the passive state since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_PASSIVEHIGHWATERMARK = "PassiveHighWaterMark"; //$NON-NLS-1$
	/**
	*	The lowest number of bean instances in the passive state since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_PASSIVELOWWATERMARK = "PassiveLowWaterMark"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PASSIVECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PASSIVEHIGHWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_PASSIVELOWWATERMARK);
				
		for (int i = 0; i < CIM_J2eeSessionBeanStats.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeSessionBeanStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PASSIVECOUNT)||
				((String)CIM_J2eeSessionBeanStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PASSIVEHIGHWATERMARK)||
				((String)CIM_J2eeSessionBeanStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PASSIVELOWWATERMARK)){
				continue;
			}
			
			CIM_J2eeStatefulSessionBeanStats.CIM_PropertyNameList.add(CIM_J2eeSessionBeanStats.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PASSIVECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PASSIVEHIGHWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PASSIVELOWWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_J2eeSessionBeanStats.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeSessionBeanStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PASSIVECOUNT)||
				((CIMProperty)CIM_J2eeSessionBeanStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PASSIVEHIGHWATERMARK)||
				((CIMProperty)CIM_J2eeSessionBeanStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PASSIVELOWWATERMARK)){
				continue;
			}
			
			CIM_J2eeStatefulSessionBeanStats.CIM_PropertyList.add(CIM_J2eeSessionBeanStats.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_J2eeSessionBeanStats.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeSessionBeanStats.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_J2eeSessionBeanStats.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeStatefulSessionBeanStats() {

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
	public CIM_J2eeStatefulSessionBeanStats(Vector keyProperties){ 
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
	public CIM_J2eeStatefulSessionBeanStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeStatefulSessionBeanStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeStatefulSessionBeanStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeStatefulSessionBeanStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeStatefulSessionBeanStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeStatefulSessionBeanStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeStatefulSessionBeanStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeStatefulSessionBeanStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeStatefulSessionBeanStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeStatefulSessionBeanStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeStatefulSessionBeanStats)object).cimObjectPath)) {
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
	
	// Attribute PassiveCount
	
	public UnsignedInt64 get_PassiveCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PassiveCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeStatefulSessionBeanStatsHelper.isValid_PassiveCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PassiveHighWaterMark
	
	public UnsignedInt64 get_PassiveHighWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PassiveHighWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeStatefulSessionBeanStatsHelper.isValid_PassiveHighWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PassiveLowWaterMark
	
	public UnsignedInt64 get_PassiveLowWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PassiveLowWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeStatefulSessionBeanStatsHelper.isValid_PassiveLowWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeStatefulSessionBeanStats.CIM_PROPERTY_PASSIVELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
