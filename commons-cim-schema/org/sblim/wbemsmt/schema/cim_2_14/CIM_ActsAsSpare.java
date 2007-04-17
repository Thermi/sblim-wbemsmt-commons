/** 
 * CIM_ActsAsSpare.java
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
 * Description:  Deprecated. IsSpare and Spared The ActsAsSpare association indicated which
 * elements can spare or replace the other aggregated elements. The fact that a
 * spare can operate in "hot standby" mode is specified on an element by element
 * basis. The use of this class is being deprecated in lieu of using the IsSpare
 * relationship.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;


/**
 *  Deprecated. IsSpare and Spared The ActsAsSpare association indicated which
 * elements can spare or replace the other aggregated elements. The fact that a
 * spare can operate in "hot standby" mode is specified on an element by element
 * basis. The use of this class is being deprecated in lieu of using the IsSpare
 * relationship.
 */
public class CIM_ActsAsSpare  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_ActsAsSpare"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.13.0";
	public final static String CIM_PROPERTY_CIM_SPAREGROUP = "Group"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT = "Spare"; //$NON-NLS-1$
	
	
	/**
	*	HotStandby is a boolean indicating that the spare is operating as a hot standby.
	*/
	public final static String CIM_PROPERTY_HOTSTANDBY = "HotStandby"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HOTSTANDBY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SPAREGROUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOTSTANDBY, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SPAREGROUP, new CIMValue(null, new CIMDataType(CIM_SpareGroup.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT, new CIMValue(null, new CIMDataType(CIM_ManagedSystemElement.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
		};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ActsAsSpare() {

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
	public CIM_ActsAsSpare(Vector keyProperties){ 
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
	public CIM_ActsAsSpare(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ActsAsSpare)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ActsAsSpare)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ActsAsSpare)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ActsAsSpare)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ActsAsSpare)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ActsAsSpare)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ActsAsSpare)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ActsAsSpare)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ActsAsSpare)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ActsAsSpare)object).cimObjectPath)) {
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
	
	// Attribute HotStandby
	
	public Boolean get_HotStandby() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HotStandby(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY + " could not be found");
    		
		} else if (!CIM_ActsAsSpareHelper.isValid_HotStandby(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_HOTSTANDBY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SpareGroup
	
	public CIMObjectPath get_CIM_SpareGroup() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SpareGroup.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP + " is not of expected type CIM_SpareGroup.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SpareGroup(CIM_SpareGroup newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP + " could not be found");
    		
		} else if (!CIM_ActsAsSpareHelper.isValid_CIM_SpareGroup(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SpareGroup.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_SPAREGROUP + " is not of expected type CIM_SpareGroup.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SpareGroup.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedSystemElement
	
	public CIMObjectPath get_CIM_ManagedSystemElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " is not of expected type CIM_ManagedSystemElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedSystemElement(CIM_ManagedSystemElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " could not be found");
    		
		} else if (!CIM_ActsAsSpareHelper.isValid_CIM_ManagedSystemElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActsAsSpare.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " is not of expected type CIM_ManagedSystemElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedSystemElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}