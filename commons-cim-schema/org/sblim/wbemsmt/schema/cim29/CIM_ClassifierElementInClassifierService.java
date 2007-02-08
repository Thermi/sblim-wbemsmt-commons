/** 
 * CIM_ClassifierElementInClassifierService.java
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
 * Description: This aggregation represents the relationship between a ClassifierService and the ClassifierElements that provide its fan-out function. ClassifierElements represent the traffic selectors for the Service. A ClassifierService typically aggregates multiple ClassifierElements. An individual Element, however, is aggregated only by a single ClassifierService.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ClassifierElementInClassifierService extends CIM_ServiceComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_ClassifierElementInClassifierService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_CLASSIFIERSERVICE = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_CLASSIFIERELEMENT = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	Because the filters for a classifier can overlap, it is necessary to specify the order in which the ClassifierElements are aggregated by a ClassifierService. This then dictates the order in which packets coming into the classifier are presented. Values are represented in ascending order: first '1', then '2', and so on. Different values MUST be assigned for each of the ClassifierElements aggregated by a given ClassifierService.
	*/
	public final static String CIM_PROPERTY_CLASSIFIERORDER = "ClassifierOrder"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSIFIERORDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CLASSIFIERSERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CLASSIFIERELEMENT);
				
		for (int i = 0; i < CIM_ServiceComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSIFIERORDER)){
				continue;
			}
			
			CIM_ClassifierElementInClassifierService.CIM_PropertyNameList.add(CIM_ServiceComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSIFIERORDER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CLASSIFIERSERVICE, new CIMValue(null, new CIMDataType(CIM_ClassifierService.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CLASSIFIERELEMENT, new CIMValue(null, new CIMDataType(CIM_ClassifierElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSIFIERORDER)){
				continue;
			}
			
			CIM_ClassifierElementInClassifierService.CIM_PropertyList.add(CIM_ServiceComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ServiceComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceComponent.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ClassifierElementInClassifierService() {

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
	public CIM_ClassifierElementInClassifierService(Vector keyProperties){ 
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
	public CIM_ClassifierElementInClassifierService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ClassifierElementInClassifierService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ClassifierElementInClassifierService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ClassifierElementInClassifierService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ClassifierElementInClassifierService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ClassifierElementInClassifierService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ClassifierElementInClassifierService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ClassifierElementInClassifierService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ClassifierElementInClassifierService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ClassifierElementInClassifierService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ClassifierElementInClassifierService)object).cimObjectPath)) {
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
	
	// Attribute ClassifierOrder
	
	public UnsignedInt32 get_ClassifierOrder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassifierOrder(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER + " could not be found");
    		
		} else if (!CIM_ClassifierElementInClassifierServiceHelper.isValid_ClassifierOrder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CLASSIFIERORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ClassifierService
	
	public CIMObjectPath get_CIM_ClassifierService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ClassifierService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE + " is not of expected type CIM_ClassifierService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ClassifierService(CIM_ClassifierService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE + " could not be found");
    		
		} else if (!CIM_ClassifierElementInClassifierServiceHelper.isValid_CIM_ClassifierService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ClassifierService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERSERVICE + " is not of expected type CIM_ClassifierService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ClassifierService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ClassifierElement
	
	public CIMObjectPath get_CIM_ClassifierElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ClassifierElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT + " is not of expected type CIM_ClassifierElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ClassifierElement(CIM_ClassifierElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT + " could not be found");
    		
		} else if (!CIM_ClassifierElementInClassifierServiceHelper.isValid_CIM_ClassifierElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ClassifierElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ClassifierElementInClassifierService.CIM_PROPERTY_CIM_CLASSIFIERELEMENT + " is not of expected type CIM_ClassifierElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ClassifierElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
