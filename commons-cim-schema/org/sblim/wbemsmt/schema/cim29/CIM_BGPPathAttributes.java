/** 
 * CIM_BGPPathAttributes.java
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
 * Description: This class defines the per-path information used to process specific BGP attribute information, as defined in the bgp4PathAttrTable of RFC 1657.
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



public class CIM_BGPPathAttributes extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_BGPPathAttributes";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPATTRIBUTESFORROUTE = "CIM_BGPAttributesForRoute";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPSERVICEATTRIBUTES = "CIM_BGPServiceAttributes";
	
	
	/**
	*	A comma-separated list of AS numbers, as would be stored in the value portion of the path segment in the PathAttrASPathSegment property. This list can be ordered or unordered.
	*/
	public final static String CIM_PROPERTY_ASNUMBERS = "ASNumbers"; //$NON-NLS-1$
	/**
	*	This property and its description are taken directly from RFC 1657. The property represents a sequence of AS path segments. Each AS path segment is represented by the tuple: 
<type, length, value> 
The type is a 1-octet field which has two possible values: 
1 = AS_SET 
2 = AS_SEQUENCE 
An AS_SET is an unordered set of ASs representing the path that an UPDATE message has traversed, and an AS_SEQUENCE is an ordered set of ASs representing the path that an UPDATE message has traversed. 
The length is a 1-octet field containing the number of ASs in the value field. 
The value field contains one or more AS numbers, each AS is represented in the octet string as a pair of octets according to the following algorithm: 
first-byte-of-pair = ASNumber / 256; 
second-byte-of-pair = ASNumber & 255; 
This property is mapped from the bgp4PathAttrASPathSegment MIB variable, which is an OctetString. Its length is defined as a minimum of 2 and a maximum of 255 octets.
	*/
	public final static String CIM_PROPERTY_PATHATTRASPATHSEGMENT = "PathAttrASPathSegment"; //$NON-NLS-1$
	/**
	*	This is the AS number of the last BGP speaker that performed route aggregation. A value of 0 indicates the absence of this attribute. The range of this attribute is defined to be 0 to 65535.
	*/
	public final static String CIM_PROPERTY_PATHATTRAGGREGATORAS = "PathAttrAggregatorAS"; //$NON-NLS-1$
	/**
	*	This is the IP address of the last BGP speaker that performed route aggregation. A value of 0.0.0.0 indicates the absence of this attribute.
	*/
	public final static String CIM_PROPERTY_PATHATTRAGGREGATORADDR = "PathAttrAggregatorAddr"; //$NON-NLS-1$
	/**
	*	This is an enumeration that defines whether or not the local system has selected a less specific route without selecting a more specific route. There are two values, 1 and 2, indicating that a less specific route has not and has been selected, respectively. This is a 32-bit integer to correspond to the IETF MIB.
	*/
	public final static String CIM_PROPERTY_PATHATTRATOMICAGGREGATE = "PathAttrAtomicAggregate"; //$NON-NLS-1$
	/**
	*	This is an indication of whether or not this route was chosen as the best BGP route. There are three possible values, 0 (Unknown), 1 (FALSE) and 2 (TRUE).
	*/
	public final static String CIM_PROPERTY_PATHATTRBEST = "PathAttrBest"; //$NON-NLS-1$
	/**
	*	This is the degree of preference calculated by the receiving BGP speaker for an advertised route. A value of -1 indicates the absence of this attribute. The range of this attribute is defined to be -1 to 2147483647.
	*/
	public final static String CIM_PROPERTY_PATHATTRCALCLOCALPREF = "PathAttrCalcLocalPref"; //$NON-NLS-1$
	/**
	*	This is the originating BGP4 speaker's degree of preference for an advertised route. A value of -1 indicates the absence of this attribute. The range of this attribute is defined to be -1 to 2147483647.
	*/
	public final static String CIM_PROPERTY_PATHATTRLOCALPREF = "PathAttrLocalPref"; //$NON-NLS-1$
	/**
	*	This metric is used to discriminate between multiple adjacent autonomous systems. A value of -1 indicates the absence of this attribute. The range of this attribute is defined to be -1 to 2147483647.
	*/
	public final static String CIM_PROPERTY_PATHATTRMULTIEXITDISC = "PathAttrMultiExitDisc"; //$NON-NLS-1$
	/**
	*	This is the address of the border router that should be used for the destination network.
	*/
	public final static String CIM_PROPERTY_PATHATTRNEXTHOP = "PathAttrNextHop"; //$NON-NLS-1$
	/**
	*	This is an enumeration that defines the ultimate origin of the path information. The value 'IGP' means that the origin is interior; the value 'EGP' means that it was learned via an EGP; the value 'INCOMPLETE' means that the origin is undetermined.
	*/
	public final static String CIM_PROPERTY_PATHATTRORIGIN = "PathAttrOrigin"; //$NON-NLS-1$
	/**
	*	The number of unknown attributes in the array, PathAttrUnknown.
	*/
	public final static String CIM_PROPERTY_PATHATTRUNKNOWNNUMBER = "PathAttrUnknownNumber"; //$NON-NLS-1$
	/**
	*	This contains one or more path atributes not understood by this BGP speaker. It is a array of path attributes that are not understood. The number of attributes is placed in a separate property of this class, PathAttrUnknownNumber.
	*/
	public final static String CIM_PROPERTY_PATHATTRUNKNOWN = "PathAttrUnknown"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ASNUMBERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRASPATHSEGMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRAGGREGATORAS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRAGGREGATORADDR);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRATOMICAGGREGATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRBEST);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRCALCLOCALPREF);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRLOCALPREF);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRMULTIEXITDISC);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRNEXTHOP);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRORIGIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRUNKNOWNNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRUNKNOWN);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ASNUMBERS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRASPATHSEGMENT)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRAGGREGATORAS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRAGGREGATORADDR)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRATOMICAGGREGATE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRBEST)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRCALCLOCALPREF)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRLOCALPREF)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRMULTIEXITDISC)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRNEXTHOP)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRORIGIN)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRUNKNOWNNUMBER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRUNKNOWN)){
				continue;
			}
			
			CIM_BGPPathAttributes.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ASNUMBERS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRASPATHSEGMENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRAGGREGATORAS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRAGGREGATORADDR, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRATOMICAGGREGATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRBEST, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRCALCLOCALPREF, new CIMValue(null, new CIMDataType(CIMDataType.SINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRLOCALPREF, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRMULTIEXITDISC, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRNEXTHOP, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRORIGIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRUNKNOWNNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRUNKNOWN, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ASNUMBERS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRASPATHSEGMENT)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRAGGREGATORAS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRAGGREGATORADDR)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRATOMICAGGREGATE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRBEST)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRCALCLOCALPREF)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRLOCALPREF)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRMULTIEXITDISC)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRNEXTHOP)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRORIGIN)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRUNKNOWNNUMBER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRUNKNOWN)){
				continue;
			}
			
			CIM_BGPPathAttributes.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PATHATTRATOMICAGGREGATE = {"Unknown","Less Specific Not Selected","Less Specific Selected"};
	public final static String[] CIM_VALUEMAP_PATHATTRBEST = {"Unknown","False","True"};
	public final static String[] CIM_VALUEMAP_PATHATTRORIGIN = {"IGP","EGP","Incomplete"};
	
	
	public final static int PATHATTRATOMICAGGREGATE_UNKNOWN = 0;
	public final static int PATHATTRATOMICAGGREGATE_LESSSPECIFICNOTSELECTED = 1;
	public final static int PATHATTRATOMICAGGREGATE_LESSSPECIFICSELECTED = 2;
	
	public final static int PATHATTRBEST_UNKNOWN = 0;
	public final static int PATHATTRBEST_FALSE = 1;
	public final static int PATHATTRBEST_TRUE = 2;
	
	public final static int PATHATTRORIGIN_IGP = 1;
	public final static int PATHATTRORIGIN_EGP = 2;
	public final static int PATHATTRORIGIN_INCOMPLETE = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BGPPathAttributes() {

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
	public CIM_BGPPathAttributes(Vector keyProperties){ 
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
	public CIM_BGPPathAttributes(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ASNumbers = this.cimInstance.getProperty(CIM_PROPERTY_ASNUMBERS);
		
		if (CIMProperty_ASNumbers == null || CIMProperty_ASNumbers.getValue().isEmpty() || CIMProperty_ASNumbers.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ASNUMBERS, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_PathAttrNextHop = this.cimInstance.getProperty(CIM_PROPERTY_PATHATTRNEXTHOP);
		
		if (CIMProperty_PathAttrNextHop == null || CIMProperty_PathAttrNextHop.getValue().isEmpty() || CIMProperty_PathAttrNextHop.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PATHATTRNEXTHOP, "Key"});
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
	    
	    if (!(object instanceof CIM_BGPPathAttributes)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BGPPathAttributes)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BGPPathAttributes)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BGPPathAttributes)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BGPPathAttributes)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BGPPathAttributes)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BGPPathAttributes)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BGPPathAttributes)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BGPPathAttributes)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BGPPathAttributes)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BGPIPRoute_CIM_BGPAttributesForRoutes(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPATTRIBUTESFORROUTE, 
					CIM_BGPIPRoute.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_BGPPathAttributes.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BGPPathAttributes.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BGPPathAttributes.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BGPPathAttributes.Java_Package_List.setElementAt((String)(CIM_BGPPathAttributes.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BGPPathAttributes.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPIPRoute(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPIPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPIPRoute(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPIPRoute_CIM_BGPAttributesForRoute_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPATTRIBUTESFORROUTE, 
					CIM_BGPIPRoute.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPIPRoute.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BGPService_CIM_BGPServiceAttributess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPSERVICEATTRIBUTES, 
					CIM_BGPService.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BGPPathAttributes.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BGPPathAttributes.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BGPPathAttributes.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BGPPathAttributes.Java_Package_List.setElementAt((String)(CIM_BGPPathAttributes.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BGPPathAttributes.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_BGPService_CIM_BGPServiceAttributes_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPSERVICEATTRIBUTES, 
					CIM_BGPService.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute ASNumbers
	
	public String get_ASNumbers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ASNumbers(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_ASNumbers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_ASNUMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrASPathSegment
	
	public UnsignedInt8[] get_PathAttrASPathSegment() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt8[] resultArray = new UnsignedInt8[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt8)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_PathAttrASPathSegment(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrASPathSegment(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRASPATHSEGMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrAggregatorAS
	
	public UnsignedInt16 get_PathAttrAggregatorAS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrAggregatorAS(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrAggregatorAS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORAS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrAggregatorAddr
	
	public String get_PathAttrAggregatorAddr() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrAggregatorAddr(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrAggregatorAddr(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRAGGREGATORADDR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrAtomicAggregate
	
	public UnsignedInt32 get_PathAttrAtomicAggregate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrAtomicAggregate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrAtomicAggregate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRATOMICAGGREGATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrBest
	
	public UnsignedInt16 get_PathAttrBest() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrBest(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrBest(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRBEST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrCalcLocalPref
	
	public Short get_PathAttrCalcLocalPref() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Short)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrCalcLocalPref(Short newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrCalcLocalPref(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRCALCLOCALPREF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrLocalPref
	
	public Integer get_PathAttrLocalPref() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrLocalPref(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrLocalPref(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRLOCALPREF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrMultiExitDisc
	
	public Integer get_PathAttrMultiExitDisc() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrMultiExitDisc(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrMultiExitDisc(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRMULTIEXITDISC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrNextHop
	
	public String get_PathAttrNextHop() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrNextHop(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrNextHop(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRNEXTHOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrOrigin
	
	public UnsignedInt16 get_PathAttrOrigin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrOrigin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrOrigin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrUnknownNumber
	
	public UnsignedInt16 get_PathAttrUnknownNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrUnknownNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrUnknownNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWNNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrUnknown
	
	public String[] get_PathAttrUnknown() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PathAttrUnknown(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN + " could not be found");
    		
		} else if (!CIM_BGPPathAttributesHelper.isValid_PathAttrUnknown(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPPathAttributes.CIM_PROPERTY_PATHATTRUNKNOWN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
