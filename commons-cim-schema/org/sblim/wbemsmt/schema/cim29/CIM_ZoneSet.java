/** 
 * CIM_ZoneSet.java
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
 * Description: A ZoneSet is a group of zones that are managed collectively by the same domain. The managing domain is indicated by the HostedCollection association. For example, for Fibre Channel, this would indicate a set of zones that are part of a fabric. The zones are only under zone enforcement by the fabric, if the zoneset is set to active.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ZoneSet extends CIM_ConnectivityCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_ZoneSet";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Indicates that this ZoneSet is currently active (i.e. under enforcement of a fabric). This property can be used to distinguish between a ZoneSet that is currently active and a snapshot of a ZoneSet (with the same InstanceName) that is for "offline" editing.
	*/
	public final static String CIM_PROPERTY_ACTIVE = "Active"; //$NON-NLS-1$
	/**
	*	A user-friendly name for the ZoneSet that is unique within the AdminDomain.
	*/
	public final static String CIM_PROPERTY_ELEMENTNAME = "ElementName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTNAME);
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVE)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTNAME)){
				continue;
			}
			
			CIM_ZoneSet.CIM_PropertyNameList.add(CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVE)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTNAME)){
				continue;
			}
			
			CIM_ZoneSet.CIM_PropertyList.add(CIM_ConnectivityCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ConnectivityCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_ConnectivityCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConnectivityCollection.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ZoneSet() {

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
	public CIM_ZoneSet(Vector keyProperties){ 
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
	public CIM_ZoneSet(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Active = this.cimInstance.getProperty(CIM_PROPERTY_ACTIVE);
		
		if (CIMProperty_Active == null || CIMProperty_Active.getValue().isEmpty() || CIMProperty_Active.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ACTIVE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ElementName = this.cimInstance.getProperty(CIM_PROPERTY_ELEMENTNAME);
		
		if (CIMProperty_ElementName == null || CIMProperty_ElementName.getValue().isEmpty() || CIMProperty_ElementName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ELEMENTNAME, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_ZoneSet)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ZoneSet)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ZoneSet)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ZoneSet)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ZoneSet)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ZoneSet)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ZoneSet)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ZoneSet)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ZoneSet)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ZoneSet)object).cimObjectPath)) {
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
	
	// Attribute Active
	
	public Boolean get_Active() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneSet.CIM_PROPERTY_ACTIVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneSet.CIM_PROPERTY_ACTIVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneSet.CIM_PROPERTY_ACTIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Active(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneSet.CIM_PROPERTY_ACTIVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneSet.CIM_PROPERTY_ACTIVE + " could not be found");
    		
		} else if (!CIM_ZoneSetHelper.isValid_Active(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneSet.CIM_PROPERTY_ACTIVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneSet.CIM_PROPERTY_ACTIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElementName
	
	public String get_ElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (!CIM_ZoneSetHelper.isValid_ElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneSet.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
