/** 
 * CIM_ServiceAccessURI.java
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
 * Description:  CIM_ServiceAccessURI represents the ability to utilize or invoke a Service via
 * a uniform resource identifier. RFC 1738 describes the Uniform Resource
 * Locator which is a more specific form of a URI, and RFC 2396 describes the
 * broader, inclusive URI. Quoting from the RFC, 'A Uniform Resource Identifier
 * (URI) is a compact string of characters for identifying an abstract or
 * physical resource.' In the context of a ServiceAccessPoint, a URI contains
 * the information necessary to access an associated service (associated via
 * ServiceAccessBySAP), using a syntax specific to that service.
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
 *  CIM_ServiceAccessURI represents the ability to utilize or invoke a Service via
 * a uniform resource identifier. RFC 1738 describes the Uniform Resource
 * Locator which is a more specific form of a URI, and RFC 2396 describes the
 * broader, inclusive URI. Quoting from the RFC, 'A Uniform Resource Identifier
 * (URI) is a compact string of characters for identifying an abstract or
 * physical resource.' In the context of a ServiceAccessPoint, a URI contains
 * the information necessary to access an associated service (associated via
 * ServiceAccessBySAP), using a syntax specific to that service.
 */
public class CIM_ServiceAccessURI extends CIM_ServiceAccessPoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_ServiceAccessURI"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The LabeledURI property is based on RFC 2079 and its value and syntax is service specific.
	*/
	public final static String CIM_PROPERTY_LABELEDURI = "LabeledURI"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LABELEDURI);
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LABELEDURI)){
				continue;
			}
			
			CIM_ServiceAccessURI.CIM_PropertyNameList.add(CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LABELEDURI, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LABELEDURI)){
				continue;
			}
			
			CIM_ServiceAccessURI.CIM_PropertyList.add(CIM_ServiceAccessPoint.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_ServiceAccessPoint.getPackages();
		
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
	public CIM_ServiceAccessURI() {

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
	public CIM_ServiceAccessURI(Vector keyProperties){ 
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
	public CIM_ServiceAccessURI(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_ServiceAccessURI.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ServiceAccessURI.Java_Package_List.toArray(new String[CIM_ServiceAccessURI.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_LabeledURI = this.cimInstance.getProperty(CIM_PROPERTY_LABELEDURI);
		
		if (CIMProperty_LabeledURI == null || CIMProperty_LabeledURI.getValue().isEmpty() || CIMProperty_LabeledURI.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LABELEDURI, "Required"});
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
	    
	    if (!(object instanceof CIM_ServiceAccessURI)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ServiceAccessURI)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ServiceAccessURI)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ServiceAccessURI)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ServiceAccessURI)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ServiceAccessURI)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ServiceAccessURI)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ServiceAccessURI)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ServiceAccessURI)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ServiceAccessURI)object).cimObjectPath)) {
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
	
	// Attribute LabeledURI
	
	public String get_LabeledURI() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LabeledURI(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI + " could not be found");
    		
		} else if (!CIM_ServiceAccessURIHelper.isValid_LabeledURI(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAccessURI.CIM_PROPERTY_LABELEDURI + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
