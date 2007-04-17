/** 
 * CIM_DiagnosticTestForMSE.java
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
 * Description:  This class is being deprecated to promote its usage to the DiagnosticService
 * level. This is an association class that relates a DiagnosticTest to a
 * ManagedSystemElement. Consumers wishing to 'diagnose' a particular Element
 * could query this association, for the Element, to determine what tests are
 * available.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  This class is being deprecated to promote its usage to the DiagnosticService
 * level. This is an association class that relates a DiagnosticTest to a
 * ManagedSystemElement. Consumers wishing to 'diagnose' a particular Element
 * could query this association, for the Element, to determine what tests are
 * available.
 */
public class CIM_DiagnosticTestForMSE extends CIM_ProvidesServiceToElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticTestForMSE"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_PROPERTY_CIM_DIAGNOSTICTEST = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Estimated number of seconds to perform the referenced DiagnosticTest against the ManagedSystemElement. Since execution times could vary by Element, this property is located in the association between the two entities. It is also captured in DiagnosticResult, in the EstimatedTimeOfPerforming property. 
A CIM Consumer can compare this value with the value in DiagnosticResult to get an idea of what impact their settings have on test execution.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING = "EstimatedTimeOfPerforming"; //$NON-NLS-1$
	/**
	*	This property is being deprecated since the same characterisitic can be published in the CIM_ServiceAffectsElement.ElementEffects array as Value = 2, "Exclusive Use". 
If the DiagnosticTest referenced in this object can be run concurrently against multiple SystemElements, but only run one at a time for the referenced ManagedSystemElement, then this boolean is set to TRUE. Alternately, if the test can NOT be run concurrently irregardless of the System Elements being tested, then the more general "Is Exclusive" enumerated value (2) should be set in DiagnosticTest. Characteristics.
	*/
	public final static String CIM_PROPERTY_ISEXCLUSIVEFORMSE = "IsExclusiveForMSE"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISEXCLUSIVEFORMSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_DIAGNOSTICTEST);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
				
		for (int i = 0; i < CIM_ProvidesServiceToElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProvidesServiceToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING)||
				((String)CIM_ProvidesServiceToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISEXCLUSIVEFORMSE)){
				continue;
			}
			
			CIM_DiagnosticTestForMSE.CIM_PropertyNameList.add(CIM_ProvidesServiceToElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISEXCLUSIVEFORMSE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_DIAGNOSTICTEST, new CIMValue(null, new CIMDataType(CIM_DiagnosticTest.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT, new CIMValue(null, new CIMDataType(CIM_ManagedSystemElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ProvidesServiceToElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProvidesServiceToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING)||
				((CIMProperty)CIM_ProvidesServiceToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISEXCLUSIVEFORMSE)){
				continue;
			}
			
			CIM_DiagnosticTestForMSE.CIM_PropertyList.add(CIM_ProvidesServiceToElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ProvidesServiceToElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ProvidesServiceToElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProvidesServiceToElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticTestForMSE() {

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
	public CIM_DiagnosticTestForMSE(Vector keyProperties){ 
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
	public CIM_DiagnosticTestForMSE(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DiagnosticTestForMSE)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticTestForMSE)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticTestForMSE)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticTestForMSE)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticTestForMSE)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticTestForMSE)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticTestForMSE)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticTestForMSE)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticTestForMSE)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticTestForMSE)object).cimObjectPath)) {
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
	
	// Attribute EstimatedTimeOfPerforming
	
	public UnsignedInt32 get_EstimatedTimeOfPerforming() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedTimeOfPerforming(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " could not be found");
    		
		} else if (!CIM_DiagnosticTestForMSEHelper.isValid_EstimatedTimeOfPerforming(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsExclusiveForMSE
	
	public Boolean get_IsExclusiveForMSE() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsExclusiveForMSE(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE + " could not be found");
    		
		} else if (!CIM_DiagnosticTestForMSEHelper.isValid_IsExclusiveForMSE(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_ISEXCLUSIVEFORMSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_DiagnosticTest
	
	public CIMObjectPath get_CIM_DiagnosticTest() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_DiagnosticTest.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST + " is not of expected type CIM_DiagnosticTest.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_DiagnosticTest(CIM_DiagnosticTest newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST + " could not be found");
    		
		} else if (!CIM_DiagnosticTestForMSEHelper.isValid_CIM_DiagnosticTest(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_DiagnosticTest.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_DIAGNOSTICTEST + " is not of expected type CIM_DiagnosticTest.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_DiagnosticTest.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedSystemElement
	
	public CIMObjectPath get_CIM_ManagedSystemElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " is not of expected type CIM_ManagedSystemElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedSystemElement(CIM_ManagedSystemElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " could not be found");
    		
		} else if (!CIM_DiagnosticTestForMSEHelper.isValid_CIM_ManagedSystemElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTestForMSE.CIM_PROPERTY_CIM_MANAGEDSYSTEMELEMENT + " is not of expected type CIM_ManagedSystemElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedSystemElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
