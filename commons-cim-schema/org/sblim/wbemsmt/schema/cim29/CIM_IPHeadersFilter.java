/** 
 * CIM_IPHeadersFilter.java
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
 * Description: IPHeadersFilter contains the most commonly required properties for performing filtering on IP, TCP or UDP headers. Properties not present in an instance of the IPHeadersFilter are treated as 'all values'.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPHeadersFilter extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPHeadersFilter";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	HdrDSCP is defined as a set of discrete DiffServ code points, with no inherent structure. There is no semantically significant relationship between different HdrDSCPs. Consequently, there is no provision for specifying a range of HdrDSCPs. 

Since, in IPv4, the HdrDSCP field may contain bits to be interpreted as the TOS IP Precedence, this property is also used to filter on IP Precedence. Similarly, the IPv6 Traffic Class field is also filtered using the value(s) in this property. 

HdrDSCP is defined as an array, to provide the ability to specify several discrete DSCPs in a single instance of IPHeadersFilter, that would be OR'ed together to define the filter criteria. 

If a value for this property is not provided, then the filter does not consider HdrDSCP in selecting matching packets, i.e., HdrDSCP matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRDSCP = "HdrDSCP"; //$NON-NLS-1$
	/**
	*	HdrDestAddressEndOfRange is an OctetString, of a size determined by the value of the HdrIPVersion property, representing the end of a range of destination IP addresses (inclusive), where the start of the range is the HdrDestAddress property value. 

If a value for HdrDestAddress is not provided, then this property also MUST NOT be provided. If a value for this property is provided, then HdrDestMask MUST NOT be provided.
	*/
	public final static String CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE = "HdrDestAddressEndOfRange"; //$NON-NLS-1$
	/**
	*	HdrDestAddress is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a destination IP address. When there is no HdrDestAddressEndOfRange value, this value is compared to the destination address in the IP header, subject to the mask represented in the HdrDestMask property. (Note that the mask is ANDed with the address.) When there is a HdrDestAddressEndOfRange value, this value is the start of the specified range (i.e., the HdrDestAddress is lower than the HdrDestAddressEndOfRange) that is compared to the source address in the IP header and matches on any value in the range. 

If a value for this property is not provided, then the filter does not consider HdrDestAddress in selecting matching packets, i.e., HdrDestAddress matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRDESTADDRESS = "HdrDestAddress"; //$NON-NLS-1$
	/**
	*	HdrDestMask is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a mask to be used in comparing the destination address in the IP header with the value represented in the HdrDestAddress property. 

If a value for this property is not provided, then the filter does not consider HdrDestMask in selecting matching packets, i.e., the value of the HdrDestAddress or the destination address range must match the destination address in the packet exactly. If a value for this property is provided, then HdrDestAddressEndOfRange MUST NOT be provided.
	*/
	public final static String CIM_PROPERTY_HDRDESTMASK = "HdrDestMask"; //$NON-NLS-1$
	/**
	*	HdrDestPortEnd represents the upper end of a range of UDP or TCP destination ports. The lower end of the range is represented by the HdrDestPortStart property. The value of HdrDestPortEnd MUST be no less than the value of HdrDestPortStart. A single port is indicated by equal values for HdrDestPortStart and HdrDestPortEnd. 

A destination port filter is evaluated by testing whether the destination port identified in the IP header falls within the range of values between HdrDestPortStart and HdrDestPortEnd, INCLUDING these two end points. 

If a value for this property is not provided, then the filter does not consider HdrDestPortEnd in selecting matching packets, i.e., there is no upper bound in matching destination port values.
	*/
	public final static String CIM_PROPERTY_HDRDESTPORTEND = "HdrDestPortEnd"; //$NON-NLS-1$
	/**
	*	HdrDestPortStart represents the lower end of a range of UDP or TCP destination ports. The upper end of the range is represented by the HdrDestPortEnd property. The value of HdrDestPortStart MUST be no greater than the value of HdrDestPortEnd. A single port is indicated by equal values for HdrDestPortStart and HdrDestPortEnd. 

A destination port filter is evaluated by testing whether the destination port identified in the IP header falls within the range of values between HdrDestPortStart and HdrDestPortEnd, INCLUDING these two end points. 

If a value for this property is not provided, then the filter does not consider HdrDestPortStart in selecting matching packets, i.e., there is no lower bound in matching destination port values.
	*/
	public final static String CIM_PROPERTY_HDRDESTPORTSTART = "HdrDestPortStart"; //$NON-NLS-1$
	/**
	*	The 20-bit Flow Label field in the IPv6 header may be used by a source to label sequences of packets for which it requests special handling by the IPv6 devices, such as non-default quality of service or 'real-time' service. In the filter, this 20-bit string is encoded in a 24-bit octetstring by right-adjusting the value and padding on the left with b'0000'. 

If a value for this property is not provided, then the filter does not consider HdrFlowLabel in selecting matching packets, i.e., HdrFlowLabel matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRFLOWLABEL = "HdrFlowLabel"; //$NON-NLS-1$
	/**
	*	HdrIPVersion identifies the version of the IP addresses for IP header filters. It is also used to determine the sizes of the OctetStrings in the six properties HdrSrcAddress, HdrSrcAddressEndOfRange, HdrSrcMask, HdrDestAddress, HdrDestAddressEndOfRange and HdrDestMask, as follows: 
ipv4(4): OctetString(SIZE (4)) 
ipv6(6): OctetString(SIZE (16|20)), 
depending on whether a scope identifier is present. 

If a value for this property is not provided, then the filter does not consider IP version in selecting matching packets, i.e., IP version matches for all values. In this case, the HdrSrcAddress, HdrSrcAddressEndOfRange, HdrSrcMask, HdrDestAddress, HdrDestAddressEndOfRange and HdrDestMask must also be not present.
	*/
	public final static String CIM_PROPERTY_HDRIPVERSION = "HdrIPVersion"; //$NON-NLS-1$
	/**
	*	HdrProtocolID is an 8-bit unsigned integer, representing an IP protocol type. This value is compared to the Protocol field in the IP header. 

If a value for this property is not provided, then the filter does not consider HdrProtocolID in selecting matching packets, i.e., HdrProtocolID matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRPROTOCOLID = "HdrProtocolID"; //$NON-NLS-1$
	/**
	*	HdrSrcAddressEndOfRange is an OctetString, of a size determined by the value of the HdrIPVersion property, representing the end of a range of source IP addresses (inclusive), where the start of the range is the HdrSrcAddress property value. 

If a value for HdrSrcAddress is not provided, then this property also MUST NOT be provided. If a value for this property is provided, then HdrSrcMask MUST NOT be provided.
	*/
	public final static String CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE = "HdrSrcAddressEndOfRange"; //$NON-NLS-1$
	/**
	*	HdrSrcAddress is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a source IP address. When there is no HdrSrcAddressEndOfRange value, this value is compared to the source address in the IP header, subject to the mask represented in the HdrSrcMask property. (Note that the mask is ANDed with the address.) When there is a HdrSrcAddressEndOfRange value, this value is the start of the specified range (i.e., the HdrSrcAddress is lower than the HdrSrcAddressEndOfRange) that is compared to the source address in the IP header and matches on any value in the range. 

If a value for this property is not provided, then the filter does not consider HdrSrcAddress in selecting matching packets, i.e., HdrSrcAddress matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRSRCADDRESS = "HdrSrcAddress"; //$NON-NLS-1$
	/**
	*	HdrSrcMask is an OctetString, of a size determined by the value of the HdrIPVersion property, representing a mask to be used in comparing the source address in the IP header with the value represented in the HdrSrcAddress property. 

If a value for this property is not provided, then the filter does not consider HdrSrcMask in selecting matching packets, i.e., the value of the HdrSrcAddress or the source address range must match the source address in the packet exactly. If a value for this property is provided, then HdrSrcAddressEndOfRange MUST NOT be provided.
	*/
	public final static String CIM_PROPERTY_HDRSRCMASK = "HdrSrcMask"; //$NON-NLS-1$
	/**
	*	HdrSrcPortEnd represents the upper end of a range of UDP or TCP source ports. The lower end of the range is represented by the HdrSrcPortStart property. The value of HdrSrcPortEnd MUST be no less than the value of HdrSrcPortStart. A single port is indicated by equal values for HdrSrcPortStart and HdrSrcPortEnd. 

A source port filter is evaluated by testing whether the source port identified in the IP header falls within the range of values between HdrSrcPortStart and HdrSrcPortEnd, INCLUDING these two end points. 

If a value for this property is not provided, then the filter does not consider HdrSrcPortEnd in selecting matching packets, i.e., there is no upper bound in matching source port values.
	*/
	public final static String CIM_PROPERTY_HDRSRCPORTEND = "HdrSrcPortEnd"; //$NON-NLS-1$
	/**
	*	HdrSrcPortStart represents the lower end of a range of UDP or TCP source ports. The upper end of the range is represented by the HdrSrcPortEnd property. The value of HdrSrcPortStart MUST be no greater than the value of HdrSrcPortEnd. 

A source port filter is evaluated by testing whether the source port identified in the IP header falls within the range of values between HdrSrcPortStart and HdrSrcPortEnd, INCLUDING these two end points. 

If a value for this property is not provided, then the filter does not consider HdrSrcPortStart in selecting matching packets, i.e., there is no lower bound in matching source port values.
	*/
	public final static String CIM_PROPERTY_HDRSRCPORTSTART = "HdrSrcPortStart"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDSCP);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTPORTEND);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTPORTSTART);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRFLOWLABEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRIPVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRPROTOCOLID);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCPORTEND);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCPORTSTART);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDSCP)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTADDRESS)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTMASK)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTPORTEND)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTPORTSTART)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRFLOWLABEL)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRIPVERSION)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRPROTOCOLID)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCADDRESS)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCMASK)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCPORTEND)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCPORTSTART)){
				continue;
			}
			
			CIM_IPHeadersFilter.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDSCP, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTMASK, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTPORTEND, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTPORTSTART, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRFLOWLABEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRIPVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRPROTOCOLID, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCMASK, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCPORTEND, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCPORTSTART, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDSCP)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTADDRESS)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTMASK)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTPORTEND)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTPORTSTART)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRFLOWLABEL)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRIPVERSION)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRPROTOCOLID)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCADDRESS)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCMASK)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCPORTEND)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCPORTSTART)){
				continue;
			}
			
			CIM_IPHeadersFilter.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_HDRIPVERSION = {"IPv4","IPv6"};
	
	
	public final static int HDRIPVERSION_IPV4 = 4;
	public final static int HDRIPVERSION_IPV6 = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPHeadersFilter() {

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
	public CIM_IPHeadersFilter(Vector keyProperties){ 
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
	public CIM_IPHeadersFilter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPHeadersFilter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPHeadersFilter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPHeadersFilter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPHeadersFilter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPHeadersFilter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPHeadersFilter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPHeadersFilter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPHeadersFilter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPHeadersFilter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPHeadersFilter)object).cimObjectPath)) {
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
	
	// Attribute HdrDSCP
	
	public UnsignedInt8[] get_HdrDSCP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrDSCP(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrDSCP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDSCP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrDestAddressEndOfRange
	
	public UnsignedInt8[] get_HdrDestAddressEndOfRange() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrDestAddressEndOfRange(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrDestAddressEndOfRange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESSENDOFRANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrDestAddress
	
	public UnsignedInt8[] get_HdrDestAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrDestAddress(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrDestAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrDestMask
	
	public UnsignedInt8[] get_HdrDestMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrDestMask(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrDestMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrDestPortEnd
	
	public UnsignedInt16 get_HdrDestPortEnd() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrDestPortEnd(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrDestPortEnd(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTEND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrDestPortStart
	
	public UnsignedInt16 get_HdrDestPortStart() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrDestPortStart(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrDestPortStart(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRDESTPORTSTART + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrFlowLabel
	
	public UnsignedInt8[] get_HdrFlowLabel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrFlowLabel(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrFlowLabel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRFLOWLABEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrIPVersion
	
	public UnsignedInt8 get_HdrIPVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrIPVersion(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrIPVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRIPVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrProtocolID
	
	public UnsignedInt8 get_HdrProtocolID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrProtocolID(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrProtocolID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRPROTOCOLID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcAddressEndOfRange
	
	public UnsignedInt8[] get_HdrSrcAddressEndOfRange() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrSrcAddressEndOfRange(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrSrcAddressEndOfRange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESSENDOFRANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcAddress
	
	public UnsignedInt8[] get_HdrSrcAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrSrcAddress(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrSrcAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcMask
	
	public UnsignedInt8[] get_HdrSrcMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_HdrSrcMask(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrSrcMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcPortEnd
	
	public UnsignedInt16 get_HdrSrcPortEnd() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrSrcPortEnd(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrSrcPortEnd(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTEND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcPortStart
	
	public UnsignedInt16 get_HdrSrcPortStart() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrSrcPortStart(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART + " could not be found");
    		
		} else if (!CIM_IPHeadersFilterHelper.isValid_HdrSrcPortStart(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPHeadersFilter.CIM_PROPERTY_HDRSRCPORTSTART + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
