/** 
 * CIM_ProtocolAdapter.java
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
 * Description:  CIM_ProtocolAdapter is deprecated in lieu of CIM_ObjectManagerAdapter. Since
 * the CIM_ProtocolAdapter class does not have to support the protocols and can
 * be any type of adapter, it was decided to change the name to
 * ObjectManagerAdapter to better reflect the true meaning of the class. A
 * ProtocolAdapter is a Service of the CIM Object Manager. It is responsible for
 * accepting incoming requests on a particular protocol, and translating and
 * forwarding the request to the CIM Object Manager. It is also responsible for
 * translating and sending the response from the CIM Object Manager.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  CIM_ProtocolAdapter is deprecated in lieu of CIM_ObjectManagerAdapter. Since
 * the CIM_ProtocolAdapter class does not have to support the protocols and can
 * be any type of adapter, it was decided to change the name to
 * ObjectManagerAdapter to better reflect the true meaning of the class. A
 * ProtocolAdapter is a Service of the CIM Object Manager. It is responsible for
 * accepting incoming requests on a particular protocol, and translating and
 * forwarding the request to the CIM Object Manager. It is also responsible for
 * translating and sending the response from the CIM Object Manager.
 */
public class CIM_ProtocolAdapter extends CIM_WBEMService  {
	
	public final static String CIM_CLASS_NAME = "CIM_ProtocolAdapter"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER = "CIM_CommMechanismForAdapter"; //$NON-NLS-1$
	
	
	/**
	*	An implementation specific string that identifies the handle to the ProtocolAdapter.
	*/
	public final static String CIM_PROPERTY_HANDLE = "Handle"; //$NON-NLS-1$
	/**
	*	A human-readable name that uniquely identifies the Protocol Adapter within a system.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The type(s) of ProtocolAdapter when "Other" is included in ProtocolAdapterType property.
	*/
	public final static String CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE = "OtherProtocolAdapterType"; //$NON-NLS-1$
	/**
	*	ProtocolAdapterType enumerates the kind of Protocol Adapter.
	*/
	public final static String CIM_PROPERTY_PROTOCOLADAPTERTYPE = "ProtocolAdapterType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HANDLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLADAPTERTYPE);
				
		for (int i = 0; i < CIM_WBEMService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HANDLE)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLADAPTERTYPE)){
				continue;
			}
			
			CIM_ProtocolAdapter.CIM_PropertyNameList.add(CIM_WBEMService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HANDLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLADAPTERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_WBEMService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HANDLE)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLADAPTERTYPE)){
				continue;
			}
			
			CIM_ProtocolAdapter.CIM_PropertyList.add(CIM_WBEMService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_WBEMService.Java_Package_List.size(); i++) {
			if (((String)CIM_WBEMService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_WBEMService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PROTOCOLADAPTERTYPE = {"Other","Client","Provider"};
	
	
	public final static int PROTOCOLADAPTERTYPE_OTHER = 1;
	public final static int PROTOCOLADAPTERTYPE_CLIENT = 2;
	public final static int PROTOCOLADAPTERTYPE_PROVIDER = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ProtocolAdapter() {

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
	public CIM_ProtocolAdapter(Vector keyProperties){ 
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
	public CIM_ProtocolAdapter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Handle = this.cimInstance.getProperty(CIM_PROPERTY_HANDLE);
		
		if (CIMProperty_Handle == null || CIMProperty_Handle.getValue().isEmpty() || CIMProperty_Handle.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_HANDLE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProtocolAdapterType = this.cimInstance.getProperty(CIM_PROPERTY_PROTOCOLADAPTERTYPE);
		
		if (CIMProperty_ProtocolAdapterType == null || CIMProperty_ProtocolAdapterType.getValue().isEmpty() || CIMProperty_ProtocolAdapterType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PROTOCOLADAPTERTYPE, "Required"});
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
	    
	    if (!(object instanceof CIM_ProtocolAdapter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ProtocolAdapter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ProtocolAdapter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ProtocolAdapter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ProtocolAdapter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ProtocolAdapter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ProtocolAdapter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ProtocolAdapter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ProtocolAdapter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ProtocolAdapter)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, 
					CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_ProtocolAdapter.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ProtocolAdapter.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ProtocolAdapter.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ProtocolAdapter.Java_Package_List.setElementAt((String)(CIM_ProtocolAdapter.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ProtocolAdapter.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, 
					CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME)) {
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
	
	// Attribute Handle
	
	public String get_Handle() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Handle(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE + " could not be found");
    		
		} else if (!CIM_ProtocolAdapterHelper.isValid_Handle(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_HANDLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ProtocolAdapterHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolAdapter.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherProtocolAdapterType
	
	public String get_OtherProtocolAdapterType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherProtocolAdapterType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE + " could not be found");
    		
		} else if (!CIM_ProtocolAdapterHelper.isValid_OtherProtocolAdapterType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_OTHERPROTOCOLADAPTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolAdapterType
	
	public UnsignedInt16 get_ProtocolAdapterType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolAdapterType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE + " could not be found");
    		
		} else if (!CIM_ProtocolAdapterHelper.isValid_ProtocolAdapterType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolAdapter.CIM_PROPERTY_PROTOCOLADAPTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}