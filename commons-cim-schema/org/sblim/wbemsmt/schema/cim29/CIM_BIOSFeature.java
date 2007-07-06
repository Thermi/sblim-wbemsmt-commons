/** 
 * CIM_BIOSFeature.java
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
 * Description:  BIOSFeature represents the capabilities of the low-level software that is used
 * to bring up and configure a Computer System.
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
 *  BIOSFeature represents the capabilities of the low-level software that is used
 * to bring up and configure a Computer System.
 */
public class CIM_BIOSFeature extends CIM_SoftwareFeature  {
	
	public final static String CIM_CLASS_NAME = "CIM_BIOSFeature"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS = "CIM_BIOSFeatureBIOSElements"; //$NON-NLS-1$
	
	
	/**
	*	An array of free-form strings providing more detailed explanations for any of the BIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS = "CharacteristicDescriptions"; //$NON-NLS-1$
	/**
	*	An array of integers that specify the features supported by the BIOS. For example, one can specify that PnP capabilities are provided (value=9) or that infrared devices are supported (21). Values specified in the enumeration are taken from both DMI and SMBIOS (the Type 0 structure, the BIOS Characteristics and BIOS Characteristics Extension Bytes attributes.
	*/
	public final static String CIM_PROPERTY_CHARACTERISTICS = "Characteristics"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARACTERISTICS);
				
		for (int i = 0; i < CIM_SoftwareFeature.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SoftwareFeature.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS)||
				((String)CIM_SoftwareFeature.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARACTERISTICS)){
				continue;
			}
			
			CIM_BIOSFeature.CIM_PropertyNameList.add(CIM_SoftwareFeature.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARACTERISTICS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_SoftwareFeature.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SoftwareFeature.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS)||
				((CIMProperty)CIM_SoftwareFeature.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARACTERISTICS)){
				continue;
			}
			
			CIM_BIOSFeature.CIM_PropertyList.add(CIM_SoftwareFeature.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_SoftwareFeature.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CHARACTERISTICS = {"Other","Unknown","Undefined","ISA Support","MCA Support","EISA Support","PCI Support","PCMCIA Support","PnP Support","APM Support","Upgradeable BIOS","BIOS Shadowing Allowed","VL VESA Support","ESCD Support","LS-120 Boot Support","ACPI Support","I2O Boot Support","USB Legacy Support","AGP Support","PC Card","IR","1394","I2C","Smart Battery","ATAPI ZIP Drive Boot Support","1394 Boot Support","Boot from CD","Selectable Boot","BIOS ROM is Socketed","Boot from PCMCIA","EDD Specification Support","PC-98"};
	
	
	public final static int CHARACTERISTICS_OTHER = 1;
	public final static int CHARACTERISTICS_UNKNOWN = 2;
	public final static int CHARACTERISTICS_UNDEFINED = 3;
	public final static int CHARACTERISTICS_ISASUPPORT = 4;
	public final static int CHARACTERISTICS_MCASUPPORT = 5;
	public final static int CHARACTERISTICS_EISASUPPORT = 6;
	public final static int CHARACTERISTICS_PCISUPPORT = 7;
	public final static int CHARACTERISTICS_PCMCIASUPPORT = 8;
	public final static int CHARACTERISTICS_PNPSUPPORT = 9;
	public final static int CHARACTERISTICS_APMSUPPORT = 10;
	public final static int CHARACTERISTICS_UPGRADEABLEBIOS = 11;
	public final static int CHARACTERISTICS_BIOSSHADOWINGALLOWED = 12;
	public final static int CHARACTERISTICS_VLVESASUPPORT = 13;
	public final static int CHARACTERISTICS_ESCDSUPPORT = 14;
	public final static int CHARACTERISTICS_LS_120BOOTSUPPORT = 15;
	public final static int CHARACTERISTICS_ACPISUPPORT = 16;
	public final static int CHARACTERISTICS_I2OBOOTSUPPORT = 17;
	public final static int CHARACTERISTICS_USBLEGACYSUPPORT = 18;
	public final static int CHARACTERISTICS_AGPSUPPORT = 19;
	public final static int CHARACTERISTICS_PCCARD = 20;
	public final static int CHARACTERISTICS_IR = 21;
	public final static int CHARACTERISTICS_1394 = 22;
	public final static int CHARACTERISTICS_I2C = 23;
	public final static int CHARACTERISTICS_SMARTBATTERY = 24;
	public final static int CHARACTERISTICS_ATAPIZIPDRIVEBOOTSUPPORT = 25;
	public final static int CHARACTERISTICS_1394BOOTSUPPORT = 26;
	public final static int CHARACTERISTICS_BOOTFROMCD = 27;
	public final static int CHARACTERISTICS_SELECTABLEBOOT = 28;
	public final static int CHARACTERISTICS_BIOSROMISSOCKETED = 29;
	public final static int CHARACTERISTICS_BOOTFROMPCMCIA = 30;
	public final static int CHARACTERISTICS_EDDSPECIFICATIONSUPPORT = 31;
	public final static int CHARACTERISTICS_PC_98 = 160;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BIOSFeature() {

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
	public CIM_BIOSFeature(Vector keyProperties){ 
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
	public CIM_BIOSFeature(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_BIOSFeature.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_BIOSFeature.Java_Package_List.toArray(new String[CIM_BIOSFeature.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_BIOSFeature)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BIOSFeature)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BIOSFeature)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BIOSFeature)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BIOSFeature)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BIOSFeature)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BIOSFeature)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BIOSFeature)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BIOSFeature)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BIOSFeature)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, 
					CIM_BIOSElement.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_BIOSFeatureHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BIOSElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BIOSElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BIOSElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElements_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, 
					CIM_BIOSElement.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BIOSElement.CIM_CLASS_NAME)) {
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
	
	// Attribute CharacteristicDescriptions
	
	public String[] get_CharacteristicDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CharacteristicDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_BIOSFeatureHelper.isValid_CharacteristicDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Characteristics
	
	public UnsignedInt16[] get_Characteristics() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Characteristics(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS + " could not be found");
    		
		} else if (!CIM_BIOSFeatureHelper.isValid_Characteristics(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSFeature.CIM_PROPERTY_CHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
