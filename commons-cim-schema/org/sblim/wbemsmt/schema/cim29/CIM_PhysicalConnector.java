/** 
 * CIM_PhysicalConnector.java
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
 * Description:  The PhysicalConnector class represents any PhysicalElement that is used to
 * connect to other Elements. Any object that can be used to connect and
 * transmit signals or power between two or more PhysicalElements is a
 * descendant (or member) of this class. For example, Slots and D-shell
 * connectors are types of PhysicalConnectors.
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
 *  The PhysicalConnector class represents any PhysicalElement that is used to
 * connect to other Elements. Any object that can be used to connect and
 * transmit signals or power between two or more PhysicalElements is a
 * descendant (or member) of this class. For example, Slots and D-shell
 * connectors are types of PhysicalConnectors.
 */
public class CIM_PhysicalConnector extends CIM_PhysicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalConnector"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION = "CIM_AdapterActiveConnection"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION = "CIM_PortActiveConnection"; //$NON-NLS-1$
	
	
	/**
	*	A string describing the Connector - used when the ConnectorLayout property is set to 1 ("Other"). Connector Description should be set to NULL when ConnectorLayout is any value other than 1.
	*/
	public final static String CIM_PROPERTY_CONNECTORDESCRIPTION = "ConnectorDescription"; //$NON-NLS-1$
	/**
	*	Describes the electrical characteristic for this connector.
	*/
	public final static String CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS = "ConnectorElectricalCharacteristics"; //$NON-NLS-1$
	/**
	*	Describes the gender of the connector.
	*/
	public final static String CIM_PROPERTY_CONNECTORGENDER = "ConnectorGender"; //$NON-NLS-1$
	/**
	*	Describes the type of packaging normally associated with this type of connector.
	*/
	public final static String CIM_PROPERTY_CONNECTORLAYOUT = "ConnectorLayout"; //$NON-NLS-1$
	/**
	*	A free-form string describing the pin configuration and/or signal usage of a PhysicalConnector.
	*/
	public final static String CIM_PROPERTY_CONNECTORPINOUT = "ConnectorPinout"; //$NON-NLS-1$
	/**
	*	An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of 'combinations' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as "Male" (value=2). 
This single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.
	*/
	public final static String CIM_PROPERTY_CONNECTORTYPE = "ConnectorType"; //$NON-NLS-1$
	/**
	*	Describes the number of physical pins (male/female) that are present on this connector.
	*/
	public final static String CIM_PROPERTY_NUMPHYSICALPINS = "NumPhysicalPins"; //$NON-NLS-1$
	/**
	*	A string describing the connector's electrical characteristics - used when the ConnectorElectricalCharacteristics property contains an entry of 1 (Other). OtherElectricalCharacteristics should be set to NULL when ConnectorElectricalCharacteristics does not contain an value of 1.
	*/
	public final static String CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS = "OtherElectricalCharacteristics"; //$NON-NLS-1$
	/**
	*	A string describing the Connector - used when the ConnectorType property is set to 1 ("Other"). OtherType Description should be set to NULL when ConnectorType is any value other than 1. 
The use of this property is deprecated in lieu of Connector Description.
	*/
	public final static String CIM_PROPERTY_OTHERTYPEDESCRIPTION = "OtherTypeDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORGENDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORLAYOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORPINOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMPHYSICALPINS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEDESCRIPTION);
				
		for (int i = 0; i < CIM_PhysicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORDESCRIPTION)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORGENDER)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORLAYOUT)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORPINOUT)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORTYPE)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMPHYSICALPINS)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_PhysicalConnector.CIM_PropertyNameList.add(CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORGENDER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORLAYOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORPINOUT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMPHYSICALPINS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_PhysicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORDESCRIPTION)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORGENDER)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORLAYOUT)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORPINOUT)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORTYPE)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMPHYSICALPINS)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_PhysicalConnector.CIM_PropertyList.add(CIM_PhysicalElement.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_PhysicalElement.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CONNECTORELECTRICALCHARACTERISTICS = {"Unknown","Other","Single Ended","Differential","Low Voltage Differential","Optical","Copper","Shielded","Unshielded"};
	public final static String[] CIM_VALUEMAP_CONNECTORGENDER = {"Unknown","Male","Female"};
	public final static String[] CIM_VALUEMAP_CONNECTORLAYOUT = {"Unknown","Other","RS232","BNC","RJ11","RJ45","DB9","Slot","SCSI High Density","SCSI Low Density","Ribbon"};
	public final static String[] CIM_VALUEMAP_CONNECTORTYPE = {"Unknown","Other","Male","Female","Shielded","Unshielded","SCSI (A) High-Density (50 pins)","SCSI (A) Low-Density (50 pins)","SCSI (P) High-Density (68 pins)","SCSI SCA-I (80 pins)","SCSI SCA-II (80 pins)","Fibre Channel (DB-9, Copper)","Fibre Channel (Optical Fibre)","Fibre Channel SCA-II (40 pins)","Fibre Channel SCA-II (20 pins)","Fibre Channel BNC","ATA 3-1/2 Inch (40 pins)","ATA 2-1/2 Inch (44 pins)","ATA-2","ATA-3","ATA/66","DB-9","DB-15","DB-25","DB-36","RS-232C","RS-422","RS-423","RS-485","RS-449","V.35","X.21","IEEE-488","AUI","UPT Category 3","UPT Category 4","UPT Category 5","BNC","RJ11","RJ45","Fiber MIC","Apple AUI","Apple GeoPort","PCI","ISA","EISA","VESA","PCMCIA","PCMCIA Type I","PCMCIA Type II","PCMCIA Type III","ZV Port","CardBus","USB","IEEE 1394","HIPPI","HSSDC (6 pins)","GBIC","DIN","Mini-DIN","Micro-DIN","PS/2","Infrared","HP-HIL","Access.bus","NuBus","Centronics","Mini-Centronics","Mini-Centronics Type-14","Mini-Centronics Type-20","Mini-Centronics Type-26","Bus Mouse","ADB","AGP","VME Bus","VME64","Proprietary","Proprietary Processor Card Slot","Proprietary Memory Card Slot","Proprietary I/O Riser Slot","PCI-66MHZ","AGP2X","AGP4X","PC-98","PC-98-Hireso","PC-H98","PC-98Note","PC-98Full","SSA SCSI","Circular","On Board IDE Connector","On Board Floppy Connector","9 Pin Dual Inline","25 Pin Dual Inline","50 Pin Dual Inline","68 Pin Dual Inline","On Board Sound Connector","Mini-jack","PCI-X","Sbus IEEE 1396-1993 32 bit","Sbus IEEE 1396-1993 64 bit","MCA","GIO","XIO","HIO","NGIO","PMC","MTRJ","VF-45","Future I/O","SC","SG","Electrical","Optical","Ribbon","GLM","1x9","Mini SG","LC","HSSC","VHDCI Shielded (68 pins)","InfiniBand","AGP8X"};
	
	
	public final static int CONNECTORELECTRICALCHARACTERISTICS_UNKNOWN = 0;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_OTHER = 1;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_SINGLEENDED = 2;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_DIFFERENTIAL = 3;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_LOWVOLTAGEDIFFERENTIAL = 4;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_OPTICAL = 5;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_COPPER = 6;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_SHIELDED = 7;
	public final static int CONNECTORELECTRICALCHARACTERISTICS_UNSHIELDED = 8;
	
	public final static int CONNECTORGENDER_UNKNOWN = 0;
	public final static int CONNECTORGENDER_MALE = 2;
	public final static int CONNECTORGENDER_FEMALE = 3;
	
	public final static int CONNECTORLAYOUT_UNKNOWN = 0;
	public final static int CONNECTORLAYOUT_OTHER = 1;
	public final static int CONNECTORLAYOUT_RS232 = 2;
	public final static int CONNECTORLAYOUT_BNC = 3;
	public final static int CONNECTORLAYOUT_RJ11 = 4;
	public final static int CONNECTORLAYOUT_RJ45 = 5;
	public final static int CONNECTORLAYOUT_DB9 = 6;
	public final static int CONNECTORLAYOUT_SLOT = 7;
	public final static int CONNECTORLAYOUT_SCSIHIGHDENSITY = 8;
	public final static int CONNECTORLAYOUT_SCSILOWDENSITY = 9;
	public final static int CONNECTORLAYOUT_RIBBON = 10;
	
	public final static int CONNECTORTYPE_UNKNOWN = 0;
	public final static int CONNECTORTYPE_OTHER = 1;
	public final static int CONNECTORTYPE_MALE = 2;
	public final static int CONNECTORTYPE_FEMALE = 3;
	public final static int CONNECTORTYPE_SHIELDED = 4;
	public final static int CONNECTORTYPE_UNSHIELDED = 5;
	public final static int CONNECTORTYPE_SCSIAHIGH_DENSITY50PINS = 6;
	public final static int CONNECTORTYPE_SCSIALOW_DENSITY50PINS = 7;
	public final static int CONNECTORTYPE_SCSIPHIGH_DENSITY68PINS = 8;
	public final static int CONNECTORTYPE_SCSISCA_I80PINS = 9;
	public final static int CONNECTORTYPE_SCSISCA_II80PINS = 10;
	public final static int CONNECTORTYPE_FIBRECHANNELDB_9_COPPER = 11;
	public final static int CONNECTORTYPE_FIBRECHANNELOPTICALFIBRE = 12;
	public final static int CONNECTORTYPE_FIBRECHANNELSCA_II40PINS = 13;
	public final static int CONNECTORTYPE_FIBRECHANNELSCA_II20PINS = 14;
	public final static int CONNECTORTYPE_FIBRECHANNELBNC = 15;
	public final static int CONNECTORTYPE_ATA3_1_2INCH40PINS = 16;
	public final static int CONNECTORTYPE_ATA2_1_2INCH44PINS = 17;
	public final static int CONNECTORTYPE_ATA_2 = 18;
	public final static int CONNECTORTYPE_ATA_3 = 19;
	public final static int CONNECTORTYPE_ATA_66 = 20;
	public final static int CONNECTORTYPE_DB_9 = 21;
	public final static int CONNECTORTYPE_DB_15 = 22;
	public final static int CONNECTORTYPE_DB_25 = 23;
	public final static int CONNECTORTYPE_DB_36 = 24;
	public final static int CONNECTORTYPE_RS_232C = 25;
	public final static int CONNECTORTYPE_RS_422 = 26;
	public final static int CONNECTORTYPE_RS_423 = 27;
	public final static int CONNECTORTYPE_RS_485 = 28;
	public final static int CONNECTORTYPE_RS_449 = 29;
	public final static int CONNECTORTYPE_V_35 = 30;
	public final static int CONNECTORTYPE_X_21 = 31;
	public final static int CONNECTORTYPE_IEEE_488 = 32;
	public final static int CONNECTORTYPE_AUI = 33;
	public final static int CONNECTORTYPE_UPTCATEGORY3 = 34;
	public final static int CONNECTORTYPE_UPTCATEGORY4 = 35;
	public final static int CONNECTORTYPE_UPTCATEGORY5 = 36;
	public final static int CONNECTORTYPE_BNC = 37;
	public final static int CONNECTORTYPE_RJ11 = 38;
	public final static int CONNECTORTYPE_RJ45 = 39;
	public final static int CONNECTORTYPE_FIBERMIC = 40;
	public final static int CONNECTORTYPE_APPLEAUI = 41;
	public final static int CONNECTORTYPE_APPLEGEOPORT = 42;
	public final static int CONNECTORTYPE_PCI = 43;
	public final static int CONNECTORTYPE_ISA = 44;
	public final static int CONNECTORTYPE_EISA = 45;
	public final static int CONNECTORTYPE_VESA = 46;
	public final static int CONNECTORTYPE_PCMCIA = 47;
	public final static int CONNECTORTYPE_PCMCIATYPEI = 48;
	public final static int CONNECTORTYPE_PCMCIATYPEII = 49;
	public final static int CONNECTORTYPE_PCMCIATYPEIII = 50;
	public final static int CONNECTORTYPE_ZVPORT = 51;
	public final static int CONNECTORTYPE_CARDBUS = 52;
	public final static int CONNECTORTYPE_USB = 53;
	public final static int CONNECTORTYPE_IEEE1394 = 54;
	public final static int CONNECTORTYPE_HIPPI = 55;
	public final static int CONNECTORTYPE_HSSDC6PINS = 56;
	public final static int CONNECTORTYPE_GBIC = 57;
	public final static int CONNECTORTYPE_DIN = 58;
	public final static int CONNECTORTYPE_MINI_DIN = 59;
	public final static int CONNECTORTYPE_MICRO_DIN = 60;
	public final static int CONNECTORTYPE_PS_2 = 61;
	public final static int CONNECTORTYPE_INFRARED = 62;
	public final static int CONNECTORTYPE_HP_HIL = 63;
	public final static int CONNECTORTYPE_ACCESS_BUS = 64;
	public final static int CONNECTORTYPE_NUBUS = 65;
	public final static int CONNECTORTYPE_CENTRONICS = 66;
	public final static int CONNECTORTYPE_MINI_CENTRONICS = 67;
	public final static int CONNECTORTYPE_MINI_CENTRONICSTYPE_14 = 68;
	public final static int CONNECTORTYPE_MINI_CENTRONICSTYPE_20 = 69;
	public final static int CONNECTORTYPE_MINI_CENTRONICSTYPE_26 = 70;
	public final static int CONNECTORTYPE_BUSMOUSE = 71;
	public final static int CONNECTORTYPE_ADB = 72;
	public final static int CONNECTORTYPE_AGP = 73;
	public final static int CONNECTORTYPE_VMEBUS = 74;
	public final static int CONNECTORTYPE_VME64 = 75;
	public final static int CONNECTORTYPE_PROPRIETARY = 76;
	public final static int CONNECTORTYPE_PROPRIETARYPROCESSORCARDSLOT = 77;
	public final static int CONNECTORTYPE_PROPRIETARYMEMORYCARDSLOT = 78;
	public final static int CONNECTORTYPE_PROPRIETARYI_ORISERSLOT = 79;
	public final static int CONNECTORTYPE_PCI_66MHZ = 80;
	public final static int CONNECTORTYPE_AGP2X = 81;
	public final static int CONNECTORTYPE_AGP4X = 82;
	public final static int CONNECTORTYPE_PC_98 = 83;
	public final static int CONNECTORTYPE_PC_98_HIRESO = 84;
	public final static int CONNECTORTYPE_PC_H98 = 85;
	public final static int CONNECTORTYPE_PC_98NOTE = 86;
	public final static int CONNECTORTYPE_PC_98FULL = 87;
	public final static int CONNECTORTYPE_SSASCSI = 88;
	public final static int CONNECTORTYPE_CIRCULAR = 89;
	public final static int CONNECTORTYPE_ONBOARDIDECONNECTOR = 90;
	public final static int CONNECTORTYPE_ONBOARDFLOPPYCONNECTOR = 91;
	public final static int CONNECTORTYPE_9PINDUALINLINE = 92;
	public final static int CONNECTORTYPE_25PINDUALINLINE = 93;
	public final static int CONNECTORTYPE_50PINDUALINLINE = 94;
	public final static int CONNECTORTYPE_68PINDUALINLINE = 95;
	public final static int CONNECTORTYPE_ONBOARDSOUNDCONNECTOR = 96;
	public final static int CONNECTORTYPE_MINI_JACK = 97;
	public final static int CONNECTORTYPE_PCI_X = 98;
	public final static int CONNECTORTYPE_SBUSIEEE1396_199332BIT = 99;
	public final static int CONNECTORTYPE_SBUSIEEE1396_199364BIT = 100;
	public final static int CONNECTORTYPE_MCA = 101;
	public final static int CONNECTORTYPE_GIO = 102;
	public final static int CONNECTORTYPE_XIO = 103;
	public final static int CONNECTORTYPE_HIO = 104;
	public final static int CONNECTORTYPE_NGIO = 105;
	public final static int CONNECTORTYPE_PMC = 106;
	public final static int CONNECTORTYPE_MTRJ = 107;
	public final static int CONNECTORTYPE_VF_45 = 108;
	public final static int CONNECTORTYPE_FUTUREI_O = 109;
	public final static int CONNECTORTYPE_SC = 110;
	public final static int CONNECTORTYPE_SG = 111;
	public final static int CONNECTORTYPE_ELECTRICAL = 112;
	public final static int CONNECTORTYPE_OPTICAL = 113;
	public final static int CONNECTORTYPE_RIBBON = 114;
	public final static int CONNECTORTYPE_GLM = 115;
	public final static int CONNECTORTYPE_1X9 = 116;
	public final static int CONNECTORTYPE_MINISG = 117;
	public final static int CONNECTORTYPE_LC = 118;
	public final static int CONNECTORTYPE_HSSC = 119;
	public final static int CONNECTORTYPE_VHDCISHIELDED68PINS = 120;
	public final static int CONNECTORTYPE_INFINIBAND = 121;
	public final static int CONNECTORTYPE_AGP8X = 122;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalConnector() {

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
	public CIM_PhysicalConnector(Vector keyProperties){ 
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
	public CIM_PhysicalConnector(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_PhysicalConnector.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_PhysicalConnector.Java_Package_List.toArray(new String[CIM_PhysicalConnector.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_PhysicalConnector)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalConnector)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalConnector)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalConnector)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalConnector)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalConnector)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalConnector)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalConnector)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalConnector)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalConnector)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnections(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, 
					CIM_NetworkAdapter.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_PhysicalConnectorHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnection_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, 
					CIM_NetworkAdapter.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkAdapter.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_NetworkPort_CIM_PortActiveConnections(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, 
					CIM_NetworkPort.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_PhysicalConnectorHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_NetworkPort_CIM_PortActiveConnection_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, 
					CIM_NetworkPort.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkPort.CIM_CLASS_NAME)) {
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
	
	// Attribute ConnectorDescription
	
	public String get_ConnectorDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectorDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_ConnectorDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectorElectricalCharacteristics
	
	public UnsignedInt16[] get_ConnectorElectricalCharacteristics() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ConnectorElectricalCharacteristics(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_ConnectorElectricalCharacteristics(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORELECTRICALCHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectorGender
	
	public UnsignedInt16 get_ConnectorGender() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectorGender(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_ConnectorGender(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORGENDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectorLayout
	
	public UnsignedInt16 get_ConnectorLayout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectorLayout(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_ConnectorLayout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORLAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectorPinout
	
	public String get_ConnectorPinout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectorPinout(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_ConnectorPinout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORPINOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectorType
	
	public UnsignedInt16[] get_ConnectorType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ConnectorType(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_ConnectorType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_CONNECTORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumPhysicalPins
	
	public UnsignedInt32 get_NumPhysicalPins() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumPhysicalPins(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_NumPhysicalPins(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_NUMPHYSICALPINS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherElectricalCharacteristics
	
	public String[] get_OtherElectricalCharacteristics() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherElectricalCharacteristics(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_OtherElectricalCharacteristics(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERELECTRICALCHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeDescription
	
	public String get_OtherTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_PhysicalConnectorHelper.isValid_OtherTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalConnector.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
