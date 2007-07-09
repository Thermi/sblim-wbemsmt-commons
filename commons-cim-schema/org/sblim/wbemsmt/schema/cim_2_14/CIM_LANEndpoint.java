/** 
 * CIM_LANEndpoint.java
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
 * Description:  A communication endpoint which, when its associated interface device is
 * connected to a LAN, may send and receive data frames. LANEndpoints include
 * Ethernet, Token Ring and FDDI interfaces.
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
 *  A communication endpoint which, when its associated interface device is
 * connected to a LAN, may send and receive data frames. LANEndpoints include
 * Ethernet, Token Ring and FDDI interfaces.
 */
public class CIM_LANEndpoint extends CIM_ProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_LANEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Other unicast addresses that may be used to communicate with the LANEndpoint.
	*/
	public final static String CIM_PROPERTY_ALIASADDRESSES = "AliasAddresses"; //$NON-NLS-1$
	/**
	*	Multicast addresses to which the LANEndpoint listens.
	*/
	public final static String CIM_PROPERTY_GROUPADDRESSES = "GroupAddresses"; //$NON-NLS-1$
	/**
	*	A label or identifier for the LAN Segment to which the Endpoint is connected. If the Endpoint is not currently active/connected or this information is not known, then LANID is NULL.
	*/
	public final static String CIM_PROPERTY_LANID = "LANID"; //$NON-NLS-1$
	/**
	*	An indication of the kind of technology used on the LAN. This property is deprecated in lieu of ProtocolType, which is an enumeration inherited from ProtocolEndpoint and which includes the Values specified here.
	*/
	public final static String CIM_PROPERTY_LANTYPE = "LANType"; //$NON-NLS-1$
	/**
	*	The principal unicast address used in communication with the LANEndpoint. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	*/
	public final static String CIM_PROPERTY_MACADDRESS = "MACAddress"; //$NON-NLS-1$
	/**
	*	The largest information field that may be sent or received by the LANEndpoint.
	*/
	public final static String CIM_PROPERTY_MAXDATASIZE = "MaxDataSize"; //$NON-NLS-1$
	/**
	*	A free-form string that describes the type of technology used on the LAN when the value of the LANType property is equal to 1 (i.e., "Other"). This property is deprecated since its purpose overlaps with OtherTypeDescription, which which is inherited from ProtocolEndpoint.
	*/
	public final static String CIM_PROPERTY_OTHERLANTYPE = "OtherLANType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALIASADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_GROUPADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANID);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MACADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATASIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLANTYPE);
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALIASADDRESSES)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GROUPADDRESSES)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANID)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANTYPE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MACADDRESS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATASIZE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLANTYPE)){
				continue;
			}
			
			CIM_LANEndpoint.CIM_PropertyNameList.add(CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALIASADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GROUPADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MACADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATASIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLANTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALIASADDRESSES)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GROUPADDRESSES)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANID)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANTYPE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MACADDRESS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATASIZE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLANTYPE)){
				continue;
			}
			
			CIM_LANEndpoint.CIM_PropertyList.add(CIM_ProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
				
		String[] parentClassPackageList = CIM_ProtocolEndpoint.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_LANTYPE = {"Unknown","Other","Ethernet","TokenRing","FDDI"};
	
	
	public final static int LANTYPE_UNKNOWN = 0;
	public final static int LANTYPE_OTHER = 1;
	public final static int LANTYPE_ETHERNET = 2;
	public final static int LANTYPE_TOKENRING = 3;
	public final static int LANTYPE_FDDI = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_LANEndpoint() {

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
	public CIM_LANEndpoint(Vector keyProperties){ 
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
	public CIM_LANEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_LANEndpoint.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_LANEndpoint.Java_Package_List.toArray(new String[CIM_LANEndpoint.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_LANEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LANEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LANEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LANEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LANEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LANEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LANEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LANEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LANEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LANEndpoint)object).cimObjectPath)) {
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
	
	// Attribute AliasAddresses
	
	public String[] get_AliasAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AliasAddresses(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_AliasAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_ALIASADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GroupAddresses
	
	public String[] get_GroupAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_GroupAddresses(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_GroupAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_GROUPADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LANID
	
	public String get_LANID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_LANID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LANID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_LANID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANID + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_LANID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_LANID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LANType
	
	public UnsignedInt16 get_LANType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_LANTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LANType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_LANTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANTYPE + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_LANType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_LANTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_LANTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MACAddress
	
	public String get_MACAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MACAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_MACAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MACADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataSize
	
	public UnsignedInt32 get_MaxDataSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_MaxDataSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLANType
	
	public String get_OtherLANType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLANType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE + " could not be found");
    		
		} else if (!CIM_LANEndpointHelper.isValid_OtherLANType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANEndpoint.CIM_PROPERTY_OTHERLANTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}