/** 
 * CIM_IRQ.java
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
 * Description: Personal computer architecture IRQ.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_IRQ extends CIM_SystemResource  {
	
	public final static String CIM_CLASS_NAME = "CIM_IRQ";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMIRQ = "CIM_ComputerSystemIRQ";
	
	
	/**
	*	Availability of the IRQ.
	*/
	public final static String CIM_PROPERTY_AVAILABILITY = "Availability"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's CreationClassName.
	*/
	public final static String CIM_PROPERTY_CSCREATIONCLASSNAME = "CSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's Name.
	*/
	public final static String CIM_PROPERTY_CSNAME = "CSName"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The Hardware property indicates whether the interrupt is hardware or software based. (If TRUE, the interrupt is hardware based.) On a personal computer, a hardware IRQ is a physical wire to a programmable interrupt controller (PIC) chip, through which the CPU can be notified of time critical events. Some IRQ lines are reserved for standard Devices such as the keyboard, floppy disk drives, and the system clock. A software interrupt is a programmatic mechanism to allow an application to get the attention of the Processor.
	*/
	public final static String CIM_PROPERTY_HARDWARE = "Hardware"; //$NON-NLS-1$
	/**
	*	A part of the object's key value, IRQ Number.
	*/
	public final static String CIM_PROPERTY_IRQNUMBER = "IRQNumber"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the IRQ can be shared.
	*/
	public final static String CIM_PROPERTY_SHAREABLE = "Shareable"; //$NON-NLS-1$
	/**
	*	IRQ trigger level indicating whether the interrupt is triggered by the hardware signal going high (value=4) or low (value=3). Also, "Other" (1) and "Unknown" (2) may be defined.
	*/
	public final static String CIM_PROPERTY_TRIGGERLEVEL = "TriggerLevel"; //$NON-NLS-1$
	/**
	*	IRQ trigger type indicating whether edge (value=4) or level triggered (value=3) interrupts occur. Also, "Other" (1) and "Unknown" (2) may be defined.
	*/
	public final static String CIM_PROPERTY_TRIGGERTYPE = "TriggerType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABILITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_HARDWARE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IRQNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SHAREABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRIGGERLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRIGGERTYPE);
				
		for (int i = 0; i < CIM_SystemResource.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABILITY)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSNAME)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HARDWARE)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IRQNUMBER)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SHAREABLE)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRIGGERLEVEL)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRIGGERTYPE)){
				continue;
			}
			
			CIM_IRQ.CIM_PropertyNameList.add(CIM_SystemResource.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABILITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HARDWARE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IRQNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SHAREABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRIGGERLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRIGGERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SystemResource.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABILITY)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSNAME)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HARDWARE)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IRQNUMBER)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SHAREABLE)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRIGGERLEVEL)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRIGGERTYPE)){
				continue;
			}
			
			CIM_IRQ.CIM_PropertyList.add(CIM_SystemResource.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SystemResource.Java_Package_List.size(); i++) {
			if (((String)CIM_SystemResource.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SystemResource.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AVAILABILITY = {"Other","Unknown","Available","In Use/Not Available","In Use and Available/Shareable"};
	public final static String[] CIM_VALUEMAP_TRIGGERLEVEL = {"Other","Unknown","Active Low","Active High"};
	public final static String[] CIM_VALUEMAP_TRIGGERTYPE = {"Other","Unknown","Level","Edge"};
	
	
	public final static int AVAILABILITY_OTHER = 1;
	public final static int AVAILABILITY_UNKNOWN = 2;
	public final static int AVAILABILITY_AVAILABLE = 3;
	public final static int AVAILABILITY_INUSE_NOTAVAILABLE = 4;
	public final static int AVAILABILITY_INUSEANDAVAILABLE_SHAREABLE = 5;
	
	public final static int TRIGGERLEVEL_OTHER = 1;
	public final static int TRIGGERLEVEL_UNKNOWN = 2;
	public final static int TRIGGERLEVEL_ACTIVELOW = 3;
	public final static int TRIGGERLEVEL_ACTIVEHIGH = 4;
	
	public final static int TRIGGERTYPE_OTHER = 1;
	public final static int TRIGGERTYPE_UNKNOWN = 2;
	public final static int TRIGGERTYPE_LEVEL = 3;
	public final static int TRIGGERTYPE_EDGE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IRQ() {

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
	public CIM_IRQ(Vector keyProperties){ 
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
	public CIM_IRQ(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CSCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CSCREATIONCLASSNAME);
		
		if (CIMProperty_CSCreationClassName == null || CIMProperty_CSCreationClassName.getValue().isEmpty() || CIMProperty_CSCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CSName = this.cimInstance.getProperty(CIM_PROPERTY_CSNAME);
		
		if (CIMProperty_CSName == null || CIMProperty_CSName.getValue().isEmpty() || CIMProperty_CSName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_IRQNumber = this.cimInstance.getProperty(CIM_PROPERTY_IRQNUMBER);
		
		if (CIMProperty_IRQNumber == null || CIMProperty_IRQNumber.getValue().isEmpty() || CIMProperty_IRQNumber.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IRQNUMBER, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_IRQ)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IRQ)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IRQ)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IRQ)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IRQ)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IRQ)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IRQ)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IRQ)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IRQ)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IRQ)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ComputerSystem_CIM_ComputerSystemIRQs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMIRQ, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_IRQ.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IRQ.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IRQ.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IRQ.Java_Package_List.setElementAt((String)(CIM_IRQ.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IRQ.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_ComputerSystemIRQ_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMIRQ, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute Availability
	
	public UnsignedInt16 get_Availability() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_AVAILABILITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_AVAILABILITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_AVAILABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Availability(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_AVAILABILITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_AVAILABILITY + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_Availability(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_AVAILABILITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_AVAILABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSCreationClassName
	
	public String get_CSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_CSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSName
	
	public String get_CSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_CSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_CSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IRQ.CIM_PROPERTY_CSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_CSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_CSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Hardware
	
	public Boolean get_Hardware() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_HARDWARE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_HARDWARE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_HARDWARE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Hardware(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_HARDWARE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_HARDWARE + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_Hardware(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_HARDWARE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_HARDWARE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IRQNumber
	
	public UnsignedInt32 get_IRQNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_IRQNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_IRQNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_IRQNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IRQNumber(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_IRQNUMBER);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IRQ.CIM_PROPERTY_IRQNUMBER + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_IRQNUMBER + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_IRQNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_IRQNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_IRQNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Shareable
	
	public Boolean get_Shareable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_SHAREABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_SHAREABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_SHAREABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Shareable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_SHAREABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_SHAREABLE + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_Shareable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_SHAREABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_SHAREABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TriggerLevel
	
	public UnsignedInt16 get_TriggerLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TriggerLevel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_TriggerLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TriggerType
	
	public UnsignedInt16 get_TriggerType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TriggerType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE + " could not be found");
    		
		} else if (!CIM_IRQHelper.isValid_TriggerType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IRQ.CIM_PROPERTY_TRIGGERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
