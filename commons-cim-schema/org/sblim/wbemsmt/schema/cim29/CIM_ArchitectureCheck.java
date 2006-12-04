/** 
 * CIM_ArchitectureCheck.java
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
 * Description: ArchitectureCheck specifies the hardware platform on which a SoftwareElement can run. The details of this Check are compared with the information found in the CIM_Processor object, related to the CIM_ComputerSystem instance that describes the environment (related by the association, CIM_ComputerSystemProcessor). There should be at least one CIM_Processor that satisfies the details of the Check. In other words, all the processors on the relevant computer system do not need to satisfy the Check.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ArchitectureCheck extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_ArchitectureCheck";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The ArchitectureType property identifies a particular type of architecture or architectural family that is required to properly execute a particular SoftwareElement. The intent is to capture the details about the machine instructions exploited by the executables of the SoftwareElement.
	*/
	public final static String CIM_PROPERTY_ARCHITECTURETYPE = "ArchitectureType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ARCHITECTURETYPE);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ARCHITECTURETYPE)){
				continue;
			}
			
			CIM_ArchitectureCheck.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ARCHITECTURETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ARCHITECTURETYPE)){
				continue;
			}
			
			CIM_ArchitectureCheck.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Check.Java_Package_List.size(); i++) {
			if (((String)CIM_Check.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Check.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ARCHITECTURETYPE = {"Other","Unknown","8086","80286","80386","80486","8087","80287","80387","80487","Pentium(R) brand","Pentium(R) Pro","Pentium(R) II","Pentium(R) processor with MMX(TM) technology","Celeron(TM)","Pentium(R) II Xeon(TM)","Pentium(R) III","M1 Family","M2 Family","K5 Family","K6 Family","K6-2","K6-3","AMD Athlon(TM) Processor Family","AMD(R) Duron(TM) Processor","AMD29000 Family","K6-2+","Power PC Family","Power PC 601","Power PC 603","Power PC 603+","Power PC 604","Power PC 620","Power PC X704","Power PC 750","Alpha Family","Alpha 21064","Alpha 21066","Alpha 21164","Alpha 21164PC","Alpha 21164a","Alpha 21264","Alpha 21364","MIPS Family","MIPS R4000","MIPS R4200","MIPS R4400","MIPS R4600","MIPS R10000","SPARC Family","SuperSPARC","microSPARC II","microSPARC IIep","UltraSPARC","UltraSPARC II","UltraSPARC IIi","UltraSPARC III","UltraSPARC IIIi","68040","68xxx Family","68000","68010","68020","68030","Hobbit Family","Crusoe(TM) TM5000 Family","Crusoe(TM) TM3000 Family","Weitek","Itanium(TM) Processor","AMD Athlon(TM) 64 Processor Family","AMD Opteron(TM) Processor Family","PA-RISC Family","PA-RISC 8500","PA-RISC 8000","PA-RISC 7300LC","PA-RISC 7200","PA-RISC 7100LC","PA-RISC 7100","V30 Family","Pentium(R) III Xeon(TM)","Pentium(R) III Processor with Intel(R) SpeedStep(TM) Technology","Pentium(R) 4","Intel(R) Xeon(TM)","AS400 Family","Intel(R) Xeon(TM) processor MP","AMD Athlon(TM) XP Family","AMD Athlon(TM) MP Family","Intel(R) Itanium(R) 2","Intel(R) Pentium(R) M processor","K7","S/390 and zSeries Family","ESA/390 G4","ESA/390 G5","ESA/390 G6","z/Architectur base","i860","i960","SH-3","SH-4","ARM","StrongARM","6x86","MediaGX","MII","WinChip","DSP","Video Processor"};
	
	
	public final static int ARCHITECTURETYPE_OTHER = 1;
	public final static int ARCHITECTURETYPE_UNKNOWN = 2;
	public final static int ARCHITECTURETYPE_8086 = 3;
	public final static int ARCHITECTURETYPE_80286 = 4;
	public final static int ARCHITECTURETYPE_80386 = 5;
	public final static int ARCHITECTURETYPE_80486 = 6;
	public final static int ARCHITECTURETYPE_8087 = 7;
	public final static int ARCHITECTURETYPE_80287 = 8;
	public final static int ARCHITECTURETYPE_80387 = 9;
	public final static int ARCHITECTURETYPE_80487 = 10;
	public final static int ARCHITECTURETYPE_PENTIUMRBRAND = 11;
	public final static int ARCHITECTURETYPE_PENTIUMRPRO = 12;
	public final static int ARCHITECTURETYPE_PENTIUMRII = 13;
	public final static int ARCHITECTURETYPE_PENTIUMRPROCESSORWITHMMXTMTECHNOLOGY = 14;
	public final static int ARCHITECTURETYPE_CELERONTM = 15;
	public final static int ARCHITECTURETYPE_PENTIUMRIIXEONTM = 16;
	public final static int ARCHITECTURETYPE_PENTIUMRIII = 17;
	public final static int ARCHITECTURETYPE_M1FAMILY = 18;
	public final static int ARCHITECTURETYPE_M2FAMILY = 19;
	public final static int ARCHITECTURETYPE_K5FAMILY = 24;
	public final static int ARCHITECTURETYPE_K6FAMILY = 25;
	public final static int ARCHITECTURETYPE_K6_2 = 26;
	public final static int ARCHITECTURETYPE_K6_3 = 27;
	public final static int ARCHITECTURETYPE_AMDATHLONTMPROCESSORFAMILY = 28;
	public final static int ARCHITECTURETYPE_AMDRDURONTMPROCESSOR = 29;
	public final static int ARCHITECTURETYPE_AMD29000FAMILY = 30;
	public final static int ARCHITECTURETYPE_K6_2_ = 31;
	public final static int ARCHITECTURETYPE_POWERPCFAMILY = 32;
	public final static int ARCHITECTURETYPE_POWERPC601 = 33;
	public final static int ARCHITECTURETYPE_POWERPC603 = 34;
	public final static int ARCHITECTURETYPE_POWERPC603_ = 35;
	public final static int ARCHITECTURETYPE_POWERPC604 = 36;
	public final static int ARCHITECTURETYPE_POWERPC620 = 37;
	public final static int ARCHITECTURETYPE_POWERPCX704 = 38;
	public final static int ARCHITECTURETYPE_POWERPC750 = 39;
	public final static int ARCHITECTURETYPE_ALPHAFAMILY = 48;
	public final static int ARCHITECTURETYPE_ALPHA21064 = 49;
	public final static int ARCHITECTURETYPE_ALPHA21066 = 50;
	public final static int ARCHITECTURETYPE_ALPHA21164 = 51;
	public final static int ARCHITECTURETYPE_ALPHA21164PC = 52;
	public final static int ARCHITECTURETYPE_ALPHA21164A = 53;
	public final static int ARCHITECTURETYPE_ALPHA21264 = 54;
	public final static int ARCHITECTURETYPE_ALPHA21364 = 55;
	public final static int ARCHITECTURETYPE_MIPSFAMILY = 64;
	public final static int ARCHITECTURETYPE_MIPSR4000 = 65;
	public final static int ARCHITECTURETYPE_MIPSR4200 = 66;
	public final static int ARCHITECTURETYPE_MIPSR4400 = 67;
	public final static int ARCHITECTURETYPE_MIPSR4600 = 68;
	public final static int ARCHITECTURETYPE_MIPSR10000 = 69;
	public final static int ARCHITECTURETYPE_SPARCFAMILY = 80;
	public final static int ARCHITECTURETYPE_SUPERSPARC = 81;
	public final static int ARCHITECTURETYPE_MICROSPARCII = 82;
	public final static int ARCHITECTURETYPE_MICROSPARCIIEP = 83;
	public final static int ARCHITECTURETYPE_ULTRASPARC = 84;
	public final static int ARCHITECTURETYPE_ULTRASPARCII = 85;
	public final static int ARCHITECTURETYPE_ULTRASPARCIII = 86;
	public final static int ARCHITECTURETYPE_ULTRASPARCIII1 = 87;
	public final static int ARCHITECTURETYPE_ULTRASPARCIIII = 88;
	public final static int ARCHITECTURETYPE_68040 = 96;
	public final static int ARCHITECTURETYPE_68XXXFAMILY = 97;
	public final static int ARCHITECTURETYPE_68000 = 98;
	public final static int ARCHITECTURETYPE_68010 = 99;
	public final static int ARCHITECTURETYPE_68020 = 100;
	public final static int ARCHITECTURETYPE_68030 = 101;
	public final static int ARCHITECTURETYPE_HOBBITFAMILY = 112;
	public final static int ARCHITECTURETYPE_CRUSOETMTM5000FAMILY = 120;
	public final static int ARCHITECTURETYPE_CRUSOETMTM3000FAMILY = 121;
	public final static int ARCHITECTURETYPE_WEITEK = 128;
	public final static int ARCHITECTURETYPE_ITANIUMTMPROCESSOR = 130;
	public final static int ARCHITECTURETYPE_AMDATHLONTM64PROCESSORFAMILY = 131;
	public final static int ARCHITECTURETYPE_AMDOPTERONTMPROCESSORFAMILY = 132;
	public final static int ARCHITECTURETYPE_PA_RISCFAMILY = 144;
	public final static int ARCHITECTURETYPE_PA_RISC8500 = 145;
	public final static int ARCHITECTURETYPE_PA_RISC8000 = 146;
	public final static int ARCHITECTURETYPE_PA_RISC7300LC = 147;
	public final static int ARCHITECTURETYPE_PA_RISC7200 = 148;
	public final static int ARCHITECTURETYPE_PA_RISC7100LC = 149;
	public final static int ARCHITECTURETYPE_PA_RISC7100 = 150;
	public final static int ARCHITECTURETYPE_V30FAMILY = 160;
	public final static int ARCHITECTURETYPE_PENTIUMRIIIXEONTM = 176;
	public final static int ARCHITECTURETYPE_PENTIUMRIIIPROCESSORWITHINTELRSPEEDSTEPTMTECHNOLOGY = 177;
	public final static int ARCHITECTURETYPE_PENTIUMR4 = 178;
	public final static int ARCHITECTURETYPE_INTELRXEONTM = 179;
	public final static int ARCHITECTURETYPE_AS400FAMILY = 180;
	public final static int ARCHITECTURETYPE_INTELRXEONTMPROCESSORMP = 181;
	public final static int ARCHITECTURETYPE_AMDATHLONTMXPFAMILY = 182;
	public final static int ARCHITECTURETYPE_AMDATHLONTMMPFAMILY = 183;
	public final static int ARCHITECTURETYPE_INTELRITANIUMR2 = 184;
	public final static int ARCHITECTURETYPE_INTELRPENTIUMRMPROCESSOR = 185;
	public final static int ARCHITECTURETYPE_K7 = 190;
	public final static int ARCHITECTURETYPE_S_390ANDZSERIESFAMILY = 200;
	public final static int ARCHITECTURETYPE_ESA_390G4 = 201;
	public final static int ARCHITECTURETYPE_ESA_390G5 = 202;
	public final static int ARCHITECTURETYPE_ESA_390G6 = 203;
	public final static int ARCHITECTURETYPE_Z_ARCHITECTURBASE = 204;
	public final static int ARCHITECTURETYPE_I860 = 250;
	public final static int ARCHITECTURETYPE_I960 = 251;
	public final static int ARCHITECTURETYPE_SH_3 = 260;
	public final static int ARCHITECTURETYPE_SH_4 = 261;
	public final static int ARCHITECTURETYPE_ARM = 280;
	public final static int ARCHITECTURETYPE_STRONGARM = 281;
	public final static int ARCHITECTURETYPE_6X86 = 300;
	public final static int ARCHITECTURETYPE_MEDIAGX = 301;
	public final static int ARCHITECTURETYPE_MII = 302;
	public final static int ARCHITECTURETYPE_WINCHIP = 320;
	public final static int ARCHITECTURETYPE_DSP = 350;
	public final static int ARCHITECTURETYPE_VIDEOPROCESSOR = 500;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ArchitectureCheck() {

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
	public CIM_ArchitectureCheck(Vector keyProperties){ 
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
	public CIM_ArchitectureCheck(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ArchitectureCheck)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ArchitectureCheck)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ArchitectureCheck)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ArchitectureCheck)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ArchitectureCheck)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ArchitectureCheck)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ArchitectureCheck)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ArchitectureCheck)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ArchitectureCheck)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ArchitectureCheck)object).cimObjectPath)) {
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
	
	// Attribute ArchitectureType
	
	public UnsignedInt16 get_ArchitectureType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ArchitectureType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE + " could not be found");
    		
		} else if (!CIM_ArchitectureCheckHelper.isValid_ArchitectureType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ArchitectureCheck.CIM_PROPERTY_ARCHITECTURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
