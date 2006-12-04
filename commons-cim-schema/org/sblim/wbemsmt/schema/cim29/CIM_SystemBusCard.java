/** 
 * CIM_SystemBusCard.java
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
 * Description: The SystemBusCard class represents additional information for a CIM_Card, detailing the Card's bus type and data width. These properties dictate the type of Slot into which the Card can be inserted. For example, using the properties of this class, one can define that a Card is a PCI, 64 bit adapter.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_SystemBusCard extends CIM_Card  {
	
	public final static String CIM_CLASS_NAME = "CIM_SystemBusCard";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	An enumerated integer describing the System bus type for this Card. It indicates the type of Slot into which the Card can plug. The list of permissible values aligns with the System bus types in CIM_PhysicalConnector.Connector Type.
	*/
	public final static String CIM_PROPERTY_BUSTYPE = "BusType"; //$NON-NLS-1$
	/**
	*	System bus width (in bits) required by this Card. If 'unknown', enter 0. If 'other' than the values, 8, 16, 32, 64 or 128, enter 1. The list of permissible values aligns with the data in CIM_Slot.MaxBusWidth.
	*/
	public final static String CIM_PROPERTY_BUSWIDTH = "BusWidth"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BUSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_BUSWIDTH);
				
		for (int i = 0; i < CIM_Card.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Card.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUSTYPE)||
				((String)CIM_Card.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUSWIDTH)){
				continue;
			}
			
			CIM_SystemBusCard.CIM_PropertyNameList.add(CIM_Card.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUSWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Card.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Card.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUSTYPE)||
				((CIMProperty)CIM_Card.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUSWIDTH)){
				continue;
			}
			
			CIM_SystemBusCard.CIM_PropertyList.add(CIM_Card.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Card.Java_Package_List.size(); i++) {
			if (((String)CIM_Card.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Card.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_BUSTYPE = {"PCI","ISA","EISA","VESA","PCMCIA","PCMCIA Type I","PCMCIA Type II","PCMCIA Type III","CardBus","Access.bus","NuBus","AGP","VME Bus","VME64","Proprietary","Proprietary Processor Card Slot","Proprietary Memory Card Slot","Proprietary I/O Riser Slot","PCI-66MHZ","AGP2X","AGP4X","PC-98","PC-98-Hireso","PC-H98","PC-98Note","PC-98Full","PCI-X","Sbus IEEE 1396-1993 32 bit","Sbus IEEE 1396-1993 64 bit","MCA","GIO","XIO","HIO","NGIO","PMC","Future I/O","InfiniBand","AGP8X","PCI-E"};
	public final static String[] CIM_VALUEMAP_BUSWIDTH = {"Value0","Value1","Value2","Value3","Value4","Value5","Value6"};
	
	
	public final static int BUSTYPE_PCI = 43;
	public final static int BUSTYPE_ISA = 44;
	public final static int BUSTYPE_EISA = 45;
	public final static int BUSTYPE_VESA = 46;
	public final static int BUSTYPE_PCMCIA = 47;
	public final static int BUSTYPE_PCMCIATYPEI = 48;
	public final static int BUSTYPE_PCMCIATYPEII = 49;
	public final static int BUSTYPE_PCMCIATYPEIII = 50;
	public final static int BUSTYPE_CARDBUS = 52;
	public final static int BUSTYPE_ACCESS_BUS = 64;
	public final static int BUSTYPE_NUBUS = 65;
	public final static int BUSTYPE_AGP = 73;
	public final static int BUSTYPE_VMEBUS = 74;
	public final static int BUSTYPE_VME64 = 75;
	public final static int BUSTYPE_PROPRIETARY = 76;
	public final static int BUSTYPE_PROPRIETARYPROCESSORCARDSLOT = 77;
	public final static int BUSTYPE_PROPRIETARYMEMORYCARDSLOT = 78;
	public final static int BUSTYPE_PROPRIETARYI_ORISERSLOT = 79;
	public final static int BUSTYPE_PCI_66MHZ = 80;
	public final static int BUSTYPE_AGP2X = 81;
	public final static int BUSTYPE_AGP4X = 82;
	public final static int BUSTYPE_PC_98 = 83;
	public final static int BUSTYPE_PC_98_HIRESO = 84;
	public final static int BUSTYPE_PC_H98 = 85;
	public final static int BUSTYPE_PC_98NOTE = 86;
	public final static int BUSTYPE_PC_98FULL = 87;
	public final static int BUSTYPE_PCI_X = 98;
	public final static int BUSTYPE_SBUSIEEE1396_199332BIT = 99;
	public final static int BUSTYPE_SBUSIEEE1396_199364BIT = 100;
	public final static int BUSTYPE_MCA = 101;
	public final static int BUSTYPE_GIO = 102;
	public final static int BUSTYPE_XIO = 103;
	public final static int BUSTYPE_HIO = 104;
	public final static int BUSTYPE_NGIO = 105;
	public final static int BUSTYPE_PMC = 106;
	public final static int BUSTYPE_FUTUREI_O = 109;
	public final static int BUSTYPE_INFINIBAND = 110;
	public final static int BUSTYPE_AGP8X = 111;
	public final static int BUSTYPE_PCI_E = 112;
	
	public final static int BUSWIDTH_VALUE0 = 0;
	public final static int BUSWIDTH_VALUE1 = 1;
	public final static int BUSWIDTH_VALUE2 = 8;
	public final static int BUSWIDTH_VALUE3 = 16;
	public final static int BUSWIDTH_VALUE4 = 32;
	public final static int BUSWIDTH_VALUE5 = 64;
	public final static int BUSWIDTH_VALUE6 = 128;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SystemBusCard() {

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
	public CIM_SystemBusCard(Vector keyProperties){ 
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
	public CIM_SystemBusCard(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SystemBusCard)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SystemBusCard)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SystemBusCard)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SystemBusCard)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SystemBusCard)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SystemBusCard)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SystemBusCard)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SystemBusCard)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SystemBusCard)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SystemBusCard)object).cimObjectPath)) {
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
	
	// Attribute BusType
	
	public UnsignedInt16 get_BusType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BusType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE + " could not be found");
    		
		} else if (!CIM_SystemBusCardHelper.isValid_BusType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BusWidth
	
	public UnsignedInt16 get_BusWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BusWidth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH + " could not be found");
    		
		} else if (!CIM_SystemBusCardHelper.isValid_BusWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SystemBusCard.CIM_PROPERTY_BUSWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
