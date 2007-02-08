/** 
 * CIM_OSPFLink.java
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
 * Description: This class is used to represent OSPF connectivity between two or more OSPF protocol endpoints.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_OSPFLink extends CIM_ConnectivityCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_OSPFLink";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ENDPOINTINLINK = "CIM_EndpointInLink";
	
	
	/**
	*	The time, in seconds, between sending OSPF Hello-packets over the interface, see section C.3 in RFC 2328.
	*/
	public final static String CIM_PROPERTY_HELLOINTERVAL = "HelloInterval"; //$NON-NLS-1$
	/**
	*	The type of the OSPF link, see section 1.2 in RFC 2328.
	*/
	public final static String CIM_PROPERTY_LINKTYPE = "LinkType"; //$NON-NLS-1$
	/**
	*	This parameter indicates whether IP multicast datagrams should be forwarded over this OSPF link, and if so, how the forwarding should be done, see section B.2 in RFC 1584.
	*/
	public final static String CIM_PROPERTY_MULTICASTFORWARDING = "MulticastForwarding"; //$NON-NLS-1$
	/**
	*	After ceasing to hear a router's Hello-packets, the number of seconds before its neighbors declare the router down, see section C.3 in RFC 2328.
	*/
	public final static String CIM_PROPERTY_ROUTERDEADINTERVAL = "RouterDeadInterval"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HELLOINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTICASTFORWARDING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROUTERDEADINTERVAL);
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HELLOINTERVAL)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKTYPE)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTICASTFORWARDING)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROUTERDEADINTERVAL)){
				continue;
			}
			
			CIM_OSPFLink.CIM_PropertyNameList.add(CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HELLOINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTICASTFORWARDING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROUTERDEADINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HELLOINTERVAL)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKTYPE)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTICASTFORWARDING)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROUTERDEADINTERVAL)){
				continue;
			}
			
			CIM_OSPFLink.CIM_PropertyList.add(CIM_ConnectivityCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ConnectivityCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_ConnectivityCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConnectivityCollection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LINKTYPE = {"Point-To-Point","Point-To-Multipoint","Broadcast","NBMA"};
	public final static String[] CIM_VALUEMAP_MULTICASTFORWARDING = {"Disabled","Data-link Multicast","Data-link Unicast"};
	
	
	public final static int LINKTYPE_POINT_TO_POINT = 2;
	public final static int LINKTYPE_POINT_TO_MULTIPOINT = 3;
	public final static int LINKTYPE_BROADCAST = 4;
	public final static int LINKTYPE_NBMA = 5;
	
	public final static int MULTICASTFORWARDING_DISABLED = 2;
	public final static int MULTICASTFORWARDING_DATA_LINKMULTICAST = 3;
	public final static int MULTICASTFORWARDING_DATA_LINKUNICAST = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OSPFLink() {

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
	public CIM_OSPFLink(Vector keyProperties){ 
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
	public CIM_OSPFLink(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_LinkType = this.cimInstance.getProperty(CIM_PROPERTY_LINKTYPE);
		
		if (CIMProperty_LinkType == null || CIMProperty_LinkType.getValue().isEmpty() || CIMProperty_LinkType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LINKTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_MulticastForwarding = this.cimInstance.getProperty(CIM_PROPERTY_MULTICASTFORWARDING);
		
		if (CIMProperty_MulticastForwarding == null || CIMProperty_MulticastForwarding.getValue().isEmpty() || CIMProperty_MulticastForwarding.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MULTICASTFORWARDING, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_OSPFLink)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OSPFLink)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OSPFLink)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OSPFLink)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OSPFLink)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OSPFLink)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OSPFLink)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OSPFLink)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OSPFLink)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OSPFLink)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_OSPFProtocolEndpointBase_CIM_EndpointInLinks(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ENDPOINTINLINK, 
					CIM_OSPFProtocolEndpointBase.CIM_CLASS_NAME, 
					"Collection",
					"Member",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OSPFLink.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OSPFLink.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_OSPFLink.Java_Package_List.get(i))).endsWith(".")) {
							CIM_OSPFLink.Java_Package_List.setElementAt((String)(CIM_OSPFLink.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_OSPFLink.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OSPFProtocolEndpointBase(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OSPFProtocolEndpointBase(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OSPFProtocolEndpointBase(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_OSPFProtocolEndpointBase_CIM_EndpointInLink_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ENDPOINTINLINK, 
					CIM_OSPFProtocolEndpointBase.CIM_CLASS_NAME, 
					"Collection",
					"Member");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OSPFProtocolEndpointBase.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute HelloInterval
	
	public UnsignedInt32 get_HelloInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HelloInterval(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL + " could not be found");
    		
		} else if (!CIM_OSPFLinkHelper.isValid_HelloInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_HELLOINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LinkType
	
	public UnsignedInt16 get_LinkType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_LINKTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_LINKTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_LINKTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_LINKTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_LINKTYPE + " could not be found");
    		
		} else if (!CIM_OSPFLinkHelper.isValid_LinkType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFLink.CIM_PROPERTY_LINKTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_LINKTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MulticastForwarding
	
	public UnsignedInt16 get_MulticastForwarding() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MulticastForwarding(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING + " could not be found");
    		
		} else if (!CIM_OSPFLinkHelper.isValid_MulticastForwarding(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_MULTICASTFORWARDING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RouterDeadInterval
	
	public UnsignedInt32 get_RouterDeadInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RouterDeadInterval(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL + " could not be found");
    		
		} else if (!CIM_OSPFLinkHelper.isValid_RouterDeadInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFLink.CIM_PROPERTY_ROUTERDEADINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
