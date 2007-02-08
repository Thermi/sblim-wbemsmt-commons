/** 
 * CIM_RoutingPolicy.java
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
 * Description: This class is used to implement routing policies. It aggregates a set of FilterLists, along with other appropriate constructs, into a unit. One of the most important uses of this class is to change the routing policy by changing values of various attributes in a consistent manner. 

A RoutingPolicy is weak to the network device (i.e., the ComputerSystem) that contains it. Hence, the ComputerSystem keys are propagated to this class. 

Note that this class was defined before the Policy Model and hence is not positioned in that hierarchy. The class will be repositioned in a later release of the Network Model.
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



public class CIM_RoutingPolicy extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_RoutingPolicy";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPROUTEMAPSINROUTINGPOLICY = "CIM_BGPRouteMapsInRoutingPolicy";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPROUTINGPOLICY = "CIM_BGPRoutingPolicy";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FILTEREDBGPATTRIBUTES = "CIM_FilteredBGPAttributes";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDROUTINGPOLICY = "CIM_HostedRoutingPolicy";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LISTSINROUTINGPOLICY = "CIM_ListsInRoutingPolicy";
	
	
	/**
	*	This defines the type of action that will be performed if the match conditions of the policy are met. The match conditions are defined by the associated ListsIn RoutingPolicy. There are essentially three choices: forward the traffic unmodified, forward the traffic but modify either the attributes describing the route and/or other attributes that define how to condition the traffic (e.g., its ToS byte settings), or prevent the traffic from being forwarded.
	*/
	public final static String CIM_PROPERTY_ACTION = "Action"; //$NON-NLS-1$
	/**
	*	This controls whether protocol-specific attributes replace, get prepended, or get appended to their existing values.
	*/
	public final static String CIM_PROPERTY_ATTRIBUTEACTION = "AttributeAction"; //$NON-NLS-1$
	/**
	*	This defines one or more BGP-specific attributes that should be used to modify this routing update.
	*/
	public final static String CIM_PROPERTY_BGPACTION = "BGPAction"; //$NON-NLS-1$
	/**
	*	The value for the corresponding BGPAction.
	*/
	public final static String CIM_PROPERTY_BGPVALUE = "BGPValue"; //$NON-NLS-1$
	/**
	*	This defines another action to be taken for this traffic.
	*/
	public final static String CIM_PROPERTY_CONDITIONINGACTION = "ConditioningAction"; //$NON-NLS-1$
	/**
	*	The value for the corresponding ConditioningAction, if appropriate.
	*/
	public final static String CIM_PROPERTY_CONDITIONINGVALUE = "ConditioningValue"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	This is the name of the Routing Policy.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	If the value of the ConditioningAction property of this class is 1, this contains an application-specific type of conditioning that is to be performed. Otherwise, if the ConditioningAction property is any other value, the value of this property should be NULL.
	*/
	public final static String CIM_PROPERTY_OTHERCONDITIONINGACTION = "OtherConditioningAction"; //$NON-NLS-1$
	/**
	*	This defines a remarking action for this traffic.
	*/
	public final static String CIM_PROPERTY_REMARKACTION = "RemarkAction"; //$NON-NLS-1$
	/**
	*	The value for the corresponding RemarkAction.
	*/
	public final static String CIM_PROPERTY_REMARKVALUE = "RemarkValue"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's CreationClassName.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's Name.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTRIBUTEACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_BGPACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_BGPVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONDITIONINGACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONDITIONINGVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCONDITIONINGACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMARKACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMARKVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTRIBUTEACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BGPACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BGPVALUE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONDITIONINGACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONDITIONINGVALUE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCONDITIONINGACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMARKACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMARKVALUE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_RoutingPolicy.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTRIBUTEACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BGPACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BGPVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONDITIONINGACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONDITIONINGVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCONDITIONINGACTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMARKACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMARKVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTRIBUTEACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BGPACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BGPVALUE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONDITIONINGACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONDITIONINGVALUE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCONDITIONINGACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMARKACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMARKVALUE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_RoutingPolicy.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACTION = {"Accept As Is","Accept With Protocol Attribute Changes","Accept and Remark Packet","Accept With Protocol Attribute Changes and Remark","Accept With Other Action","Accept With Protocol Attribute Changes and Other Action","Accept with Remark and Other Action","Accept with Protocol Attribute Changes, Remark and Other Action","Deny"};
	public final static String[] CIM_VALUEMAP_ATTRIBUTEACTION = {"Replace","Prepend","Append"};
	public final static String[] CIM_VALUEMAP_BGPACTION = {"Origin","AS_Path","NEXT_HOP","Multi_Exit_Disc","Local_Pref","Atomic_Aggregate","Aggregator","Community","Originator_ID","Cluster_List"};
	public final static String[] CIM_VALUEMAP_CONDITIONINGACTION = {"Other","Input Flow Policing","Output Flow Policing","Input Aggregate Policing","Output Aggregate Policing","Police By Marking Down","Police By Dropping Down"};
	public final static String[] CIM_VALUEMAP_REMARKACTION = {"Change DSCP","Change ToS","Change 802.1Q Value","Change CIR","Change CBR","Change ABR","Change VBR"};
	
	
	public final static int ACTION_ACCEPTASIS = 1;
	public final static int ACTION_ACCEPTWITHPROTOCOLATTRIBUTECHANGES = 2;
	public final static int ACTION_ACCEPTANDREMARKPACKET = 3;
	public final static int ACTION_ACCEPTWITHPROTOCOLATTRIBUTECHANGESANDREMARK = 4;
	public final static int ACTION_ACCEPTWITHOTHERACTION = 5;
	public final static int ACTION_ACCEPTWITHPROTOCOLATTRIBUTECHANGESANDOTHERACTION = 6;
	public final static int ACTION_ACCEPTWITHREMARKANDOTHERACTION = 7;
	public final static int ACTION_ACCEPTWITHPROTOCOLATTRIBUTECHANGES_REMARKANDOTHERACTION = 8;
	public final static int ACTION_DENY = 9;
	
	public final static int ATTRIBUTEACTION_REPLACE = 1;
	public final static int ATTRIBUTEACTION_PREPEND = 2;
	public final static int ATTRIBUTEACTION_APPEND = 3;
	
	public final static int BGPACTION_ORIGIN = 1;
	public final static int BGPACTION_AS_PATH = 2;
	public final static int BGPACTION_NEXT_HOP = 3;
	public final static int BGPACTION_MULTI_EXIT_DISC = 4;
	public final static int BGPACTION_LOCAL_PREF = 5;
	public final static int BGPACTION_ATOMIC_AGGREGATE = 6;
	public final static int BGPACTION_AGGREGATOR = 7;
	public final static int BGPACTION_COMMUNITY = 8;
	public final static int BGPACTION_ORIGINATOR_ID = 9;
	public final static int BGPACTION_CLUSTER_LIST = 10;
	
	public final static int CONDITIONINGACTION_OTHER = 1;
	public final static int CONDITIONINGACTION_INPUTFLOWPOLICING = 2;
	public final static int CONDITIONINGACTION_OUTPUTFLOWPOLICING = 3;
	public final static int CONDITIONINGACTION_INPUTAGGREGATEPOLICING = 4;
	public final static int CONDITIONINGACTION_OUTPUTAGGREGATEPOLICING = 5;
	public final static int CONDITIONINGACTION_POLICEBYMARKINGDOWN = 6;
	public final static int CONDITIONINGACTION_POLICEBYDROPPINGDOWN = 7;
	
	public final static int REMARKACTION_CHANGEDSCP = 1;
	public final static int REMARKACTION_CHANGETOS = 2;
	public final static int REMARKACTION_CHANGE802_1QVALUE = 3;
	public final static int REMARKACTION_CHANGECIR = 4;
	public final static int REMARKACTION_CHANGECBR = 5;
	public final static int REMARKACTION_CHANGEABR = 6;
	public final static int REMARKACTION_CHANGEVBR = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_RoutingPolicy() {

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
	public CIM_RoutingPolicy(Vector keyProperties){ 
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
	public CIM_RoutingPolicy(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		
		if (CIMProperty_SystemCreationClassName == null || CIMProperty_SystemCreationClassName.getValue().isEmpty() || CIMProperty_SystemCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMNAME);
		
		if (CIMProperty_SystemName == null || CIMProperty_SystemName.getValue().isEmpty() || CIMProperty_SystemName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMNAME, "Key"});
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
	    
	    if (!(object instanceof CIM_RoutingPolicy)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_RoutingPolicy)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_RoutingPolicy)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_RoutingPolicy)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_RoutingPolicy)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_RoutingPolicy)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_RoutingPolicy)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_RoutingPolicy)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_RoutingPolicy)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_RoutingPolicy)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BGPRouteMap_CIM_BGPRouteMapsInRoutingPolicys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPROUTEMAPSINROUTINGPOLICY, 
					CIM_BGPRouteMap.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_RoutingPolicy.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RoutingPolicy.Java_Package_List.setElementAt((String)(CIM_RoutingPolicy.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RoutingPolicy.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_BGPRouteMap_CIM_BGPRouteMapsInRoutingPolicy_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPROUTEMAPSINROUTINGPOLICY, 
					CIM_BGPRouteMap.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
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

	public ArrayList getAssociated_CIM_BGPService_CIM_BGPRoutingPolicys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPROUTINGPOLICY, 
					CIM_BGPService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_RoutingPolicy.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RoutingPolicy.Java_Package_List.setElementAt((String)(CIM_RoutingPolicy.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RoutingPolicy.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPService_CIM_BGPRoutingPolicy_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPROUTINGPOLICY, 
					CIM_BGPService.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BGPAttributes_CIM_FilteredBGPAttributess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILTEREDBGPATTRIBUTES, 
					CIM_BGPAttributes.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_RoutingPolicy.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RoutingPolicy.Java_Package_List.setElementAt((String)(CIM_RoutingPolicy.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RoutingPolicy.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_BGPAttributes_CIM_FilteredBGPAttributes_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILTEREDBGPATTRIBUTES, 
					CIM_BGPAttributes.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_HostedRoutingPolicys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDROUTINGPOLICY, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_RoutingPolicy.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RoutingPolicy.Java_Package_List.setElementAt((String)(CIM_RoutingPolicy.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RoutingPolicy.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_HostedRoutingPolicy_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDROUTINGPOLICY, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
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

	public ArrayList getAssociated_CIM_FilterList_CIM_ListsInRoutingPolicys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LISTSINROUTINGPOLICY, 
					CIM_FilterList.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_RoutingPolicy.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RoutingPolicy.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RoutingPolicy.Java_Package_List.setElementAt((String)(CIM_RoutingPolicy.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RoutingPolicy.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FilterList(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FilterList(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FilterList(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FilterList_CIM_ListsInRoutingPolicy_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LISTSINROUTINGPOLICY, 
					CIM_FilterList.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FilterList.CIM_CLASS_NAME)) {
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
	
	// Attribute Action
	
	public UnsignedInt16 get_Action() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_ACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Action(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_ACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ACTION + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_Action(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_ACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttributeAction
	
	public UnsignedInt16 get_AttributeAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttributeAction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_AttributeAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_ATTRIBUTEACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BGPAction
	
	public UnsignedInt16 get_BGPAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BGPAction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_BGPAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BGPValue
	
	public String get_BGPValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BGPValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_BGPValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_BGPVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConditioningAction
	
	public UnsignedInt16 get_ConditioningAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConditioningAction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_ConditioningAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConditioningValue
	
	public String get_ConditioningValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConditioningValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_ConditioningValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CONDITIONINGVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RoutingPolicy.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherConditioningAction
	
	public String get_OtherConditioningAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherConditioningAction(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_OtherConditioningAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_OTHERCONDITIONINGACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemarkAction
	
	public UnsignedInt16 get_RemarkAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemarkAction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_RemarkAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemarkValue
	
	public String get_RemarkValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemarkValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_RemarkValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_REMARKVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_RoutingPolicyHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RoutingPolicy.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
