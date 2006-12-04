/** 
 * CIM_TokenRingPortStatistics.java
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
 * Description: The TokenRingPortStatistics class describes the statistics for the TokenRingPort.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_TokenRingPortStatistics extends CIM_NetworkPortStatistics  {
	
	public final static String CIM_CLASS_NAME = "CIM_TokenRingPortStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
	*/
	public final static String CIM_PROPERTY_ACERRORS = "ACErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station transmits an abort delimiter while transmitting data.
	*/
	public final static String CIM_PROPERTY_ABORTTRANSERRORS = "AbortTransErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
	*/
	public final static String CIM_PROPERTY_BURSTERRORS = "BurstErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
	*/
	public final static String CIM_PROPERTY_FRAMECOPIEDERRORS = "FrameCopiedErrors"; //$NON-NLS-1$
	/**
	*	The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
	*/
	public final static String CIM_PROPERTY_FREQUENCYERRORS = "FrequencyErrors"; //$NON-NLS-1$
	/**
	*	The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
	*/
	public final static String CIM_PROPERTY_HARDERRORS = "HardErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station recognizes an internal error.
	*/
	public final static String CIM_PROPERTY_INTERNALERRORS = "InternalErrors"; //$NON-NLS-1$
	/**
	*	The number of times the Device has detected an open or short circuit in the lobe data path. The port will be closed and RingState will signify this condition.
	*/
	public final static String CIM_PROPERTY_LOBEWIRES = "LobeWires"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
	*/
	public final static String CIM_PROPERTY_LOSTFRAMEERRORS = "LostFrameErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
	*/
	public final static String CIM_PROPERTY_RECEIVECONGESTIONS = "ReceiveCongestions"; //$NON-NLS-1$
	/**
	*	The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
	*/
	public final static String CIM_PROPERTY_RECOVERYS = "Recoverys"; //$NON-NLS-1$
	/**
	*	The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
	*/
	public final static String CIM_PROPERTY_REMOVES = "Removes"; //$NON-NLS-1$
	/**
	*	The number of times this Device has detected the loss of signal condition from the ring.
	*/
	public final static String CIM_PROPERTY_SIGNALLOSSCOUNT = "SignalLossCount"; //$NON-NLS-1$
	/**
	*	The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
	*/
	public final static String CIM_PROPERTY_SINGLES = "Singles"; //$NON-NLS-1$
	/**
	*	The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
	*/
	public final static String CIM_PROPERTY_SOFTERRORS = "SoftErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
	*/
	public final static String CIM_PROPERTY_TOKENERRORS = "TokenErrors"; //$NON-NLS-1$
	/**
	*	The number of times this Device has transmitted a beacon frame.
	*/
	public final static String CIM_PROPERTY_TRANSMITTEDBEACONS = "TransmittedBeacons"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ABORTTRANSERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BURSTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMECOPIEDERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREQUENCYERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HARDERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNALERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOBEWIRES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOSTFRAMEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVECONGESTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVERYS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOVES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNALLOSSCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SINGLES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOFTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOKENERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITTEDBEACONS);
				
		for (int i = 0; i < CIM_NetworkPortStatistics.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ABORTTRANSERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BURSTERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMECOPIEDERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREQUENCYERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HARDERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNALERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOBEWIRES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOSTFRAMEERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVECONGESTIONS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVERYS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOVES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNALLOSSCOUNT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SINGLES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOFTERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOKENERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITTEDBEACONS)){
				continue;
			}
			
			CIM_TokenRingPortStatistics.CIM_PropertyNameList.add(CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ABORTTRANSERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BURSTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMECOPIEDERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREQUENCYERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HARDERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNALERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOBEWIRES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOSTFRAMEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVECONGESTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVERYS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOVES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNALLOSSCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SINGLES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOFTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOKENERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITTEDBEACONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_NetworkPortStatistics.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ABORTTRANSERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BURSTERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMECOPIEDERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREQUENCYERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HARDERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNALERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOBEWIRES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOSTFRAMEERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVECONGESTIONS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVERYS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOVES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNALLOSSCOUNT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SINGLES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOFTERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOKENERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITTEDBEACONS)){
				continue;
			}
			
			CIM_TokenRingPortStatistics.CIM_PropertyList.add(CIM_NetworkPortStatistics.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_NetworkPortStatistics.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkPortStatistics.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
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
	public CIM_TokenRingPortStatistics() {

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
	public CIM_TokenRingPortStatistics(Vector keyProperties){ 
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
	public CIM_TokenRingPortStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_TokenRingPortStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_TokenRingPortStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_TokenRingPortStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_TokenRingPortStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_TokenRingPortStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_TokenRingPortStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_TokenRingPortStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_TokenRingPortStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_TokenRingPortStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_TokenRingPortStatistics)object).cimObjectPath)) {
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
	
	// Attribute ACErrors
	
	public UnsignedInt32 get_ACErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ACErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_ACErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ACERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AbortTransErrors
	
	public UnsignedInt32 get_AbortTransErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AbortTransErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_AbortTransErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_ABORTTRANSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BurstErrors
	
	public UnsignedInt32 get_BurstErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BurstErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_BurstErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_BURSTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrameCopiedErrors
	
	public UnsignedInt32 get_FrameCopiedErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrameCopiedErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_FrameCopiedErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FRAMECOPIEDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrequencyErrors
	
	public UnsignedInt32 get_FrequencyErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrequencyErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_FrequencyErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_FREQUENCYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HardErrors
	
	public UnsignedInt32 get_HardErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HardErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_HardErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_HARDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternalErrors
	
	public UnsignedInt32 get_InternalErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InternalErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_InternalErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_INTERNALERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LobeWires
	
	public UnsignedInt32 get_LobeWires() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LobeWires(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_LobeWires(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOBEWIRES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LostFrameErrors
	
	public UnsignedInt32 get_LostFrameErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LostFrameErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_LostFrameErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_LOSTFRAMEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveCongestions
	
	public UnsignedInt32 get_ReceiveCongestions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveCongestions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_ReceiveCongestions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECEIVECONGESTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Recoverys
	
	public UnsignedInt32 get_Recoverys() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Recoverys(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_Recoverys(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_RECOVERYS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Removes
	
	public UnsignedInt32 get_Removes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Removes(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_Removes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_REMOVES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SignalLossCount
	
	public UnsignedInt32 get_SignalLossCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SignalLossCount(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_SignalLossCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SIGNALLOSSCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Singles
	
	public UnsignedInt32 get_Singles() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Singles(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_Singles(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SINGLES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SoftErrors
	
	public UnsignedInt32 get_SoftErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SoftErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_SoftErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_SOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TokenErrors
	
	public UnsignedInt32 get_TokenErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TokenErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_TokenErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TOKENERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmittedBeacons
	
	public UnsignedInt32 get_TransmittedBeacons() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmittedBeacons(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS + " could not be found");
    		
		} else if (!CIM_TokenRingPortStatisticsHelper.isValid_TransmittedBeacons(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingPortStatistics.CIM_PROPERTY_TRANSMITTEDBEACONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
