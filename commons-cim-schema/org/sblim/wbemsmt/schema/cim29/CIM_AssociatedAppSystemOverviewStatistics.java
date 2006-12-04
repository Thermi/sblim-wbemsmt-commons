/** 
 * CIM_AssociatedAppSystemOverviewStatistics.java
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
 * Description: The link to the runtime overview statistics of an application system.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AssociatedAppSystemOverviewStatistics extends CIM_ElementStatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_AssociatedAppSystemOverviewStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_APPLICATIONSYSTEM = "ManagedElement"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW = "Stats"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW);
				
		for (int i = 0; i < CIM_ElementStatisticalData.CIM_PropertyNameList.size(); i++) {
			
			CIM_AssociatedAppSystemOverviewStatistics.CIM_PropertyNameList.add(CIM_ElementStatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_APPLICATIONSYSTEM, new CIMValue(null, new CIMDataType(CIM_ApplicationSystem.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW, new CIMValue(null, new CIMDataType(CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ElementStatisticalData.CIM_PropertyList.size(); i++) {
			
			CIM_AssociatedAppSystemOverviewStatistics.CIM_PropertyList.add(CIM_ElementStatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ElementStatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_ElementStatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ElementStatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AssociatedAppSystemOverviewStatistics() {

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
	public CIM_AssociatedAppSystemOverviewStatistics(Vector keyProperties){ 
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
	public CIM_AssociatedAppSystemOverviewStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AssociatedAppSystemOverviewStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AssociatedAppSystemOverviewStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AssociatedAppSystemOverviewStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AssociatedAppSystemOverviewStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AssociatedAppSystemOverviewStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AssociatedAppSystemOverviewStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AssociatedAppSystemOverviewStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AssociatedAppSystemOverviewStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AssociatedAppSystemOverviewStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AssociatedAppSystemOverviewStatistics)object).cimObjectPath)) {
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
	
	// Attribute CIM_ApplicationSystem
	
	public CIMObjectPath get_CIM_ApplicationSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " is not of expected type CIM_ApplicationSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ApplicationSystem(CIM_ApplicationSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " could not be found");
    		
		} else if (!CIM_AssociatedAppSystemOverviewStatisticsHelper.isValid_CIM_ApplicationSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " is not of expected type CIM_ApplicationSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ApplicationSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_StatisticalRuntimeOverview
	
	public CIMObjectPath get_CIM_StatisticalRuntimeOverview() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW + " is not of expected type CIM_StatisticalRuntimeOverview.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StatisticalRuntimeOverview(CIM_StatisticalRuntimeOverview newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW + " could not be found");
    		
		} else if (!CIM_AssociatedAppSystemOverviewStatisticsHelper.isValid_CIM_StatisticalRuntimeOverview(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedAppSystemOverviewStatistics.CIM_PROPERTY_CIM_STATISTICALRUNTIMEOVERVIEW + " is not of expected type CIM_StatisticalRuntimeOverview.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
