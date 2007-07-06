/** 
 * CIM_PhysicalMemory.java
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
 * Description:  PhysicalMemory is a subclass of CIM_Chip, representing low level memory devices
 * - SIMMS, DIMMs, raw memory chips, etc.
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
 *  PhysicalMemory is a subclass of CIM_Chip, representing low level memory devices
 * - SIMMS, DIMMs, raw memory chips, etc.
 */
public class CIM_PhysicalMemory extends CIM_Chip  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalMemory"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD = "CIM_MemoryOnCard"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA = "CIM_MemoryWithMedia"; //$NON-NLS-1$
	
	
	/**
	*	A string identifying the physically labeled bank where the Memory is located - for example, 'Bank 0' or 'Bank A'.
	*/
	public final static String CIM_PROPERTY_BANKLABEL = "BankLabel"; //$NON-NLS-1$
	/**
	*	The total capacity of this PhysicalMemory, in bytes.
	*/
	public final static String CIM_PROPERTY_CAPACITY = "Capacity"; //$NON-NLS-1$
	/**
	*	Data width of the PhysicalMemory, in bits. A data width of 0 and a TotalWidth of 8 would indicate that the Memory is solely used to provide error correction bits.
	*/
	public final static String CIM_PROPERTY_DATAWIDTH = "DataWidth"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_FORMFACTOR = "FormFactor"; //$NON-NLS-1$
	/**
	*	The position of this PhysicalMemory in an interleave. 0 indicates non-interleaved. 1 indicates the first position, 2 the second position and so on. For example, in a 2:1 interleave, a value of '1' would indicate that the Memory is in the 'even' position.
	*/
	public final static String CIM_PROPERTY_INTERLEAVEPOSITION = "InterleavePosition"; //$NON-NLS-1$
	/**
	*	The type of PhysicalMemory.
	*/
	public final static String CIM_PROPERTY_MEMORYTYPE = "MemoryType"; //$NON-NLS-1$
	/**
	*	Specifies the position of the PhysicalMemory in a 'row'. For example, if it takes two 8-bit memory devices to form a 16- bit row, then a value of '2'means that this Memory is the second device. 0 is an invalid value for this property.
	*/
	public final static String CIM_PROPERTY_POSITIONINROW = "PositionInRow"; //$NON-NLS-1$
	/**
	*	The speed of the PhysicalMemory, in nanoseconds.
	*/
	public final static String CIM_PROPERTY_SPEED = "Speed"; //$NON-NLS-1$
	/**
	*	Total width, in bits, of the PhysicalMemory, including check or error correction bits. If there are no error correction bits, the value in this property should match that specified for DataWidth.
	*/
	public final static String CIM_PROPERTY_TOTALWIDTH = "TotalWidth"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BANKLABEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_FORMFACTOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERLEAVEPOSITION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEMORYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSITIONINROW);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALWIDTH);
				
		for (int i = 0; i < CIM_Chip.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BANKLABEL)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPACITY)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAWIDTH)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FORMFACTOR)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERLEAVEPOSITION)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEMORYTYPE)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSITIONINROW)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPEED)||
				((String)CIM_Chip.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALWIDTH)){
				continue;
			}
			
			CIM_PhysicalMemory.CIM_PropertyNameList.add(CIM_Chip.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BANKLABEL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FORMFACTOR, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERLEAVEPOSITION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEMORYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSITIONINROW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Chip.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BANKLABEL)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPACITY)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAWIDTH)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FORMFACTOR)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERLEAVEPOSITION)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEMORYTYPE)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSITIONINROW)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPEED)||
				((CIMProperty)CIM_Chip.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALWIDTH)){
				continue;
			}
			
			CIM_PhysicalMemory.CIM_PropertyList.add(CIM_Chip.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_Chip.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_MEMORYTYPE = {"Unknown","Other","DRAM","Synchronous DRAM","Cache DRAM","EDO","EDRAM","VRAM","SRAM","RAM","ROM","Flash","EEPROM","FEPROM","EPROM","CDRAM","3DRAM","SDRAM","SGRAM","RDRAM","DDR","DDR2"};
	
	
	public final static int MEMORYTYPE_UNKNOWN = 0;
	public final static int MEMORYTYPE_OTHER = 1;
	public final static int MEMORYTYPE_DRAM = 2;
	public final static int MEMORYTYPE_SYNCHRONOUSDRAM = 3;
	public final static int MEMORYTYPE_CACHEDRAM = 4;
	public final static int MEMORYTYPE_EDO = 5;
	public final static int MEMORYTYPE_EDRAM = 6;
	public final static int MEMORYTYPE_VRAM = 7;
	public final static int MEMORYTYPE_SRAM = 8;
	public final static int MEMORYTYPE_RAM = 9;
	public final static int MEMORYTYPE_ROM = 10;
	public final static int MEMORYTYPE_FLASH = 11;
	public final static int MEMORYTYPE_EEPROM = 12;
	public final static int MEMORYTYPE_FEPROM = 13;
	public final static int MEMORYTYPE_EPROM = 14;
	public final static int MEMORYTYPE_CDRAM = 15;
	public final static int MEMORYTYPE_3DRAM = 16;
	public final static int MEMORYTYPE_SDRAM = 17;
	public final static int MEMORYTYPE_SGRAM = 18;
	public final static int MEMORYTYPE_RDRAM = 19;
	public final static int MEMORYTYPE_DDR = 20;
	public final static int MEMORYTYPE_DDR2 = 21;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalMemory() {

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
	public CIM_PhysicalMemory(Vector keyProperties){ 
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
	public CIM_PhysicalMemory(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_PhysicalMemory.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_PhysicalMemory.Java_Package_List.toArray(new String[CIM_PhysicalMemory.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_PhysicalMemory)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalMemory)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalMemory)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalMemory)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalMemory)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalMemory)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalMemory)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalMemory)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalMemory)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalMemory)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Card_CIM_MemoryOnCards(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, 
					CIM_Card.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_PhysicalMemoryHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Card(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Card(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Card(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Card_CIM_MemoryOnCard_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, 
					CIM_Card.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Card.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedias(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_PhysicalMemoryHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMedia(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalMedia(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMedia(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedia_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalMedia.CIM_CLASS_NAME)) {
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
	
	// Attribute BankLabel
	
	public String get_BankLabel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BankLabel(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_BankLabel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_BANKLABEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capacity
	
	public UnsignedInt64 get_Capacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Capacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_Capacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_CAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataWidth
	
	public UnsignedInt16 get_DataWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataWidth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_DataWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_DATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FormFactor
	
	public UnsignedInt16 get_FormFactor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FormFactor(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_FormFactor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_FORMFACTOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InterleavePosition
	
	public UnsignedInt32 get_InterleavePosition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InterleavePosition(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_InterleavePosition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_INTERLEAVEPOSITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MemoryType
	
	public UnsignedInt16 get_MemoryType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MemoryType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_MemoryType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_MEMORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PositionInRow
	
	public UnsignedInt32 get_PositionInRow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PositionInRow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_PositionInRow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_POSITIONINROW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Speed
	
	public UnsignedInt32 get_Speed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_SPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_SPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_SPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Speed(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_SPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_SPEED + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_Speed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_SPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_SPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalWidth
	
	public UnsignedInt16 get_TotalWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalWidth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH + " could not be found");
    		
		} else if (!CIM_PhysicalMemoryHelper.isValid_TotalWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMemory.CIM_PROPERTY_TOTALWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
