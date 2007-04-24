/** 
 * CIM_Processor.java
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
 * Description:  Capabilities and management of the Processor LogicalDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  Capabilities and management of the Processor LogicalDevice.
 */
public class CIM_Processor extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_Processor"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	
	
	/**
	*	Processor address width in bits.
	*/
	public final static String CIM_PROPERTY_ADDRESSWIDTH = "AddressWidth"; //$NON-NLS-1$
	/**
	*	The CPUStatus property that indicates the current status of the Processor. For example, the Processor might be disabled by the user (value=2), or disabled due to a POST error (value=3). Information in this property can be obtained from SMBIOS, the Type 4 structure, and the Status attribute.
	*/
	public final static String CIM_PROPERTY_CPUSTATUS = "CPUStatus"; //$NON-NLS-1$
	/**
	*	The current speed (in MHz) of this Processor.
	*/
	public final static String CIM_PROPERTY_CURRENTCLOCKSPEED = "CurrentClockSpeed"; //$NON-NLS-1$
	/**
	*	Processor data width in bits.
	*/
	public final static String CIM_PROPERTY_DATAWIDTH = "DataWidth"; //$NON-NLS-1$
	/**
	*	The Processor family type. For example, values include "Pentium(R) processor with MMX(TM) technology" (value=14) and "68040" (value=96).
	*/
	public final static String CIM_PROPERTY_FAMILY = "Family"; //$NON-NLS-1$
	/**
	*	Loading of this Processor, averaged over the last minute, in Percent.
	*/
	public final static String CIM_PROPERTY_LOADPERCENTAGE = "LoadPercentage"; //$NON-NLS-1$
	/**
	*	The maximum speed (in MHz) of this Processor.
	*/
	public final static String CIM_PROPERTY_MAXCLOCKSPEED = "MaxClockSpeed"; //$NON-NLS-1$
	/**
	*	A string that describes the Processor Family type. It is used when the Family property is set to 1 ("Other"). This string should be set to NULL when the Family property is any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERFAMILYDESCRIPTION = "OtherFamilyDescription"; //$NON-NLS-1$
	/**
	*	A free-form string that describes the role of the Processor, for example, "Central Processor" or "Math Processor".
	*/
	public final static String CIM_PROPERTY_ROLE = "Role"; //$NON-NLS-1$
	/**
	*	Stepping is a free-form string that indicates the revision level of the Processor within the Processor.Family.
	*/
	public final static String CIM_PROPERTY_STEPPING = "Stepping"; //$NON-NLS-1$
	/**
	*	A globally unique identifier for the Processor. This identifier can be unique only within a Processor Family.
	*/
	public final static String CIM_PROPERTY_UNIQUEID = "UniqueID"; //$NON-NLS-1$
	/**
	*	CPU socket information that includes data on how this Processor can be upgraded (if upgrades are supported). This property is an integer enumeration.
	*/
	public final static String CIM_PROPERTY_UPGRADEMETHOD = "UpgradeMethod"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_CPUSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTCLOCKSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_FAMILY);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADPERCENTAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXCLOCKSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERFAMILYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STEPPING);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNIQUEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPGRADEMETHOD);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSWIDTH)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CPUSTATUS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTCLOCKSPEED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAWIDTH)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FAMILY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADPERCENTAGE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXCLOCKSPEED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERFAMILYDESCRIPTION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROLE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STEPPING)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNIQUEID)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPGRADEMETHOD)){
				continue;
			}
			
			CIM_Processor.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CPUSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTCLOCKSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FAMILY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADPERCENTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXCLOCKSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERFAMILYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STEPPING, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNIQUEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPGRADEMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSWIDTH)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CPUSTATUS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTCLOCKSPEED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAWIDTH)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FAMILY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADPERCENTAGE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXCLOCKSPEED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERFAMILYDESCRIPTION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROLE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STEPPING)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNIQUEID)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPGRADEMETHOD)){
				continue;
			}
			
			CIM_Processor.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CPUSTATUS = {"Unknown","CPU Enabled","CPU Disabled by User","CPU Disabled By BIOS (POST Error)","CPU Is Idle","Other"};
	public final static String[] CIM_VALUEMAP_FAMILY = {"Other","Unknown","8086","80286","80386","80486","8087","80287","80387","80487","Pentium(R) brand","Pentium(R) Pro","Pentium(R) II","Pentium(R) processor with MMX(TM) technology","Celeron(TM)","Pentium(R) II Xeon(TM)","Pentium(R) III","M1 Family","M2 Family","K5 Family","K6 Family","K6-2","K6-3","AMD Athlon(TM) Processor Family","AMD(R) Duron(TM) Processor","AMD29000 Family","K6-2+","Power PC Family","Power PC 601","Power PC 603","Power PC 603+","Power PC 604","Power PC 620","Power PC X704","Power PC 750","Alpha Family","Alpha 21064","Alpha 21066","Alpha 21164","Alpha 21164PC","Alpha 21164a","Alpha 21264","Alpha 21364","MIPS Family","MIPS R4000","MIPS R4200","MIPS R4400","MIPS R4600","MIPS R10000","SPARC Family","SuperSPARC","microSPARC II","microSPARC IIep","UltraSPARC","UltraSPARC II","UltraSPARC IIi","UltraSPARC III","UltraSPARC IIIi","68040","68xxx Family","68000","68010","68020","68030","Hobbit Family","Crusoe(TM) TM5000 Family","Crusoe(TM) TM3000 Family","Efficeon(TM) TM8000 Family","Weitek","Itanium(TM) Processor","AMD Athlon(TM) 64 Processor Family","AMD Opteron(TM) Processor Family","AMD Sempron(TM) Processor Family","AMD Turion(TM) 64 Mobile Technology","PA-RISC Family","PA-RISC 8500","PA-RISC 8000","PA-RISC 7300LC","PA-RISC 7200","PA-RISC 7100LC","PA-RISC 7100","V30 Family","Pentium(R) III Xeon(TM)","Pentium(R) III Processor with Intel(R) SpeedStep(TM) Technology","Pentium(R) 4","Intel(R) Xeon(TM)","AS400 Family","Intel(R) Xeon(TM) processor MP","AMD Athlon(TM) XP Family","AMD Athlon(TM) MP Family","Intel(R) Itanium(R) 2","Intel(R) Pentium(R) M processor","Intel(R) Celeron(R) D processor","Intel(R) Pentium(R) D processor","Intel(R) Pentium(R) Processor Extreme Edition","Intel(R) Core(TM) Solo Processor","K7","S/390 and zSeries Family","ESA/390 G4","ESA/390 G5","ESA/390 G6","z/Architectur base","i860","i960","SH-3","SH-4","ARM","StrongARM","6x86","MediaGX","MII","WinChip","DSP","Video Processor"};
	public final static String[] CIM_VALUEMAP_UPGRADEMETHOD = {"Other","Unknown","Daughter Board","ZIF Socket","Replacement/Piggy Back","None","LIF Socket","Slot 1","Slot 2","370 Pin Socket","Slot A","Slot M","Socket 423","Socket A (Socket 462)","Socket 478","Socket 754","Socket 940","Socket 939","Socket mPGA604","Socket LGA771","Socket LGA775","Socket S1","Socket AM2","Socket F (1207)"};
	
	
	public final static int CPUSTATUS_UNKNOWN = 0;
	public final static int CPUSTATUS_CPUENABLED = 1;
	public final static int CPUSTATUS_CPUDISABLEDBYUSER = 2;
	public final static int CPUSTATUS_CPUDISABLEDBYBIOSPOSTERROR = 3;
	public final static int CPUSTATUS_CPUISIDLE = 4;
	public final static int CPUSTATUS_OTHER = 7;
	
	public final static int FAMILY_OTHER = 1;
	public final static int FAMILY_UNKNOWN = 2;
	public final static int FAMILY_8086 = 3;
	public final static int FAMILY_80286 = 4;
	public final static int FAMILY_80386 = 5;
	public final static int FAMILY_80486 = 6;
	public final static int FAMILY_8087 = 7;
	public final static int FAMILY_80287 = 8;
	public final static int FAMILY_80387 = 9;
	public final static int FAMILY_80487 = 10;
	public final static int FAMILY_PENTIUMRBRAND = 11;
	public final static int FAMILY_PENTIUMRPRO = 12;
	public final static int FAMILY_PENTIUMRII = 13;
	public final static int FAMILY_PENTIUMRPROCESSORWITHMMXTMTECHNOLOGY = 14;
	public final static int FAMILY_CELERONTM = 15;
	public final static int FAMILY_PENTIUMRIIXEONTM = 16;
	public final static int FAMILY_PENTIUMRIII = 17;
	public final static int FAMILY_M1FAMILY = 18;
	public final static int FAMILY_M2FAMILY = 19;
	public final static int FAMILY_K5FAMILY = 24;
	public final static int FAMILY_K6FAMILY = 25;
	public final static int FAMILY_K6_2 = 26;
	public final static int FAMILY_K6_3 = 27;
	public final static int FAMILY_AMDATHLONTMPROCESSORFAMILY = 28;
	public final static int FAMILY_AMDRDURONTMPROCESSOR = 29;
	public final static int FAMILY_AMD29000FAMILY = 30;
	public final static int FAMILY_K6_2_ = 31;
	public final static int FAMILY_POWERPCFAMILY = 32;
	public final static int FAMILY_POWERPC601 = 33;
	public final static int FAMILY_POWERPC603 = 34;
	public final static int FAMILY_POWERPC603_ = 35;
	public final static int FAMILY_POWERPC604 = 36;
	public final static int FAMILY_POWERPC620 = 37;
	public final static int FAMILY_POWERPCX704 = 38;
	public final static int FAMILY_POWERPC750 = 39;
	public final static int FAMILY_ALPHAFAMILY = 48;
	public final static int FAMILY_ALPHA21064 = 49;
	public final static int FAMILY_ALPHA21066 = 50;
	public final static int FAMILY_ALPHA21164 = 51;
	public final static int FAMILY_ALPHA21164PC = 52;
	public final static int FAMILY_ALPHA21164A = 53;
	public final static int FAMILY_ALPHA21264 = 54;
	public final static int FAMILY_ALPHA21364 = 55;
	public final static int FAMILY_MIPSFAMILY = 64;
	public final static int FAMILY_MIPSR4000 = 65;
	public final static int FAMILY_MIPSR4200 = 66;
	public final static int FAMILY_MIPSR4400 = 67;
	public final static int FAMILY_MIPSR4600 = 68;
	public final static int FAMILY_MIPSR10000 = 69;
	public final static int FAMILY_SPARCFAMILY = 80;
	public final static int FAMILY_SUPERSPARC = 81;
	public final static int FAMILY_MICROSPARCII = 82;
	public final static int FAMILY_MICROSPARCIIEP = 83;
	public final static int FAMILY_ULTRASPARC = 84;
	public final static int FAMILY_ULTRASPARCII = 85;
	public final static int FAMILY_ULTRASPARCIII = 86;
	public final static int FAMILY_ULTRASPARCIII1 = 87;
	public final static int FAMILY_ULTRASPARCIIII = 88;
	public final static int FAMILY_68040 = 96;
	public final static int FAMILY_68XXXFAMILY = 97;
	public final static int FAMILY_68000 = 98;
	public final static int FAMILY_68010 = 99;
	public final static int FAMILY_68020 = 100;
	public final static int FAMILY_68030 = 101;
	public final static int FAMILY_HOBBITFAMILY = 112;
	public final static int FAMILY_CRUSOETMTM5000FAMILY = 120;
	public final static int FAMILY_CRUSOETMTM3000FAMILY = 121;
	public final static int FAMILY_EFFICEONTMTM8000FAMILY = 122;
	public final static int FAMILY_WEITEK = 128;
	public final static int FAMILY_ITANIUMTMPROCESSOR = 130;
	public final static int FAMILY_AMDATHLONTM64PROCESSORFAMILY = 131;
	public final static int FAMILY_AMDOPTERONTMPROCESSORFAMILY = 132;
	public final static int FAMILY_AMDSEMPRONTMPROCESSORFAMILY = 133;
	public final static int FAMILY_AMDTURIONTM64MOBILETECHNOLOGY = 134;
	public final static int FAMILY_PA_RISCFAMILY = 144;
	public final static int FAMILY_PA_RISC8500 = 145;
	public final static int FAMILY_PA_RISC8000 = 146;
	public final static int FAMILY_PA_RISC7300LC = 147;
	public final static int FAMILY_PA_RISC7200 = 148;
	public final static int FAMILY_PA_RISC7100LC = 149;
	public final static int FAMILY_PA_RISC7100 = 150;
	public final static int FAMILY_V30FAMILY = 160;
	public final static int FAMILY_PENTIUMRIIIXEONTM = 176;
	public final static int FAMILY_PENTIUMRIIIPROCESSORWITHINTELRSPEEDSTEPTMTECHNOLOGY = 177;
	public final static int FAMILY_PENTIUMR4 = 178;
	public final static int FAMILY_INTELRXEONTM = 179;
	public final static int FAMILY_AS400FAMILY = 180;
	public final static int FAMILY_INTELRXEONTMPROCESSORMP = 181;
	public final static int FAMILY_AMDATHLONTMXPFAMILY = 182;
	public final static int FAMILY_AMDATHLONTMMPFAMILY = 183;
	public final static int FAMILY_INTELRITANIUMR2 = 184;
	public final static int FAMILY_INTELRPENTIUMRMPROCESSOR = 185;
	public final static int FAMILY_INTELRCELERONRDPROCESSOR = 186;
	public final static int FAMILY_INTELRPENTIUMRDPROCESSOR = 187;
	public final static int FAMILY_INTELRPENTIUMRPROCESSOREXTREMEEDITION = 188;
	public final static int FAMILY_INTELRCORETMSOLOPROCESSOR = 189;
	public final static int FAMILY_K7 = 190;
	public final static int FAMILY_S_390ANDZSERIESFAMILY = 200;
	public final static int FAMILY_ESA_390G4 = 201;
	public final static int FAMILY_ESA_390G5 = 202;
	public final static int FAMILY_ESA_390G6 = 203;
	public final static int FAMILY_Z_ARCHITECTURBASE = 204;
	public final static int FAMILY_I860 = 250;
	public final static int FAMILY_I960 = 251;
	public final static int FAMILY_SH_3 = 260;
	public final static int FAMILY_SH_4 = 261;
	public final static int FAMILY_ARM = 280;
	public final static int FAMILY_STRONGARM = 281;
	public final static int FAMILY_6X86 = 300;
	public final static int FAMILY_MEDIAGX = 301;
	public final static int FAMILY_MII = 302;
	public final static int FAMILY_WINCHIP = 320;
	public final static int FAMILY_DSP = 350;
	public final static int FAMILY_VIDEOPROCESSOR = 500;
	
	public final static int UPGRADEMETHOD_OTHER = 1;
	public final static int UPGRADEMETHOD_UNKNOWN = 2;
	public final static int UPGRADEMETHOD_DAUGHTERBOARD = 3;
	public final static int UPGRADEMETHOD_ZIFSOCKET = 4;
	public final static int UPGRADEMETHOD_REPLACEMENT_PIGGYBACK = 5;
	public final static int UPGRADEMETHOD_NONE = 6;
	public final static int UPGRADEMETHOD_LIFSOCKET = 7;
	public final static int UPGRADEMETHOD_SLOT1 = 8;
	public final static int UPGRADEMETHOD_SLOT2 = 9;
	public final static int UPGRADEMETHOD_370PINSOCKET = 10;
	public final static int UPGRADEMETHOD_SLOTA = 11;
	public final static int UPGRADEMETHOD_SLOTM = 12;
	public final static int UPGRADEMETHOD_SOCKET423 = 13;
	public final static int UPGRADEMETHOD_SOCKETASOCKET462 = 14;
	public final static int UPGRADEMETHOD_SOCKET478 = 15;
	public final static int UPGRADEMETHOD_SOCKET754 = 16;
	public final static int UPGRADEMETHOD_SOCKET940 = 17;
	public final static int UPGRADEMETHOD_SOCKET939 = 18;
	public final static int UPGRADEMETHOD_SOCKETMPGA604 = 19;
	public final static int UPGRADEMETHOD_SOCKETLGA771 = 20;
	public final static int UPGRADEMETHOD_SOCKETLGA775 = 21;
	public final static int UPGRADEMETHOD_SOCKETS1 = 22;
	public final static int UPGRADEMETHOD_SOCKETAM2 = 23;
	public final static int UPGRADEMETHOD_SOCKETF1207 = 24;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Processor() {

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
	public CIM_Processor(Vector keyProperties){ 
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
	public CIM_Processor(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Processor)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Processor)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Processor)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Processor)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Processor)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Processor)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Processor)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Processor)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Processor)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Processor)object).cimObjectPath)) {
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
	
	// Attribute AddressWidth
	
	public UnsignedInt16 get_AddressWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressWidth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_AddressWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_ADDRESSWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CPUStatus
	
	public UnsignedInt16 get_CPUStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_CPUSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_CPUSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_CPUSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CPUStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_CPUSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_CPUSTATUS + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_CPUStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_CPUSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_CPUSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentClockSpeed
	
	public UnsignedInt32 get_CurrentClockSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentClockSpeed(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_CurrentClockSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_CURRENTCLOCKSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataWidth
	
	public UnsignedInt16 get_DataWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_DATAWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_DATAWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_DATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataWidth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_DATAWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_DATAWIDTH + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_DataWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_DATAWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_DATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Family
	
	public UnsignedInt16 get_Family() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_FAMILY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_FAMILY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_FAMILY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Family(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_FAMILY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_FAMILY + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_Family(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_FAMILY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_FAMILY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoadPercentage
	
	public UnsignedInt16 get_LoadPercentage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadPercentage(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_LoadPercentage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_LOADPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxClockSpeed
	
	public UnsignedInt32 get_MaxClockSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxClockSpeed(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_MaxClockSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_MAXCLOCKSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherFamilyDescription
	
	public String get_OtherFamilyDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherFamilyDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_OtherFamilyDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_OTHERFAMILYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Role
	
	public String get_Role() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_ROLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Role(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_ROLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_Role(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_ROLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Stepping
	
	public String get_Stepping() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_STEPPING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_STEPPING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_STEPPING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Stepping(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_STEPPING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_STEPPING + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_Stepping(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_STEPPING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_STEPPING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UniqueID
	
	public String get_UniqueID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_UNIQUEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_UNIQUEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_UNIQUEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UniqueID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_UNIQUEID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_UNIQUEID + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_UniqueID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_UNIQUEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_UNIQUEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpgradeMethod
	
	public UnsignedInt16 get_UpgradeMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpgradeMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD + " could not be found");
    		
		} else if (!CIM_ProcessorHelper.isValid_UpgradeMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Processor.CIM_PROPERTY_UPGRADEMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
