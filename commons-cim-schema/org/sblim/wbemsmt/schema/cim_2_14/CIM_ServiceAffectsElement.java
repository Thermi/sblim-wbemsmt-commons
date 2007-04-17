/** 
 * CIM_ServiceAffectsElement.java
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
 * Description:  ServiceAffectsElement represents an association between a Service and the
 * ManagedElements that might be affected by its execution. Instantiating this
 * association indicates that running the service may change, manage, provide
 * functionality for,or pose some burden on the ManagedElement. This burden
 * might affect performance, throughput, availability, and so on.
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
import org.sblim.wbem.cim.UnsignedInt16;


/**
 *  ServiceAffectsElement represents an association between a Service and the
 * ManagedElements that might be affected by its execution. Instantiating this
 * association indicates that running the service may change, manage, provide
 * functionality for,or pose some burden on the ManagedElement. This burden
 * might affect performance, throughput, availability, and so on.
 */
public class CIM_ServiceAffectsElement  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_ServiceAffectsElement"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT = "AffectedElement"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SERVICE = "AffectingElement"; //$NON-NLS-1$
	
	
	/**
	*	An enumeration that describes the effect on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details that are related to the high-level effects enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1 (Other). The values are defined as follows: 
- Exclusive Use (2): No other Service may have this association to the element. 
- Performance Impact (3): Deprecated in favor of "Consumes", "Enhances Performance", or "Degrades Performance". Execution of the Service may enhance or degrade the performance of the element. This may be as a side-effect of execution or as an intended consequence of methods provided by the Service. 
- Element Integrity (4): Deprecated in favor of "Consumes", "Enhances Integrity", or "Degrades Integrity". Execution of the Service may enhance or degrade the integrity of the element. This may be as a side-effect of execution or as an intended consequence of methods provided by the Service. 
- Manages (5): The Service manages the element. 
- Consumes (6): Execution of the Service consumes some or all of the associated element as a consequence of running the Service. For example, the Service may consume CPU cycles, which may affect performance, or Storage which may affect both performance and integrity. (For instance, the lack of free storage can degrade integrity by reducing the ability to save state. ) "Consumes" may be used alone or in conjunction with other values, in particular, "Degrades Performance" and "Degrades Integrity". 
"Manages" and not "Consumes" should be used to reflect allocation services that may be provided by a Service. 
- Enhances Integrity (7): The Service may enhance integrity of the associated element. 
- Degrades Integrity (8): The Service may degrade integrity of the associated element. 
- Enhances Performance (9): The Service may enhance performance of the associated element. 
- Degrades Performance (10): The Service may degrade performance of the associated element.
	*/
	public final static String CIM_PROPERTY_ELEMENTEFFECTS = "ElementEffects"; //$NON-NLS-1$
	/**
	*	Provides details for the effect at the corresponding array position in ElementEffects. This information is required if ElementEffects contains the value 1 (Other).
	*/
	public final static String CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS = "OtherElementEffectsDescriptions"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTEFFECTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICE);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTEFFECTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICE, new CIMValue(null, new CIMDataType(CIM_Service.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
		};
			
	public final static String[] CIM_VALUEMAP_ELEMENTEFFECTS = {"Unknown","Other","Exclusive Use","Performance Impact","Element Integrity","Manages","Consumes","Enhances Integrity","Degrades Integrity","Enhances Performance","Degrades Performance","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ELEMENTEFFECTS_UNKNOWN = "0";
	public final static String ELEMENTEFFECTS_OTHER = "1";
	public final static String ELEMENTEFFECTS_EXCLUSIVEUSE = "2";
	public final static String ELEMENTEFFECTS_PERFORMANCEIMPACT = "3";
	public final static String ELEMENTEFFECTS_ELEMENTINTEGRITY = "4";
	public final static String ELEMENTEFFECTS_MANAGES = "5";
	public final static String ELEMENTEFFECTS_CONSUMES = "6";
	public final static String ELEMENTEFFECTS_ENHANCESINTEGRITY = "7";
	public final static String ELEMENTEFFECTS_DEGRADESINTEGRITY = "8";
	public final static String ELEMENTEFFECTS_ENHANCESPERFORMANCE = "9";
	public final static String ELEMENTEFFECTS_DEGRADESPERFORMANCE = "10";
	public final static String ELEMENTEFFECTS_DMTFRESERVED = "..";
	public final static String ELEMENTEFFECTS_VENDORRESERVED = "0x8000..0xFFFF";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ServiceAffectsElement() {

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
	public CIM_ServiceAffectsElement(Vector keyProperties){ 
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
	public CIM_ServiceAffectsElement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ServiceAffectsElement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ServiceAffectsElement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ServiceAffectsElement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ServiceAffectsElement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ServiceAffectsElement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ServiceAffectsElement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ServiceAffectsElement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ServiceAffectsElement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ServiceAffectsElement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ServiceAffectsElement)object).cimObjectPath)) {
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
	
	// Attribute ElementEffects
	
	public UnsignedInt16[] get_ElementEffects() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ElementEffects(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS + " could not be found");
    		
		} else if (!CIM_ServiceAffectsElementHelper.isValid_ElementEffects(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_ELEMENTEFFECTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherElementEffectsDescriptions
	
	public String[] get_OtherElementEffectsDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherElementEffectsDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_ServiceAffectsElementHelper.isValid_OtherElementEffectsDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement
	
	public CIMObjectPath get_CIM_ManagedElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (!CIM_ServiceAffectsElementHelper.isValid_CIM_ManagedElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Service
	
	public CIMObjectPath get_CIM_Service() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE + " is not of expected type CIM_Service.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Service(CIM_Service newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE + " could not be found");
    		
		} else if (!CIM_ServiceAffectsElementHelper.isValid_CIM_Service(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAffectsElement.CIM_PROPERTY_CIM_SERVICE + " is not of expected type CIM_Service.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Service.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}