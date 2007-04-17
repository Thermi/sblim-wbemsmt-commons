/** 
 * CIM_EthernetPortStatistics.java
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
 * Description:  The EthernetPortStatistics class describes the statistics for the EthernetPort.
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
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  The EthernetPortStatistics class describes the statistics for the EthernetPort.
 */
public class CIM_EthernetPortStatistics extends CIM_NetworkPortStatistics  {
	
	public final static String CIM_CLASS_NAME = "CIM_EthernetPortStatistics"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	The number of frames that are received on a particular interface that are not an integral number of octets in length and do not pass the FCS check. The count represented by an instance of this object is incremented when the alignment error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	*/
	public final static String CIM_PROPERTY_ALIGNMENTERRORS = "AlignmentErrors"; //$NON-NLS-1$
	/**
	*	The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object can be incremented only once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
	*/
	public final static String CIM_PROPERTY_CARRIERSENSEERRORS = "CarrierSenseErrors"; //$NON-NLS-1$
	/**
	*	The number of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include frames involved in collisions.
	*/
	public final static String CIM_PROPERTY_DEFERREDTRANSMISSIONS = "DeferredTransmissions"; //$NON-NLS-1$
	/**
	*	The number of frames for which transmission on a particular interface fails due to excessive collisions.
	*/
	public final static String CIM_PROPERTY_EXCESSIVECOLLISIONS = "ExcessiveCollisions"; //$NON-NLS-1$
	/**
	*	The number of frames that are received on a particular interface that are an integral number of octets in length, but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame check error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of the error status presented to the LLC.
	*/
	public final static String CIM_PROPERTY_FCSERRORS = "FCSErrors"; //$NON-NLS-1$
	/**
	*	The number of frames received on a particular interface that exceed the maximum permitted frame size. The count represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	*/
	public final static String CIM_PROPERTY_FRAMETOOLONGS = "FrameTooLongs"; //$NON-NLS-1$
	/**
	*	The number of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of either the FrameTooLongs property, the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count that is represented by an instance of this object is implementation-specific. For example, an instance of this object can represent a count of receive errors on a particular interface that are not otherwise counted.
	*/
	public final static String CIM_PROPERTY_INTERNALMACRECEIVEERRORS = "InternalMACReceiveErrors"; //$NON-NLS-1$
	/**
	*	The number of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of either the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count that is represented by an instance of this object is implementation-specific. In particular, an instance of this object can represent a count of transmission errors on a particular interface that are not otherwise counted.
	*/
	public final static String CIM_PROPERTY_INTERNALMACTRANSMITERRORS = "InternalMACTransmitErrors"; //$NON-NLS-1$
	/**
	*	The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit- times corresponds to 51.2 microseconds on a 10 Mbit/s system. A (late) collision included in a count represented by an instance of this object is also considered as a (generic) collision for purposes of other collision-related statistics.
	*/
	public final static String CIM_PROPERTY_LATECOLLISIONS = "LateCollisions"; //$NON-NLS-1$
	/**
	*	The number of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
	*/
	public final static String CIM_PROPERTY_MULTIPLECOLLISIONFRAMES = "MultipleCollisionFrames"; //$NON-NLS-1$
	/**
	*	The total number of packets that are received.
	*/
	public final static String CIM_PROPERTY_PACKETSRECEIVED = "PacketsReceived"; //$NON-NLS-1$
	/**
	*	The total number of packets that are transmitted.
	*/
	public final static String CIM_PROPERTY_PACKETSTRANSMITTED = "PacketsTransmitted"; //$NON-NLS-1$
	/**
	*	The number of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
	*/
	public final static String CIM_PROPERTY_SQETESTERRORS = "SQETestErrors"; //$NON-NLS-1$
	/**
	*	The number of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
	*/
	public final static String CIM_PROPERTY_SINGLECOLLISIONFRAMES = "SingleCollisionFrames"; //$NON-NLS-1$
	/**
	*	The number of times that there was an invalid data symbol when a valid carrier was present. The count can be incremented only once per carrier event, even if multiple symbol errors occur during the carrier event.
	*/
	public final static String CIM_PROPERTY_SYMBOLERRORS = "SymbolErrors"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALIGNMENTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CARRIERSENSEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFERREDTRANSMISSIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXCESSIVECOLLISIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FCSERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMETOOLONGS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LATECOLLISIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKETSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKETSTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SQETESTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SINGLECOLLISIONFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYMBOLERRORS);
				
		for (int i = 0; i < CIM_NetworkPortStatistics.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALIGNMENTERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CARRIERSENSEERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFERREDTRANSMISSIONS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXCESSIVECOLLISIONS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FCSERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMETOOLONGS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNALMACRECEIVEERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNALMACTRANSMITERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LATECOLLISIONS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKETSRECEIVED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKETSTRANSMITTED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SQETESTERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SINGLECOLLISIONFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYMBOLERRORS)){
				continue;
			}
			
			CIM_EthernetPortStatistics.CIM_PropertyNameList.add(CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALIGNMENTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CARRIERSENSEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFERREDTRANSMISSIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXCESSIVECOLLISIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FCSERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMETOOLONGS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNALMACRECEIVEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNALMACTRANSMITERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LATECOLLISIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKETSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKETSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SQETESTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SINGLECOLLISIONFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYMBOLERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_NetworkPortStatistics.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALIGNMENTERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CARRIERSENSEERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFERREDTRANSMISSIONS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXCESSIVECOLLISIONS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FCSERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMETOOLONGS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNALMACRECEIVEERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNALMACTRANSMITERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LATECOLLISIONS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKETSRECEIVED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKETSTRANSMITTED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SQETESTERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SINGLECOLLISIONFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYMBOLERRORS)){
				continue;
			}
			
			CIM_EthernetPortStatistics.CIM_PropertyList.add(CIM_NetworkPortStatistics.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_NetworkPortStatistics.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkPortStatistics.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_NetworkPortStatistics.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EthernetPortStatistics() {

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
	public CIM_EthernetPortStatistics(Vector keyProperties){ 
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
	public CIM_EthernetPortStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_EthernetPortStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EthernetPortStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EthernetPortStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EthernetPortStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EthernetPortStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EthernetPortStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EthernetPortStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EthernetPortStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EthernetPortStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EthernetPortStatistics)object).cimObjectPath)) {
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
	
	// Attribute AlignmentErrors
	
	public UnsignedInt32 get_AlignmentErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlignmentErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_AlignmentErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_ALIGNMENTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CarrierSenseErrors
	
	public UnsignedInt32 get_CarrierSenseErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CarrierSenseErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_CarrierSenseErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_CARRIERSENSEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeferredTransmissions
	
	public UnsignedInt32 get_DeferredTransmissions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeferredTransmissions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_DeferredTransmissions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExcessiveCollisions
	
	public UnsignedInt32 get_ExcessiveCollisions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExcessiveCollisions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_ExcessiveCollisions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_EXCESSIVECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FCSErrors
	
	public UnsignedInt32 get_FCSErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FCSErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_FCSErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FCSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrameTooLongs
	
	public UnsignedInt32 get_FrameTooLongs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrameTooLongs(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_FrameTooLongs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_FRAMETOOLONGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternalMACReceiveErrors
	
	public UnsignedInt32 get_InternalMACReceiveErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InternalMACReceiveErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_InternalMACReceiveErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternalMACTransmitErrors
	
	public UnsignedInt32 get_InternalMACTransmitErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InternalMACTransmitErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_InternalMACTransmitErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LateCollisions
	
	public UnsignedInt32 get_LateCollisions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LateCollisions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_LateCollisions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_LATECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MultipleCollisionFrames
	
	public UnsignedInt32 get_MultipleCollisionFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MultipleCollisionFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_MultipleCollisionFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PacketsReceived
	
	public UnsignedInt64 get_PacketsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PacketsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_PacketsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PacketsTransmitted
	
	public UnsignedInt64 get_PacketsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PacketsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_PacketsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SQETestErrors
	
	public UnsignedInt32 get_SQETestErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SQETestErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_SQETestErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SQETESTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SingleCollisionFrames
	
	public UnsignedInt32 get_SingleCollisionFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SingleCollisionFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_SingleCollisionFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SymbolErrors
	
	public UnsignedInt32 get_SymbolErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SymbolErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS + " could not be found");
    		
		} else if (!CIM_EthernetPortStatisticsHelper.isValid_SymbolErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetPortStatistics.CIM_PROPERTY_SYMBOLERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
