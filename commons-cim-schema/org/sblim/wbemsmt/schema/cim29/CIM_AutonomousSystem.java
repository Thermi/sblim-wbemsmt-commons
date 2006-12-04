/** 
 * CIM_AutonomousSystem.java
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
 * Description: An Autonomous System (AS) is a fundamental concept in networking. An AS provides a structured view of routing by segregating the system that is using routing (e.g., the Internet, or an extranet) into a set of separately administered domains that each have their own independent routing policies. These domains are called autonomous systems. 

The classic definition of an AS, from RFC1771, is '...a set of routers under a single technical administration, using an interior gateway protocol and common metrics to route packets within the AS, and using an exterior gateway protocol to route packets to other ASs'. The RFC continues: 'Since this classic definition was developed, it has become common for a single AS to use several interior gateway protocols and sometimes several sets of metrics within an AS. The use of the term Autonomous System here stresses the fact that, even when multiple IGPs and metrics are used, the administration of an AS appears to other ASs to have a single coherent interior routing plan and presents a consistent picture of what destinations are reachable through it.'
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



public class CIM_AutonomousSystem extends CIM_AdminDomain  {
	
	public final static String CIM_CLASS_NAME = "CIM_AutonomousSystem";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASBGPENDPOINTS = "CIM_ASBGPEndpoints";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPCLUSTERSINAS = "CIM_BGPClustersInAS";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CONFEDERATION = "CIM_Confederation";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPATTRIBUTES = "CIM_HostedBGPAttributes";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPPEERGROUP = "CIM_HostedBGPPeerGroup";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPROUTEMAP = "CIM_HostedBGPRouteMap";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTERSINAS = "CIM_RoutersInAS";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTINGPROTOCOLDOMAININAS = "CIM_RoutingProtocolDomainInAS";
	
	
	/**
	*	An ASNumber is an integer between 1 and 65535, with the range 64512 through 65535 reserved for private use. Every AS has a unique AS number, which is assigned to it by an Internet Registry or a provider. IANA assigns and administers AS numbers.
	*/
	public final static String CIM_PROPERTY_ASNUMBER = "ASNumber"; //$NON-NLS-1$
	/**
	*	Route aggregation refers to summarizing ranges of routes into one or more aggregate routes. This is done to minimize the number of routes in the global routing table. A potential drawback is that specific path information (e.g., the Path attribute value) is lost, which may lead to potential routing loops. There are a variety of ways to ensure that this does not happen. Note that BGP4 is required to do this. 

There are many ways to form aggregate routes. The following are the most popular: 'Aggregate only', where only the aggregate is advertised, and all of its more specific routes are suppressed; 'Aggregate Plus Specific Routes', where both the aggregate as well as its more specific routes are advertised (e.g., send the aggregate to the NAP, but send the more specific routes to providers); 'Aggregate Based on a Subset of Specific Routes', where the aggregate route is formed by looking at certain more specific routes and forming an aggregate on them, suppressing all others.
	*/
	public final static String CIM_PROPERTY_AGGREGATIONTYPE = "AggregationType"; //$NON-NLS-1$
	/**
	*	IsSingleHomed is a boolean that, when its value is TRUE, indicates that this AS reaches networks outside of its domain through a single exit point.
	*/
	public final static String CIM_PROPERTY_ISSINGLEHOMED = "IsSingleHomed"; //$NON-NLS-1$
	/**
	*	IsTransit is a boolean that, when its value is TRUE, indicates that this AS will advertise routes that it learns from other ASs. A non-transit AS will only advertise its own routes.
	*/
	public final static String CIM_PROPERTY_ISTRANSIT = "IsTransit"; //$NON-NLS-1$
	/**
	*	RequireIGPSync is a boolean that, when its value is TRUE, indicates that this AS must obey the following rule: a router should not advertise destinations learned from internal neighbors to external destinations unless those destinations are also known via some internal gateway protocol. Otherwise, a router may receive traffic that cannot yet be routed. However, since this is a costly choice, it is common practice to allow this rule to be broken under certain carefully controlled circumstances.
	*/
	public final static String CIM_PROPERTY_REQUIREIGPSYNC = "RequireIGPSync"; //$NON-NLS-1$
	/**
	*	RoutingUpdateSource defines how routing information is to be injected. Statically injected routes are maintained by the routing table and are independent of the status of the networks to which they refer. This is done simply by defining static routes in the routing table. Dynamically injected routes are of two types. Dynamic routes refer to distributing all of the IGP routes. Semi-dynamic routes define a set of specific IGP routes that will be injected.
	*/
	public final static String CIM_PROPERTY_ROUTINGUPDATESOURCE = "RoutingUpdateSource"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ASNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_AGGREGATIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISSINGLEHOMED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISTRANSIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUIREIGPSYNC);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROUTINGUPDATESOURCE);
				
		for (int i = 0; i < CIM_AdminDomain.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_AdminDomain.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ASNUMBER)||
				((String)CIM_AdminDomain.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AGGREGATIONTYPE)||
				((String)CIM_AdminDomain.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISSINGLEHOMED)||
				((String)CIM_AdminDomain.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISTRANSIT)||
				((String)CIM_AdminDomain.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUIREIGPSYNC)||
				((String)CIM_AdminDomain.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROUTINGUPDATESOURCE)){
				continue;
			}
			
			CIM_AutonomousSystem.CIM_PropertyNameList.add(CIM_AdminDomain.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ASNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AGGREGATIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISSINGLEHOMED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISTRANSIT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUIREIGPSYNC, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROUTINGUPDATESOURCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_AdminDomain.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_AdminDomain.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ASNUMBER)||
				((CIMProperty)CIM_AdminDomain.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AGGREGATIONTYPE)||
				((CIMProperty)CIM_AdminDomain.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISSINGLEHOMED)||
				((CIMProperty)CIM_AdminDomain.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISTRANSIT)||
				((CIMProperty)CIM_AdminDomain.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUIREIGPSYNC)||
				((CIMProperty)CIM_AdminDomain.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROUTINGUPDATESOURCE)){
				continue;
			}
			
			CIM_AutonomousSystem.CIM_PropertyList.add(CIM_AdminDomain.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_AdminDomain.Java_Package_List.size(); i++) {
			if (((String)CIM_AdminDomain.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_AdminDomain.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AGGREGATIONTYPE = {"Unknown","None","Aggregate Only ","Aggregate And All Specific Routes","Aggregate Based on Subset of Specific Routes"};
	public final static String[] CIM_VALUEMAP_ROUTINGUPDATESOURCE = {"Unknown","Static","Dynamic","Semi-Dynamic"};
	
	
	public final static int AGGREGATIONTYPE_UNKNOWN = 0;
	public final static int AGGREGATIONTYPE_NONE = 1;
	public final static int AGGREGATIONTYPE_AGGREGATEONLY = 2;
	public final static int AGGREGATIONTYPE_AGGREGATEANDALLSPECIFICROUTES = 3;
	public final static int AGGREGATIONTYPE_AGGREGATEBASEDONSUBSETOFSPECIFICROUTES = 4;
	
	public final static int ROUTINGUPDATESOURCE_UNKNOWN = 0;
	public final static int ROUTINGUPDATESOURCE_STATIC = 1;
	public final static int ROUTINGUPDATESOURCE_DYNAMIC = 2;
	public final static int ROUTINGUPDATESOURCE_SEMI_DYNAMIC = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AutonomousSystem() {

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
	public CIM_AutonomousSystem(Vector keyProperties){ 
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
	public CIM_AutonomousSystem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AutonomousSystem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AutonomousSystem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AutonomousSystem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AutonomousSystem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AutonomousSystem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AutonomousSystem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AutonomousSystem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AutonomousSystem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AutonomousSystem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AutonomousSystem)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BGPProtocolEndpoint_CIM_ASBGPEndpointss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASBGPENDPOINTS, 
					CIM_BGPProtocolEndpoint.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPProtocolEndpoint_CIM_ASBGPEndpoints_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASBGPENDPOINTS, 
					CIM_BGPProtocolEndpoint.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPProtocolEndpoint.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BGPCluster_CIM_BGPClustersInASs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPCLUSTERSINAS, 
					CIM_BGPCluster.CIM_CLASS_NAME, 
					"GroupAS",
					"PartAS",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPCluster(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPCluster(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPCluster(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPCluster_CIM_BGPClustersInAS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPCLUSTERSINAS, 
					CIM_BGPCluster.CIM_CLASS_NAME, 
					"GroupAS",
					"PartAS");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPCluster.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_AutonomousSystem_CIM_Confederations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONFEDERATION, 
					CIM_AutonomousSystem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AutonomousSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_AutonomousSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AutonomousSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_AutonomousSystem_CIM_Confederation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONFEDERATION, 
					CIM_AutonomousSystem.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BGPAttributes_CIM_HostedBGPAttributess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPATTRIBUTES, 
					CIM_BGPAttributes.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPAttributes(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPAttributes(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPAttributes(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPAttributes_CIM_HostedBGPAttributes_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPATTRIBUTES, 
					CIM_BGPAttributes.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPAttributes.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BGPPeerGroup_CIM_HostedBGPPeerGroups(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPPEERGROUP, 
					CIM_BGPPeerGroup.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPPeerGroup(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPPeerGroup(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPPeerGroup(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPPeerGroup_CIM_HostedBGPPeerGroup_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPPEERGROUP, 
					CIM_BGPPeerGroup.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPPeerGroup.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BGPRouteMap_CIM_HostedBGPRouteMaps(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPROUTEMAP, 
					CIM_BGPRouteMap.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPRouteMap(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPRouteMap(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPRouteMap(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPRouteMap_CIM_HostedBGPRouteMap_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDBGPROUTEMAP, 
					CIM_BGPRouteMap.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPRouteMap.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_RoutersInASs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTERSINAS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_RoutersInAS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTERSINAS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
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

	public ArrayList getAssociated_CIM_RoutingProtocolDomain_CIM_RoutingProtocolDomainInASs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTINGPROTOCOLDOMAININAS, 
					CIM_RoutingProtocolDomain.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AutonomousSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AutonomousSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AutonomousSystem.Java_Package_List.setElementAt((String)(CIM_AutonomousSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AutonomousSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RoutingProtocolDomain(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_RoutingProtocolDomain(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RoutingProtocolDomain(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_RoutingProtocolDomain_CIM_RoutingProtocolDomainInAS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTINGPROTOCOLDOMAININAS, 
					CIM_RoutingProtocolDomain.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_RoutingProtocolDomain.CIM_CLASS_NAME)) {
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
	
	// Attribute ASNumber
	
	public UnsignedInt16 get_ASNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ASNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER + " could not be found");
    		
		} else if (!CIM_AutonomousSystemHelper.isValid_ASNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ASNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AggregationType
	
	public UnsignedInt16 get_AggregationType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AggregationType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE + " could not be found");
    		
		} else if (!CIM_AutonomousSystemHelper.isValid_AggregationType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_AGGREGATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsSingleHomed
	
	public Boolean get_IsSingleHomed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsSingleHomed(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED + " could not be found");
    		
		} else if (!CIM_AutonomousSystemHelper.isValid_IsSingleHomed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISSINGLEHOMED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsTransit
	
	public Boolean get_IsTransit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsTransit(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT + " could not be found");
    		
		} else if (!CIM_AutonomousSystemHelper.isValid_IsTransit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ISTRANSIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequireIGPSync
	
	public Boolean get_RequireIGPSync() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequireIGPSync(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC + " could not be found");
    		
		} else if (!CIM_AutonomousSystemHelper.isValid_RequireIGPSync(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_REQUIREIGPSYNC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RoutingUpdateSource
	
	public UnsignedInt16 get_RoutingUpdateSource() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RoutingUpdateSource(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE + " could not be found");
    		
		} else if (!CIM_AutonomousSystemHelper.isValid_RoutingUpdateSource(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AutonomousSystem.CIM_PROPERTY_ROUTINGUPDATESOURCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
