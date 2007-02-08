/** 
 * CIM_DatabaseResourceStatistics.java
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
 * Description: The CIM_DatabaseServiceStatistics class contains the current statistics for a database resource. This class maps to the database and server limited resource tables in the SNMP RDBMS MIB as defined in RFC 1697.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DatabaseResourceStatistics extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_DatabaseResourceStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The current value of a limited database resource.
	*/
	public final static String CIM_PROPERTY_CURRENT = "Current"; //$NON-NLS-1$
	/**
	*	The number of times that the system wanted to exceed the database resource limit measured from the time when the first service was started for the database.
	*/
	public final static String CIM_PROPERTY_FAILURES = "Failures"; //$NON-NLS-1$
	/**
	*	The number of database resources used measured from the time when the first service was started for the database. Other external factors, such as an explicit reset of the statistics may cause this measurement to begin at a later point in time.
	*/
	public final static String CIM_PROPERTY_HIGHWATER = "Highwater"; //$NON-NLS-1$
	/**
	*	The maximum value that the database resource can attain.
	*/
	public final static String CIM_PROPERTY_LIMIT = "Limit"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_FAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_HIGHWATER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LIMIT);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENT)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HIGHWATER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LIMIT)){
				continue;
			}
			
			CIM_DatabaseResourceStatistics.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HIGHWATER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LIMIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENT)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HIGHWATER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LIMIT)){
				continue;
			}
			
			CIM_DatabaseResourceStatistics.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
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
	public CIM_DatabaseResourceStatistics() {

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
	public CIM_DatabaseResourceStatistics(Vector keyProperties){ 
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
	public CIM_DatabaseResourceStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DatabaseResourceStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DatabaseResourceStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DatabaseResourceStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DatabaseResourceStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DatabaseResourceStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DatabaseResourceStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DatabaseResourceStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DatabaseResourceStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DatabaseResourceStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DatabaseResourceStatistics)object).cimObjectPath)) {
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
	
	// Attribute Current
	
	public UnsignedInt64 get_Current() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Current(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT + " could not be found");
    		
		} else if (!CIM_DatabaseResourceStatisticsHelper.isValid_Current(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_CURRENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Failures
	
	public UnsignedInt32 get_Failures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Failures(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES + " could not be found");
    		
		} else if (!CIM_DatabaseResourceStatisticsHelper.isValid_Failures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_FAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Highwater
	
	public UnsignedInt64 get_Highwater() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Highwater(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER + " could not be found");
    		
		} else if (!CIM_DatabaseResourceStatisticsHelper.isValid_Highwater(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_HIGHWATER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Limit
	
	public UnsignedInt64 get_Limit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Limit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT + " could not be found");
    		
		} else if (!CIM_DatabaseResourceStatisticsHelper.isValid_Limit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseResourceStatistics.CIM_PROPERTY_LIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
