/** 
 * CIM_ObjectManagerAdapter.java
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
 * Description:  A ObjectManagerAdapter is a Service of the CIM Object Manager. An adapter can
 * be any service of the Object Manager that needs to be managed (e.g. started,
 * stopped, monitored, ...). There MUST be an instance for each Adapter type.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  A ObjectManagerAdapter is a Service of the CIM Object Manager. An adapter can
 * be any service of the Object Manager that needs to be managed (e.g. started,
 * stopped, monitored, ...). There MUST be an instance for each Adapter type.
 */
public class CIM_ObjectManagerAdapter extends CIM_WBEMService  {
	
	public final static String CIM_CLASS_NAME = "CIM_ObjectManagerAdapter"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER = "CIM_CommMechanismForObjectManagerAdapter"; //$NON-NLS-1$
	
	
	/**
	*	AdapterType enumerates the kind of Object Manager Adapter. If 'Other' is specified, the OtherAdapterTypeDescription property MUST be populated. 
Other - If the adapter does not fit into one of the other catagories in the list. If specified, the OtherAdapterTypeDescription property MUST be populated. 
Client - A client side adapter that responds to client operation requests, such as CIM-XML or CIM-SOAP. 
Provider - A provider adapter, such as DMI, SNMP, JSR48 or CMPI. 
Indication Handler - An Indication Handler is a service that delivers indications to a subscriber. Examples of possible Indication Handlers are CIM-XML, CIM-SOAP, SMPT (e-mail) or any other delivery mechanism. 
Repository - A repository is an adapter that can store/retrieve persistent data, such as CIM Qualifier Types, CIM Classes and CIM Instances. An Object Manager could use multiple repositiories at one time, for example one could be used for CIM Schema information only, while another is used for instance information. Repositories MAY be remote or local to the CIM Object Manager. Examples of repository implementations could be databases, LDAP or files.
	*/
	public final static String CIM_PROPERTY_ADAPTERTYPE = "AdapterType"; //$NON-NLS-1$
	/**
	*	The ElmentName property is used as a name of the Object Manager Adapter for human interfaces. For example, "ACME ObjectManager Adapter".
	*/
	public final static String CIM_PROPERTY_ELEMENTNAME = "ElementName"; //$NON-NLS-1$
	/**
	*	An implementation specific string that identifies the handle to the Object Manager Adapter.
	*/
	public final static String CIM_PROPERTY_HANDLE = "Handle"; //$NON-NLS-1$
	/**
	*	A human-readable name that uniquely identifies the ObjectManager within a system.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The type(s) of ObjectManagerAdapter when "Other" is included in ObjectManagerAdapterType property.
	*/
	public final static String CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION = "OtherAdapterTypeDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADAPTERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_HANDLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION);
				
		for (int i = 0; i < CIM_WBEMService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADAPTERTYPE)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTNAME)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HANDLE)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_WBEMService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_ObjectManagerAdapter.CIM_PropertyNameList.add(CIM_WBEMService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADAPTERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HANDLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_WBEMService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADAPTERTYPE)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTNAME)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HANDLE)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_WBEMService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_ObjectManagerAdapter.CIM_PropertyList.add(CIM_WBEMService.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_WBEMService.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADAPTERTYPE = {"Other","Client","Provider","Indication Handler","Repository"};
	
	
	public final static int ADAPTERTYPE_OTHER = 1;
	public final static int ADAPTERTYPE_CLIENT = 2;
	public final static int ADAPTERTYPE_PROVIDER = 3;
	public final static int ADAPTERTYPE_INDICATIONHANDLER = 4;
	public final static int ADAPTERTYPE_REPOSITORY = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ObjectManagerAdapter() {

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
	public CIM_ObjectManagerAdapter(Vector keyProperties){ 
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
	public CIM_ObjectManagerAdapter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_ObjectManagerAdapter.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ObjectManagerAdapter.Java_Package_List.toArray(new String[CIM_ObjectManagerAdapter.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_AdapterType = this.cimInstance.getProperty(CIM_PROPERTY_ADAPTERTYPE);
		
		if (CIMProperty_AdapterType == null || CIMProperty_AdapterType.getValue().isEmpty() || CIMProperty_AdapterType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ADAPTERTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_Handle = this.cimInstance.getProperty(CIM_PROPERTY_HANDLE);
		
		if (CIMProperty_Handle == null || CIMProperty_Handle.getValue().isEmpty() || CIMProperty_Handle.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_HANDLE, "Required"});
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
	    
	    if (!(object instanceof CIM_ObjectManagerAdapter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ObjectManagerAdapter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ObjectManagerAdapter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ObjectManagerAdapter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ObjectManagerAdapter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ObjectManagerAdapter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ObjectManagerAdapter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ObjectManagerAdapter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ObjectManagerAdapter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ObjectManagerAdapter)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, 
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
                    Class clazz = CIM_ObjectManagerAdapterHelper.findClass(cimClient, cimInstance);
                    
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

	public ArrayList getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, 
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
	
	// Attribute AdapterType
	
	public UnsignedInt16 get_AdapterType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AdapterType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE + " could not be found");
    		
		} else if (!CIM_ObjectManagerAdapterHelper.isValid_AdapterType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ADAPTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElementName
	
	public String get_ElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (!CIM_ObjectManagerAdapterHelper.isValid_ElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Handle
	
	public String get_Handle() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Handle(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE + " could not be found");
    		
		} else if (!CIM_ObjectManagerAdapterHelper.isValid_Handle(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_HANDLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ObjectManagerAdapterHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAdapterTypeDescription
	
	public String get_OtherAdapterTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAdapterTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ObjectManagerAdapterHelper.isValid_OtherAdapterTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerAdapter.CIM_PROPERTY_OTHERADAPTERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
