/** 
 * CIM_FibrePort.java
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
 * Description:  The use of the FibrePort class is deprecated, since FibreChannel Adapter has
 * been deprecated in lieu of FCPort. And, this class overlaps with FCPort. The
 * new FCPort class should be used in lieu of both FibreChannelAdapter and
 * FibrePort. FibrePort describes the capabilities and management aspects of a
 * Fibre Channel Port Device.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  The use of the FibrePort class is deprecated, since FibreChannel Adapter has
 * been deprecated in lieu of FCPort. And, this class overlaps with FCPort. The
 * new FCPort class should be used in lieu of both FibreChannelAdapter and
 * FibrePort. FibrePort describes the capabilities and management aspects of a
 * Fibre Channel Port Device.
 */
public class CIM_FibrePort extends CIM_LogicalPort  {
	
	public final static String CIM_CLASS_NAME = "CIM_FibrePort"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN = "CIM_FibrePortActiveLogin"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER = "CIM_FibrePortOnFCAdapter"; //$NON-NLS-1$
	
	
	/**
	*	An address value used to identify the source (S_ID) or destination (D_ID) of a frame. The FC-SW standard includes a table of special address identifier values and their meanings. Consult the FC-SW documentation for additional information.
	*/
	public final static String CIM_PROPERTY_ADDRESSIDENTIFIER = "AddressIdentifier"; //$NON-NLS-1$
	/**
	*	One or more address identifiers that may be recognized by the Port, in addition to its port-specific identifier. Multicast or hunt group addresses that are recognized by the Port would be identified in this array.
	*/
	public final static String CIM_PROPERTY_ALIASADDRESSES = "AliasAddresses"; //$NON-NLS-1$
	/**
	*	Indication of whether the Port is currently bypassed (value=2) or not (value=1). A value of 3 ("Forced Insert") describes that the Port is forced active, when it would otherwise be "Bypassed".
	*/
	public final static String CIM_PROPERTY_BYPASSEDSTATE = "BypassedState"; //$NON-NLS-1$
	/**
	*	Number of times that the CRC in a frame does not match the CRC computed by the receiver.
	*/
	public final static String CIM_PROPERTY_CRCERRORS = "CRCErrors"; //$NON-NLS-1$
	/**
	*	The type of cabling as sensed by the Port. Not all Fibre Ports are capable of providing this information. In this case, a value of 0, "Unknown", will be returned. Also, when single or multi-mode fiber cabling can not be distinguished, the more general value - 4, "Fiber-optic" - can be specified.
	*/
	public final static String CIM_PROPERTY_CONNECTEDMEDIA = "ConnectedMedia"; //$NON-NLS-1$
	/**
	*	The specific mode in which the Port is currently running. The value is one of the entries in the EnabledPortTypes array. The current port type/mode is dependent on the fibre technology. For example, in a public loop network, you might indicate a port type of "FL" (value=6) or "NL" (value=2).
	*/
	public final static String CIM_PROPERTY_CURRENTPORTTYPE = "CurrentPortType"; //$NON-NLS-1$
	/**
	*	Version information for the CurrentPortType that is active.
	*/
	public final static String CIM_PROPERTY_CURRENTVERSION = "CurrentVersion"; //$NON-NLS-1$
	/**
	*	The number of times that a fill word could not be deleted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
	*/
	public final static String CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS = "ElasticityBufferOverruns"; //$NON-NLS-1$
	/**
	*	The number of times that a fill word could not be inserted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
	*/
	public final static String CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS = "ElasticityBufferUnderruns"; //$NON-NLS-1$
	/**
	*	The specific modes currently enabled for the Port. The values are equal to, or a subset of the values in the Supported PortTypes array.
	*/
	public final static String CIM_PROPERTY_ENABLEDPORTTYPES = "EnabledPortTypes"; //$NON-NLS-1$
	/**
	*	Version information for each of the EnabledPortTypes. A particular PortType (mode) may be listed multiple times in the EnabledPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in EnabledPortTypes that is located at the same index.
	*/
	public final static String CIM_PROPERTY_ENABLEDVERSIONS = "EnabledVersions"; //$NON-NLS-1$
	/**
	*	The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
	*/
	public final static String CIM_PROPERTY_FRAMESTOOLONG = "FramesTooLong"; //$NON-NLS-1$
	/**
	*	The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes which are not data.
	*/
	public final static String CIM_PROPERTY_FRAMESTOOSHORT = "FramesTooShort"; //$NON-NLS-1$
	/**
	*	The number of transmission words that had an 8b10b code violation in one or more of its characters, had a K28.5 in its second, third or fourth character positions, and/or was an ordered set that had an incorrect Beginning Running Disparity.
	*/
	public final static String CIM_PROPERTY_INVALIDTRANSMISSIONWORDS = "InvalidTransmissionWords"; //$NON-NLS-1$
	/**
	*	Number of times that signal is lost on the Port since last reset of the Device.
	*/
	public final static String CIM_PROPERTY_LOSSOFSIGNALCOUNTER = "LossOfSignalCounter"; //$NON-NLS-1$
	/**
	*	Number of times that synchronization is lost on the Port since last reset of the Device. Synchronization is assumed lost after a timeout period identified by the Receiver TransmitterTimeout property.
	*/
	public final static String CIM_PROPERTY_LOSSOFSYNCCOUNTER = "LossOfSyncCounter"; //$NON-NLS-1$
	/**
	*	Version information for each of the SupportedPortTypes. A particular PortType (mode) may be listed multiple times in the SupportedPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in SupportedPortTypes that is located at the same index.
	*/
	public final static String CIM_PROPERTY_PORTTYPEVERSIONS = "PortTypeVersions"; //$NON-NLS-1$
	/**
	*	Timeout value in milliseconds used to determine when loss of synchronization has occurred. The typical default is 100 msec.
	*/
	public final static String CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT = "ReceiverTransmitterTimeout"; //$NON-NLS-1$
	/**
	*	An array indicating the modes in which the Port can operate. PortType values describe the role and behavior of the Fibre Channel entity: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F" = Fabric (element) Port, "FL" = Fabric (element) Port supporting FC arbitrated loop, and "B" = Bridge Port. PortTypes are defined in the ANSI X3 standards. 

A particular mode may be listed multiple times in the SupportedPortTypes array in order to define that multiple, unique version levels are supported. Version information is defined in the PortTypeVersions property. Note that each entry of the SupportedPortTypes array is related to the entry in PortTypeVersions that is located at the same index.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDPORTTYPES = "SupportedPortTypes"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_ALIASADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_BYPASSEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CRCERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTEDMEDIA);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTPORTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDPORTTYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDVERSIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMESTOOLONG);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMESTOOSHORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOSSOFSYNCCOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTTYPEVERSIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDPORTTYPES);
				
		for (int i = 0; i < CIM_LogicalPort.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSIDENTIFIER)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALIASADDRESSES)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BYPASSEDSTATE)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRCERRORS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTEDMEDIA)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTPORTTYPE)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTVERSION)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDPORTTYPES)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDVERSIONS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMESTOOLONG)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMESTOOSHORT)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOSSOFSIGNALCOUNTER)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOSSOFSYNCCOUNTER)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTTYPEVERSIONS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDPORTTYPES)){
				continue;
			}
			
			CIM_FibrePort.CIM_PropertyNameList.add(CIM_LogicalPort.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALIASADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BYPASSEDSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRCERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTEDMEDIA, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTPORTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDPORTTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDVERSIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMESTOOLONG, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMESTOOSHORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOSSOFSIGNALCOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOSSOFSYNCCOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTTYPEVERSIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDPORTTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_LogicalPort.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSIDENTIFIER)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALIASADDRESSES)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BYPASSEDSTATE)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRCERRORS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTEDMEDIA)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTPORTTYPE)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTVERSION)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDPORTTYPES)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDVERSIONS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMESTOOLONG)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMESTOOSHORT)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOSSOFSIGNALCOUNTER)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOSSOFSYNCCOUNTER)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTTYPEVERSIONS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDPORTTYPES)){
				continue;
			}
			
			CIM_FibrePort.CIM_PropertyList.add(CIM_LogicalPort.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_LogicalPort.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_BYPASSEDSTATE = {"Unknown","Not Bypassed","Bypassed","Forced Insert"};
	public final static String[] CIM_VALUEMAP_CONNECTEDMEDIA = {"Unknown","Other","No Media","Copper/Twinaxial","Fiber-optic","Fiber Single Mode","Fiber Multimode"};
	public final static String[] CIM_VALUEMAP_CURRENTPORTTYPE = {"Unknown","N","NL-Private","NL-Public","E","F","FL","B"};
	public final static String[] CIM_VALUEMAP_ENABLEDPORTTYPES = {"Unknown","N","NL-Private","NL-Public","E","F","FL","B"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDPORTTYPES = {"Unknown","N","NL-Private","NL-Public","E","F","FL","B"};
	
	
	public final static int BYPASSEDSTATE_UNKNOWN = 0;
	public final static int BYPASSEDSTATE_NOTBYPASSED = 1;
	public final static int BYPASSEDSTATE_BYPASSED = 2;
	public final static int BYPASSEDSTATE_FORCEDINSERT = 3;
	
	public final static int CONNECTEDMEDIA_UNKNOWN = 0;
	public final static int CONNECTEDMEDIA_OTHER = 1;
	public final static int CONNECTEDMEDIA_NOMEDIA = 2;
	public final static int CONNECTEDMEDIA_COPPER_TWINAXIAL = 3;
	public final static int CONNECTEDMEDIA_FIBER_OPTIC = 4;
	public final static int CONNECTEDMEDIA_FIBERSINGLEMODE = 5;
	public final static int CONNECTEDMEDIA_FIBERMULTIMODE = 6;
	
	public final static int CURRENTPORTTYPE_UNKNOWN = 0;
	public final static int CURRENTPORTTYPE_N = 1;
	public final static int CURRENTPORTTYPE_NL_PRIVATE = 2;
	public final static int CURRENTPORTTYPE_NL_PUBLIC = 3;
	public final static int CURRENTPORTTYPE_E = 4;
	public final static int CURRENTPORTTYPE_F = 5;
	public final static int CURRENTPORTTYPE_FL = 6;
	public final static int CURRENTPORTTYPE_B = 7;
	
	public final static int ENABLEDPORTTYPES_UNKNOWN = 0;
	public final static int ENABLEDPORTTYPES_N = 1;
	public final static int ENABLEDPORTTYPES_NL_PRIVATE = 2;
	public final static int ENABLEDPORTTYPES_NL_PUBLIC = 3;
	public final static int ENABLEDPORTTYPES_E = 4;
	public final static int ENABLEDPORTTYPES_F = 5;
	public final static int ENABLEDPORTTYPES_FL = 6;
	public final static int ENABLEDPORTTYPES_B = 7;
	
	public final static int SUPPORTEDPORTTYPES_UNKNOWN = 0;
	public final static int SUPPORTEDPORTTYPES_N = 1;
	public final static int SUPPORTEDPORTTYPES_NL_PRIVATE = 2;
	public final static int SUPPORTEDPORTTYPES_NL_PUBLIC = 3;
	public final static int SUPPORTEDPORTTYPES_E = 4;
	public final static int SUPPORTEDPORTTYPES_F = 5;
	public final static int SUPPORTEDPORTTYPES_FL = 6;
	public final static int SUPPORTEDPORTTYPES_B = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FibrePort() {

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
	public CIM_FibrePort(Vector keyProperties){ 
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
	public CIM_FibrePort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_FibrePort.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_FibrePort.Java_Package_List.toArray(new String[CIM_FibrePort.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_FibrePort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FibrePort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FibrePort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FibrePort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FibrePort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FibrePort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FibrePort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FibrePort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FibrePort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FibrePort)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogins(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, 
					CIM_FibrePort.CIM_CLASS_NAME, 
					"LoginOriginator", //$NON-NLS-1$
					"LoginResponder", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_FibrePortHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FibrePort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FibrePort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FibrePort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogin_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, 
					CIM_FibrePort.CIM_CLASS_NAME, 
					"LoginOriginator", //$NON-NLS-1$
					"LoginResponder"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FibrePort.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, 
					CIM_FibreChannelAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_FibrePortHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, 
					CIM_FibreChannelAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FibreChannelAdapter.CIM_CLASS_NAME)) {
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
	
	// Attribute AddressIdentifier
	
	public UnsignedInt32 get_AddressIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressIdentifier(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_AddressIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ADDRESSIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AliasAddresses
	
	public UnsignedInt32[] get_AliasAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt32[] resultArray = new UnsignedInt32[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt32)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_AliasAddresses(UnsignedInt32[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_AliasAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ALIASADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BypassedState
	
	public UnsignedInt16 get_BypassedState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BypassedState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_BypassedState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_BYPASSEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CRCErrors
	
	public UnsignedInt64 get_CRCErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CRCERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CRCERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CRCERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CRCErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CRCERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CRCERRORS + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_CRCErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_CRCERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CRCERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectedMedia
	
	public UnsignedInt16 get_ConnectedMedia() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectedMedia(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_ConnectedMedia(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CONNECTEDMEDIA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentPortType
	
	public UnsignedInt16 get_CurrentPortType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentPortType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_CurrentPortType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTPORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentVersion
	
	public String get_CurrentVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_CurrentVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_CURRENTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElasticityBufferOverruns
	
	public UnsignedInt64 get_ElasticityBufferOverruns() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElasticityBufferOverruns(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_ElasticityBufferOverruns(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFEROVERRUNS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElasticityBufferUnderruns
	
	public UnsignedInt64 get_ElasticityBufferUnderruns() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElasticityBufferUnderruns(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_ElasticityBufferUnderruns(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ELASTICITYBUFFERUNDERRUNS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledPortTypes
	
	public UnsignedInt16[] get_EnabledPortTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_EnabledPortTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_EnabledPortTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDPORTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledVersions
	
	public String[] get_EnabledVersions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_EnabledVersions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_EnabledVersions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_ENABLEDVERSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FramesTooLong
	
	public UnsignedInt64 get_FramesTooLong() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FramesTooLong(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_FramesTooLong(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOLONG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FramesTooShort
	
	public UnsignedInt64 get_FramesTooShort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FramesTooShort(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_FramesTooShort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_FRAMESTOOSHORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InvalidTransmissionWords
	
	public UnsignedInt64 get_InvalidTransmissionWords() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InvalidTransmissionWords(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_InvalidTransmissionWords(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LossOfSignalCounter
	
	public UnsignedInt64 get_LossOfSignalCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LossOfSignalCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_LossOfSignalCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LossOfSyncCounter
	
	public UnsignedInt64 get_LossOfSyncCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LossOfSyncCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_LossOfSyncCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortTypeVersions
	
	public String[] get_PortTypeVersions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PortTypeVersions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_PortTypeVersions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_PORTTYPEVERSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiverTransmitterTimeout
	
	public UnsignedInt64 get_ReceiverTransmitterTimeout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiverTransmitterTimeout(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_ReceiverTransmitterTimeout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_RECEIVERTRANSMITTERTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedPortTypes
	
	public UnsignedInt16[] get_SupportedPortTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedPortTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES + " could not be found");
    		
		} else if (!CIM_FibrePortHelper.isValid_SupportedPortTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePort.CIM_PROPERTY_SUPPORTEDPORTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
