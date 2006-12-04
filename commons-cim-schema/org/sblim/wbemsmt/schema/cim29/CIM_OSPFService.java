/** 
 * CIM_OSPFService.java
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
 * Description: This class is used to represent the basic operation of OSPF. It is derived from the RouteCalculationService, the superclass of all routing protocols.
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



public class CIM_OSPFService extends CIM_RouteCalculationService  {
	
	public final static String CIM_CLASS_NAME = "CIM_OSPFService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPFSERVICECONFIGURATION = "CIM_OSPFServiceConfiguration";
	
	
	/**
	*	The number of seconds that, after entering OverflowState, a router will attempt to leave OverflowState. When set to 0, the router will not leave OverflowState until restarted, see 2.1 in RFC 1765.
	*/
	public final static String CIM_PROPERTY_EXITOVERFLOWINTERVAL = "ExitOverflowInterval"; //$NON-NLS-1$
	/**
	*	This attribute indicates whether this router will forward multicast datagrams between OSPF areas or not, see B.1 in RFC 1584.
	*/
	public final static String CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER = "IsInterAreaMulticastForwarder"; //$NON-NLS-1$
	/**
	*	This attribute indicates whether this router will forward multicast datagrams between Autonomous Systems or not, see B.1 in RFC 1584.
	*/
	public final static String CIM_PROPERTY_ISINTERASMULTICASTFORWARDER = "IsInterAsMulticastForwarder"; //$NON-NLS-1$
	/**
	*	Controls the preference rules used in choosing among multiple AS-external-LSAs advertising the same destination. When set to TRUE, the preference rules remain those specified by RFC 1583. When set to FALSE, the preference rules are those stated in RFC 2328, which prevent routing loops when AS-external-LSAs for the same destination have been originated from different areas. See C.1 in RFC2328.
	*/
	public final static String CIM_PROPERTY_RFC1583COMPATIBILITY = "RFC1583Compatibility"; //$NON-NLS-1$
	/**
	*	This attribute indicates whether this router is running MOSPF (multicast enhancements to OSPF) or not, see B.1 in RFC 1584. This attribute only can be true, when the SupportMOSPF property in OSPFService Capabilities is also true. If SupportMOSPF is false, then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_RUNNINGMOSPF = "RunningMOSPF"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_EXITOVERFLOWINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISINTERASMULTICASTFORWARDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_RFC1583COMPATIBILITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_RUNNINGMOSPF);
				
		for (int i = 0; i < CIM_RouteCalculationService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RouteCalculationService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXITOVERFLOWINTERVAL)||
				((String)CIM_RouteCalculationService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER)||
				((String)CIM_RouteCalculationService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISINTERASMULTICASTFORWARDER)||
				((String)CIM_RouteCalculationService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RFC1583COMPATIBILITY)||
				((String)CIM_RouteCalculationService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RUNNINGMOSPF)){
				continue;
			}
			
			CIM_OSPFService.CIM_PropertyNameList.add(CIM_RouteCalculationService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXITOVERFLOWINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISINTERASMULTICASTFORWARDER, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RFC1583COMPATIBILITY, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RUNNINGMOSPF, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_RouteCalculationService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RouteCalculationService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXITOVERFLOWINTERVAL)||
				((CIMProperty)CIM_RouteCalculationService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER)||
				((CIMProperty)CIM_RouteCalculationService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISINTERASMULTICASTFORWARDER)||
				((CIMProperty)CIM_RouteCalculationService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RFC1583COMPATIBILITY)||
				((CIMProperty)CIM_RouteCalculationService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RUNNINGMOSPF)){
				continue;
			}
			
			CIM_OSPFService.CIM_PropertyList.add(CIM_RouteCalculationService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_RouteCalculationService.Java_Package_List.size(); i++) {
			if (((String)CIM_RouteCalculationService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_RouteCalculationService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OSPFService() {

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
	public CIM_OSPFService(Vector keyProperties){ 
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
	public CIM_OSPFService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_OSPFService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OSPFService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OSPFService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OSPFService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OSPFService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OSPFService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OSPFService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OSPFService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OSPFService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OSPFService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_OSPFAreaConfiguration_CIM_OSPFServiceConfigurations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPFSERVICECONFIGURATION, 
					CIM_OSPFAreaConfiguration.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OSPFService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OSPFService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_OSPFService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_OSPFService.Java_Package_List.setElementAt((String)(CIM_OSPFService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_OSPFService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OSPFAreaConfiguration(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_OSPFAreaConfiguration(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OSPFAreaConfiguration(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_OSPFAreaConfiguration_CIM_OSPFServiceConfiguration_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPFSERVICECONFIGURATION, 
					CIM_OSPFAreaConfiguration.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OSPFAreaConfiguration.CIM_CLASS_NAME)) {
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
	
	// Attribute ExitOverflowInterval
	
	public UnsignedInt32 get_ExitOverflowInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExitOverflowInterval(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL + " could not be found");
    		
		} else if (!CIM_OSPFServiceHelper.isValid_ExitOverflowInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_EXITOVERFLOWINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsInterAreaMulticastForwarder
	
	public Boolean get_IsInterAreaMulticastForwarder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsInterAreaMulticastForwarder(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER + " could not be found");
    		
		} else if (!CIM_OSPFServiceHelper.isValid_IsInterAreaMulticastForwarder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERAREAMULTICASTFORWARDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsInterAsMulticastForwarder
	
	public Boolean get_IsInterAsMulticastForwarder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsInterAsMulticastForwarder(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER + " could not be found");
    		
		} else if (!CIM_OSPFServiceHelper.isValid_IsInterAsMulticastForwarder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_ISINTERASMULTICASTFORWARDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RFC1583Compatibility
	
	public Boolean get_RFC1583Compatibility() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RFC1583Compatibility(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY + " could not be found");
    		
		} else if (!CIM_OSPFServiceHelper.isValid_RFC1583Compatibility(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_RFC1583COMPATIBILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RunningMOSPF
	
	public Boolean get_RunningMOSPF() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RunningMOSPF(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF + " could not be found");
    		
		} else if (!CIM_OSPFServiceHelper.isValid_RunningMOSPF(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFService.CIM_PROPERTY_RUNNINGMOSPF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
