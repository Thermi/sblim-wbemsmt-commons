/** 
 * CIM_NetworkAdapterRedundancyComponent.java
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
 * Description:  Note: The use of the CIM_NetworkAdapterRedundancyComponent class has been
 * deprecated because a specific association is not needed. Instead use the CIM_
 * OrderedMemberOf Collection class. Deprecated description:
 * CIM_NetworkAdapterRedundancyComponent indicates the role that a
 * NetworkAdapter plays in an ExtraCapacityGroup, providing load balancing.
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
 *  Note: The use of the CIM_NetworkAdapterRedundancyComponent class has been
 * deprecated because a specific association is not needed. Instead use the CIM_
 * OrderedMemberOf Collection class. Deprecated description:
 * CIM_NetworkAdapterRedundancyComponent indicates the role that a
 * NetworkAdapter plays in an ExtraCapacityGroup, providing load balancing.
 */
public class CIM_NetworkAdapterRedundancyComponent extends CIM_RedundancyComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_NetworkAdapterRedundancyComponent"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	public final static String CIM_PROPERTY_CIM_EXTRACAPACITYGROUP = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_NETWORKADAPTER = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A Boolean that indicates whether the Network Adapter is an original primary adapter (value=1), a preferred primary adapter (value=2), or both (value=3). Values of "Unknown" and "Not Applicable" can also be specified.
	*/
	public final static String CIM_PROPERTY_PRIMARYADAPTER = "PrimaryAdapter"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: Indicates the scope of load balancing for the NetworkAdapters that is involved in the RedundancyGroup. Load balancing can be restricted to transmitting data only (value=1), receiving data only (value=2), or used for both transmit and receive (value=3).
	*/
	public final static String CIM_PROPERTY_SCOPEOFBALANCING = "ScopeOfBalancing"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYADAPTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCOPEOFBALANCING);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_EXTRACAPACITYGROUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_NETWORKADAPTER);
				
		for (int i = 0; i < CIM_RedundancyComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RedundancyComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYADAPTER)||
				((String)CIM_RedundancyComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCOPEOFBALANCING)){
				continue;
			}
			
			CIM_NetworkAdapterRedundancyComponent.CIM_PropertyNameList.add(CIM_RedundancyComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYADAPTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCOPEOFBALANCING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_EXTRACAPACITYGROUP, new CIMValue(null, new CIMDataType(CIM_ExtraCapacityGroup.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_NETWORKADAPTER, new CIMValue(null, new CIMDataType(CIM_NetworkAdapter.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_RedundancyComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RedundancyComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYADAPTER)||
				((CIMProperty)CIM_RedundancyComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCOPEOFBALANCING)){
				continue;
			}
			
			CIM_NetworkAdapterRedundancyComponent.CIM_PropertyList.add(CIM_RedundancyComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_RedundancyComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_RedundancyComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_RedundancyComponent.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PRIMARYADAPTER = {"Unknown","Original Primary","Preferred Primary","Both","Not Applicable"};
	public final static String[] CIM_VALUEMAP_SCOPEOFBALANCING = {"Unknown","Load Balancing - Transmit Only","Load Balancing - Receive Only","Full Load Balancing"};
	
	
	public final static int PRIMARYADAPTER_UNKNOWN = 0;
	public final static int PRIMARYADAPTER_ORIGINALPRIMARY = 1;
	public final static int PRIMARYADAPTER_PREFERREDPRIMARY = 2;
	public final static int PRIMARYADAPTER_BOTH = 3;
	public final static int PRIMARYADAPTER_NOTAPPLICABLE = 4;
	
	public final static int SCOPEOFBALANCING_UNKNOWN = 0;
	public final static int SCOPEOFBALANCING_LOADBALANCING_TRANSMITONLY = 1;
	public final static int SCOPEOFBALANCING_LOADBALANCING_RECEIVEONLY = 2;
	public final static int SCOPEOFBALANCING_FULLLOADBALANCING = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NetworkAdapterRedundancyComponent() {

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
	public CIM_NetworkAdapterRedundancyComponent(Vector keyProperties){ 
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
	public CIM_NetworkAdapterRedundancyComponent(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NetworkAdapterRedundancyComponent)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NetworkAdapterRedundancyComponent)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NetworkAdapterRedundancyComponent)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NetworkAdapterRedundancyComponent)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NetworkAdapterRedundancyComponent)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NetworkAdapterRedundancyComponent)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NetworkAdapterRedundancyComponent)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NetworkAdapterRedundancyComponent)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NetworkAdapterRedundancyComponent)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NetworkAdapterRedundancyComponent)object).cimObjectPath)) {
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
	
	// Attribute PrimaryAdapter
	
	public UnsignedInt16 get_PrimaryAdapter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryAdapter(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER + " could not be found");
    		
		} else if (!CIM_NetworkAdapterRedundancyComponentHelper.isValid_PrimaryAdapter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_PRIMARYADAPTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScopeOfBalancing
	
	public UnsignedInt16 get_ScopeOfBalancing() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ScopeOfBalancing(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING + " could not be found");
    		
		} else if (!CIM_NetworkAdapterRedundancyComponentHelper.isValid_ScopeOfBalancing(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_SCOPEOFBALANCING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ExtraCapacityGroup
	
	public CIMObjectPath get_CIM_ExtraCapacityGroup() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ExtraCapacityGroup.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP + " is not of expected type CIM_ExtraCapacityGroup.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ExtraCapacityGroup(CIM_ExtraCapacityGroup newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP + " could not be found");
    		
		} else if (!CIM_NetworkAdapterRedundancyComponentHelper.isValid_CIM_ExtraCapacityGroup(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ExtraCapacityGroup.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_EXTRACAPACITYGROUP + " is not of expected type CIM_ExtraCapacityGroup.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ExtraCapacityGroup.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_NetworkAdapter
	
	public CIMObjectPath get_CIM_NetworkAdapter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkAdapter.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER + " is not of expected type CIM_NetworkAdapter.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_NetworkAdapter(CIM_NetworkAdapter newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER + " could not be found");
    		
		} else if (!CIM_NetworkAdapterRedundancyComponentHelper.isValid_CIM_NetworkAdapter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkAdapter.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkAdapterRedundancyComponent.CIM_PROPERTY_CIM_NETWORKADAPTER + " is not of expected type CIM_NetworkAdapter.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_NetworkAdapter.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
