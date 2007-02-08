/** 
 * CIM_J2eeJTAStats.java
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
 * Description: The CIM_J2eeJTAStats class defines the performance statistics that are provided by a JTA resource.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_J2eeJTAStats extends CIM_J2eeStatistic  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeJTAStats";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The number of active transactions.
	*/
	public final static String CIM_PROPERTY_ACTIVECOUNT = "ActiveCount"; //$NON-NLS-1$
	/**
	*	The number of committed transactions.
	*/
	public final static String CIM_PROPERTY_COMMITTEDCOUNT = "CommittedCount"; //$NON-NLS-1$
	/**
	*	The number of rolled-back transactions.
	*/
	public final static String CIM_PROPERTY_ROLLEDBACKCOUNT = "RolledbackCount"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMITTEDCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROLLEDBACKCOUNT);
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVECOUNT)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMITTEDCOUNT)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROLLEDBACKCOUNT)){
				continue;
			}
			
			CIM_J2eeJTAStats.CIM_PropertyNameList.add(CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMITTEDCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROLLEDBACKCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVECOUNT)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMITTEDCOUNT)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROLLEDBACKCOUNT)){
				continue;
			}
			
			CIM_J2eeJTAStats.CIM_PropertyList.add(CIM_J2eeStatistic.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_J2eeStatistic.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeStatistic.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
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
	public CIM_J2eeJTAStats() {

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
	public CIM_J2eeJTAStats(Vector keyProperties){ 
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
	public CIM_J2eeJTAStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeJTAStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeJTAStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeJTAStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeJTAStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeJTAStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeJTAStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeJTAStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeJTAStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeJTAStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeJTAStats)object).cimObjectPath)) {
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
	
	// Attribute ActiveCount
	
	public UnsignedInt64 get_ActiveCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActiveCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJTAStatsHelper.isValid_ActiveCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ACTIVECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CommittedCount
	
	public UnsignedInt64 get_CommittedCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommittedCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJTAStatsHelper.isValid_CommittedCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_COMMITTEDCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RolledbackCount
	
	public UnsignedInt64 get_RolledbackCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RolledbackCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJTAStatsHelper.isValid_RolledbackCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJTAStats.CIM_PROPERTY_ROLLEDBACKCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
