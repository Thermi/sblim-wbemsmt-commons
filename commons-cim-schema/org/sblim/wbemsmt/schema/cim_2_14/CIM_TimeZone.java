/** 
 * CIM_TimeZone.java
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
 * Description:  The TimeZone class is a set of properties defining a particular time zone.
 * These properties include the concept of daylight saving time.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  The TimeZone class is a set of properties defining a particular time zone.
 * These properties include the concept of daylight saving time.
 */
public class CIM_TimeZone extends CIM_Setting  {
	
	public final static String CIM_CLASS_NAME = "CIM_TimeZone"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Short name of the 'daylight' time zone (e.g., "EDT"), suitable for presentation to the user in the default locale. Note that a specific DaylightCaption property is defined, instead of using the inherited Caption. This is done to force consistent property naming for the StandardXXX and DaylightXXX properties.
	*/
	public final static String CIM_PROPERTY_DAYLIGHTCAPTION = "DaylightCaption"; //$NON-NLS-1$
	/**
	*	There are two different interpretations for this property, depending on the value of DaylightDayOfWeek. In one case, DaylightDay defines the day-in-month on which daylight saving time starts. This interpretation is used when the DaylightDayOfWeek is 0. A positive or negative integer is specified to indicate whether the DaylightDay should be calculated from the beginning or the end of the month. For example, 5 indicates the fifth day in the DaylightMonth and -1 indicates the last day in the DaylightMonth. 

When DaylightDayOfWeek is not 0, DaylightDay is the day- in-month on which daylight saving time starts, defined in conjunction with DaylightDayOfWeek. For example, if DaylightDay is 15 and DaylightDayOfWeek is Saturday, then daylight saving time starts on the first Saturday on or after the 15th day in the DaylightMonth (i.e., the third Saturday in the month). If DaylightDay is 20 and DaylightDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the DaylightMonth. If DaylightDay is -1 and DaylightDayOfWeek is -Sunday, then this indicates the last Sunday in the month.
	*/
	public final static String CIM_PROPERTY_DAYLIGHTDAY = "DaylightDay"; //$NON-NLS-1$
	/**
	*	Positive or negative integer used in conjunction with DaylightDay to indicate the day of the week on which daylight saving time starts. Set DaylightDayOfWeek to 0 to indicate an exact day of month, such as March 1. Positive integer (Sunday, Monday, ..., Saturday) means that the day of week is found on or after DaylightDay. Negative integer (-Sunday, -Monday, ..., -Saturday) means that the day of week is found on or before DaylightDay.
	*/
	public final static String CIM_PROPERTY_DAYLIGHTDAYOFWEEK = "DaylightDayOfWeek"; //$NON-NLS-1$
	/**
	*	The month in which daylight saving time starts. Specify 0 for January, 1 for February, and so on.
	*/
	public final static String CIM_PROPERTY_DAYLIGHTMONTH = "DaylightMonth"; //$NON-NLS-1$
	/**
	*	Full name of the 'daylight' time zone (e.g., "U.S. Eastern Daylight Saving Time"), suitable for presentation to the user in the default locale.
	*/
	public final static String CIM_PROPERTY_DAYLIGHTNAME = "DaylightName"; //$NON-NLS-1$
	/**
	*	The number of minutes by which this daylight saving time differs from UTC. For example, U.S. EDT differs from UTC by -4.0 hours or -240 minutes, whereas Australia Adelaide Daylight Time differs by 10.5 hours or 630 minutes.
	*/
	public final static String CIM_PROPERTY_DAYLIGHTOFFSET = "DaylightOffset"; //$NON-NLS-1$
	/**
	*	The time interval after midnight when daylight saving time starts. For example, 
00000000020000.000000:000 
indicates that daylight saving time starts at two o'clock, local time (usually, standard time).
	*/
	public final static String CIM_PROPERTY_DAYLIGHTSTARTINTERVAL = "DaylightStartInterval"; //$NON-NLS-1$
	/**
	*	Short name of the 'standard' time zone (e.g., "EST"), suitable for presentation to the user in the default locale. Note that a specific StandardCaption property is defined, instead of using the inherited Caption. This is done to force consistent property naming for the StandardXXX and DaylightXXX properties.
	*/
	public final static String CIM_PROPERTY_STANDARDCAPTION = "StandardCaption"; //$NON-NLS-1$
	/**
	*	There are two different interpretations for this property, depending on the value of StandardDayOfWeek. In one case, StandardDay defines the day-in-month on which daylight saving time ends. This interpretation is used when the StandardDayOfWeek is 0. A positive or negative integer is specified to indicate whether the StandardDay should be calculated from the beginning or the end of the month. For example, 5 indicates the fifth day in the StandardMonth and -1 indicates the last day in the StandardMonth. 

When StandardDayOfWeek is not 0, StandardDay is the day- in-month on which daylight saving time ends, defined in conjunction with StandardDayOfWeek. For example, if StandardDay is 15 and StandardDayOfWeek is Saturday, then daylight saving time ends on the first Saturday on or after the 15th day in the StandardMonth (i.e., the third Saturday in the month). If StandardDay is 20 and StandardDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the StandardMonth. If StandardDay is -1 and StandardDayOfWeek is -Sunday, then this indicates the last Sunday in the StandardMonth.
	*/
	public final static String CIM_PROPERTY_STANDARDDAY = "StandardDay"; //$NON-NLS-1$
	/**
	*	Positive or negative integer used in conjunction with StandardDay to indicate the day of the week on which daylight saving time ends (and 'standard' time begins). StandardDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified StandardDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or before the StandardDay.
	*/
	public final static String CIM_PROPERTY_STANDARDDAYOFWEEK = "StandardDayOfWeek"; //$NON-NLS-1$
	/**
	*	The month in which daylight saving time ends (and 'standard' time begins). Specify 0 for January, 1 for February, and so on.
	*/
	public final static String CIM_PROPERTY_STANDARDMONTH = "StandardMonth"; //$NON-NLS-1$
	/**
	*	Full name of the 'standard' time zone (e.g., "U.S. Eastern Standard Time"), suitable for presentation to the user in the default locale.
	*/
	public final static String CIM_PROPERTY_STANDARDNAME = "StandardName"; //$NON-NLS-1$
	/**
	*	The number of minutes by which this 'standard' time differs from UTC. For example, U.S. EST differs from UTC by -5.0 hours or -300 minutes, whereas Australia Adelaide Standard Time differs by 9.5 hours or 570 minutes.
	*/
	public final static String CIM_PROPERTY_STANDARDOFFSET = "StandardOffset"; //$NON-NLS-1$
	/**
	*	The time interval after midnight when daylight saving time ends. For example, 
00000000020000.000000:000 
indicates that daylight saving time ends at two o'clock, local time (usually, daylight saving time).
	*/
	public final static String CIM_PROPERTY_STANDARDSTARTINTERVAL = "StandardStartInterval"; //$NON-NLS-1$
	/**
	*	Time zone identifier. The Id MAY be expressed in the form 'area name/city name' (e.g., "America/New_York"), or as a time zone name (for example, EST or EDT).
	*/
	public final static String CIM_PROPERTY_TIMEZONEID = "TimeZoneID"; //$NON-NLS-1$
	/**
	*	The date and time at which this time zone definition takes effect. The value is specified in UTC.
	*/
	public final static String CIM_PROPERTY_TIMEZONESTARTDATE = "TimeZoneStartDate"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTCAPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTDAY);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTDAYOFWEEK);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTMONTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTOFFSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_DAYLIGHTSTARTINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDCAPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDDAY);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDDAYOFWEEK);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDMONTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDOFFSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_STANDARDSTARTINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEZONEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEZONESTARTDATE);
				
		for (int i = 0; i < CIM_Setting.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTCAPTION)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTDAY)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTDAYOFWEEK)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTMONTH)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTNAME)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTOFFSET)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DAYLIGHTSTARTINTERVAL)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDCAPTION)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDDAY)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDDAYOFWEEK)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDMONTH)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDNAME)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDOFFSET)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STANDARDSTARTINTERVAL)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEZONEID)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEZONESTARTDATE)){
				continue;
			}
			
			CIM_TimeZone.CIM_PropertyNameList.add(CIM_Setting.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTCAPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTDAY, new CIMValue(null, new CIMDataType(CIMDataType.SINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTDAYOFWEEK, new CIMValue(null, new CIMDataType(CIMDataType.SINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTMONTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTOFFSET, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DAYLIGHTSTARTINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDCAPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDDAY, new CIMValue(null, new CIMDataType(CIMDataType.SINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDDAYOFWEEK, new CIMValue(null, new CIMDataType(CIMDataType.SINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDMONTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDOFFSET, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STANDARDSTARTINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEZONEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEZONESTARTDATE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_Setting.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTCAPTION)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTDAY)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTDAYOFWEEK)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTMONTH)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTNAME)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTOFFSET)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DAYLIGHTSTARTINTERVAL)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDCAPTION)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDDAY)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDDAYOFWEEK)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDMONTH)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDNAME)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDOFFSET)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STANDARDSTARTINTERVAL)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEZONEID)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEZONESTARTDATE)){
				continue;
			}
			
			CIM_TimeZone.CIM_PropertyList.add(CIM_Setting.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Setting.Java_Package_List.size(); i++) {
			if (((String)CIM_Setting.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Setting.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DAYLIGHTDAYOFWEEK = {"-Saturday","-Friday","-Thursday","-Wednesday","-Tuesday","-Monday","-Sunday","ExactDayOfMonth","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public final static String[] CIM_VALUEMAP_DAYLIGHTMONTH = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	public final static String[] CIM_VALUEMAP_STANDARDDAYOFWEEK = {"-Saturday","-Friday","-Thursday","-Wednesday","-Tuesday","-Monday","-Sunday","ExactDayOfMonth","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public final static String[] CIM_VALUEMAP_STANDARDMONTH = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	
	public final static int DAYLIGHTDAYOFWEEK__SATURDAY = -7;
	public final static int DAYLIGHTDAYOFWEEK__FRIDAY = -6;
	public final static int DAYLIGHTDAYOFWEEK__THURSDAY = -5;
	public final static int DAYLIGHTDAYOFWEEK__WEDNESDAY = -4;
	public final static int DAYLIGHTDAYOFWEEK__TUESDAY = -3;
	public final static int DAYLIGHTDAYOFWEEK__MONDAY = -2;
	public final static int DAYLIGHTDAYOFWEEK__SUNDAY = -1;
	public final static int DAYLIGHTDAYOFWEEK_EXACTDAYOFMONTH = 0;
	public final static int DAYLIGHTDAYOFWEEK_SUNDAY = 1;
	public final static int DAYLIGHTDAYOFWEEK_MONDAY = 2;
	public final static int DAYLIGHTDAYOFWEEK_TUESDAY = 3;
	public final static int DAYLIGHTDAYOFWEEK_WEDNESDAY = 4;
	public final static int DAYLIGHTDAYOFWEEK_THURSDAY = 5;
	public final static int DAYLIGHTDAYOFWEEK_FRIDAY = 6;
	public final static int DAYLIGHTDAYOFWEEK_SATURDAY = 7;
	
	public final static int DAYLIGHTMONTH_JANUARY = 0;
	public final static int DAYLIGHTMONTH_FEBRUARY = 1;
	public final static int DAYLIGHTMONTH_MARCH = 2;
	public final static int DAYLIGHTMONTH_APRIL = 3;
	public final static int DAYLIGHTMONTH_MAY = 4;
	public final static int DAYLIGHTMONTH_JUNE = 5;
	public final static int DAYLIGHTMONTH_JULY = 6;
	public final static int DAYLIGHTMONTH_AUGUST = 7;
	public final static int DAYLIGHTMONTH_SEPTEMBER = 8;
	public final static int DAYLIGHTMONTH_OCTOBER = 9;
	public final static int DAYLIGHTMONTH_NOVEMBER = 10;
	public final static int DAYLIGHTMONTH_DECEMBER = 11;
	
	public final static int STANDARDDAYOFWEEK__SATURDAY = -7;
	public final static int STANDARDDAYOFWEEK__FRIDAY = -6;
	public final static int STANDARDDAYOFWEEK__THURSDAY = -5;
	public final static int STANDARDDAYOFWEEK__WEDNESDAY = -4;
	public final static int STANDARDDAYOFWEEK__TUESDAY = -3;
	public final static int STANDARDDAYOFWEEK__MONDAY = -2;
	public final static int STANDARDDAYOFWEEK__SUNDAY = -1;
	public final static int STANDARDDAYOFWEEK_EXACTDAYOFMONTH = 0;
	public final static int STANDARDDAYOFWEEK_SUNDAY = 1;
	public final static int STANDARDDAYOFWEEK_MONDAY = 2;
	public final static int STANDARDDAYOFWEEK_TUESDAY = 3;
	public final static int STANDARDDAYOFWEEK_WEDNESDAY = 4;
	public final static int STANDARDDAYOFWEEK_THURSDAY = 5;
	public final static int STANDARDDAYOFWEEK_FRIDAY = 6;
	public final static int STANDARDDAYOFWEEK_SATURDAY = 7;
	
	public final static int STANDARDMONTH_JANUARY = 0;
	public final static int STANDARDMONTH_FEBRUARY = 1;
	public final static int STANDARDMONTH_MARCH = 2;
	public final static int STANDARDMONTH_APRIL = 3;
	public final static int STANDARDMONTH_MAY = 4;
	public final static int STANDARDMONTH_JUNE = 5;
	public final static int STANDARDMONTH_JULY = 6;
	public final static int STANDARDMONTH_AUGUST = 7;
	public final static int STANDARDMONTH_SEPTEMBER = 8;
	public final static int STANDARDMONTH_OCTOBER = 9;
	public final static int STANDARDMONTH_NOVEMBER = 10;
	public final static int STANDARDMONTH_DECEMBER = 11;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_TimeZone() {

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
	public CIM_TimeZone(Vector keyProperties){ 
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
	public CIM_TimeZone(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_TimeZoneID = this.cimInstance.getProperty(CIM_PROPERTY_TIMEZONEID);
		
		if (CIMProperty_TimeZoneID == null || CIMProperty_TimeZoneID.getValue().isEmpty() || CIMProperty_TimeZoneID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_TIMEZONEID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_TimeZoneStartDate = this.cimInstance.getProperty(CIM_PROPERTY_TIMEZONESTARTDATE);
		
		if (CIMProperty_TimeZoneStartDate == null || CIMProperty_TimeZoneStartDate.getValue().isEmpty() || CIMProperty_TimeZoneStartDate.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_TIMEZONESTARTDATE, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_TimeZone)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_TimeZone)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_TimeZone)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_TimeZone)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_TimeZone)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_TimeZone)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_TimeZone)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_TimeZone)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_TimeZone)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_TimeZone)object).cimObjectPath)) {
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
	
	// Attribute DaylightCaption
	
	public String get_DaylightCaption() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DaylightCaption(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightCaption(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTCAPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DaylightDay
	
	public Byte get_DaylightDay() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Byte)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DaylightDay(Byte newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightDay(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DaylightDayOfWeek
	
	public Byte get_DaylightDayOfWeek() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Byte)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DaylightDayOfWeek(Byte newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightDayOfWeek(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTDAYOFWEEK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DaylightMonth
	
	public UnsignedInt8 get_DaylightMonth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DaylightMonth(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightMonth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTMONTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DaylightName
	
	public String get_DaylightName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DaylightName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DaylightOffset
	
	public Integer get_DaylightOffset() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DaylightOffset(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightOffset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTOFFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DaylightStartInterval
	
	public Calendar get_DaylightStartInterval() {

		CIMProperty property = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_DaylightStartInterval(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_DaylightStartInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_DAYLIGHTSTARTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute StandardCaption
	
	public String get_StandardCaption() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StandardCaption(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardCaption(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDCAPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StandardDay
	
	public Byte get_StandardDay() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDDAY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Byte)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StandardDay(Byte newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDDAY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAY + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardDay(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StandardDayOfWeek
	
	public Byte get_StandardDayOfWeek() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Byte)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StandardDayOfWeek(Byte newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardDayOfWeek(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDDAYOFWEEK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StandardMonth
	
	public UnsignedInt8 get_StandardMonth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StandardMonth(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardMonth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDMONTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StandardName
	
	public String get_StandardName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StandardName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDNAME + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StandardOffset
	
	public Integer get_StandardOffset() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StandardOffset(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardOffset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDOFFSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StandardStartInterval
	
	public Calendar get_StandardStartInterval() {

		CIMProperty property = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_StandardStartInterval(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_StandardStartInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_STANDARDSTARTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TimeZoneID
	
	public String get_TimeZoneID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_TIMEZONEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeZoneID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_TIMEZONEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONEID + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_TimeZoneID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeZoneStartDate
	
	public Calendar get_TimeZoneStartDate() {

		CIMProperty property = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeZoneStartDate(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE + " could not be found");
    		
		} else if (!CIM_TimeZoneHelper.isValid_TimeZoneStartDate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TimeZone.CIM_PROPERTY_TIMEZONESTARTDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
