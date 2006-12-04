/** 
 * CIM_FilterEntry.java
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
 * Description: A FilterEntry is used by network devices to identify traffic and either forward it (with possibly further processing) to its destination, or to deny its forwarding. It is one of the building block of FilterLists. 

This class is oriented towards packet filtering. Other subclasses of FilterEntryBase can be defined to do other types of filtering. 

A FilterEntry is weak to the network device (i.e., the ComputerSystem) that contains it. Hence, the ComputerSystem keys are propagated to this class.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_FilterEntry extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_FilterEntry";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This defines whether the action should be to forward or deny traffic meeting the match condition specified in this filter.
	*/
	public final static String CIM_PROPERTY_ACTION = "Action"; //$NON-NLS-1$
	/**
	*	This defines whether this FilterEntry is the default entry to use by its FilterList.
	*/
	public final static String CIM_PROPERTY_DEFAULTFILTER = "DefaultFilter"; //$NON-NLS-1$
	/**
	*	This specifies one of a set of ways to identify traffic. If the value is 1 (i.e., "Other"), then the specific type of filtering is specified in the OtherMatchConditionType property of this class.
	*/
	public final static String CIM_PROPERTY_MATCHCONDITIONTYPE = "MatchConditionType"; //$NON-NLS-1$
	/**
	*	This is the value of the condition that filters the traffic. It corresponds to the condition specified in the MatchConditionType property. If, however, the value of the MatchConditionProperty is 1, then it corresponds to the condition specified in the OtherMatchConditionType property.
	*/
	public final static String CIM_PROPERTY_MATCHCONDITIONVALUE = "MatchConditionValue"; //$NON-NLS-1$
	/**
	*	If the value of the MatchConditionType property in this class is 1 (i.e., "Other"), then the specific type of filtering is specified in this property.
	*/
	public final static String CIM_PROPERTY_OTHERMATCHCONDITIONTYPE = "OtherMatchConditionType"; //$NON-NLS-1$
	/**
	*	If the value of the TrafficType property in this class is 5 (i.e., "Other"), then the specific type of traffic is specified in this property.
	*/
	public final static String CIM_PROPERTY_OTHERTRAFFICTYPE = "OtherTrafficType"; //$NON-NLS-1$
	/**
	*	This defines the traffic class that is being matched by this FilterEntry. Note that FilterEntries are aggregated into FilterLists by the EntriesInFilterList relationship. If the EntrySequence property of the aggregation is set to 0, this means that all the Filter Entries should be ANDed together. Consequently, the TrafficClass property of each of the aggregated Entries should be set to the same value.
	*/
	public final static String CIM_PROPERTY_TRAFFICCLASS = "TrafficClass"; //$NON-NLS-1$
	/**
	*	This defines the type of traffic that is being filtered. This will affect the filtering rules in the MatchCondition property of this class.
	*/
	public final static String CIM_PROPERTY_TRAFFICTYPE = "TrafficType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTFILTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHCONDITIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHCONDITIONVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERMATCHCONDITIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTRAFFICTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRAFFICCLASS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRAFFICTYPE);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTION)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTFILTER)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHCONDITIONTYPE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHCONDITIONVALUE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERMATCHCONDITIONTYPE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTRAFFICTYPE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRAFFICCLASS)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRAFFICTYPE)){
				continue;
			}
			
			CIM_FilterEntry.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTFILTER, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHCONDITIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHCONDITIONVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERMATCHCONDITIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTRAFFICTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRAFFICCLASS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRAFFICTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTION)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTFILTER)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHCONDITIONTYPE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHCONDITIONVALUE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERMATCHCONDITIONTYPE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTRAFFICTYPE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRAFFICCLASS)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRAFFICTYPE)){
				continue;
			}
			
			CIM_FilterEntry.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACTION = {"Permit","Deny"};
	public final static String[] CIM_VALUEMAP_MATCHCONDITIONTYPE = {"Other","Source Address and Mask","Destination Address and Mask","Source Port","Source Port Range","Destination Port","Destination Port Range","Protocol Type","Protocol Type and Option","DSCP","ToS Value","802.1P Priority Value","Any"};
	public final static String[] CIM_VALUEMAP_TRAFFICTYPE = {"Unknown","IPv4","IPX","IPv6","Any","Other"};
	
	
	public final static int ACTION_PERMIT = 1;
	public final static int ACTION_DENY = 2;
	
	public final static int MATCHCONDITIONTYPE_OTHER = 1;
	public final static int MATCHCONDITIONTYPE_SOURCEADDRESSANDMASK = 2;
	public final static int MATCHCONDITIONTYPE_DESTINATIONADDRESSANDMASK = 3;
	public final static int MATCHCONDITIONTYPE_SOURCEPORT = 4;
	public final static int MATCHCONDITIONTYPE_SOURCEPORTRANGE = 5;
	public final static int MATCHCONDITIONTYPE_DESTINATIONPORT = 6;
	public final static int MATCHCONDITIONTYPE_DESTINATIONPORTRANGE = 7;
	public final static int MATCHCONDITIONTYPE_PROTOCOLTYPE = 8;
	public final static int MATCHCONDITIONTYPE_PROTOCOLTYPEANDOPTION = 9;
	public final static int MATCHCONDITIONTYPE_DSCP = 10;
	public final static int MATCHCONDITIONTYPE_TOSVALUE = 11;
	public final static int MATCHCONDITIONTYPE_802_1PPRIORITYVALUE = 12;
	public final static int MATCHCONDITIONTYPE_ANY = 13;
	
	public final static int TRAFFICTYPE_UNKNOWN = 0;
	public final static int TRAFFICTYPE_IPV4 = 1;
	public final static int TRAFFICTYPE_IPX = 2;
	public final static int TRAFFICTYPE_IPV6 = 3;
	public final static int TRAFFICTYPE_ANY = 4;
	public final static int TRAFFICTYPE_OTHER = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FilterEntry() {

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
	public CIM_FilterEntry(Vector keyProperties){ 
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
	public CIM_FilterEntry(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FilterEntry)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FilterEntry)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FilterEntry)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FilterEntry)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FilterEntry)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FilterEntry)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FilterEntry)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FilterEntry)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FilterEntry)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FilterEntry)object).cimObjectPath)) {
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
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute Action
	
	public UnsignedInt16 get_Action() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_ACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_ACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_ACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Action(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_ACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_ACTION + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_Action(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_ACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_ACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultFilter
	
	public Boolean get_DefaultFilter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultFilter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_DefaultFilter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_DEFAULTFILTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MatchConditionType
	
	public UnsignedInt16 get_MatchConditionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchConditionType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_MatchConditionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MatchConditionValue
	
	public String get_MatchConditionValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchConditionValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_MatchConditionValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_MATCHCONDITIONVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherMatchConditionType
	
	public String get_OtherMatchConditionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherMatchConditionType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_OtherMatchConditionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERMATCHCONDITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTrafficType
	
	public String get_OtherTrafficType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTrafficType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_OtherTrafficType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_OTHERTRAFFICTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TrafficClass
	
	public String get_TrafficClass() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TrafficClass(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_TrafficClass(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICCLASS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TrafficType
	
	public UnsignedInt16 get_TrafficType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TrafficType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE + " could not be found");
    		
		} else if (!CIM_FilterEntryHelper.isValid_TrafficType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FilterEntry.CIM_PROPERTY_TRAFFICTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
