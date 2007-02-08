/** 
 * CIM_Card.java
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
 * Description: The Card class represents a type of physical container that can be plugged into another Card or HostingBoard, or is itself a HostingBoard/Motherboard in a Chassis. The CIM_Card class includes any package capable of carrying signals and providing a mounting point for PhysicalComponents, such as Chips, or other PhysicalPackages, such as other Cards.
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



public class CIM_Card extends CIM_PhysicalPackage  {
	
	public final static String CIM_CLASS_NAME = "CIM_Card";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDINSLOT = "CIM_CardInSlot";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD = "CIM_CardOnCard";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD = "CIM_MemoryOnCard";
	
	
	/**
	*	Boolean indicating that this Card is a Motherboard or, more generically, a baseboard in a Chassis.
	*/
	public final static String CIM_PROPERTY_HOSTINGBOARD = "HostingBoard"; //$NON-NLS-1$
	/**
	*	Operating voltages required by the Card.
	*/
	public final static String CIM_PROPERTY_OPERATINGVOLTAGES = "OperatingVoltages"; //$NON-NLS-1$
	/**
	*	A free-form string describing the way(s) in which this Card is physically unique from other Cards. This property only has meaning when the corresponding boolean property, SpecialRequirements, is set to TRUE.
	*/
	public final static String CIM_PROPERTY_REQUIREMENTSDESCRIPTION = "RequirementsDescription"; //$NON-NLS-1$
	/**
	*	Boolean indicating that at least one daughterboard or auxiliary Card is required in order to function properly.
	*/
	public final static String CIM_PROPERTY_REQUIRESDAUGHTERBOARD = "RequiresDaughterBoard"; //$NON-NLS-1$
	/**
	*	SlotLayout is a free-form string that describes the slot positioning, typical usage, restrictions, individual slot spacings or any other pertinent information for the slots on a Card.
	*/
	public final static String CIM_PROPERTY_SLOTLAYOUT = "SlotLayout"; //$NON-NLS-1$
	/**
	*	Boolean indicating that this Card is physically unique from other Cards of the same type and therefore requires a special Slot. For example, a double-wide Card requires two Slots. Another example is where a certain Card may be used for the same general function as other Cards but requires a special Slot (e.g., extra long), whereas the other Cards can be placed in any available Slot. If set to TRUE, then the corresponding property, RequirementsDescription, should specify the nature of the uniqueness or purpose of the Card.
	*/
	public final static String CIM_PROPERTY_SPECIALREQUIREMENTS = "SpecialRequirements"; //$NON-NLS-1$
	
	
	/**
	*	This method manipulates the power to a PhysicalConnector on a Card. It is intended to be used by a Card (especially by a motherboard - i.e., HostingBoard=TRUE) to turn the power on and off for a specific PhysicalConnector located on it. For example, in a personal computer, a system slot does not know how to turn itself on and off. However, the motherboard hosting this slot may have that capability. This is important in order to support hot swapping of an adapter card in a system slot. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_CONNECTORPOWER = "ConnectorPower";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HOSTINGBOARD);
		CIM_PropertyNameList.add(CIM_PROPERTY_OPERATINGVOLTAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUIREMENTSDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUIRESDAUGHTERBOARD);
		CIM_PropertyNameList.add(CIM_PROPERTY_SLOTLAYOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPECIALREQUIREMENTS);
				
		for (int i = 0; i < CIM_PhysicalPackage.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOSTINGBOARD)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OPERATINGVOLTAGES)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUIREMENTSDESCRIPTION)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUIRESDAUGHTERBOARD)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SLOTLAYOUT)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPECIALREQUIREMENTS)){
				continue;
			}
			
			CIM_Card.CIM_PropertyNameList.add(CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOSTINGBOARD, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OPERATINGVOLTAGES, new CIMValue(null, new CIMDataType(CIMDataType.SINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUIREMENTSDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUIRESDAUGHTERBOARD, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SLOTLAYOUT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPECIALREQUIREMENTS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_PhysicalPackage.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOSTINGBOARD)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OPERATINGVOLTAGES)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUIREMENTSDESCRIPTION)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUIRESDAUGHTERBOARD)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SLOTLAYOUT)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPECIALREQUIREMENTS)){
				continue;
			}
			
			CIM_Card.CIM_PropertyList.add(CIM_PhysicalPackage.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalPackage.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalPackage.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalPackage.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Card() {

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
	public CIM_Card(Vector keyProperties){ 
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
	public CIM_Card(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Card)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Card)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Card)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Card)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Card)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Card)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Card)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Card)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Card)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Card)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Slot_CIM_CardInSlots(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDINSLOT, 
					CIM_Slot.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Card.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Card.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Card.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Card.Java_Package_List.setElementAt((String)(CIM_Card.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Card.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Slot(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Slot(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Slot(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Slot_CIM_CardInSlot_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDINSLOT, 
					CIM_Slot.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Slot.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Card_CIM_CardOnCards(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, 
					CIM_Card.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Card.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Card.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Card.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Card.Java_Package_List.setElementAt((String)(CIM_Card.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Card.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
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

	public ArrayList getAssociated_CIM_Card_CIM_CardOnCard_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, 
					CIM_Card.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
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

	public ArrayList getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCards(CIMClient cimClient,
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
					CIM_PhysicalMemory.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Card.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Card.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Card.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Card.Java_Package_List.setElementAt((String)(CIM_Card.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Card.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMemory(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalMemory(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMemory(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCard_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, 
					CIM_PhysicalMemory.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalMemory.CIM_CLASS_NAME)) {
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
	
	// Attribute HostingBoard
	
	public Boolean get_HostingBoard() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_HOSTINGBOARD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_HOSTINGBOARD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_HOSTINGBOARD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HostingBoard(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_HOSTINGBOARD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_HOSTINGBOARD + " could not be found");
    		
		} else if (!CIM_CardHelper.isValid_HostingBoard(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Card.CIM_PROPERTY_HOSTINGBOARD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_HOSTINGBOARD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OperatingVoltages
	
	public Short[] get_OperatingVoltages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		Short[] resultArray = new Short[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (Short)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_OperatingVoltages(Short[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES + " could not be found");
    		
		} else if (!CIM_CardHelper.isValid_OperatingVoltages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_OPERATINGVOLTAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequirementsDescription
	
	public String get_RequirementsDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequirementsDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION + " could not be found");
    		
		} else if (!CIM_CardHelper.isValid_RequirementsDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_REQUIREMENTSDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequiresDaughterBoard
	
	public Boolean get_RequiresDaughterBoard() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequiresDaughterBoard(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD + " could not be found");
    		
		} else if (!CIM_CardHelper.isValid_RequiresDaughterBoard(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_REQUIRESDAUGHTERBOARD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SlotLayout
	
	public String get_SlotLayout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_SLOTLAYOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_SLOTLAYOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_SLOTLAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SlotLayout(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_SLOTLAYOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_SLOTLAYOUT + " could not be found");
    		
		} else if (!CIM_CardHelper.isValid_SlotLayout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Card.CIM_PROPERTY_SLOTLAYOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_SLOTLAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpecialRequirements
	
	public Boolean get_SpecialRequirements() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpecialRequirements(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS + " could not be found");
    		
		} else if (!CIM_CardHelper.isValid_SpecialRequirements(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Card.CIM_PROPERTY_SPECIALREQUIREMENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_connectorPower(CIMClient cimClient, CIM_PhysicalConnector Connector, Boolean PoweredOn) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Card.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Connector = new CIMValue(Connector.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_PoweredOn = new CIMValue(PoweredOn, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("Connector", cimValue_Connector));
		inParameter.add(new CIMArgument("PoweredOn", cimValue_PoweredOn));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CONNECTORPOWER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Card.CIM_METHOD_CONNECTORPOWER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Card.CIM_METHOD_CONNECTORPOWER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Card.CIM_METHOD_CONNECTORPOWER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
