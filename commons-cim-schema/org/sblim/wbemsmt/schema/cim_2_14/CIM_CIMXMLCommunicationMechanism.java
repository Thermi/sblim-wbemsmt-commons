/** 
 * CIM_CIMXMLCommunicationMechanism.java
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
 * Description:  This class specializes ObjectManagerCommunicationMechanism, adding properties
 * specific to the CIM-XML protocol (XML encoding and CIM Operations).
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  This class specializes ObjectManagerCommunicationMechanism, adding properties
 * specific to the CIM-XML protocol (XML encoding and CIM Operations).
 */
public class CIM_CIMXMLCommunicationMechanism extends CIM_ObjectManagerCommunicationMechanism  {
	
	public final static String CIM_CLASS_NAME = "CIM_CIMXMLCommunicationMechanism"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
	*/
	public final static String CIM_PROPERTY_CIMVALIDATED = "CIMValidated"; //$NON-NLS-1$
	/**
	*	Enumeration describing the CIM-XML protocol version supported by the ObjectManager. It is deprecated in lieu of a more general, inherited property (Version).
	*/
	public final static String CIM_PROPERTY_CIMXMLPROTOCOLVERSION = "CIMXMLProtocolVersion"; //$NON-NLS-1$
	/**
	*	The only valid CommunicationMechanism for this subclass is CIM-XML.
	*/
	public final static String CIM_PROPERTY_COMMUNICATIONMECHANISM = "CommunicationMechanism"; //$NON-NLS-1$
	/**
	*	Enumeration describing the CIM-XML protocol version supported by the ObjectManager.
	*/
	public final static String CIM_PROPERTY_VERSION = "Version"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIMVALIDATED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIMXMLPROTOCOLVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMUNICATIONMECHANISM);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERSION);
				
		for (int i = 0; i < CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIMVALIDATED)||
				((String)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIMXMLPROTOCOLVERSION)||
				((String)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMUNICATIONMECHANISM)||
				((String)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_CIMXMLCommunicationMechanism.CIM_PropertyNameList.add(CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIMVALIDATED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIMXMLPROTOCOLVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMUNICATIONMECHANISM, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIMVALIDATED)||
				((CIMProperty)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIMXMLPROTOCOLVERSION)||
				((CIMProperty)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMUNICATIONMECHANISM)||
				((CIMProperty)CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_CIMXMLCommunicationMechanism.CIM_PropertyList.add(CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
				
		String[] parentClassPackageList = CIM_ObjectManagerCommunicationMechanism.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CIMXMLPROTOCOLVERSION = {"Unknown","1.0"};
	public final static String[] CIM_VALUEMAP_COMMUNICATIONMECHANISM = {"CIM-XML"};
	public final static String[] CIM_VALUEMAP_VERSION = {"Value0","Value1","Value2"};
	
	
	public final static int CIMXMLPROTOCOLVERSION_UNKNOWN = 0;
	public final static int CIMXMLPROTOCOLVERSION_1_0 = 1;
	
	public final static int COMMUNICATIONMECHANISM_CIM_XML = 2;
	
	public final static String VERSION_VALUE0 = "1.0";
	public final static String VERSION_VALUE1 = "1.1";
	public final static String VERSION_VALUE2 = "1.2";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CIMXMLCommunicationMechanism() {

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
	public CIM_CIMXMLCommunicationMechanism(Vector keyProperties){ 
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
	public CIM_CIMXMLCommunicationMechanism(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_CIMXMLCommunicationMechanism.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_CIMXMLCommunicationMechanism.Java_Package_List.toArray(new String[CIM_CIMXMLCommunicationMechanism.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_CIMValidated = this.cimInstance.getProperty(CIM_PROPERTY_CIMVALIDATED);
		
		if (CIMProperty_CIMValidated == null || CIMProperty_CIMValidated.getValue().isEmpty() || CIMProperty_CIMValidated.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CIMVALIDATED, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_CIMXMLProtocolVersion = this.cimInstance.getProperty(CIM_PROPERTY_CIMXMLPROTOCOLVERSION);
		
		if (CIMProperty_CIMXMLProtocolVersion == null || CIMProperty_CIMXMLProtocolVersion.getValue().isEmpty() || CIMProperty_CIMXMLProtocolVersion.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CIMXMLPROTOCOLVERSION, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_CommunicationMechanism = this.cimInstance.getProperty(CIM_PROPERTY_COMMUNICATIONMECHANISM);
		
		if (CIMProperty_CommunicationMechanism == null || CIMProperty_CommunicationMechanism.getValue().isEmpty() || CIMProperty_CommunicationMechanism.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_COMMUNICATIONMECHANISM, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_Version = this.cimInstance.getProperty(CIM_PROPERTY_VERSION);
		
		if (CIMProperty_Version == null || CIMProperty_Version.getValue().isEmpty() || CIMProperty_Version.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_VERSION, "Required"});
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
	    
	    if (!(object instanceof CIM_CIMXMLCommunicationMechanism)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CIMXMLCommunicationMechanism)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CIMXMLCommunicationMechanism)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CIMXMLCommunicationMechanism)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CIMXMLCommunicationMechanism)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CIMXMLCommunicationMechanism)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CIMXMLCommunicationMechanism)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CIMXMLCommunicationMechanism)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CIMXMLCommunicationMechanism)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CIMXMLCommunicationMechanism)object).cimObjectPath)) {
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
	
	// Attribute CIMValidated
	
	public Boolean get_CIMValidated() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIMValidated(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED + " could not be found");
    		
		} else if (!CIM_CIMXMLCommunicationMechanismHelper.isValid_CIMValidated(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMVALIDATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIMXMLProtocolVersion
	
	public UnsignedInt16 get_CIMXMLProtocolVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIMXMLProtocolVersion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION + " could not be found");
    		
		} else if (!CIM_CIMXMLCommunicationMechanismHelper.isValid_CIMXMLProtocolVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_CIMXMLPROTOCOLVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CommunicationMechanism
	
	public UnsignedInt16 get_CommunicationMechanism() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommunicationMechanism(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " could not be found");
    		
		} else if (!CIM_CIMXMLCommunicationMechanismHelper.isValid_CommunicationMechanism(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Version
	
	public String get_Version() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Version(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (!CIM_CIMXMLCommunicationMechanismHelper.isValid_Version(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMXMLCommunicationMechanism.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
