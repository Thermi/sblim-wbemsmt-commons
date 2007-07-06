/** 
 * CIM_InstMethodCall.java
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
 * Description:  CIM_InstMethodCall notifies when an instance's method is invoked.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  CIM_InstMethodCall notifies when an instance's method is invoked.
 */
public class CIM_InstMethodCall extends CIM_InstIndication  {
	
	public final static String CIM_CLASS_NAME = "CIM_InstMethodCall"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	The name of the method invoked.
	*/
	public final static String CIM_PROPERTY_METHODNAME = "MethodName"; //$NON-NLS-1$
	/**
	*	The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
	*/
	public final static String CIM_PROPERTY_METHODPARAMETERS = "MethodParameters"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
	*/
	public final static String CIM_PROPERTY_PRECALL = "PreCall"; //$NON-NLS-1$
	/**
	*	ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
	*/
	public final static String CIM_PROPERTY_RETURNVALUE = "ReturnValue"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_METHODNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_METHODPARAMETERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRECALL);
		CIM_PropertyNameList.add(CIM_PROPERTY_RETURNVALUE);
				
		for (int i = 0; i < CIM_InstIndication.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_InstIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_METHODNAME)||
				((String)CIM_InstIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_METHODPARAMETERS)||
				((String)CIM_InstIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRECALL)||
				((String)CIM_InstIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RETURNVALUE)){
				continue;
			}
			
			CIM_InstMethodCall.CIM_PropertyNameList.add(CIM_InstIndication.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METHODNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METHODPARAMETERS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRECALL, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RETURNVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_InstIndication.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_InstIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_METHODNAME)||
				((CIMProperty)CIM_InstIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_METHODPARAMETERS)||
				((CIMProperty)CIM_InstIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRECALL)||
				((CIMProperty)CIM_InstIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RETURNVALUE)){
				continue;
			}
			
			CIM_InstMethodCall.CIM_PropertyList.add(CIM_InstIndication.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_InstIndication.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_InstMethodCall() {

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
	public CIM_InstMethodCall(Vector keyProperties){ 
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
	public CIM_InstMethodCall(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_InstMethodCall.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_InstMethodCall.Java_Package_List.toArray(new String[CIM_InstMethodCall.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_MethodName = this.cimInstance.getProperty(CIM_PROPERTY_METHODNAME);
		
		if (CIMProperty_MethodName == null || CIMProperty_MethodName.getValue().isEmpty() || CIMProperty_MethodName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_METHODNAME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_PreCall = this.cimInstance.getProperty(CIM_PROPERTY_PRECALL);
		
		if (CIMProperty_PreCall == null || CIMProperty_PreCall.getValue().isEmpty() || CIMProperty_PreCall.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PRECALL, "Required"});
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
	    
	    if (!(object instanceof CIM_InstMethodCall)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_InstMethodCall)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_InstMethodCall)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_InstMethodCall)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_InstMethodCall)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_InstMethodCall)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_InstMethodCall)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_InstMethodCall)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_InstMethodCall)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_InstMethodCall)object).cimObjectPath)) {
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
	
	// Attribute MethodName
	
	public String get_MethodName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_METHODNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MethodName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_METHODNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODNAME + " could not be found");
    		
		} else if (!CIM_InstMethodCallHelper.isValid_MethodName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstMethodCall.CIM_PROPERTY_METHODNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MethodParameters
	
	public String get_MethodParameters() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MethodParameters(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS + " could not be found");
    		
		} else if (!CIM_InstMethodCallHelper.isValid_MethodParameters(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_METHODPARAMETERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PreCall
	
	public Boolean get_PreCall() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_PRECALL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_PRECALL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_PRECALL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PreCall(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_PRECALL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_PRECALL + " could not be found");
    		
		} else if (!CIM_InstMethodCallHelper.isValid_PreCall(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstMethodCall.CIM_PROPERTY_PRECALL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_PRECALL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReturnValue
	
	public String get_ReturnValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReturnValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE + " could not be found");
    		
		} else if (!CIM_InstMethodCallHelper.isValid_ReturnValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstMethodCall.CIM_PROPERTY_RETURNVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
