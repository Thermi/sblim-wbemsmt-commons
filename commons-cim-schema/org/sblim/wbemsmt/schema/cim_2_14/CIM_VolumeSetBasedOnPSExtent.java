/** 
 * CIM_VolumeSetBasedOnPSExtent.java
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
 * Description:  This association is deprecated in lieu of CompositeExtentBasedOn, since
 * VolumeSets and ProtectedSpaceExtents are themselves deprecated. The
 * relationship describes that VolumeSets are BasedOn on one or more
 * ProtectedSpaceExtents.
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
 *  This association is deprecated in lieu of CompositeExtentBasedOn, since
 * VolumeSets and ProtectedSpaceExtents are themselves deprecated. The
 * relationship describes that VolumeSets are BasedOn on one or more
 * ProtectedSpaceExtents.
 */
public class CIM_VolumeSetBasedOnPSExtent extends CIM_BasedOn  {
	
	public final static String CIM_CLASS_NAME = "CIM_VolumeSetBasedOnPSExtent"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_VOLUMESET = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA = "LBAMappingIncludesCheckData"; //$NON-NLS-1$
	/**
	*	True if logical blocks in the ProtectedSpaceExtent are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_LBASMAPPEDBYDECREMENTING = "LBAsMappedByDecrementing"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_VOLUMESET);
				
		for (int i = 0; i < CIM_BasedOn.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING)){
				continue;
			}
			
			CIM_VolumeSetBasedOnPSExtent.CIM_PropertyNameList.add(CIM_BasedOn.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT, new CIMValue(null, new CIMDataType(CIM_ProtectedSpaceExtent.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_VOLUMESET, new CIMValue(null, new CIMDataType(CIM_VolumeSet.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_BasedOn.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING)){
				continue;
			}
			
			CIM_VolumeSetBasedOnPSExtent.CIM_PropertyList.add(CIM_BasedOn.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_BasedOn.Java_Package_List.size(); i++) {
			if (((String)CIM_BasedOn.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_BasedOn.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_VolumeSetBasedOnPSExtent() {

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
	public CIM_VolumeSetBasedOnPSExtent(Vector keyProperties){ 
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
	public CIM_VolumeSetBasedOnPSExtent(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_VolumeSetBasedOnPSExtent)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_VolumeSetBasedOnPSExtent)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_VolumeSetBasedOnPSExtent)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_VolumeSetBasedOnPSExtent)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_VolumeSetBasedOnPSExtent)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_VolumeSetBasedOnPSExtent)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_VolumeSetBasedOnPSExtent)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_VolumeSetBasedOnPSExtent)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_VolumeSetBasedOnPSExtent)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_VolumeSetBasedOnPSExtent)object).cimObjectPath)) {
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
	
	// Attribute LBAMappingIncludesCheckData
	
	public Boolean get_LBAMappingIncludesCheckData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LBAMappingIncludesCheckData(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " could not be found");
    		
		} else if (!CIM_VolumeSetBasedOnPSExtentHelper.isValid_LBAMappingIncludesCheckData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LBAsMappedByDecrementing
	
	public Boolean get_LBAsMappedByDecrementing() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LBAsMappedByDecrementing(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " could not be found");
    		
		} else if (!CIM_VolumeSetBasedOnPSExtentHelper.isValid_LBAsMappedByDecrementing(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ProtectedSpaceExtent
	
	public CIMObjectPath get_CIM_ProtectedSpaceExtent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ProtectedSpaceExtent.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT + " is not of expected type CIM_ProtectedSpaceExtent.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ProtectedSpaceExtent(CIM_ProtectedSpaceExtent newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT + " could not be found");
    		
		} else if (!CIM_VolumeSetBasedOnPSExtentHelper.isValid_CIM_ProtectedSpaceExtent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ProtectedSpaceExtent.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_PROTECTEDSPACEEXTENT + " is not of expected type CIM_ProtectedSpaceExtent.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ProtectedSpaceExtent.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_VolumeSet
	
	public CIMObjectPath get_CIM_VolumeSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_VolumeSet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET + " is not of expected type CIM_VolumeSet.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_VolumeSet(CIM_VolumeSet newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET + " could not be found");
    		
		} else if (!CIM_VolumeSetBasedOnPSExtentHelper.isValid_CIM_VolumeSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_VolumeSet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSetBasedOnPSExtent.CIM_PROPERTY_CIM_VOLUMESET + " is not of expected type CIM_VolumeSet.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_VolumeSet.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}