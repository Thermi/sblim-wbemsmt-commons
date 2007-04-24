/** 
 * CIM_SoftwareElementServiceImplementation.java
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
 * Description:  An association between a Service and how it is implemented by one or more
 * executable SoftwareElements. Note that this association is restricted to
 * 'executable' Elements. In earlier phases of deployment, the
 * SoftwareFeatureService Implementation association is adequate and
 * recommended. The relationship between this association and Software
 * FeatureServiceImplementation is more fully described here.
 * SoftwareElementServiceImplementation allows the description of greater
 * granularity than SoftwareFeatureService Implementation, when a
 * SoftwareFeature is fully deployed and results in several executable Elements.
 * These Elements may implement several different Services. Since
 * SoftwareFeatures decompose into SoftwareElements, it is possible to describe
 * how software implements a Service by using either this association or the
 * SoftwareFeature ServiceImplementation relationship. One or the other should
 * be chosen. Both associations should not be used for a single Service
 * instance, since their information is redundant. This relationship is
 * especially important when the SoftwareFeature and Product aspects are not
 * described for a SoftwareElement (ie, when the acquisition and deployment of
 * the software is not detailed). In this case, the Software
 * ElementServiceImplementation association is the only one available to
 * describe how a Service is implemented in software. Since SoftwareFeatures are
 * not instantiated, it is not possible to use the SoftwareFeatureService
 * Implementation association. The cardinality of this association is
 * many-to-many. A Service may be provided by more than one SoftwareElement. If
 * this is true, it is assumed that the SoftwareElements operate in conjunction.
 * And, any SoftwareElement may provide more than one Service.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  An association between a Service and how it is implemented by one or more
 * executable SoftwareElements. Note that this association is restricted to
 * 'executable' Elements. In earlier phases of deployment, the
 * SoftwareFeatureService Implementation association is adequate and
 * recommended. The relationship between this association and Software
 * FeatureServiceImplementation is more fully described here.
 * SoftwareElementServiceImplementation allows the description of greater
 * granularity than SoftwareFeatureService Implementation, when a
 * SoftwareFeature is fully deployed and results in several executable Elements.
 * These Elements may implement several different Services. Since
 * SoftwareFeatures decompose into SoftwareElements, it is possible to describe
 * how software implements a Service by using either this association or the
 * SoftwareFeature ServiceImplementation relationship. One or the other should
 * be chosen. Both associations should not be used for a single Service
 * instance, since their information is redundant. This relationship is
 * especially important when the SoftwareFeature and Product aspects are not
 * described for a SoftwareElement (ie, when the acquisition and deployment of
 * the software is not detailed). In this case, the Software
 * ElementServiceImplementation association is the only one available to
 * describe how a Service is implemented in software. Since SoftwareFeatures are
 * not instantiated, it is not possible to use the SoftwareFeatureService
 * Implementation association. The cardinality of this association is
 * many-to-many. A Service may be provided by more than one SoftwareElement. If
 * this is true, it is assumed that the SoftwareElements operate in conjunction.
 * And, any SoftwareElement may provide more than one Service.
 */
public class CIM_SoftwareElementServiceImplementation extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_SoftwareElementServiceImplementation"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_SOFTWAREELEMENT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SERVICE = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SOFTWAREELEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICE);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			
			CIM_SoftwareElementServiceImplementation.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SOFTWAREELEMENT, new CIMValue(null, new CIMDataType(CIM_SoftwareElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICE, new CIMValue(null, new CIMDataType(CIM_Service.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			
			CIM_SoftwareElementServiceImplementation.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SoftwareElementServiceImplementation() {

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
	public CIM_SoftwareElementServiceImplementation(Vector keyProperties){ 
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
	public CIM_SoftwareElementServiceImplementation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SoftwareElementServiceImplementation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SoftwareElementServiceImplementation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SoftwareElementServiceImplementation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SoftwareElementServiceImplementation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SoftwareElementServiceImplementation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SoftwareElementServiceImplementation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SoftwareElementServiceImplementation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SoftwareElementServiceImplementation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SoftwareElementServiceImplementation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SoftwareElementServiceImplementation)object).cimObjectPath)) {
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
	
	// Attribute CIM_SoftwareElement
	
	public CIMObjectPath get_CIM_SoftwareElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " is not of expected type CIM_SoftwareElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SoftwareElement(CIM_SoftwareElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " could not be found");
    		
		} else if (!CIM_SoftwareElementServiceImplementationHelper.isValid_CIM_SoftwareElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " is not of expected type CIM_SoftwareElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SoftwareElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Service
	
	public CIMObjectPath get_CIM_Service() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE + " is not of expected type CIM_Service.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Service(CIM_Service newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE + " could not be found");
    		
		} else if (!CIM_SoftwareElementServiceImplementationHelper.isValid_CIM_Service(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementServiceImplementation.CIM_PROPERTY_CIM_SERVICE + " is not of expected type CIM_Service.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Service.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
