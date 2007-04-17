/** 
 * CIM_RedundancySet.java
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
 * Description:  A class derived from SystemSpecificCollection that is a special collection of
 * ManagedElements. This collection indicates that the aggregated elements
 * together provide redundancy, or that redundancy is provided via sparing. All
 * elements collected in a RedundancySet SHOULD be instantiations of the same
 * object class.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
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
 *  A class derived from SystemSpecificCollection that is a special collection of
 * ManagedElements. This collection indicates that the aggregated elements
 * together provide redundancy, or that redundancy is provided via sparing. All
 * elements collected in a RedundancySet SHOULD be instantiations of the same
 * object class.
 */
public class CIM_RedundancySet extends CIM_SystemSpecificCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_RedundancySet"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ISSPARE = "CIM_IsSpare"; //$NON-NLS-1$
	
	
	/**
	*	The current load balance algorithm. 
Least Blocks, Least IO, and Address Region are used in storage device path redundancy drivers to optimize load balancing by routing requests to a path with the least queued blocks or IO requests, or based on locality of reference. 
'Product Specific' indicates that the algorithm is optimized for a particular type of product. Information about that product SHOULD be provided in an associated CIM_Product instance.
	*/
	public final static String CIM_PROPERTY_LOADBALANCEALGORITHM = "LoadBalanceAlgorithm"; //$NON-NLS-1$
	/**
	*	MaxNumberSupported indicates the largest number of elements that can participate in the RedundancySet. A value of 0 indicates there is no limit on the number of elements.
	*/
	public final static String CIM_PROPERTY_MAXNUMBERSUPPORTED = "MaxNumberSupported"; //$NON-NLS-1$
	/**
	*	MinNumberNeeded indicates the smallest number of elements that MUST be operational in order to function. For example, in an N+1 redundancy relationship, the MinNumberNeeded property is set equal to N. In a 'LimitedSparing' environment, this property is meaningless and SHOULD be set to zero.
	*/
	public final static String CIM_PROPERTY_MINNUMBERNEEDED = "MinNumberNeeded"; //$NON-NLS-1$
	/**
	*	When LoadBalanceAlgorithm is Other, this property describes the algorithm.
	*/
	public final static String CIM_PROPERTY_OTHERLOADBALANCEALGORITHM = "OtherLoadBalanceAlgorithm"; //$NON-NLS-1$
	/**
	*	When the corresponding array entry in TypeOfSet[] is 'Other', this entry provides a string describing the type of set.
	*/
	public final static String CIM_PROPERTY_OTHERTYPEOFSET = "OtherTypeOfSet"; //$NON-NLS-1$
	/**
	*	RedundancyStatus provides information on the state of the RedundancyGroup. 'Fully Redundant' (value=2) means that all of the configured redundancy is still available; 'Degraded Redundancy' (3) means that some configured elements are degraded, missing or failed but that the number of elements in the set is still greater than the minimum required ('MinNumberNeeded'); 'Redundancy Lost' (4) means that sufficient configured elements are missing or failed that no redundancy is available and the next failure experienced will cause overall failure. 'Overall Failure' (5) means that there has been an overall failure of the RedundancySet.
	*/
	public final static String CIM_PROPERTY_REDUNDANCYSTATUS = "RedundancyStatus"; //$NON-NLS-1$
	/**
	*	TypeOfSet provides information on the type of redundancy. - N+1 (=2) indicates all members are active, are unaware and function independent of one another. However, there exist at least one extra member to achieve functionality. 'Sparing' is implied (i.e. each member can be a spare for the other(s). An example of N+1 is a system that has 2 power supplies, but needs only 1 power supply to functioning properly. 
- Load Balanced (=3) indicates all members are active. However, there functionality is not independent of each other. Their functioning is determined by some sort of load balancing algrothim (implemented in hardware and/or software). 'Sparing' is implied (i.e. each member can be a spare for the other(s). 
- Sparing (=4) indicates that all members are active and are aware of each others. However, their functionality is independent until failover. Each member can be a spare for the other(s). 
- Limited Sparing (=5) indicates that all members are active, and they may or may not be aware of each and they are not spares for each other. Instead, their redundancy is indicated by the IsSpare relationship.
	*/
	public final static String CIM_PROPERTY_TYPEOFSET = "TypeOfSet"; //$NON-NLS-1$
	/**
	*	VendorIdentifyingInfo captures the vendor identifying data for the RedundancySet. One example is the product name for a cluster.
	*/
	public final static String CIM_PROPERTY_VENDORIDENTIFYINGINFO = "VendorIdentifyingInfo"; //$NON-NLS-1$
	
	
	/**
	*	This method forces a failover from one ManagedElement to another. There are two parameters to the Failover method. 
- FailoverFrom is a reference to an 'active' ManagedElement that will become inactive after the method. This element SHOULD be part of the RedundancySet via a MemberOfCollection relationship. 
- FailoverTo is a reference to the ManagedElement that will take over for the FailoverFrom element. This element SHOULD either be a member of the RedundancySet or be associated with the RedundancySet via an IsSpare relationship. 

Upon sucessful completion: 
- the FailoverTo element SHOULD be associated to the RedundancySet via MemberOfCollection. 
- the FailFrom element SHOULD either still be associated to the RedundandySet via MemberOfCollection with a OperationalStatus or EnableState that indicates it not active, or it SHOULD be associated to the 'Spared' collection via the MemberOfCollection association.
	*/
	public final static String CIM_METHOD_FAILOVER = "Failover";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADBALANCEALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBERSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINNUMBERNEEDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOADBALANCEALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEOFSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_REDUNDANCYSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_VENDORIDENTIFYINGINFO);
				
		for (int i = 0; i < CIM_SystemSpecificCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADBALANCEALGORITHM)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBERSUPPORTED)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINNUMBERNEEDED)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOADBALANCEALGORITHM)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEOFSET)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REDUNDANCYSTATUS)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFSET)||
				((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VENDORIDENTIFYINGINFO)){
				continue;
			}
			
			CIM_RedundancySet.CIM_PropertyNameList.add(CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADBALANCEALGORITHM, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBERSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINNUMBERNEEDED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOADBALANCEALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEOFSET, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REDUNDANCYSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFSET, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VENDORIDENTIFYINGINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SystemSpecificCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADBALANCEALGORITHM)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBERSUPPORTED)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINNUMBERNEEDED)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOADBALANCEALGORITHM)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEOFSET)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REDUNDANCYSTATUS)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFSET)||
				((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VENDORIDENTIFYINGINFO)){
				continue;
			}
			
			CIM_RedundancySet.CIM_PropertyList.add(CIM_SystemSpecificCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SystemSpecificCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_SystemSpecificCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SystemSpecificCollection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOADBALANCEALGORITHM = {"Unknown","Other","No Load Balancing","Round Robin","Least Blocks","Least IO","Address Region","Product Specific"};
	public final static String[] CIM_VALUEMAP_REDUNDANCYSTATUS = {"Unknown","DMTF Reserved","Fully Redundant","Degraded Redundancy","Redundancy Lost","Overall Failure"};
	public final static String[] CIM_VALUEMAP_TYPEOFSET = {"Unknown","Other","N+1","Load Balanced","Sparing","Limited Sparing","DMTF Reserved","Vendor Reserved"};
	
	
	public final static int LOADBALANCEALGORITHM_UNKNOWN = 0;
	public final static int LOADBALANCEALGORITHM_OTHER = 1;
	public final static int LOADBALANCEALGORITHM_NOLOADBALANCING = 2;
	public final static int LOADBALANCEALGORITHM_ROUNDROBIN = 3;
	public final static int LOADBALANCEALGORITHM_LEASTBLOCKS = 4;
	public final static int LOADBALANCEALGORITHM_LEASTIO = 5;
	public final static int LOADBALANCEALGORITHM_ADDRESSREGION = 6;
	public final static int LOADBALANCEALGORITHM_PRODUCTSPECIFIC = 7;
	
	public final static int REDUNDANCYSTATUS_UNKNOWN = 0;
	public final static int REDUNDANCYSTATUS_DMTFRESERVED = 1;
	public final static int REDUNDANCYSTATUS_FULLYREDUNDANT = 2;
	public final static int REDUNDANCYSTATUS_DEGRADEDREDUNDANCY = 3;
	public final static int REDUNDANCYSTATUS_REDUNDANCYLOST = 4;
	public final static int REDUNDANCYSTATUS_OVERALLFAILURE = 5;
	
	public final static String TYPEOFSET_UNKNOWN = "0";
	public final static String TYPEOFSET_OTHER = "1";
	public final static String TYPEOFSET_N_1 = "2";
	public final static String TYPEOFSET_LOADBALANCED = "3";
	public final static String TYPEOFSET_SPARING = "4";
	public final static String TYPEOFSET_LIMITEDSPARING = "5";
	public final static String TYPEOFSET_DMTFRESERVED = "..";
	public final static String TYPEOFSET_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_RedundancySet() {

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
	public CIM_RedundancySet(Vector keyProperties){ 
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
	public CIM_RedundancySet(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_RedundancySet)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_RedundancySet)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_RedundancySet)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_RedundancySet)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_RedundancySet)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_RedundancySet)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_RedundancySet)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_RedundancySet)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_RedundancySet)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_RedundancySet)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedElement_CIM_IsSpares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ISSPARE, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_RedundancySet.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RedundancySet.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_RedundancySet.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_RedundancySet.Java_Package_List.setElementAt((String)(CIM_RedundancySet.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_RedundancySet.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_IsSpare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ISSPARE, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
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
	
	// Attribute LoadBalanceAlgorithm
	
	public UnsignedInt16 get_LoadBalanceAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadBalanceAlgorithm(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_LoadBalanceAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_LOADBALANCEALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumberSupported
	
	public UnsignedInt32 get_MaxNumberSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberSupported(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_MaxNumberSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_MAXNUMBERSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinNumberNeeded
	
	public UnsignedInt32 get_MinNumberNeeded() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinNumberNeeded(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_MinNumberNeeded(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_MINNUMBERNEEDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLoadBalanceAlgorithm
	
	public String get_OtherLoadBalanceAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLoadBalanceAlgorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_OtherLoadBalanceAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERLOADBALANCEALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeOfSet
	
	public String[] get_OtherTypeOfSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherTypeOfSet(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_OtherTypeOfSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_OTHERTYPEOFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RedundancyStatus
	
	public UnsignedInt16 get_RedundancyStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RedundancyStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_RedundancyStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_REDUNDANCYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfSet
	
	public UnsignedInt16[] get_TypeOfSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_TypeOfSet(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_TypeOfSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_TYPEOFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VendorIdentifyingInfo
	
	public String get_VendorIdentifyingInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VendorIdentifyingInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO + " could not be found");
    		
		} else if (!CIM_RedundancySetHelper.isValid_VendorIdentifyingInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancySet.CIM_PROPERTY_VENDORIDENTIFYINGINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_failover(CIMClient cimClient, CIM_ManagedElement FailoverFrom, CIM_ManagedElement FailoverTo) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_RedundancySet.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_FailoverFrom = new CIMValue(FailoverFrom.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_FailoverTo = new CIMValue(FailoverTo.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("FailoverFrom", cimValue_FailoverFrom));
		inParameter.add(new CIMArgument("FailoverTo", cimValue_FailoverTo));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_FAILOVER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_RedundancySet.CIM_METHOD_FAILOVER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_RedundancySet.CIM_METHOD_FAILOVER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_RedundancySet.CIM_METHOD_FAILOVER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
