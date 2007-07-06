/** 
 * CIM_ConcreteDependency.java
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
 * Description:  CIM_ConcreteDependency is a generic association used to establish dependency
 * relationships between ManagedElements. It is defined as a concrete subclass
 * of the abstract CIM_Dependency class, to be used in place of many specific
 * subclasses of Dependency that add no semantics - i.e., that do not clarify
 * the type of dependency, update cardinalities, or add/remove qualifiers. Note
 * that when defining additional semantics for Dependency that this class MUST
 * NOT be subclassed. Specific semantics continue to be defined as subclasses of
 * the abstract CIM_Dependency. ConcreteDependency is limited in its use as a
 * concrete form of a general dependency. It was deemed more prudent to create
 * this concrete subclass than to change Dependency from an abstract to a
 * concrete class. Dependency already had multiple abstract subclasses in the
 * CIM Schema, and wider industry usage and impact could not be anticipated.
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
 *  CIM_ConcreteDependency is a generic association used to establish dependency
 * relationships between ManagedElements. It is defined as a concrete subclass
 * of the abstract CIM_Dependency class, to be used in place of many specific
 * subclasses of Dependency that add no semantics - i.e., that do not clarify
 * the type of dependency, update cardinalities, or add/remove qualifiers. Note
 * that when defining additional semantics for Dependency that this class MUST
 * NOT be subclassed. Specific semantics continue to be defined as subclasses of
 * the abstract CIM_Dependency. ConcreteDependency is limited in its use as a
 * concrete form of a general dependency. It was deemed more prudent to create
 * this concrete subclass than to change Dependency from an abstract to a
 * concrete class. Dependency already had multiple abstract subclasses in the
 * CIM Schema, and wider industry usage and impact could not be anticipated.
 */
public class CIM_ConcreteDependency extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_ConcreteDependency"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT_1 = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT_2 = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			
			CIM_ConcreteDependency.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT_1, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT_2, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			
			CIM_ConcreteDependency.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_Dependency.getPackages();
		
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
	public CIM_ConcreteDependency() {

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
	public CIM_ConcreteDependency(Vector keyProperties){ 
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
	public CIM_ConcreteDependency(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_ConcreteDependency.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ConcreteDependency.Java_Package_List.toArray(new String[CIM_ConcreteDependency.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_ConcreteDependency)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ConcreteDependency)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ConcreteDependency)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ConcreteDependency)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ConcreteDependency)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ConcreteDependency)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ConcreteDependency)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ConcreteDependency)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ConcreteDependency)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ConcreteDependency)object).cimObjectPath)) {
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
	
	// Attribute CIM_ManagedElement_1
	
	public CIMObjectPath get_CIM_ManagedElement_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement_1(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " could not be found");
    		
		} else if (!CIM_ConcreteDependencyHelper.isValid_CIM_ManagedElement_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement_2
	
	public CIMObjectPath get_CIM_ManagedElement_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement_2(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " could not be found");
    		
		} else if (!CIM_ConcreteDependencyHelper.isValid_CIM_ManagedElement_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteDependency.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
