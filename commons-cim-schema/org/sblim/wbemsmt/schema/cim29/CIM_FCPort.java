/** 
 * CIM_FCPort.java
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
 * Description: Capabilities and management of a Fibre Channel Port Device.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_FCPort extends CIM_NetworkPort  {
	
	public final static String CIM_CLASS_NAME = "CIM_FCPort";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.1";
	
	
	/**
	*	An array of integers indicating the Classes of Service that are active. The Active COS is indicated in ActiveCOS.
	*/
	public final static String CIM_PROPERTY_ACTIVECOS = "ActiveCOS"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the Fibre Channel FC-4 protocols currently running. A list of all protocols supported is indicated in the SupportedFC4Types property.
	*/
	public final static String CIM_PROPERTY_ACTIVEFC4TYPES = "ActiveFC4Types"; //$NON-NLS-1$
	/**
	*	The specific mode currently enabled for the Port. The values: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F" = Fabric (element) Port, "FL" = Fabric (element) Port supporting FC arbitrated loop, "B" = Bridge and "G" = Generic Port. PortTypes are defined in the ANSI X3 standards. When set to 1 ("Other"), the related property OtherPortType contains a string description of the port's type.
	*/
	public final static String CIM_PROPERTY_PORTTYPE = "PortType"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the Fibre Channel Classes of Service that are supported. The active COS are indicated in ActiveCOS.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDCOS = "SupportedCOS"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the Fibre Channel FC-4 protocols supported. The protocols that are active and running are indicated in the ActiveFC4Types property.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDFC4TYPES = "SupportedFC4Types"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVECOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVEFC4TYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDCOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDFC4TYPES);
				
		for (int i = 0; i < CIM_NetworkPort.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVECOS)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVEFC4TYPES)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTTYPE)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDCOS)||
				((String)CIM_NetworkPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDFC4TYPES)){
				continue;
			}
			
			CIM_FCPort.CIM_PropertyNameList.add(CIM_NetworkPort.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVECOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVEFC4TYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDCOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDFC4TYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_NetworkPort.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVECOS)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVEFC4TYPES)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTTYPE)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDCOS)||
				((CIMProperty)CIM_NetworkPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDFC4TYPES)){
				continue;
			}
			
			CIM_FCPort.CIM_PropertyList.add(CIM_NetworkPort.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_NetworkPort.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkPort.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_NetworkPort.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACTIVECOS = {"Unknown","1","2","3","4","5","6","F"};
	public final static String[] CIM_VALUEMAP_ACTIVEFC4TYPES = {"Unknown","Other","ISO/IEC 8802 - 2 LLC","IP over FC","SCSI - FCP","SCSI - GPP","IPI - 3 Master","IPI - 3 Slave","IPI - 3 Peer","CP IPI - 3 Master","CP IPI - 3 Slave","CP IPI - 3 Peer","SBCCS Channel","SBCCS Control Unit","FC-SB-2 Channel","FC-SB-2 Control Unit","Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)","FC-SW","FC - SNMP","HIPPI - FP","BBL Control","BBL FDDI Encapsulated LAN PDU","BBL 802.3 Encapsulated LAN PDU","FC - VI","FC - AV","Vendor Unique"};
	public final static String[] CIM_VALUEMAP_PORTTYPE = {"Unknown","Other","N","NL","F/NL","Nx","E","F","FL","B","G","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDCOS = {"Unknown","1","2","3","4","5","6","F"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDFC4TYPES = {"Unknown","Other","ISO/IEC 8802 - 2 LLC","IP over FC","SCSI - FCP","SCSI - GPP","IPI - 3 Master","IPI - 3 Slave","IPI - 3 Peer","CP IPI - 3 Master","CP IPI - 3 Slave","CP IPI - 3 Peer","SBCCS Channel","SBCCS Control Unit","FC-SB-2 Channel","FC-SB-2 Control Unit","Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)","FC-SW","FC - SNMP","HIPPI - FP","BBL Control","BBL FDDI Encapsulated LAN PDU","BBL 802.3 Encapsulated LAN PDU","FC - VI","FC - AV","Vendor Unique"};
	
	
	public final static int ACTIVECOS_UNKNOWN = 0;
	public final static int ACTIVECOS_1 = 1;
	public final static int ACTIVECOS_2 = 2;
	public final static int ACTIVECOS_3 = 3;
	public final static int ACTIVECOS_4 = 4;
	public final static int ACTIVECOS_5 = 5;
	public final static int ACTIVECOS_6 = 6;
	public final static int ACTIVECOS_F = 7;
	
	public final static int ACTIVEFC4TYPES_UNKNOWN = 0;
	public final static int ACTIVEFC4TYPES_OTHER = 1;
	public final static int ACTIVEFC4TYPES_ISO_IEC8802_2LLC = 4;
	public final static int ACTIVEFC4TYPES_IPOVERFC = 5;
	public final static int ACTIVEFC4TYPES_SCSI_FCP = 8;
	public final static int ACTIVEFC4TYPES_SCSI_GPP = 9;
	public final static int ACTIVEFC4TYPES_IPI_3MASTER = 17;
	public final static int ACTIVEFC4TYPES_IPI_3SLAVE = 18;
	public final static int ACTIVEFC4TYPES_IPI_3PEER = 19;
	public final static int ACTIVEFC4TYPES_CPIPI_3MASTER = 21;
	public final static int ACTIVEFC4TYPES_CPIPI_3SLAVE = 22;
	public final static int ACTIVEFC4TYPES_CPIPI_3PEER = 23;
	public final static int ACTIVEFC4TYPES_SBCCSCHANNEL = 25;
	public final static int ACTIVEFC4TYPES_SBCCSCONTROLUNIT = 26;
	public final static int ACTIVEFC4TYPES_FC_SB_2CHANNEL = 27;
	public final static int ACTIVEFC4TYPES_FC_SB_2CONTROLUNIT = 28;
	public final static int ACTIVEFC4TYPES_FIBRECHANNELSERVICESFC_GS_FC_GS_2_FC_GS_3 = 32;
	public final static int ACTIVEFC4TYPES_FC_SW = 34;
	public final static int ACTIVEFC4TYPES_FC_SNMP = 36;
	public final static int ACTIVEFC4TYPES_HIPPI_FP = 64;
	public final static int ACTIVEFC4TYPES_BBLCONTROL = 80;
	public final static int ACTIVEFC4TYPES_BBLFDDIENCAPSULATEDLANPDU = 81;
	public final static int ACTIVEFC4TYPES_BBL802_3ENCAPSULATEDLANPDU = 82;
	public final static int ACTIVEFC4TYPES_FC_VI = 88;
	public final static int ACTIVEFC4TYPES_FC_AV = 96;
	public final static int ACTIVEFC4TYPES_VENDORUNIQUE = 255;
	
	public final static String PORTTYPE_UNKNOWN = "0";
	public final static String PORTTYPE_OTHER = "1";
	public final static String PORTTYPE_N = "10";
	public final static String PORTTYPE_NL = "11";
	public final static String PORTTYPE_F_NL = "12";
	public final static String PORTTYPE_NX = "13";
	public final static String PORTTYPE_E = "14";
	public final static String PORTTYPE_F = "15";
	public final static String PORTTYPE_FL = "16";
	public final static String PORTTYPE_B = "17";
	public final static String PORTTYPE_G = "18";
	public final static String PORTTYPE_VENDORRESERVED = "16000..65535";
	
	public final static int SUPPORTEDCOS_UNKNOWN = 0;
	public final static int SUPPORTEDCOS_1 = 1;
	public final static int SUPPORTEDCOS_2 = 2;
	public final static int SUPPORTEDCOS_3 = 3;
	public final static int SUPPORTEDCOS_4 = 4;
	public final static int SUPPORTEDCOS_5 = 5;
	public final static int SUPPORTEDCOS_6 = 6;
	public final static int SUPPORTEDCOS_F = 7;
	
	public final static int SUPPORTEDFC4TYPES_UNKNOWN = 0;
	public final static int SUPPORTEDFC4TYPES_OTHER = 1;
	public final static int SUPPORTEDFC4TYPES_ISO_IEC8802_2LLC = 4;
	public final static int SUPPORTEDFC4TYPES_IPOVERFC = 5;
	public final static int SUPPORTEDFC4TYPES_SCSI_FCP = 8;
	public final static int SUPPORTEDFC4TYPES_SCSI_GPP = 9;
	public final static int SUPPORTEDFC4TYPES_IPI_3MASTER = 17;
	public final static int SUPPORTEDFC4TYPES_IPI_3SLAVE = 18;
	public final static int SUPPORTEDFC4TYPES_IPI_3PEER = 19;
	public final static int SUPPORTEDFC4TYPES_CPIPI_3MASTER = 21;
	public final static int SUPPORTEDFC4TYPES_CPIPI_3SLAVE = 22;
	public final static int SUPPORTEDFC4TYPES_CPIPI_3PEER = 23;
	public final static int SUPPORTEDFC4TYPES_SBCCSCHANNEL = 25;
	public final static int SUPPORTEDFC4TYPES_SBCCSCONTROLUNIT = 26;
	public final static int SUPPORTEDFC4TYPES_FC_SB_2CHANNEL = 27;
	public final static int SUPPORTEDFC4TYPES_FC_SB_2CONTROLUNIT = 28;
	public final static int SUPPORTEDFC4TYPES_FIBRECHANNELSERVICESFC_GS_FC_GS_2_FC_GS_3 = 32;
	public final static int SUPPORTEDFC4TYPES_FC_SW = 34;
	public final static int SUPPORTEDFC4TYPES_FC_SNMP = 36;
	public final static int SUPPORTEDFC4TYPES_HIPPI_FP = 64;
	public final static int SUPPORTEDFC4TYPES_BBLCONTROL = 80;
	public final static int SUPPORTEDFC4TYPES_BBLFDDIENCAPSULATEDLANPDU = 81;
	public final static int SUPPORTEDFC4TYPES_BBL802_3ENCAPSULATEDLANPDU = 82;
	public final static int SUPPORTEDFC4TYPES_FC_VI = 88;
	public final static int SUPPORTEDFC4TYPES_FC_AV = 96;
	public final static int SUPPORTEDFC4TYPES_VENDORUNIQUE = 255;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FCPort() {

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
	public CIM_FCPort(Vector keyProperties){ 
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
	public CIM_FCPort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FCPort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FCPort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FCPort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FCPort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FCPort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FCPort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FCPort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FCPort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FCPort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FCPort)object).cimObjectPath)) {
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
	
	// Attribute ActiveCOS
	
	public UnsignedInt16[] get_ActiveCOS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_ACTIVECOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVECOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVECOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ActiveCOS(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_ACTIVECOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVECOS + " could not be found");
    		
		} else if (!CIM_FCPortHelper.isValid_ActiveCOS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPort.CIM_PROPERTY_ACTIVECOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVECOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ActiveFC4Types
	
	public UnsignedInt16[] get_ActiveFC4Types() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ActiveFC4Types(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES + " could not be found");
    		
		} else if (!CIM_FCPortHelper.isValid_ActiveFC4Types(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_ACTIVEFC4TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortType
	
	public UnsignedInt16 get_PortType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_PORTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_PORTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_PORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_PORTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_PORTTYPE + " could not be found");
    		
		} else if (!CIM_FCPortHelper.isValid_PortType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPort.CIM_PROPERTY_PORTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_PORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedCOS
	
	public UnsignedInt16[] get_SupportedCOS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedCOS(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS + " could not be found");
    		
		} else if (!CIM_FCPortHelper.isValid_SupportedCOS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDCOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedFC4Types
	
	public UnsignedInt16[] get_SupportedFC4Types() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedFC4Types(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES + " could not be found");
    		
		} else if (!CIM_FCPortHelper.isValid_SupportedFC4Types(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPort.CIM_PROPERTY_SUPPORTEDFC4TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
