/** 
 * CIM_ActiveConnection.java
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
 * Description:  This association defines a connection that is currently communicating, or is
 * configured to communicate, between two ServiceAccessPoints. It is used when
 * the connection is not treated as a ManagedElement itself (i.e., with Status,
 * statistics, etc.), but its existence is known. The SAPs that are connected
 * are typically at the same networking or application layer.
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
 *  This association defines a connection that is currently communicating, or is
 * configured to communicate, between two ServiceAccessPoints. It is used when
 * the connection is not treated as a ManagedElement itself (i.e., with Status,
 * statistics, etc.), but its existence is known. The SAPs that are connected
 * are typically at the same networking or application layer.
 */
public class CIM_ActiveConnection extends CIM_SAPSAPDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_ActiveConnection"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1 = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2 = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	TRUE means that this connection is uni-directional; FALSE means that this connection is bi-directional. When the connection is unidirectional, the 'speaker' should be defined as the Antecedent reference. In a bidirectional connection, the selection of which AccessPoint is the Antecedent or Dependent is immaterial.
	*/
	public final static String CIM_PROPERTY_ISUNIDIRECTIONAL = "IsUnidirectional"; //$NON-NLS-1$
	/**
	*	A string describing the type of traffic that is being carried over this instance when its Type property is set to 1 (e.g., 'Other'). This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
	*/
	public final static String CIM_PROPERTY_OTHERTRAFFICDESCRIPTION = "OtherTrafficDescription"; //$NON-NLS-1$
	/**
	*	The type of traffic that is carried over this connection. This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
	*/
	public final static String CIM_PROPERTY_TRAFFICTYPE = "TrafficType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ISUNIDIRECTIONAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTRAFFICDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRAFFICTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2);
				
		for (int i = 0; i < CIM_SAPSAPDependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISUNIDIRECTIONAL)||
				((String)CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTRAFFICDESCRIPTION)||
				((String)CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRAFFICTYPE)){
				continue;
			}
			
			CIM_ActiveConnection.CIM_PropertyNameList.add(CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISUNIDIRECTIONAL, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTRAFFICDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRAFFICTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1, new CIMValue(null, new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2, new CIMValue(null, new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_SAPSAPDependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SAPSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISUNIDIRECTIONAL)||
				((CIMProperty)CIM_SAPSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTRAFFICDESCRIPTION)||
				((CIMProperty)CIM_SAPSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRAFFICTYPE)){
				continue;
			}
			
			CIM_ActiveConnection.CIM_PropertyList.add(CIM_SAPSAPDependency.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_SAPSAPDependency.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_TRAFFICTYPE = {"Unknown","Other","Unicast","Broadcast","Multicast","Anycast"};
	
	
	public final static int TRAFFICTYPE_UNKNOWN = 0;
	public final static int TRAFFICTYPE_OTHER = 1;
	public final static int TRAFFICTYPE_UNICAST = 2;
	public final static int TRAFFICTYPE_BROADCAST = 3;
	public final static int TRAFFICTYPE_MULTICAST = 4;
	public final static int TRAFFICTYPE_ANYCAST = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ActiveConnection() {

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
	public CIM_ActiveConnection(Vector keyProperties){ 
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
	public CIM_ActiveConnection(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_ActiveConnection.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ActiveConnection.Java_Package_List.toArray(new String[CIM_ActiveConnection.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_ActiveConnection)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ActiveConnection)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ActiveConnection)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ActiveConnection)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ActiveConnection)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ActiveConnection)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ActiveConnection)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ActiveConnection)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ActiveConnection)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ActiveConnection)object).cimObjectPath)) {
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
	
	// Attribute IsUnidirectional
	
	public Boolean get_IsUnidirectional() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsUnidirectional(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL + " could not be found");
    		
		} else if (!CIM_ActiveConnectionHelper.isValid_IsUnidirectional(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_ISUNIDIRECTIONAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTrafficDescription
	
	public String get_OtherTrafficDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTrafficDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ActiveConnectionHelper.isValid_OtherTrafficDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_OTHERTRAFFICDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TrafficType
	
	public UnsignedInt16 get_TrafficType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TrafficType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE + " could not be found");
    		
		} else if (!CIM_ActiveConnectionHelper.isValid_TrafficType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_TRAFFICTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ServiceAccessPoint_1
	
	public CIMObjectPath get_CIM_ServiceAccessPoint_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1 + " is not of expected type CIM_ServiceAccessPoint.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ServiceAccessPoint_1(CIM_ServiceAccessPoint newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1 + " could not be found");
    		
		} else if (!CIM_ActiveConnectionHelper.isValid_CIM_ServiceAccessPoint_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_1 + " is not of expected type CIM_ServiceAccessPoint.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ServiceAccessPoint_2
	
	public CIMObjectPath get_CIM_ServiceAccessPoint_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2 + " is not of expected type CIM_ServiceAccessPoint.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ServiceAccessPoint_2(CIM_ServiceAccessPoint newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2 + " could not be found");
    		
		} else if (!CIM_ActiveConnectionHelper.isValid_CIM_ServiceAccessPoint_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ActiveConnection.CIM_PROPERTY_CIM_SERVICEACCESSPOINT_2 + " is not of expected type CIM_ServiceAccessPoint.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
