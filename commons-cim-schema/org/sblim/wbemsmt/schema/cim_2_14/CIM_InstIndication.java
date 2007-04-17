/** 
 * CIM_InstIndication.java
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
 * Description:  CIM_InstIndication is an abstract superclass describing changes to instances.
 * Subclasses represent specific types of change notifications, such as instance
 * creation, deletion and modification.
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
 *  CIM_InstIndication is an abstract superclass describing changes to instances.
 * Subclasses represent specific types of change notifications, such as instance
 * creation, deletion and modification.
 */
public class CIM_InstIndication extends CIM_Indication  {
	
	public final static String CIM_CLASS_NAME = "CIM_InstIndication"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	
	
	/**
	*	A copy of the instance that changed to generate the Indication. SourceInstance contains the current values of the properties selected by the Indication Filter's Query. In the case of CIM_InstDeletion, the property values are copied before the instance is deleted.
	*/
	public final static String CIM_PROPERTY_SOURCEINSTANCE = "SourceInstance"; //$NON-NLS-1$
	/**
	*	The host name or IP address of the SourceInstance.
	*/
	public final static String CIM_PROPERTY_SOURCEINSTANCEHOST = "SourceInstanceHost"; //$NON-NLS-1$
	/**
	*	The Model Path of the SourceInstance. The following format MUST be used to encode the Model Path: 
<NamespacePath>:<ClassName>.<Prop1>="<Value1>", 
<Prop2>="<Value2>", ...
	*/
	public final static String CIM_PROPERTY_SOURCEINSTANCEMODELPATH = "SourceInstanceModelPath"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_SOURCEINSTANCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOURCEINSTANCEHOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOURCEINSTANCEMODELPATH);
				
		for (int i = 0; i < CIM_Indication.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Indication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOURCEINSTANCE)||
				((String)CIM_Indication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOURCEINSTANCEHOST)||
				((String)CIM_Indication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOURCEINSTANCEMODELPATH)){
				continue;
			}
			
			CIM_InstIndication.CIM_PropertyNameList.add(CIM_Indication.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOURCEINSTANCE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOURCEINSTANCEHOST, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOURCEINSTANCEMODELPATH, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Indication.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Indication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOURCEINSTANCE)||
				((CIMProperty)CIM_Indication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOURCEINSTANCEHOST)||
				((CIMProperty)CIM_Indication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOURCEINSTANCEMODELPATH)){
				continue;
			}
			
			CIM_InstIndication.CIM_PropertyList.add(CIM_Indication.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Indication.Java_Package_List.size(); i++) {
			if (((String)CIM_Indication.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Indication.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_InstIndication() {

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
	public CIM_InstIndication(Vector keyProperties){ 
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
	public CIM_InstIndication(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_SourceInstance = this.cimInstance.getProperty(CIM_PROPERTY_SOURCEINSTANCE);
		
		if (CIMProperty_SourceInstance == null || CIMProperty_SourceInstance.getValue().isEmpty() || CIMProperty_SourceInstance.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SOURCEINSTANCE, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_InstIndication)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_InstIndication)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_InstIndication)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_InstIndication)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_InstIndication)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_InstIndication)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_InstIndication)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_InstIndication)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_InstIndication)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_InstIndication)object).cimObjectPath)) {
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
	
	// Attribute SourceInstance
	
	public String get_SourceInstance() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SourceInstance(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE + " could not be found");
    		
		} else if (!CIM_InstIndicationHelper.isValid_SourceInstance(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SourceInstanceHost
	
	public String get_SourceInstanceHost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SourceInstanceHost(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST + " could not be found");
    		
		} else if (!CIM_InstIndicationHelper.isValid_SourceInstanceHost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEHOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SourceInstanceModelPath
	
	public String get_SourceInstanceModelPath() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SourceInstanceModelPath(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH + " could not be found");
    		
		} else if (!CIM_InstIndicationHelper.isValid_SourceInstanceModelPath(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstIndication.CIM_PROPERTY_SOURCEINSTANCEMODELPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
