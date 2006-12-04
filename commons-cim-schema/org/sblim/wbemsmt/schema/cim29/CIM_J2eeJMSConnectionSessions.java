/** 
 * CIM_J2eeJMSConnectionSessions.java
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
 * Description: CIM_J2eeJMSConnectionSessions identifies the JMS session statistics that are associated with the referencing JMS connection statistics.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_J2eeJMSConnectionSessions extends CIM_RelatedStatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeJMSConnectionSessions";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS = "Stats"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS = "RelatedStats"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS);
				
		for (int i = 0; i < CIM_RelatedStatisticalData.CIM_PropertyNameList.size(); i++) {
			
			CIM_J2eeJMSConnectionSessions.CIM_PropertyNameList.add(CIM_RelatedStatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS, new CIMValue(null, new CIMDataType(CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS, new CIMValue(null, new CIMDataType(CIM_J2eeJMSSessionStats.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_RelatedStatisticalData.CIM_PropertyList.size(); i++) {
			
			CIM_J2eeJMSConnectionSessions.CIM_PropertyList.add(CIM_RelatedStatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_RelatedStatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_RelatedStatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_RelatedStatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeJMSConnectionSessions() {

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
	public CIM_J2eeJMSConnectionSessions(Vector keyProperties){ 
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
	public CIM_J2eeJMSConnectionSessions(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeJMSConnectionSessions)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeJMSConnectionSessions)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeJMSConnectionSessions)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeJMSConnectionSessions)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeJMSConnectionSessions)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeJMSConnectionSessions)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeJMSConnectionSessions)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeJMSConnectionSessions)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeJMSConnectionSessions)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeJMSConnectionSessions)object).cimObjectPath)) {
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
	
	// Attribute CIM_J2eeJMSConnectionStats
	
	public CIMObjectPath get_CIM_J2eeJMSConnectionStats() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS + " is not of expected type CIM_J2eeJMSConnectionStats.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_J2eeJMSConnectionStats(CIM_J2eeJMSConnectionStats newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS + " could not be found");
    		
		} else if (!CIM_J2eeJMSConnectionSessionsHelper.isValid_CIM_J2eeJMSConnectionStats(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSCONNECTIONSTATS + " is not of expected type CIM_J2eeJMSConnectionStats.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_J2eeJMSSessionStats
	
	public CIMObjectPath get_CIM_J2eeJMSSessionStats() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJMSSessionStats.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS + " is not of expected type CIM_J2eeJMSSessionStats.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_J2eeJMSSessionStats(CIM_J2eeJMSSessionStats newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS + " could not be found");
    		
		} else if (!CIM_J2eeJMSConnectionSessionsHelper.isValid_CIM_J2eeJMSSessionStats(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJMSSessionStats.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSConnectionSessions.CIM_PROPERTY_CIM_J2EEJMSSESSIONSTATS + " is not of expected type CIM_J2eeJMSSessionStats.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_J2eeJMSSessionStats.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
