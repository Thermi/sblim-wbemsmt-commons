/** 
 * CIM_SoftwareElementVersionCheck.java
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
 * Description:  SoftwareElementVersionCheck specifies the release of a SoftwareElement that
 * must exist in the environment. This Check can be for a specific, minimum,
 * maximum or a range of versions. To specify a specific version, the lower and
 * upper versions must be the same. To specify a minimum, only the lower version
 * needs to be defined. To specify a maximum version, only the upper version
 * needs to be defined. To specify a range, both upper and lower versions need
 * to be defined. The details of this Check are compared with the corresponding
 * details found in a CIM_SoftwareElement object, associated to the
 * CIM_ComputerSystem instance that describes the environment (related by the
 * association, CIM_InstalledSoftwareElement). There should be at least one
 * CIM_SoftwareElement that satisfies the details of the Check. In other words,
 * all the SoftwareElements on the relevant computer system do not need to
 * satisfy the Check.
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


/**
 *  SoftwareElementVersionCheck specifies the release of a SoftwareElement that
 * must exist in the environment. This Check can be for a specific, minimum,
 * maximum or a range of versions. To specify a specific version, the lower and
 * upper versions must be the same. To specify a minimum, only the lower version
 * needs to be defined. To specify a maximum version, only the upper version
 * needs to be defined. To specify a range, both upper and lower versions need
 * to be defined. The details of this Check are compared with the corresponding
 * details found in a CIM_SoftwareElement object, associated to the
 * CIM_ComputerSystem instance that describes the environment (related by the
 * association, CIM_InstalledSoftwareElement). There should be at least one
 * CIM_SoftwareElement that satisfies the details of the Check. In other words,
 * all the SoftwareElements on the relevant computer system do not need to
 * satisfy the Check.
 */
public class CIM_SoftwareElementVersionCheck extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_SoftwareElementVersionCheck"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The minimum version of the SoftwareElement being checked.
	*/
	public final static String CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION = "LowerSoftwareElementVersion"; //$NON-NLS-1$
	/**
	*	The name of the SoftwareElement being checked.
	*/
	public final static String CIM_PROPERTY_SOFTWAREELEMENTNAME = "SoftwareElementName"; //$NON-NLS-1$
	/**
	*	The state of the SoftwareElement being checked.
	*/
	public final static String CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED = "SoftwareElementStateDesired"; //$NON-NLS-1$
	/**
	*	The target operating system of the SoftwareElement being checked.
	*/
	public final static String CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED = "TargetOperatingSystemDesired"; //$NON-NLS-1$
	/**
	*	The maximum version of the SoftwareElement being checked.
	*/
	public final static String CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION = "UpperSoftwareElementVersion"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOFTWAREELEMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOFTWAREELEMENTNAME)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION)){
				continue;
			}
			
			CIM_SoftwareElementVersionCheck.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOFTWAREELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOFTWAREELEMENTNAME)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION)){
				continue;
			}
			
			CIM_SoftwareElementVersionCheck.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Check.Java_Package_List.size(); i++) {
			if (((String)CIM_Check.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Check.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SOFTWAREELEMENTSTATEDESIRED = {"Deployable","Installable","Executable","Running"};
	public final static String[] CIM_VALUEMAP_TARGETOPERATINGSYSTEMDESIRED = {"Unknown","Other","MACOS","ATTUNIX","DGUX","DECNT","Tru64 UNIX","OpenVMS","HPUX","AIX","MVS","OS400","OS/2","JavaVM","MSDOS","WIN3x","WIN95","WIN98","WINNT","WINCE","NCR3000","NetWare","OSF","DC/OS","Reliant UNIX","SCO UnixWare","SCO OpenServer","Sequent","IRIX","Solaris","SunOS","U6000","ASERIES","HP NonStop OS","HP NonStop OSS","BS2000","LINUX","Lynx","XENIX","VM","Interactive UNIX","BSDUNIX","FreeBSD","NetBSD","GNU Hurd","OS9","MACH Kernel","Inferno","QNX","EPOC","IxWorks","VxWorks","MiNT","BeOS","HP MPE","NextStep","PalmPilot","Rhapsody","Windows 2000","Dedicated","OS/390","VSE","TPF","Windows (R) Me","Caldera Open UNIX","OpenBSD","Not Applicable","Windows XP","z/OS","Microsoft Windows Server 2003","Microsoft Windows Server 2003 64-Bit"};
	
	
	public final static int SOFTWAREELEMENTSTATEDESIRED_DEPLOYABLE = 0;
	public final static int SOFTWAREELEMENTSTATEDESIRED_INSTALLABLE = 1;
	public final static int SOFTWAREELEMENTSTATEDESIRED_EXECUTABLE = 2;
	public final static int SOFTWAREELEMENTSTATEDESIRED_RUNNING = 3;
	
	public final static int TARGETOPERATINGSYSTEMDESIRED_UNKNOWN = 0;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OTHER = 1;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MACOS = 2;
	public final static int TARGETOPERATINGSYSTEMDESIRED_ATTUNIX = 3;
	public final static int TARGETOPERATINGSYSTEMDESIRED_DGUX = 4;
	public final static int TARGETOPERATINGSYSTEMDESIRED_DECNT = 5;
	public final static int TARGETOPERATINGSYSTEMDESIRED_TRU64UNIX = 6;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OPENVMS = 7;
	public final static int TARGETOPERATINGSYSTEMDESIRED_HPUX = 8;
	public final static int TARGETOPERATINGSYSTEMDESIRED_AIX = 9;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MVS = 10;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OS400 = 11;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OS_2 = 12;
	public final static int TARGETOPERATINGSYSTEMDESIRED_JAVAVM = 13;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MSDOS = 14;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WIN3X = 15;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WIN95 = 16;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WIN98 = 17;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WINNT = 18;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WINCE = 19;
	public final static int TARGETOPERATINGSYSTEMDESIRED_NCR3000 = 20;
	public final static int TARGETOPERATINGSYSTEMDESIRED_NETWARE = 21;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OSF = 22;
	public final static int TARGETOPERATINGSYSTEMDESIRED_DC_OS = 23;
	public final static int TARGETOPERATINGSYSTEMDESIRED_RELIANTUNIX = 24;
	public final static int TARGETOPERATINGSYSTEMDESIRED_SCOUNIXWARE = 25;
	public final static int TARGETOPERATINGSYSTEMDESIRED_SCOOPENSERVER = 26;
	public final static int TARGETOPERATINGSYSTEMDESIRED_SEQUENT = 27;
	public final static int TARGETOPERATINGSYSTEMDESIRED_IRIX = 28;
	public final static int TARGETOPERATINGSYSTEMDESIRED_SOLARIS = 29;
	public final static int TARGETOPERATINGSYSTEMDESIRED_SUNOS = 30;
	public final static int TARGETOPERATINGSYSTEMDESIRED_U6000 = 31;
	public final static int TARGETOPERATINGSYSTEMDESIRED_ASERIES = 32;
	public final static int TARGETOPERATINGSYSTEMDESIRED_HPNONSTOPOS = 33;
	public final static int TARGETOPERATINGSYSTEMDESIRED_HPNONSTOPOSS = 34;
	public final static int TARGETOPERATINGSYSTEMDESIRED_BS2000 = 35;
	public final static int TARGETOPERATINGSYSTEMDESIRED_LINUX = 36;
	public final static int TARGETOPERATINGSYSTEMDESIRED_LYNX = 37;
	public final static int TARGETOPERATINGSYSTEMDESIRED_XENIX = 38;
	public final static int TARGETOPERATINGSYSTEMDESIRED_VM = 39;
	public final static int TARGETOPERATINGSYSTEMDESIRED_INTERACTIVEUNIX = 40;
	public final static int TARGETOPERATINGSYSTEMDESIRED_BSDUNIX = 41;
	public final static int TARGETOPERATINGSYSTEMDESIRED_FREEBSD = 42;
	public final static int TARGETOPERATINGSYSTEMDESIRED_NETBSD = 43;
	public final static int TARGETOPERATINGSYSTEMDESIRED_GNUHURD = 44;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OS9 = 45;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MACHKERNEL = 46;
	public final static int TARGETOPERATINGSYSTEMDESIRED_INFERNO = 47;
	public final static int TARGETOPERATINGSYSTEMDESIRED_QNX = 48;
	public final static int TARGETOPERATINGSYSTEMDESIRED_EPOC = 49;
	public final static int TARGETOPERATINGSYSTEMDESIRED_IXWORKS = 50;
	public final static int TARGETOPERATINGSYSTEMDESIRED_VXWORKS = 51;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MINT = 52;
	public final static int TARGETOPERATINGSYSTEMDESIRED_BEOS = 53;
	public final static int TARGETOPERATINGSYSTEMDESIRED_HPMPE = 54;
	public final static int TARGETOPERATINGSYSTEMDESIRED_NEXTSTEP = 55;
	public final static int TARGETOPERATINGSYSTEMDESIRED_PALMPILOT = 56;
	public final static int TARGETOPERATINGSYSTEMDESIRED_RHAPSODY = 57;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WINDOWS2000 = 58;
	public final static int TARGETOPERATINGSYSTEMDESIRED_DEDICATED = 59;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OS_390 = 60;
	public final static int TARGETOPERATINGSYSTEMDESIRED_VSE = 61;
	public final static int TARGETOPERATINGSYSTEMDESIRED_TPF = 62;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WINDOWSRME = 63;
	public final static int TARGETOPERATINGSYSTEMDESIRED_CALDERAOPENUNIX = 64;
	public final static int TARGETOPERATINGSYSTEMDESIRED_OPENBSD = 65;
	public final static int TARGETOPERATINGSYSTEMDESIRED_NOTAPPLICABLE = 66;
	public final static int TARGETOPERATINGSYSTEMDESIRED_WINDOWSXP = 67;
	public final static int TARGETOPERATINGSYSTEMDESIRED_Z_OS = 68;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MICROSOFTWINDOWSSERVER2003 = 69;
	public final static int TARGETOPERATINGSYSTEMDESIRED_MICROSOFTWINDOWSSERVER200364_BIT = 70;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SoftwareElementVersionCheck() {

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
	public CIM_SoftwareElementVersionCheck(Vector keyProperties){ 
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
	public CIM_SoftwareElementVersionCheck(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SoftwareElementVersionCheck)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SoftwareElementVersionCheck)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SoftwareElementVersionCheck)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SoftwareElementVersionCheck)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SoftwareElementVersionCheck)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SoftwareElementVersionCheck)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SoftwareElementVersionCheck)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SoftwareElementVersionCheck)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SoftwareElementVersionCheck)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SoftwareElementVersionCheck)object).cimObjectPath)) {
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
	
	// Attribute LowerSoftwareElementVersion
	
	public String get_LowerSoftwareElementVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerSoftwareElementVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION + " could not be found");
    		
		} else if (!CIM_SoftwareElementVersionCheckHelper.isValid_LowerSoftwareElementVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_LOWERSOFTWAREELEMENTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SoftwareElementName
	
	public String get_SoftwareElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SoftwareElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME + " could not be found");
    		
		} else if (!CIM_SoftwareElementVersionCheckHelper.isValid_SoftwareElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SoftwareElementStateDesired
	
	public UnsignedInt16 get_SoftwareElementStateDesired() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SoftwareElementStateDesired(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED + " could not be found");
    		
		} else if (!CIM_SoftwareElementVersionCheckHelper.isValid_SoftwareElementStateDesired(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_SOFTWAREELEMENTSTATEDESIRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetOperatingSystemDesired
	
	public UnsignedInt16 get_TargetOperatingSystemDesired() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TargetOperatingSystemDesired(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED + " could not be found");
    		
		} else if (!CIM_SoftwareElementVersionCheckHelper.isValid_TargetOperatingSystemDesired(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_TARGETOPERATINGSYSTEMDESIRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperSoftwareElementVersion
	
	public String get_UpperSoftwareElementVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperSoftwareElementVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION + " could not be found");
    		
		} else if (!CIM_SoftwareElementVersionCheckHelper.isValid_UpperSoftwareElementVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementVersionCheck.CIM_PROPERTY_UPPERSOFTWAREELEMENTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
