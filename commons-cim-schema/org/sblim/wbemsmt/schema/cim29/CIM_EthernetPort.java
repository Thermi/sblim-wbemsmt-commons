/** 
 * CIM_EthernetPort.java
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
 * Description:  Capabilities and management of an EthernetPort.
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
 *  Capabilities and management of an EthernetPort.
 */
public class CIM_EthernetPort extends CIM_NetworkPort  {
	
	public final static String CIM_CLASS_NAME = "CIM_EthernetPort"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Capabilities of the EthernetPort. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the EthernetPort features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	Specifies which capabilities are enabled from the list of all supported ones, defined in the Capabilities array.
	*/
	public final static String CIM_PROPERTY_ENABLEDCAPABILITIES = "EnabledCapabilities"; //$NON-NLS-1$
	/**
	*	The maximum size of the INFO (non-MAC) field that will be received or transmitted.
	*/
	public final static String CIM_PROPERTY_MAXDATASIZE = "MaxDataSize"; //$NON-NLS-1$
	/**
	*	Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
	*/
	public final static String CIM_PROPERTY_NETWORKADDRESSES = "NetworkAddresses"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the enabled capabilities that are specified as 'Other'.
	*/
	public final static String CIM_PROPERTY_OTHERENABLEDCAPABILITIES = "OtherEnabledCapabilities"; //$NON-NLS-1$
	/**
	*	The specific mode currently enabled for the Port. When set to 1 ("Other"), the related property OtherPortType contains a string description of the port's type.
	*/
	public final static String CIM_PROPERTY_PORTTYPE = "PortType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATASIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NETWORKADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERENABLEDCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTTYPE);
				
		for (int i = 0; i < CIM_NetworkPort.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATASIZE)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERENABLEDCAPABILITIES)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTTYPE)){
				continue;
			}
			
			CIM_EthernetPort.CIM_PropertyNameList.add(CIM_NetworkPort.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATASIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NETWORKADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERENABLEDCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_NetworkPort.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATASIZE)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERENABLEDCAPABILITIES)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTTYPE)){
				continue;
			}
			
			CIM_EthernetPort.CIM_PropertyList.add(CIM_NetworkPort.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_NetworkPort.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","AlertOnLan","WakeOnLan","FailOver","LoadBalancing"};
	public final static String[] CIM_VALUEMAP_ENABLEDCAPABILITIES = {"Unknown","Other","AlertOnLan","WakeOnLan","FailOver","LoadBalancing"};
	public final static String[] CIM_VALUEMAP_PORTTYPE = {"Unknown","Other","10BaseT","10-100BaseT","100BaseT","1000BaseT","Vendor Reserved"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_ALERTONLAN = 2;
	public final static int CAPABILITIES_WAKEONLAN = 3;
	public final static int CAPABILITIES_FAILOVER = 4;
	public final static int CAPABILITIES_LOADBALANCING = 5;
	
	public final static int ENABLEDCAPABILITIES_UNKNOWN = 0;
	public final static int ENABLEDCAPABILITIES_OTHER = 1;
	public final static int ENABLEDCAPABILITIES_ALERTONLAN = 2;
	public final static int ENABLEDCAPABILITIES_WAKEONLAN = 3;
	public final static int ENABLEDCAPABILITIES_FAILOVER = 4;
	public final static int ENABLEDCAPABILITIES_LOADBALANCING = 5;
	
	public final static String PORTTYPE_UNKNOWN = "0";
	public final static String PORTTYPE_OTHER = "1";
	public final static String PORTTYPE_10BASET = "50";
	public final static String PORTTYPE_10_100BASET = "51";
	public final static String PORTTYPE_100BASET = "52";
	public final static String PORTTYPE_1000BASET = "53";
	public final static String PORTTYPE_VENDORRESERVED = "16000..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EthernetPort() {

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
	public CIM_EthernetPort(Vector keyProperties){ 
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
	public CIM_EthernetPort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_EthernetPort.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_EthernetPort.Java_Package_List.toArray(new String[CIM_EthernetPort.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_EthernetPort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EthernetPort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EthernetPort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EthernetPort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EthernetPort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EthernetPort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EthernetPort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EthernetPort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EthernetPort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EthernetPort)object).cimObjectPath)) {
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
	
	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledCapabilities
	
	public UnsignedInt16[] get_EnabledCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_EnabledCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_EnabledCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataSize
	
	public UnsignedInt32 get_MaxDataSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_MaxDataSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NetworkAddresses
	
	public String[] get_NetworkAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_NetworkAddresses(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_NetworkAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherEnabledCapabilities
	
	public String[] get_OtherEnabledCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherEnabledCapabilities(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_OtherEnabledCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_OTHERENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortType
	
	public UnsignedInt16 get_PortType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_PORTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_PORTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_PORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPort.CIM_PROPERTY_PORTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPort.CIM_PROPERTY_PORTTYPE + " could not be found");
    		
		} else if (!CIM_EthernetPortHelper.isValid_PortType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPort.CIM_PROPERTY_PORTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPort.CIM_PROPERTY_PORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
