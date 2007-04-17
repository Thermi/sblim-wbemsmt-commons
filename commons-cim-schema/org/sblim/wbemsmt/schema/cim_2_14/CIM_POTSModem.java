/** 
 * CIM_POTSModem.java
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
 * Description:  The POTSModem class represents a Device that translates binary data into wave
 * modulations for sound-based transmission. It connects to the POTS (Plain Old
 * Telephone System) network.
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
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  The POTSModem class represents a Device that translates binary data into wave
 * modulations for sound-based transmission. It connects to the POTS (Plain Old
 * Telephone System) network.
 */
public class CIM_POTSModem extends CIM_CallBasedModem  {
	
	public final static String CIM_CLASS_NAME = "CIM_POTSModem"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	AnswerMode defines the current auto-answer or call-back setting for the Modem.
	*/
	public final static String CIM_PROPERTY_ANSWERMODE = "AnswerMode"; //$NON-NLS-1$
	/**
	*	List of black-listed numbers for the Modem.
	*/
	public final static String CIM_PROPERTY_BLACKLISTEDNUMBERS = "BlackListedNumbers"; //$NON-NLS-1$
	/**
	*	Capabilities of the POTSModem. For example, the Device might support distinctive ring, caller ID, fax, voice, and so on.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings that provides more detailed explanations for any of the POTSModem features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	CountriesSupported is an array of strings that defines the countries in which the POTSModem operates.
	*/
	public final static String CIM_PROPERTY_COUNTRIESSUPPORTED = "CountriesSupported"; //$NON-NLS-1$
	/**
	*	CountrySelected is a string value that defines the country for which the Modem is currently programmed. When multiple countries are supported, this property defines which one is currently selected for use.
	*/
	public final static String CIM_PROPERTY_COUNTRYSELECTED = "CountrySelected"; //$NON-NLS-1$
	/**
	*	CurrentPasswords is an array that contains the currently defined passwords for the Modem. This array might be left blank for security reasons.
	*/
	public final static String CIM_PROPERTY_CURRENTPASSWORDS = "CurrentPasswords"; //$NON-NLS-1$
	/**
	*	DialType is an integer that indicates whether tone (value=1) or pulse dialing (value=2) is used. "Unknown" (0) can also be defined.
	*/
	public final static String CIM_PROPERTY_DIALTYPE = "DialType"; //$NON-NLS-1$
	/**
	*	Specifies which capabilities from the list of those supported are enabled and defined in the Capabilities array.
	*/
	public final static String CIM_PROPERTY_ENABLEDCAPABILITIES = "EnabledCapabilities"; //$NON-NLS-1$
	/**
	*	The current equalization setting for the Modem.
	*/
	public final static String CIM_PROPERTY_EQUALIZATION = "Equalization"; //$NON-NLS-1$
	/**
	*	InactivityTimeout defines the time limit (in seconds) for automatic disconnection of the phone line, if no data is exchanged. A value of 0 indicates that this feature is present but not enabled.
	*/
	public final static String CIM_PROPERTY_INACTIVITYTIMEOUT = "InactivityTimeout"; //$NON-NLS-1$
	/**
	*	Defines the maximum communication speed for accessing the phone system that can be set.
	*/
	public final static String CIM_PROPERTY_MAXBAUDRATETOPHONE = "MaxBaudRateToPhone"; //$NON-NLS-1$
	/**
	*	Defines the maximum communication speed to the COM Port for an external modem that can be set. Enter 0 if not applicable.
	*/
	public final static String CIM_PROPERTY_MAXBAUDRATETOSERIALPORT = "MaxBaudRateToSerialPort"; //$NON-NLS-1$
	/**
	*	MaxNumberOfPasswords specifies the number of passwords that can be defined in the Modem itself. If this feature is not supported, enter 0.
	*/
	public final static String CIM_PROPERTY_MAXNUMBEROFPASSWORDS = "MaxNumberOfPasswords"; //$NON-NLS-1$
	/**
	*	Number of rings before the Modem answers an incoming call.
	*/
	public final static String CIM_PROPERTY_RINGSBEFOREANSWER = "RingsBeforeAnswer"; //$NON-NLS-1$
	/**
	*	Describes the volume level of the audible tones from the Modem. For example, high, medium, or low volume can be reported (values 3, 4, or 5, respectively).
	*/
	public final static String CIM_PROPERTY_SPEAKERVOLUMEINFO = "SpeakerVolumeInfo"; //$NON-NLS-1$
	/**
	*	Indication of whether the Modem supports call-back.
	*/
	public final static String CIM_PROPERTY_SUPPORTSCALLBACK = "SupportsCallback"; //$NON-NLS-1$
	/**
	*	Boolean that indicates that synchronous, as well as asynchronous, communication is supported.
	*/
	public final static String CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT = "SupportsSynchronousConnect"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ANSWERMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_BLACKLISTEDNUMBERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_COUNTRIESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_COUNTRYSELECTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTPASSWORDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIALTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_EQUALIZATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_INACTIVITYTIMEOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXBAUDRATETOPHONE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXBAUDRATETOSERIALPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBEROFPASSWORDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RINGSBEFOREANSWER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPEAKERVOLUMEINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTSCALLBACK);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT);
				
		for (int i = 0; i < CIM_CallBasedModem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ANSWERMODE)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLACKLISTEDNUMBERS)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COUNTRIESSUPPORTED)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COUNTRYSELECTED)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTPASSWORDS)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIALTYPE)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EQUALIZATION)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INACTIVITYTIMEOUT)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXBAUDRATETOPHONE)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXBAUDRATETOSERIALPORT)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBEROFPASSWORDS)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RINGSBEFOREANSWER)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPEAKERVOLUMEINFO)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTSCALLBACK)||
				((String)CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT)){
				continue;
			}
			
			CIM_POTSModem.CIM_PropertyNameList.add(CIM_CallBasedModem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ANSWERMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLACKLISTEDNUMBERS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COUNTRIESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COUNTRYSELECTED, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTPASSWORDS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIALTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EQUALIZATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INACTIVITYTIMEOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXBAUDRATETOPHONE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXBAUDRATETOSERIALPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBEROFPASSWORDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RINGSBEFOREANSWER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPEAKERVOLUMEINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTSCALLBACK, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_CallBasedModem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ANSWERMODE)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLACKLISTEDNUMBERS)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COUNTRIESSUPPORTED)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COUNTRYSELECTED)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTPASSWORDS)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIALTYPE)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EQUALIZATION)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INACTIVITYTIMEOUT)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXBAUDRATETOPHONE)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXBAUDRATETOSERIALPORT)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBEROFPASSWORDS)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RINGSBEFOREANSWER)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPEAKERVOLUMEINFO)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTSCALLBACK)||
				((CIMProperty)CIM_CallBasedModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT)){
				continue;
			}
			
			CIM_POTSModem.CIM_PropertyList.add(CIM_CallBasedModem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_CallBasedModem.Java_Package_List.size(); i++) {
			if (((String)CIM_CallBasedModem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_CallBasedModem.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ANSWERMODE = {"Unknown","Other","Disabled","Manual Answer","Auto Answer","Auto Answer with Call-Back"};
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Distinctive Ring","Caller ID","Voice","Fax Class 1","Fax Class 2","WakeOnRing","Fax Group 3","GSM Support","AMPS Support","OOB Alerting","Worldwide Country Support"};
	public final static String[] CIM_VALUEMAP_DIALTYPE = {"Unknown","Tone","Pulse"};
	public final static String[] CIM_VALUEMAP_ENABLEDCAPABILITIES = {"Unknown","Other","Distinctive Ring","Caller ID","Voice","Fax Class 1","Fax Class 2","WakeOnRing","Fax Group 3","GSM Support","AMPS Support","OOB Alerting","Worldwide Country Support"};
	public final static String[] CIM_VALUEMAP_EQUALIZATION = {"Unknown","Other","Long","Short"};
	public final static String[] CIM_VALUEMAP_SPEAKERVOLUMEINFO = {"Unknown","Other","Not Supported","High","Medium","Low","Off","Auto"};
	
	
	public final static int ANSWERMODE_UNKNOWN = 0;
	public final static int ANSWERMODE_OTHER = 1;
	public final static int ANSWERMODE_DISABLED = 2;
	public final static int ANSWERMODE_MANUALANSWER = 3;
	public final static int ANSWERMODE_AUTOANSWER = 4;
	public final static int ANSWERMODE_AUTOANSWERWITHCALL_BACK = 5;
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_DISTINCTIVERING = 2;
	public final static int CAPABILITIES_CALLERID = 3;
	public final static int CAPABILITIES_VOICE = 4;
	public final static int CAPABILITIES_FAXCLASS1 = 5;
	public final static int CAPABILITIES_FAXCLASS2 = 6;
	public final static int CAPABILITIES_WAKEONRING = 7;
	public final static int CAPABILITIES_FAXGROUP3 = 8;
	public final static int CAPABILITIES_GSMSUPPORT = 9;
	public final static int CAPABILITIES_AMPSSUPPORT = 10;
	public final static int CAPABILITIES_OOBALERTING = 11;
	public final static int CAPABILITIES_WORLDWIDECOUNTRYSUPPORT = 12;
	
	public final static int DIALTYPE_UNKNOWN = 0;
	public final static int DIALTYPE_TONE = 1;
	public final static int DIALTYPE_PULSE = 2;
	
	public final static int ENABLEDCAPABILITIES_UNKNOWN = 0;
	public final static int ENABLEDCAPABILITIES_OTHER = 1;
	public final static int ENABLEDCAPABILITIES_DISTINCTIVERING = 2;
	public final static int ENABLEDCAPABILITIES_CALLERID = 3;
	public final static int ENABLEDCAPABILITIES_VOICE = 4;
	public final static int ENABLEDCAPABILITIES_FAXCLASS1 = 5;
	public final static int ENABLEDCAPABILITIES_FAXCLASS2 = 6;
	public final static int ENABLEDCAPABILITIES_WAKEONRING = 7;
	public final static int ENABLEDCAPABILITIES_FAXGROUP3 = 8;
	public final static int ENABLEDCAPABILITIES_GSMSUPPORT = 9;
	public final static int ENABLEDCAPABILITIES_AMPSSUPPORT = 10;
	public final static int ENABLEDCAPABILITIES_OOBALERTING = 11;
	public final static int ENABLEDCAPABILITIES_WORLDWIDECOUNTRYSUPPORT = 12;
	
	public final static int EQUALIZATION_UNKNOWN = 0;
	public final static int EQUALIZATION_OTHER = 1;
	public final static int EQUALIZATION_LONG = 2;
	public final static int EQUALIZATION_SHORT = 3;
	
	public final static int SPEAKERVOLUMEINFO_UNKNOWN = 0;
	public final static int SPEAKERVOLUMEINFO_OTHER = 1;
	public final static int SPEAKERVOLUMEINFO_NOTSUPPORTED = 2;
	public final static int SPEAKERVOLUMEINFO_HIGH = 3;
	public final static int SPEAKERVOLUMEINFO_MEDIUM = 4;
	public final static int SPEAKERVOLUMEINFO_LOW = 5;
	public final static int SPEAKERVOLUMEINFO_OFF = 6;
	public final static int SPEAKERVOLUMEINFO_AUTO = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_POTSModem() {

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
	public CIM_POTSModem(Vector keyProperties){ 
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
	public CIM_POTSModem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_POTSModem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_POTSModem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_POTSModem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_POTSModem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_POTSModem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_POTSModem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_POTSModem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_POTSModem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_POTSModem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_POTSModem)object).cimObjectPath)) {
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
	
	// Attribute AnswerMode
	
	public UnsignedInt16 get_AnswerMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_ANSWERMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_ANSWERMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_ANSWERMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AnswerMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_ANSWERMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_ANSWERMODE + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_AnswerMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_ANSWERMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_ANSWERMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BlackListedNumbers
	
	public String[] get_BlackListedNumbers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_BlackListedNumbers(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_BlackListedNumbers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_BLACKLISTEDNUMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CountriesSupported
	
	public String[] get_CountriesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CountriesSupported(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_CountriesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRIESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CountrySelected
	
	public String get_CountrySelected() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CountrySelected(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_CountrySelected(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_COUNTRYSELECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentPasswords
	
	public String[] get_CurrentPasswords() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CurrentPasswords(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_CurrentPasswords(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_CURRENTPASSWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DialType
	
	public UnsignedInt16 get_DialType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_DIALTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_DIALTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_DIALTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DialType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_DIALTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_DIALTYPE + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_DialType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_DIALTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_DIALTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledCapabilities
	
	public UnsignedInt16[] get_EnabledCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_EnabledCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_EnabledCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Equalization
	
	public UnsignedInt16 get_Equalization() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_EQUALIZATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_EQUALIZATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_EQUALIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Equalization(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_EQUALIZATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_EQUALIZATION + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_Equalization(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_EQUALIZATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_EQUALIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InactivityTimeout
	
	public UnsignedInt32 get_InactivityTimeout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InactivityTimeout(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_InactivityTimeout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_INACTIVITYTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxBaudRateToPhone
	
	public UnsignedInt32 get_MaxBaudRateToPhone() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxBaudRateToPhone(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_MaxBaudRateToPhone(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOPHONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxBaudRateToSerialPort
	
	public UnsignedInt32 get_MaxBaudRateToSerialPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxBaudRateToSerialPort(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_MaxBaudRateToSerialPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXBAUDRATETOSERIALPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumberOfPasswords
	
	public UnsignedInt16 get_MaxNumberOfPasswords() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberOfPasswords(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_MaxNumberOfPasswords(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_MAXNUMBEROFPASSWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RingsBeforeAnswer
	
	public UnsignedInt8 get_RingsBeforeAnswer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RingsBeforeAnswer(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_RingsBeforeAnswer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_RINGSBEFOREANSWER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpeakerVolumeInfo
	
	public UnsignedInt16 get_SpeakerVolumeInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpeakerVolumeInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_SpeakerVolumeInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_SPEAKERVOLUMEINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportsCallback
	
	public Boolean get_SupportsCallback() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportsCallback(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_SupportsCallback(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSCALLBACK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportsSynchronousConnect
	
	public Boolean get_SupportsSynchronousConnect() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportsSynchronousConnect(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT + " could not be found");
    		
		} else if (!CIM_POTSModemHelper.isValid_SupportsSynchronousConnect(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_POTSModem.CIM_PROPERTY_SUPPORTSSYNCHRONOUSCONNECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
