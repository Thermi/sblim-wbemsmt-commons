/** 
 * CIM_SystemInNamespace.java
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
 * Description:  SystemInNamespace is an association that allows enumeration of the system(s)
 * represented in a Namespace.
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
 *  SystemInNamespace is an association that allows enumeration of the system(s)
 * represented in a Namespace.
 */
public class CIM_SystemInNamespace  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_SystemInNamespace"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_NAMESPACE = "ManagedNamespace"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION = "Identification"; //$NON-NLS-1$
	
	
	/**
	*	An array of free-form strings providing more detailed explanations for the data/objects contained in the Namespace, as described by the ContainedData array. Note, each entry of this array is related to the entry in the ContainedData array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA = "DescriptionOfContainedData"; //$NON-NLS-1$
	/**
	*	A list of enumerated values providing a high level description of the data contained and allowed in the Namespace. Additional clarification is provided in the DescriptionOfContainedData array.
	*/
	public final static String CIM_PROPERTY_SCOPEOFCONTAINEDDATA = "ScopeOfContainedData"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCOPEOFCONTAINEDDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_NAMESPACE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCOPEOFCONTAINEDDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_NAMESPACE, new CIMValue(null, new CIMDataType(CIM_Namespace.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION, new CIMValue(null, new CIMDataType(CIM_SystemIdentification.CIM_CLASS_NAME))));
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_SCOPEOFCONTAINEDDATA = {"Unknown","Other","Local System Data","Data Aggregated from Multiple Systems","Proxied Data"};
	
	
	public final static int SCOPEOFCONTAINEDDATA_UNKNOWN = 0;
	public final static int SCOPEOFCONTAINEDDATA_OTHER = 1;
	public final static int SCOPEOFCONTAINEDDATA_LOCALSYSTEMDATA = 2;
	public final static int SCOPEOFCONTAINEDDATA_DATAAGGREGATEDFROMMULTIPLESYSTEMS = 3;
	public final static int SCOPEOFCONTAINEDDATA_PROXIEDDATA = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SystemInNamespace() {

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
	public CIM_SystemInNamespace(Vector keyProperties){ 
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
	public CIM_SystemInNamespace(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_SystemInNamespace.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_SystemInNamespace.Java_Package_List.toArray(new String[CIM_SystemInNamespace.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_ScopeOfContainedData = this.cimInstance.getProperty(CIM_PROPERTY_SCOPEOFCONTAINEDDATA);
		
		if (CIMProperty_ScopeOfContainedData == null || CIMProperty_ScopeOfContainedData.getValue().isEmpty() || CIMProperty_ScopeOfContainedData.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SCOPEOFCONTAINEDDATA, "Required"});
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
	    
	    if (!(object instanceof CIM_SystemInNamespace)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SystemInNamespace)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SystemInNamespace)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SystemInNamespace)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SystemInNamespace)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SystemInNamespace)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SystemInNamespace)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SystemInNamespace)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SystemInNamespace)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SystemInNamespace)object).cimObjectPath)) {
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
	
	// Attribute DescriptionOfContainedData
	
	public String[] get_DescriptionOfContainedData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_DescriptionOfContainedData(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA + " could not be found");
    		
		} else if (!CIM_SystemInNamespaceHelper.isValid_DescriptionOfContainedData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_DESCRIPTIONOFCONTAINEDDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScopeOfContainedData
	
	public UnsignedInt16[] get_ScopeOfContainedData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ScopeOfContainedData(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA + " could not be found");
    		
		} else if (!CIM_SystemInNamespaceHelper.isValid_ScopeOfContainedData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_SCOPEOFCONTAINEDDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Namespace
	
	public CIMObjectPath get_CIM_Namespace() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE + " is not of expected type CIM_Namespace.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Namespace(CIM_Namespace newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE + " could not be found");
    		
		} else if (!CIM_SystemInNamespaceHelper.isValid_CIM_Namespace(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_NAMESPACE + " is not of expected type CIM_Namespace.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Namespace.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SystemIdentification
	
	public CIMObjectPath get_CIM_SystemIdentification() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION + " is not of expected type CIM_SystemIdentification.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SystemIdentification(CIM_SystemIdentification newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION + " could not be found");
    		
		} else if (!CIM_SystemInNamespaceHelper.isValid_CIM_SystemIdentification(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemInNamespace.CIM_PROPERTY_CIM_SYSTEMIDENTIFICATION + " is not of expected type CIM_SystemIdentification.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SystemIdentification.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
