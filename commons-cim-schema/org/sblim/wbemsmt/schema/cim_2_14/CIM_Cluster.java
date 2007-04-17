/** 
 * CIM_Cluster.java
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
 * Description:  A class derived from ComputerSystem that 'is made up of' two or more
 * ComputerSystems which operate together as an atomic, functional whole to
 * increase the performance, resources and/or RAS (Reliability, Availability and
 * Serviceability) of the component ComputerSystems, related to some aspects of
 * these ComputerSystems.
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
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  A class derived from ComputerSystem that 'is made up of' two or more
 * ComputerSystems which operate together as an atomic, functional whole to
 * increase the performance, resources and/or RAS (Reliability, Availability and
 * Serviceability) of the component ComputerSystems, related to some aspects of
 * these ComputerSystems.
 */
public class CIM_Cluster extends CIM_ComputerSystem  {
	
	public final static String CIM_CLASS_NAME = "CIM_Cluster"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PARTICIPATINGCS = "CIM_ParticipatingCS"; //$NON-NLS-1$
	
	
	/**
	*	Indicates the state of the Cluster. The cluster can be defined to be on-line (value=2), off-line (3), in a degraded mode of operation (4) or unavailable (5).
	*/
	public final static String CIM_PROPERTY_CLUSTERSTATE = "ClusterState"; //$NON-NLS-1$
	/**
	*	Interconnect is a free form string that describes the interconnection mechanism for the Cluster.
	*/
	public final static String CIM_PROPERTY_INTERCONNECT = "Interconnect"; //$NON-NLS-1$
	/**
	*	InterconnectAddress indicates the address of the Cluster System, which is dependent on the interconnection scheme. If no address is available or applicable, a null string should be used.
	*/
	public final static String CIM_PROPERTY_INTERCONNECTADDRESS = "InterconnectAddress"; //$NON-NLS-1$
	/**
	*	Indicates the maximum number of nodes that may participate in the Cluster. If unlimited, enter 0.
	*/
	public final static String CIM_PROPERTY_MAXNUMBEROFNODES = "MaxNumberOfNodes"; //$NON-NLS-1$
	/**
	*	The cluster types. This specifies whether the cluster is for failover (value=2), performance (3), etc. The values which can be specified are not mutually exclusive. Thus, Types is an array.
	*/
	public final static String CIM_PROPERTY_TYPES = "Types"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLUSTERSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERCONNECT);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERCONNECTADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBEROFNODES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPES);
				
		for (int i = 0; i < CIM_ComputerSystem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLUSTERSTATE)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERCONNECT)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERCONNECTADDRESS)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBEROFNODES)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPES)){
				continue;
			}
			
			CIM_Cluster.CIM_PropertyNameList.add(CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLUSTERSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERCONNECT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERCONNECTADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBEROFNODES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_ComputerSystem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLUSTERSTATE)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERCONNECT)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERCONNECTADDRESS)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBEROFNODES)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPES)){
				continue;
			}
			
			CIM_Cluster.CIM_PropertyList.add(CIM_ComputerSystem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ComputerSystem.Java_Package_List.size(); i++) {
			if (((String)CIM_ComputerSystem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ComputerSystem.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CLUSTERSTATE = {"Unknown","Other","On-line","Off-line","Degraded","Unavailable"};
	public final static String[] CIM_VALUEMAP_TYPES = {"Unknown","Other","Failover","Performance","Distributed OS","Node Grouping","SysPlex"};
	
	
	public final static int CLUSTERSTATE_UNKNOWN = 0;
	public final static int CLUSTERSTATE_OTHER = 1;
	public final static int CLUSTERSTATE_ON_LINE = 2;
	public final static int CLUSTERSTATE_OFF_LINE = 3;
	public final static int CLUSTERSTATE_DEGRADED = 4;
	public final static int CLUSTERSTATE_UNAVAILABLE = 5;
	
	public final static int TYPES_UNKNOWN = 0;
	public final static int TYPES_OTHER = 1;
	public final static int TYPES_FAILOVER = 2;
	public final static int TYPES_PERFORMANCE = 3;
	public final static int TYPES_DISTRIBUTEDOS = 4;
	public final static int TYPES_NODEGROUPING = 5;
	public final static int TYPES_SYSPLEX = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Cluster() {

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
	public CIM_Cluster(Vector keyProperties){ 
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
	public CIM_Cluster(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Cluster)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Cluster)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Cluster)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Cluster)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Cluster)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Cluster)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Cluster)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Cluster)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Cluster)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Cluster)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ComputerSystem_CIM_ParticipatingCSs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PARTICIPATINGCS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Cluster.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Cluster.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_Cluster.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_Cluster.Java_Package_List.setElementAt((String)(CIM_Cluster.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_Cluster.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_ParticipatingCS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PARTICIPATINGCS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute ClusterState
	
	public UnsignedInt16 get_ClusterState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClusterState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE + " could not be found");
    		
		} else if (!CIM_ClusterHelper.isValid_ClusterState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_CLUSTERSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Interconnect
	
	public String get_Interconnect() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_INTERCONNECT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Interconnect(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_INTERCONNECT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECT + " could not be found");
    		
		} else if (!CIM_ClusterHelper.isValid_Interconnect(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InterconnectAddress
	
	public String get_InterconnectAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InterconnectAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS + " could not be found");
    		
		} else if (!CIM_ClusterHelper.isValid_InterconnectAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_INTERCONNECTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumberOfNodes
	
	public UnsignedInt32 get_MaxNumberOfNodes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberOfNodes(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES + " could not be found");
    		
		} else if (!CIM_ClusterHelper.isValid_MaxNumberOfNodes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_MAXNUMBEROFNODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Types
	
	public UnsignedInt16[] get_Types() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_TYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_TYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Types(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Cluster.CIM_PROPERTY_TYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Cluster.CIM_PROPERTY_TYPES + " could not be found");
    		
		} else if (!CIM_ClusterHelper.isValid_Types(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Cluster.CIM_PROPERTY_TYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Cluster.CIM_PROPERTY_TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
