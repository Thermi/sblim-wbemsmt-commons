/** 
 * CIM_Controller.java
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
 * Description: Controller is a superclass for grouping the miscellaneous control-related Devices that provide a 'classic' bus master interface. Examples of Controllers are USBControllers, SerialControllers, etc. The Controller class is an abstraction for Devices with a single protocol stack, which exist to control communications (data, control, and reset) to 'downstream' devices. Note that a new abstract class (ProtocolController) has been created to model more complex interface controllers such as SCSI.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_Controller extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_Controller";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTROLLEDBY = "CIM_ControlledBy";
	
	
	/**
	*	Maximum number of directly addressable entities supported by this Controller. A value of 0 should be used if the number is unknown or unlimited.
	*/
	public final static String CIM_PROPERTY_MAXNUMBERCONTROLLED = "MaxNumberControlled"; //$NON-NLS-1$
	/**
	*	A free form string providing more information related to the ProtocolSupported by the Controller.
	*/
	public final static String CIM_PROPERTY_PROTOCOLDESCRIPTION = "ProtocolDescription"; //$NON-NLS-1$
	/**
	*	The protocol used by the Controller to access 'controlled' Devices.
	*/
	public final static String CIM_PROPERTY_PROTOCOLSUPPORTED = "ProtocolSupported"; //$NON-NLS-1$
	/**
	*	Time of last reset of the Controller.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTRESET = "TimeOfLastReset"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBERCONTROLLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTRESET);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBERCONTROLLED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLDESCRIPTION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLSUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTRESET)){
				continue;
			}
			
			CIM_Controller.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBERCONTROLLED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTRESET, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBERCONTROLLED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLDESCRIPTION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLSUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTRESET)){
				continue;
			}
			
			CIM_Controller.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PROTOCOLSUPPORTED = {"Other","Unknown","EISA","ISA","PCI","ATA/ATAPI","Flexible Diskette","1496","SCSI Parallel Interface","SCSI Fibre Channel Protocol","SCSI Serial Bus Protocol","SCSI Serial Bus Protocol-2 (1394)","SCSI Serial Storage Architecture","VESA","PCMCIA","Universal Serial Bus","Parallel Protocol","ESCON","Diagnostic","I2C","Power","HIPPI","MultiBus","VME","IPI","IEEE-488","RS232","IEEE 802.3 10BASE5","IEEE 802.3 10BASE2","IEEE 802.3 1BASE5","IEEE 802.3 10BROAD36","IEEE 802.3 100BASEVG","IEEE 802.5 Token-Ring","ANSI X3T9.5 FDDI","MCA","ESDI","IDE","CMD","ST506","DSSI","QIC2","Enhanced ATA/IDE","AGP","TWIRP (two-way infrared)","FIR (fast infrared)","SIR (serial infrared)","IrBus","Serial ATA"};
	
	
	public final static int PROTOCOLSUPPORTED_OTHER = 1;
	public final static int PROTOCOLSUPPORTED_UNKNOWN = 2;
	public final static int PROTOCOLSUPPORTED_EISA = 3;
	public final static int PROTOCOLSUPPORTED_ISA = 4;
	public final static int PROTOCOLSUPPORTED_PCI = 5;
	public final static int PROTOCOLSUPPORTED_ATA_ATAPI = 6;
	public final static int PROTOCOLSUPPORTED_FLEXIBLEDISKETTE = 7;
	public final static int PROTOCOLSUPPORTED_1496 = 8;
	public final static int PROTOCOLSUPPORTED_SCSIPARALLELINTERFACE = 9;
	public final static int PROTOCOLSUPPORTED_SCSIFIBRECHANNELPROTOCOL = 10;
	public final static int PROTOCOLSUPPORTED_SCSISERIALBUSPROTOCOL = 11;
	public final static int PROTOCOLSUPPORTED_SCSISERIALBUSPROTOCOL_21394 = 12;
	public final static int PROTOCOLSUPPORTED_SCSISERIALSTORAGEARCHITECTURE = 13;
	public final static int PROTOCOLSUPPORTED_VESA = 14;
	public final static int PROTOCOLSUPPORTED_PCMCIA = 15;
	public final static int PROTOCOLSUPPORTED_UNIVERSALSERIALBUS = 16;
	public final static int PROTOCOLSUPPORTED_PARALLELPROTOCOL = 17;
	public final static int PROTOCOLSUPPORTED_ESCON = 18;
	public final static int PROTOCOLSUPPORTED_DIAGNOSTIC = 19;
	public final static int PROTOCOLSUPPORTED_I2C = 20;
	public final static int PROTOCOLSUPPORTED_POWER = 21;
	public final static int PROTOCOLSUPPORTED_HIPPI = 22;
	public final static int PROTOCOLSUPPORTED_MULTIBUS = 23;
	public final static int PROTOCOLSUPPORTED_VME = 24;
	public final static int PROTOCOLSUPPORTED_IPI = 25;
	public final static int PROTOCOLSUPPORTED_IEEE_488 = 26;
	public final static int PROTOCOLSUPPORTED_RS232 = 27;
	public final static int PROTOCOLSUPPORTED_IEEE802_310BASE5 = 28;
	public final static int PROTOCOLSUPPORTED_IEEE802_310BASE2 = 29;
	public final static int PROTOCOLSUPPORTED_IEEE802_31BASE5 = 30;
	public final static int PROTOCOLSUPPORTED_IEEE802_310BROAD36 = 31;
	public final static int PROTOCOLSUPPORTED_IEEE802_3100BASEVG = 32;
	public final static int PROTOCOLSUPPORTED_IEEE802_5TOKEN_RING = 33;
	public final static int PROTOCOLSUPPORTED_ANSIX3T9_5FDDI = 34;
	public final static int PROTOCOLSUPPORTED_MCA = 35;
	public final static int PROTOCOLSUPPORTED_ESDI = 36;
	public final static int PROTOCOLSUPPORTED_IDE = 37;
	public final static int PROTOCOLSUPPORTED_CMD = 38;
	public final static int PROTOCOLSUPPORTED_ST506 = 39;
	public final static int PROTOCOLSUPPORTED_DSSI = 40;
	public final static int PROTOCOLSUPPORTED_QIC2 = 41;
	public final static int PROTOCOLSUPPORTED_ENHANCEDATA_IDE = 42;
	public final static int PROTOCOLSUPPORTED_AGP = 43;
	public final static int PROTOCOLSUPPORTED_TWIRPTWO_WAYINFRARED = 44;
	public final static int PROTOCOLSUPPORTED_FIRFASTINFRARED = 45;
	public final static int PROTOCOLSUPPORTED_SIRSERIALINFRARED = 46;
	public final static int PROTOCOLSUPPORTED_IRBUS = 47;
	public final static int PROTOCOLSUPPORTED_SERIALATA = 48;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Controller() {

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
	public CIM_Controller(Vector keyProperties){ 
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
	public CIM_Controller(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Controller)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Controller)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Controller)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Controller)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Controller)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Controller)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Controller)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Controller)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Controller)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Controller)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalDevice_CIM_ControlledBys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTROLLEDBY, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Controller.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Controller.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Controller.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Controller.Java_Package_List.setElementAt((String)(CIM_Controller.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Controller.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_ControlledBy_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTROLLEDBY, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
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
	
	// Attribute MaxNumberControlled
	
	public UnsignedInt32 get_MaxNumberControlled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberControlled(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED + " could not be found");
    		
		} else if (!CIM_ControllerHelper.isValid_MaxNumberControlled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_MAXNUMBERCONTROLLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolDescription
	
	public String get_ProtocolDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ControllerHelper.isValid_ProtocolDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolSupported
	
	public UnsignedInt16 get_ProtocolSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolSupported(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED + " could not be found");
    		
		} else if (!CIM_ControllerHelper.isValid_ProtocolSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_PROTOCOLSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastReset
	
	public Calendar get_TimeOfLastReset() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastReset(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET + " could not be found");
    		
		} else if (!CIM_ControllerHelper.isValid_TimeOfLastReset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Controller.CIM_PROPERTY_TIMEOFLASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
