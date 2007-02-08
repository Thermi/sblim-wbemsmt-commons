/** 
 * CIM_NetworkPipe.java
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
 * Description: NetworkPipe is a subclass of EnabledLogicalElement, representing the state and management of a connection or trail between endpoints. This object is different than the association between the endpoints (CIM_ActiveConnection) since the emphasis is NOT on the endpoints but on the management of the pipe itself - its state, configuration, etc. NetworkPipes are defined in the context of a CIM_Network and represent the 'transfer of information . . . between . . . endpoints'. These concepts are aligned with the definition of the Pipe object in ITU's M.3100 specification.
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



public class CIM_NetworkPipe extends CIM_EnabledLogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_NetworkPipe";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ENDPOINTOFNETWORKPIPE = "CIM_EndpointOfNetworkPipe";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDNETWORKPIPE = "CIM_HostedNetworkPipe";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_NETWORKPIPECOMPOSITION = "CIM_NetworkPipeComposition";
	
	
	/**
	*	Indicates whether the pipe is composed of lower-level pipes, and if so, how these lower-level pipes are aggregated (in parallel or in sequence). The specific instances of NetworkPipe that are combined are described using the NetworkPipeComposition association. 

In the context of M.3100, the ability to be composed of lower-level pipes is modeled as a Trail. A Trail is made up of one or more Connections. (Note that both Trails and Connections are subclasses of Pipe). Because of the flexibility of the NetworkPipeComposition association, there is no need to subclass NetworkPipe, as was done in M.3100, but merely to instantiate the NetworkPipeComposition association to describe the bundling of the lower-level pipes (i.e., the connections), or the sequencing of them.
	*/
	public final static String CIM_PROPERTY_AGGREGATIONBEHAVIOR = "AggregationBehavior"; //$NON-NLS-1$
	/**
	*	Indicates whether the pipe is bi-directional (value = 2), unidirectional (value = 3), or this information is not known (value = 0). For unidirectional pipes, the source and sink are indicated by a property (SourceOrSink) of the association, EndpointOfNetworkPipe.
	*/
	public final static String CIM_PROPERTY_DIRECTIONALITY = "Directionality"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_ENABLEDSTATE = "EnabledState"; //$NON-NLS-1$
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. (For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.) 
<LocalID> MUST include either a vendor specified unique identifier, or if mapping from an ITU M.3100 environment, the trailID, connectionID or subNetworkConnectionID of the instances of PipeR2.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_REQUESTEDSTATE = "RequestedState"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AGGREGATIONBEHAVIOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTIONALITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTEDSTATE);
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AGGREGATIONBEHAVIOR)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTIONALITY)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDSTATE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTEDSTATE)){
				continue;
			}
			
			CIM_NetworkPipe.CIM_PropertyNameList.add(CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AGGREGATIONBEHAVIOR, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTIONALITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTEDSTATE, new CIMValue(new UnsignedInt16("5"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AGGREGATIONBEHAVIOR)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTIONALITY)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDSTATE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTEDSTATE)){
				continue;
			}
			
			CIM_NetworkPipe.CIM_PropertyList.add(CIM_EnabledLogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_EnabledLogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_EnabledLogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AGGREGATIONBEHAVIOR = {"Unknown","No Lower-Level Composition","Combined In Parallel","Combined In Sequence"};
	public final static String[] CIM_VALUEMAP_DIRECTIONALITY = {"Unknown","Bi-Directional","Unidirectional"};
	
	
	public final static int AGGREGATIONBEHAVIOR_UNKNOWN = 0;
	public final static int AGGREGATIONBEHAVIOR_NOLOWER_LEVELCOMPOSITION = 2;
	public final static int AGGREGATIONBEHAVIOR_COMBINEDINPARALLEL = 3;
	public final static int AGGREGATIONBEHAVIOR_COMBINEDINSEQUENCE = 4;
	
	public final static int DIRECTIONALITY_UNKNOWN = 0;
	public final static int DIRECTIONALITY_BI_DIRECTIONAL = 2;
	public final static int DIRECTIONALITY_UNIDIRECTIONAL = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NetworkPipe() {

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
	public CIM_NetworkPipe(Vector keyProperties){ 
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
	public CIM_NetworkPipe(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_InstanceID = this.cimInstance.getProperty(CIM_PROPERTY_INSTANCEID);
		
		if (CIMProperty_InstanceID == null || CIMProperty_InstanceID.getValue().isEmpty() || CIMProperty_InstanceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_INSTANCEID, "Key"});
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
	    
	    if (!(object instanceof CIM_NetworkPipe)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NetworkPipe)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NetworkPipe)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NetworkPipe)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NetworkPipe)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NetworkPipe)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NetworkPipe)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NetworkPipe)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NetworkPipe)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NetworkPipe)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ProtocolEndpoint_CIM_EndpointOfNetworkPipes(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ENDPOINTOFNETWORKPIPE, 
					CIM_ProtocolEndpoint.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_NetworkPipe.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPipe.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_NetworkPipe.Java_Package_List.get(i))).endsWith(".")) {
							CIM_NetworkPipe.Java_Package_List.setElementAt((String)(CIM_NetworkPipe.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_NetworkPipe.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ProtocolEndpoint_CIM_EndpointOfNetworkPipe_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ENDPOINTOFNETWORKPIPE, 
					CIM_ProtocolEndpoint.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ProtocolEndpoint.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Network_CIM_HostedNetworkPipes(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDNETWORKPIPE, 
					CIM_Network.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_NetworkPipe.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPipe.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_NetworkPipe.Java_Package_List.get(i))).endsWith(".")) {
							CIM_NetworkPipe.Java_Package_List.setElementAt((String)(CIM_NetworkPipe.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_NetworkPipe.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Network(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Network(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Network(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Network_CIM_HostedNetworkPipe_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDNETWORKPIPE, 
					CIM_Network.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Network.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_NetworkPipe_CIM_NetworkPipeCompositions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_NETWORKPIPECOMPOSITION, 
					CIM_NetworkPipe.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_NetworkPipe.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPipe.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_NetworkPipe.Java_Package_List.get(i))).endsWith(".")) {
							CIM_NetworkPipe.Java_Package_List.setElementAt((String)(CIM_NetworkPipe.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_NetworkPipe.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPipe(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_NetworkPipe(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPipe(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_NetworkPipe_CIM_NetworkPipeComposition_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_NETWORKPIPECOMPOSITION, 
					CIM_NetworkPipe.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkPipe.CIM_CLASS_NAME)) {
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
	
	// Attribute AggregationBehavior
	
	public UnsignedInt16 get_AggregationBehavior() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AggregationBehavior(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR + " could not be found");
    		
		} else if (!CIM_NetworkPipeHelper.isValid_AggregationBehavior(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_AGGREGATIONBEHAVIOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Directionality
	
	public UnsignedInt16 get_Directionality() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Directionality(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY + " could not be found");
    		
		} else if (!CIM_NetworkPipeHelper.isValid_Directionality(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_DIRECTIONALITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledState
	
	public UnsignedInt16 get_EnabledState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EnabledState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (!CIM_NetworkPipeHelper.isValid_EnabledState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_NetworkPipeHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestedState
	
	public UnsignedInt16 get_RequestedState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestedState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE + " could not be found");
    		
		} else if (!CIM_NetworkPipeHelper.isValid_RequestedState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipe.CIM_PROPERTY_REQUESTEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
