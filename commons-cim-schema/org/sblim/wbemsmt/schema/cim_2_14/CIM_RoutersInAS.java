/** 
 * CIM_RoutersInAS.java
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
 * Description:  This aggregation establishes 'whole-part' relationships between an
 * AutonomousSystem and the routers that it contains. In addition, the routers
 * in the AS share common configuration information, and are commonly
 * administered.
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
 *  This aggregation establishes 'whole-part' relationships between an
 * AutonomousSystem and the routers that it contains. In addition, the routers
 * in the AS share common configuration information, and are commonly
 * administered.
 */
public class CIM_RoutersInAS extends CIM_SystemComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_RoutersInAS"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_COMPUTERSYSTEM = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	TRUE means that the community value of this router is added to the existing community value, and FALSE means that the community value of this router replaces the existing community value.
	*/
	public final static String CIM_PROPERTY_ADDCOMMUNITYVALUE = "AddCommunityValue"; //$NON-NLS-1$
	/**
	*	This is an array of strings that contain the BGP attributes supported by this router.
	*/
	public final static String CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES = "BGPSupportedAttributes"; //$NON-NLS-1$
	/**
	*	A string describing the type of function that this router has in its AS when the value of the Role property of this class is set to 1 (i.e., "Other"). The format of the string inserted in this property should be similar in format to the values defined for the Role property. This property should be set to NULL when the Role property is any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERROLEDESCRIPTION = "OtherRoleDescription"; //$NON-NLS-1$
	/**
	*	This is an enumeration that defines the function, from the point of view of BGP, of this router.
	*/
	public final static String CIM_PROPERTY_ROLE = "Role"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDCOMMUNITYVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERROLEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_COMPUTERSYSTEM);
				
		for (int i = 0; i < CIM_SystemComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SystemComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDCOMMUNITYVALUE)||
				((String)CIM_SystemComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES)||
				((String)CIM_SystemComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERROLEDESCRIPTION)||
				((String)CIM_SystemComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROLE)){
				continue;
			}
			
			CIM_RoutersInAS.CIM_PropertyNameList.add(CIM_SystemComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDCOMMUNITYVALUE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERROLEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM, new CIMValue(null, new CIMDataType(CIM_AutonomousSystem.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_COMPUTERSYSTEM, new CIMValue(null, new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_SystemComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SystemComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDCOMMUNITYVALUE)||
				((CIMProperty)CIM_SystemComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES)||
				((CIMProperty)CIM_SystemComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERROLEDESCRIPTION)||
				((CIMProperty)CIM_SystemComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROLE)){
				continue;
			}
			
			CIM_RoutersInAS.CIM_PropertyList.add(CIM_SystemComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SystemComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_SystemComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SystemComponent.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ROLE = {"Unknown","Other","Conventional BGP Speaker","Route Reflector","Router Reflector Client","Route Reflector Non-Client","Peer Group Member","Confederation Member"};
	
	
	public final static int ROLE_UNKNOWN = 0;
	public final static int ROLE_OTHER = 1;
	public final static int ROLE_CONVENTIONALBGPSPEAKER = 2;
	public final static int ROLE_ROUTEREFLECTOR = 3;
	public final static int ROLE_ROUTERREFLECTORCLIENT = 4;
	public final static int ROLE_ROUTEREFLECTORNON_CLIENT = 5;
	public final static int ROLE_PEERGROUPMEMBER = 6;
	public final static int ROLE_CONFEDERATIONMEMBER = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_RoutersInAS() {

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
	public CIM_RoutersInAS(Vector keyProperties){ 
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
	public CIM_RoutersInAS(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_RoutersInAS)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_RoutersInAS)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_RoutersInAS)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_RoutersInAS)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_RoutersInAS)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_RoutersInAS)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_RoutersInAS)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_RoutersInAS)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_RoutersInAS)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_RoutersInAS)object).cimObjectPath)) {
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
	
	// Attribute AddCommunityValue
	
	public Boolean get_AddCommunityValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddCommunityValue(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE + " could not be found");
    		
		} else if (!CIM_RoutersInASHelper.isValid_AddCommunityValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ADDCOMMUNITYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BGPSupportedAttributes
	
	public String[] get_BGPSupportedAttributes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_BGPSupportedAttributes(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES + " could not be found");
    		
		} else if (!CIM_RoutersInASHelper.isValid_BGPSupportedAttributes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_BGPSUPPORTEDATTRIBUTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherRoleDescription
	
	public String get_OtherRoleDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherRoleDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_RoutersInASHelper.isValid_OtherRoleDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_OTHERROLEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Role
	
	public UnsignedInt16 get_Role() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_ROLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Role(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_ROLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (!CIM_RoutersInASHelper.isValid_Role(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutersInAS.CIM_PROPERTY_ROLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_AutonomousSystem
	
	public CIMObjectPath get_CIM_AutonomousSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM + " is not of expected type CIM_AutonomousSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_AutonomousSystem(CIM_AutonomousSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM + " could not be found");
    		
		} else if (!CIM_RoutersInASHelper.isValid_CIM_AutonomousSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM + " is not of expected type CIM_AutonomousSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_AutonomousSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ComputerSystem
	
	public CIMObjectPath get_CIM_ComputerSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " is not of expected type CIM_ComputerSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ComputerSystem(CIM_ComputerSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " could not be found");
    		
		} else if (!CIM_RoutersInASHelper.isValid_CIM_ComputerSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutersInAS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " is not of expected type CIM_ComputerSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
