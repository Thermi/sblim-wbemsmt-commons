/** 
 * CIM_PolicyTimePeriodCondition.java
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
 * Description: This class provides a means of representing the time periods during which a PolicySet is valid, i.e., active. At all times that fall outside these time periods, the PolicySet has no effect. A PolicySet is treated as valid at ALL times, if it does not specify a PolicyTimePeriodCondition. 

In some cases a Policy Consumer may need to perform certain setup / cleanup actions when a PolicySet becomes active / inactive. For example, sessions that were established while a PolicySet was active might need to be taken down when the PolicySet becomes inactive. In other cases, however, such sessions might be left up. In this case, the effect of deactivating the PolicySet would just be to prevent the establishment of new sessions. 

Setup / cleanup behaviors on validity period transitions are not currently addressed by the Policy Model, and must be specified in 'guideline' documents or via subclasses of CIM_PolicySet, CIM_PolicyTimePeriod Condition or other concrete subclasses of CIM_Policy. If such behaviors need to be under the control of the policy administrator, then a mechanism to allow this control must also be specified in the subclasses. 

PolicyTimePeriodCondition is defined as a subclass of PolicyCondition. This is to allow the inclusion of time-based criteria in the AND/OR condition definitions for a PolicyRule. 

Instances of this class may have up to five properties identifying time periods at different levels. The values of all the properties present in an instance are ANDed together to determine the validity period(s) for the instance. For example, an instance with an overall validity range of January 1, 2000 through December 31, 2000; a month mask that selects March and April; a day-of-the-week mask that selects Fridays; and a time of day range of 0800 through 1600 would be represented using the following time periods: 
Friday, March 5, 2000, from 0800 through 1600; 
Friday, March 12, 2000, from 0800 through 1600; 
Friday, March 19, 2000, from 0800 through 1600; 
Friday, March 26, 2000, from 0800 through 1600; 
Friday, April 2, 2000, from 0800 through 1600; 
Friday, April 9, 2000, from 0800 through 1600; 
Friday, April 16, 2000, from 0800 through 1600; 
Friday, April 23, 2000, from 0800 through 1600; 
Friday, April 30, 2000, from 0800 through 1600. 

Properties not present in an instance of PolicyTimePeriodCondition are implicitly treated as having their value 'always enabled'. Thus, in the example above, the day-of-the-month mask is not present, and so the validity period for the instance implicitly includes a day-of-the-month mask that selects all days of the month. If this 'missing property' rule is applied to its fullest, we see that there is a second way to indicate that a PolicySet is always enabled: associate with it an instance of PolicyTimePeriodCondition whose only properties with specific values are its key properties.
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



public class CIM_PolicyTimePeriodCondition extends CIM_PolicyCondition  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicyTimePeriodCondition";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYRULEVALIDITYPERIOD = "CIM_PolicyRuleValidityPeriod";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYSETVALIDITYPERIOD = "CIM_PolicySetValidityPeriod";
	
	
	/**
	*	The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying in which days of the month the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the DayOfMonthMask used to pick out the days of the month during which the PolicySet is valid. 

This property is formatted as an octet string, structured as follows: 
o a 4-octet length field, indicating the length of the entire octet string; this field is always set to 0x0000000C for this property; 
o an 8-octet field consisting of 31 bits identifying the days of the month counting from the beginning, followed by 31 more bits identifying the days of the month counting from the end, followed by 2 bits that are always set to '0'. For each day, the value '1' indicates that the PolicySet is valid for that day, and the value '0' indicates that it is not valid. 

The value 0x0000000C8000000100000000, for example, indicates that a PolicySet is valid on the first and last days of the month. 

For months with fewer than 31 days, the digits corresponding to days that the months do not have (counting in both directions) are ignored. 

If a value for this property is not provided, then the PolicySet is treated as valid for all days of the month, and only restricted by its TimePeriod property value and the other Mask properties.
	*/
	public final static String CIM_PROPERTY_DAYOFMONTHMASK = "DayOfMonthMask"; //$NON-NLS-1$
	/**
	*	The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying in which days of the week the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the DayOfWeekMask used to pick out the days of the week during which the PolicySet is valid. 

This property is formatted as an octet string, structured as follows: 
o a 4-octet length field, indicating the length of the entire octet string; this field is always set to 0x00000005 for this property; 
o a 1-octet field consisting of 7 bits identifying the 7 days of the week, beginning with Sunday and ending with Saturday, followed by 1 bit that is always set to '0'. For each day of the week, the value '1' indicates that the PolicySet is valid for that day, and the value '0' indicates that it is not valid. 

The value 0x000000057C, for example, indicates that a PolicySet is valid Monday through Friday. 

If a value for this property is not provided, then the PolicySet is treated as valid for all days of the week, and only restricted by its TimePeriod property value and the other Mask properties.
	*/
	public final static String CIM_PROPERTY_DAYOFWEEKMASK = "DayOfWeekMask"; //$NON-NLS-1$
	/**
	*	This property indicates whether the times represented in the TimePeriod property and in the various Mask properties represent local times or UTC times. There is no provision for mixing of local times and UTC times: the value of this property applies to all of the other time-related properties. TimePeriods are synchronized worldwide by using the enumeration value 'UTCTime'. If the goal is to synchronize worldwide on a particular local time (such as 0300 - 0500 in New York), then if the TimePeriod property spans a Daylight Savings Time transition in New York, it will be necessary to create multiple instances of PolicyTimePeriodCondition, one based on the offset UTC-0500 for the part of each year when standard time is used in New York, and one based on the offset UTC-0400 for the part of each year when Daylight Savings Time is used there.
	*/
	public final static String CIM_PROPERTY_LOCALORUTCTIME = "LocalOrUtcTime"; //$NON-NLS-1$
	/**
	*	The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying in which months the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the MonthOfYearMask used to pick out the months during which the PolicySet is valid. 

This property is formatted as an octet string, structured as follows: 
o a 4-octet length field, indicating the length of the entire octet string; this field is always set to 0x00000006 for this property; 
o a 2-octet field consisting of 12 bits identifying the 12 months of the year, beginning with January and ending with December, followed by 4 bits that are always set to '0'. For each month, the value '1' indicates that the policy is valid for that month, and the value '0' indicates that it is not valid. 

The value 0x000000060830, for example, indicates that a PolicySet is valid only in the months May, November, and December. 

If a value for this property is not provided, then the PolicySet is treated as valid for all twelve months, and only restricted by its TimePeriod property value and the other Mask properties.
	*/
	public final static String CIM_PROPERTY_MONTHOFYEARMASK = "MonthOfYearMask"; //$NON-NLS-1$
	/**
	*	The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying a range of times in a day during which the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the TimeOfDayMask used to pick out the range of time periods in a given day of during which the PolicySet is valid. 

This property is formatted in the style of RFC 2445: a time string beginning with the character 'T', followed by the solidus character '/', followed by a second time string. The first time indicates the beginning of the range, while the second time indicates the end. Times are expressed as substrings of the form 'Thhmmss'. 

The second substring always identifies a later time than the first substring. To allow for ranges that span midnight, however, the value of the second string may be smaller than the value of the first substring. Thus, 'T080000/T210000' identifies the range from 0800 until 2100, while 'T210000/T080000' identifies the range from 2100 until 0800 of the following day. 

When a range spans midnight, it by definition includes parts of two successive days. When one of these days is also selected by either the MonthOfYearMask, DayOfMonthMask, and/or DayOfWeekMask, but the other day is not, then the PolicySet is active only during the portion of the range that falls on the selected day. For example, if the range extends from 2100 until 0800, and the day of week mask selects Monday and Tuesday, then the PolicySet is active during the following three intervals: 
From midnight Sunday until 0800 Monday; 
From 2100 Monday until 0800 Tuesday; 
From 2100 Tuesday until 23:59:59 Tuesday. 

If a value for this property is not provided, then the PolicySet is treated as valid for all hours of the day, and only restricted by its TimePeriod property value and the other Mask properties.
	*/
	public final static String CIM_PROPERTY_TIMEOFDAYMASK = "TimeOfDayMask"; //$NON-NLS-1$
	/**
	*	This property identifies an overall range of calendar dates and times over which a PolicySet is valid. It is formatted as a string representing a start date and time, in which the character 'T' indicates the beginning of the time portion, followed by the solidus character '/', followed by a similar string representing an end date and time. The first date indicates the beginning of the range, while the second date indicates the end. Thus, the second date and time must be later than the first. Date/times are expressed as substrings of the form yyyymmddThhmmss. For example: 
20000101T080000/20000131T120000 defines 
January 1, 2000, 0800 through January 31, 2000, noon 

There are also two special cases in which one of the date/time strings is replaced with a special string defined in RFC 2445. 
o If the first date/time is replaced with the string 'THISANDPRIOR', then the property indicates that a PolicySet is valid [from now] until the date/time that appears after the '/'. 
o If the second date/time is replaced with the string 'THISANDFUTURE', then the property indicates that a PolicySet becomes valid on the date/time that appears before the '/', and remains valid from that point on.
	*/
	public final static String CIM_PROPERTY_TIMEPERIOD = "TimePeriod"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYOFMONTHMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYOFWEEKMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALORUTCTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MONTHOFYEARMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFDAYMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEPERIOD);
				
		for (int i = 0; i < CIM_PolicyCondition.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYOFMONTHMASK)||
				((String)CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYOFWEEKMASK)||
				((String)CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALORUTCTIME)||
				((String)CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MONTHOFYEARMASK)||
				((String)CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFDAYMASK)||
				((String)CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEPERIOD)){
				continue;
			}
			
			CIM_PolicyTimePeriodCondition.CIM_PropertyNameList.add(CIM_PolicyCondition.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYOFMONTHMASK, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYOFWEEKMASK, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALORUTCTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MONTHOFYEARMASK, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFDAYMASK, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEPERIOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_PolicyCondition.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PolicyCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYOFMONTHMASK)||
				((CIMProperty)CIM_PolicyCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYOFWEEKMASK)||
				((CIMProperty)CIM_PolicyCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALORUTCTIME)||
				((CIMProperty)CIM_PolicyCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MONTHOFYEARMASK)||
				((CIMProperty)CIM_PolicyCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFDAYMASK)||
				((CIMProperty)CIM_PolicyCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEPERIOD)){
				continue;
			}
			
			CIM_PolicyTimePeriodCondition.CIM_PropertyList.add(CIM_PolicyCondition.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PolicyCondition.Java_Package_List.size(); i++) {
			if (((String)CIM_PolicyCondition.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PolicyCondition.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOCALORUTCTIME = {"Local Time","UTC Time"};
	
	
	public final static int LOCALORUTCTIME_LOCALTIME = 1;
	public final static int LOCALORUTCTIME_UTCTIME = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PolicyTimePeriodCondition() {

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
	public CIM_PolicyTimePeriodCondition(Vector keyProperties){ 
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
	public CIM_PolicyTimePeriodCondition(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicyTimePeriodCondition)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicyTimePeriodCondition)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicyTimePeriodCondition)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicyTimePeriodCondition)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicyTimePeriodCondition)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicyTimePeriodCondition)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicyTimePeriodCondition)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicyTimePeriodCondition)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicyTimePeriodCondition)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicyTimePeriodCondition)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PolicyRule_CIM_PolicyRuleValidityPeriods(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYRULEVALIDITYPERIOD, 
					CIM_PolicyRule.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PolicyTimePeriodCondition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PolicyTimePeriodCondition.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PolicyTimePeriodCondition.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PolicyTimePeriodCondition.Java_Package_List.setElementAt((String)(CIM_PolicyTimePeriodCondition.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PolicyTimePeriodCondition.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicyRule(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PolicyRule(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicyRule(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PolicyRule_CIM_PolicyRuleValidityPeriod_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYRULEVALIDITYPERIOD, 
					CIM_PolicyRule.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PolicyRule.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PolicySet_CIM_PolicySetValidityPeriods(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYSETVALIDITYPERIOD, 
					CIM_PolicySet.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PolicyTimePeriodCondition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PolicyTimePeriodCondition.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PolicyTimePeriodCondition.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PolicyTimePeriodCondition.Java_Package_List.setElementAt((String)(CIM_PolicyTimePeriodCondition.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PolicyTimePeriodCondition.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicySet(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PolicySet(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicySet(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PolicySet_CIM_PolicySetValidityPeriod_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYSETVALIDITYPERIOD, 
					CIM_PolicySet.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
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
	
	// Attribute DayOfMonthMask
	
	public UnsignedInt8[] get_DayOfMonthMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_DayOfMonthMask(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK + " could not be found");
    		
		} else if (!CIM_PolicyTimePeriodConditionHelper.isValid_DayOfMonthMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFMONTHMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DayOfWeekMask
	
	public UnsignedInt8[] get_DayOfWeekMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_DayOfWeekMask(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK + " could not be found");
    		
		} else if (!CIM_PolicyTimePeriodConditionHelper.isValid_DayOfWeekMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_DAYOFWEEKMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalOrUtcTime
	
	public UnsignedInt16 get_LocalOrUtcTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalOrUtcTime(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME + " could not be found");
    		
		} else if (!CIM_PolicyTimePeriodConditionHelper.isValid_LocalOrUtcTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_LOCALORUTCTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MonthOfYearMask
	
	public UnsignedInt8[] get_MonthOfYearMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_MonthOfYearMask(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK + " could not be found");
    		
		} else if (!CIM_PolicyTimePeriodConditionHelper.isValid_MonthOfYearMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_MONTHOFYEARMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfDayMask
	
	public String get_TimeOfDayMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeOfDayMask(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK + " could not be found");
    		
		} else if (!CIM_PolicyTimePeriodConditionHelper.isValid_TimeOfDayMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEOFDAYMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimePeriod
	
	public String get_TimePeriod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimePeriod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD + " could not be found");
    		
		} else if (!CIM_PolicyTimePeriodConditionHelper.isValid_TimePeriod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyTimePeriodCondition.CIM_PROPERTY_TIMEPERIOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
