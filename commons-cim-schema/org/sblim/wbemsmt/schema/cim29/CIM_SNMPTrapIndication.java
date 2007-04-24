/** 
 * CIM_SNMPTrapIndication.java
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
 * Description:  A concrete class for mapping an SNMP Trap to CIM based on the IETF RFC 1157.
 * The usefulness of this class is to describe common trap semantics. But, a
 * complete understanding of any trap data received relies on the Indicaton
 * recipient having access to the sender's MIB. Understanding can be improved by
 * mapping the SNMP domain to CIM, and using CIM LifeCycle and standard
 * subclasses of CIM_ProcessIndication.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


/**
 *  A concrete class for mapping an SNMP Trap to CIM based on the IETF RFC 1157.
 * The usefulness of this class is to describe common trap semantics. But, a
 * complete understanding of any trap data received relies on the Indicaton
 * recipient having access to the sender's MIB. Understanding can be improved by
 * mapping the SNMP domain to CIM, and using CIM LifeCycle and standard
 * subclasses of CIM_ProcessIndication.
 */
public class CIM_SNMPTrapIndication extends CIM_ProcessIndication  {
	
	public final static String CIM_CLASS_NAME = "CIM_SNMPTrapIndication"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Address of the object generating the trap.
	*/
	public final static String CIM_PROPERTY_AGENTADDRESS = "AgentAddress"; //$NON-NLS-1$
	/**
	*	Type of object generating the trap.
	*/
	public final static String CIM_PROPERTY_ENTERPRISE = "Enterprise"; //$NON-NLS-1$
	/**
	*	An enumerated value that describes the generic trap type: 
- The coldStart(0) trap signifies that the sending protocol entity is reinitializing itself such that the agent's configuration or the protocol entity implementation may be altered. 
- The warmStart(1) trap signifies that the sending protocol entity is reinitializing itself such that neither the agent configuration nor the protocol entity implementation is altered. 
- The linkDown(2) trap signifies that the sending protocol recognizes a failure in one of the communication links represented in the agent's configuration. The Trap-PDU of type linkDown contains as the first element of its variable-bindings the name and value of the ifIndex instance for the affected interface. 
- The linkUp(3) trap signifies that the sending protocol entity recognizes that one of the communication links represented in the agent's configuration has come up. The Trap-PDU of type linkUp contains as the first element of its variable-bindings, the name and value of the ifIndex instance for the affected interface. 
- An authenticationFailure(4) trap signifies that the sending protocol entity is the adressee of a protocol message that was not properly authenticated. While implementations of SNMP must be capable of generating this trap, they must also be capable of suppressing the emission of such traps via an implementation- specific mechanism. 
- An egpNeighborLoss(5) trap signifies that an EGP neighbor for whom the sending protocol entity was an EGP peer has been marked as down and the peer relationship no longer pertains. The Trap-PDU of type egpNeighborLoss contains as the first element of its variable-bindings, the name and value of the egpNeighAddr instance for the affected neighbor. 
- An enterpriseSpecific(6) trap signifies that the sending protocol entity recognizes that some enterprise-specific event has occurred. The specific-trap field identifies the particular trap which occurred.
	*/
	public final static String CIM_PROPERTY_GENERICTRAP = "GenericTrap"; //$NON-NLS-1$
	/**
	*	Specific trap code.
	*/
	public final static String CIM_PROPERTY_SPECIFICTRAP = "SpecificTrap"; //$NON-NLS-1$
	/**
	*	Time elapsed between the last (re)intialization of the managed entity and the generation of the trap.
	*/
	public final static String CIM_PROPERTY_TIMESTAMP = "TimeStamp"; //$NON-NLS-1$
	/**
	*	Object naming information (an OID) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindSyntaxes and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
	*/
	public final static String CIM_PROPERTY_VARBINDNAMES = "VarBindNames"; //$NON-NLS-1$
	/**
	*	Object syntax information (defined as an enumerated value) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
	*/
	public final static String CIM_PROPERTY_VARBINDSYNTAXES = "VarBindSyntaxes"; //$NON-NLS-1$
	/**
	*	An OctetString representing object value information from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindSyntaxes arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
	*/
	public final static String CIM_PROPERTY_VARBINDVALUES = "VarBindValues"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AGENTADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENTERPRISE);
		CIM_PropertyNameList.add(CIM_PROPERTY_GENERICTRAP);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPECIFICTRAP);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMESTAMP);
		CIM_PropertyNameList.add(CIM_PROPERTY_VARBINDNAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_VARBINDSYNTAXES);
		CIM_PropertyNameList.add(CIM_PROPERTY_VARBINDVALUES);
				
		for (int i = 0; i < CIM_ProcessIndication.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AGENTADDRESS)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENTERPRISE)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GENERICTRAP)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPECIFICTRAP)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMESTAMP)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VARBINDNAMES)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VARBINDSYNTAXES)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VARBINDVALUES)){
				continue;
			}
			
			CIM_SNMPTrapIndication.CIM_PropertyNameList.add(CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AGENTADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENTERPRISE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GENERICTRAP, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPECIFICTRAP, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VARBINDNAMES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VARBINDSYNTAXES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VARBINDVALUES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_ProcessIndication.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AGENTADDRESS)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENTERPRISE)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GENERICTRAP)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPECIFICTRAP)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMESTAMP)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VARBINDNAMES)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VARBINDSYNTAXES)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VARBINDVALUES)){
				continue;
			}
			
			CIM_SNMPTrapIndication.CIM_PropertyList.add(CIM_ProcessIndication.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ProcessIndication.Java_Package_List.size(); i++) {
			if (((String)CIM_ProcessIndication.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProcessIndication.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_GENERICTRAP = {"Cold Start","Warm Start","Link Down","Link Up","Authentication Failure","EGP Neighbor Loss","Enterprise Specific"};
	public final static String[] CIM_VALUEMAP_VARBINDSYNTAXES = {"Integer","OctetString","ObjectIdentifier","NetworkAddress","Counter","Gauge","TimeTicks","Opaque"};
	
	
	public final static int GENERICTRAP_COLDSTART = 0;
	public final static int GENERICTRAP_WARMSTART = 1;
	public final static int GENERICTRAP_LINKDOWN = 2;
	public final static int GENERICTRAP_LINKUP = 3;
	public final static int GENERICTRAP_AUTHENTICATIONFAILURE = 4;
	public final static int GENERICTRAP_EGPNEIGHBORLOSS = 5;
	public final static int GENERICTRAP_ENTERPRISESPECIFIC = 6;
	
	public final static int VARBINDSYNTAXES_INTEGER = 1;
	public final static int VARBINDSYNTAXES_OCTETSTRING = 2;
	public final static int VARBINDSYNTAXES_OBJECTIDENTIFIER = 3;
	public final static int VARBINDSYNTAXES_NETWORKADDRESS = 4;
	public final static int VARBINDSYNTAXES_COUNTER = 5;
	public final static int VARBINDSYNTAXES_GAUGE = 6;
	public final static int VARBINDSYNTAXES_TIMETICKS = 7;
	public final static int VARBINDSYNTAXES_OPAQUE = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SNMPTrapIndication() {

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
	public CIM_SNMPTrapIndication(Vector keyProperties){ 
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
	public CIM_SNMPTrapIndication(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SNMPTrapIndication)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SNMPTrapIndication)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SNMPTrapIndication)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SNMPTrapIndication)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SNMPTrapIndication)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SNMPTrapIndication)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SNMPTrapIndication)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SNMPTrapIndication)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SNMPTrapIndication)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SNMPTrapIndication)object).cimObjectPath)) {
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
	
	// Attribute AgentAddress
	
	public String get_AgentAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AgentAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_AgentAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_AGENTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Enterprise
	
	public String get_Enterprise() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Enterprise(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_Enterprise(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_ENTERPRISE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GenericTrap
	
	public UnsignedInt16 get_GenericTrap() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GenericTrap(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_GenericTrap(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_GENERICTRAP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpecificTrap
	
	public UnsignedInt32 get_SpecificTrap() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpecificTrap(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_SpecificTrap(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_SPECIFICTRAP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeStamp
	
	public Calendar get_TimeStamp() {

		CIMProperty property = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeStamp(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_TimeStamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_TIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute VarBindNames
	
	public String[] get_VarBindNames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_VarBindNames(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_VarBindNames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDNAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VarBindSyntaxes
	
	public UnsignedInt16[] get_VarBindSyntaxes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_VarBindSyntaxes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_VarBindSyntaxes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDSYNTAXES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VarBindValues
	
	public String[] get_VarBindValues() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_VarBindValues(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES + " could not be found");
    		
		} else if (!CIM_SNMPTrapIndicationHelper.isValid_VarBindValues(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapIndication.CIM_PROPERTY_VARBINDVALUES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
