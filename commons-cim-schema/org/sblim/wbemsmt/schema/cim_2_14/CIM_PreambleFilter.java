/** 
 * CIM_PreambleFilter.java
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
 * Description:  PreambleFilter allows the classification of packets using traffic-conditioning
 * results (where the results are determined by a PreambleMarkerService and
 * stored in a 'packet preamble'). This permits information about the treatment
 * that a packet receives on an ingress interface to be communicated along with
 * the packet to the egress interface. An instance of PreambleFilter selects
 * packets based on a two-part string (type and value pair) identifying a
 * specific entry in the preamble. The logic for this match is 'at least one.'
 * That is, a packet with multiple entries/results in its preamble matches a
 * filter if at least one of these matches the filter.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;


/**
 *  PreambleFilter allows the classification of packets using traffic-conditioning
 * results (where the results are determined by a PreambleMarkerService and
 * stored in a 'packet preamble'). This permits information about the treatment
 * that a packet receives on an ingress interface to be communicated along with
 * the packet to the egress interface. An instance of PreambleFilter selects
 * packets based on a two-part string (type and value pair) identifying a
 * specific entry in the preamble. The logic for this match is 'at least one.'
 * That is, a packet with multiple entries/results in its preamble matches a
 * filter if at least one of these matches the filter.
 */
public class CIM_PreambleFilter extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_PreambleFilter"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	To foster interoperability, the basic format of the information captured by a PreambleMarker is specified. That information is contained in the FilterItemList property (an ordered, string array). Each entry in the array takes the form 'type,value'. When entries are added, they are appended to the end of the list. 

A limited set of standardized 'type's exist. They are: 
- ConformingFromMeter, NonConformingFromMeter and PartConformingFromMeter to convey metering results (where the 'value' is the name of the meter) 
- VlanId to describe the traffic's VLAN information (where the 'value' is the VLAN ID). 
An implementation is free to define and use other preamble 'types'. 

Note that a wildcard value of "any" is allowed to indicate that the preamble entry matches for any 'value' of the specified 'type'. For example, using the wildcard, an administrator can define a filter to select all packets that were found to be conforming ('type' = "ConformingFromMeter") without having to name each meter individually.
	*/
	public final static String CIM_PROPERTY_FILTERITEMLIST = "FilterItemList"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FILTERITEMLIST);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILTERITEMLIST)){
				continue;
			}
			
			CIM_PreambleFilter.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILTERITEMLIST, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILTERITEMLIST)){
				continue;
			}
			
			CIM_PreambleFilter.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PreambleFilter() {

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
	public CIM_PreambleFilter(Vector keyProperties){ 
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
	public CIM_PreambleFilter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PreambleFilter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PreambleFilter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PreambleFilter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PreambleFilter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PreambleFilter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PreambleFilter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PreambleFilter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PreambleFilter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PreambleFilter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PreambleFilter)object).cimObjectPath)) {
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
	
	// Attribute FilterItemList
	
	public String[] get_FilterItemList() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_FilterItemList(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST + " could not be found");
    		
		} else if (!CIM_PreambleFilterHelper.isValid_FilterItemList(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PreambleFilter.CIM_PROPERTY_FILTERITEMLIST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}