/** 
 * CIM_SCSIInterface.java
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
 * Description: The use of this class is deprecated in lieu of ProtocolControllerForUnit, since the SCSIController class involved in this association is itself deprecated. The protocol-related aspects of SCSI are better reflected in the new classes and associations. SCSIInterface is a ControlledBy relationship indicating which Devices are accessed through a SCSIController and the characteristics of this access.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_SCSIInterface extends CIM_ControlledBy  {
	
	public final static String CIM_CLASS_NAME = "CIM_SCSIInterface";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_SCSICONTROLLER = "Antecedent"; //$NON-NLS-1$
	
	
	/**
	*	The SCSI Initiator ID.
	*/
	public final static String CIM_PROPERTY_INITIATORID = "InitiatorId"; //$NON-NLS-1$
	/**
	*	Maximum number of Command Descriptor Blocks (CDBs) that can be supported by the target. This data can not be obtained under all circumstances.
	*/
	public final static String CIM_PROPERTY_MAXQUEUEDEPTH = "MaxQueueDepth"; //$NON-NLS-1$
	/**
	*	The maximum number of concurrent Command Descriptor Blocks (CDBs) that the initiator will send to the target. This value should never be greater than MaxQueueDepth.
	*/
	public final static String CIM_PROPERTY_QUEUEDEPTHLIMIT = "QueueDepthLimit"; //$NON-NLS-1$
	/**
	*	SCSIReservation indicates the type of SCSI reservation that currently exists between the source and destination.
	*/
	public final static String CIM_PROPERTY_SCSIRESERVATION = "SCSIReservation"; //$NON-NLS-1$
	/**
	*	Number of SCSI retries that have occurred since last hard or soft reset related to the controlled Device. The time of last reset is indicated in the TimeOfDeviceReset property, inherited from the ControlledBy association.
	*/
	public final static String CIM_PROPERTY_SCSIRETRIES = "SCSIRetries"; //$NON-NLS-1$
	/**
	*	The SCSI signal characteristics being used for this connection. The value listed here must also be listed in the SCSIController's SignalCapabilities field.
	*/
	public final static String CIM_PROPERTY_SCSISIGNAL = "SCSISignal"; //$NON-NLS-1$
	/**
	*	Number of SCSI timeouts that have occurred since last hard or soft reset related to the controlled Device. The time of last reset is indicated in the TimeOfDeviceReset property, inherited from the ControlledBy association.
	*/
	public final static String CIM_PROPERTY_SCSITIMEOUTS = "SCSITimeouts"; //$NON-NLS-1$
	/**
	*	The SCSI Target ID.
	*/
	public final static String CIM_PROPERTY_TARGETID = "TargetId"; //$NON-NLS-1$
	/**
	*	The SCSI Target LUN.
	*/
	public final static String CIM_PROPERTY_TARGETLUN = "TargetLUN"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIATORID);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXQUEUEDEPTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUEDEPTHLIMIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCSIRESERVATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCSIRETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCSISIGNAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCSITIMEOUTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETID);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETLUN);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SCSICONTROLLER);
				
		for (int i = 0; i < CIM_ControlledBy.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIATORID)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXQUEUEDEPTH)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUEDEPTHLIMIT)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCSIRESERVATION)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCSIRETRIES)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCSISIGNAL)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCSITIMEOUTS)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETID)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETLUN)){
				continue;
			}
			
			CIM_SCSIInterface.CIM_PropertyNameList.add(CIM_ControlledBy.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIATORID, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXQUEUEDEPTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUEDEPTHLIMIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCSIRESERVATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCSIRETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCSISIGNAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCSITIMEOUTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETID, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETLUN, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SCSICONTROLLER, new CIMValue(null, new CIMDataType(CIM_SCSIController.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ControlledBy.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIATORID)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXQUEUEDEPTH)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUEDEPTHLIMIT)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCSIRESERVATION)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCSIRETRIES)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCSISIGNAL)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCSITIMEOUTS)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETID)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETLUN)){
				continue;
			}
			
			CIM_SCSIInterface.CIM_PropertyList.add(CIM_ControlledBy.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ControlledBy.Java_Package_List.size(); i++) {
			if (((String)CIM_ControlledBy.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ControlledBy.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SCSIRESERVATION = {"Unknown","None","Simple","Persistent"};
	public final static String[] CIM_VALUEMAP_SCSISIGNAL = {"Other","Unknown","Single Ended","Differential","Low Voltage Differential","Optical"};
	
	
	public final static int SCSIRESERVATION_UNKNOWN = 0;
	public final static int SCSIRESERVATION_NONE = 1;
	public final static int SCSIRESERVATION_SIMPLE = 2;
	public final static int SCSIRESERVATION_PERSISTENT = 3;
	
	public final static int SCSISIGNAL_OTHER = 1;
	public final static int SCSISIGNAL_UNKNOWN = 2;
	public final static int SCSISIGNAL_SINGLEENDED = 3;
	public final static int SCSISIGNAL_DIFFERENTIAL = 4;
	public final static int SCSISIGNAL_LOWVOLTAGEDIFFERENTIAL = 5;
	public final static int SCSISIGNAL_OPTICAL = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SCSIInterface() {

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
	public CIM_SCSIInterface(Vector keyProperties){ 
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
	public CIM_SCSIInterface(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SCSIInterface)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SCSIInterface)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SCSIInterface)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SCSIInterface)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SCSIInterface)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SCSIInterface)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SCSIInterface)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SCSIInterface)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SCSIInterface)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SCSIInterface)object).cimObjectPath)) {
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
	
	// Attribute InitiatorId
	
	public UnsignedInt32 get_InitiatorId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_INITIATORID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_INITIATORID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_INITIATORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitiatorId(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_INITIATORID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_INITIATORID + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_InitiatorId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_INITIATORID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_INITIATORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxQueueDepth
	
	public UnsignedInt32 get_MaxQueueDepth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxQueueDepth(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_MaxQueueDepth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_MAXQUEUEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueDepthLimit
	
	public UnsignedInt32 get_QueueDepthLimit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueDepthLimit(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_QueueDepthLimit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_QUEUEDEPTHLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SCSIReservation
	
	public UnsignedInt16 get_SCSIReservation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SCSIReservation(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_SCSIReservation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRESERVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SCSIRetries
	
	public UnsignedInt32 get_SCSIRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SCSIRetries(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_SCSIRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSIRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SCSISignal
	
	public UnsignedInt16 get_SCSISignal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SCSISignal(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_SCSISignal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSISIGNAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SCSITimeouts
	
	public UnsignedInt32 get_SCSITimeouts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SCSITimeouts(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_SCSITimeouts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_SCSITIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetId
	
	public UnsignedInt32 get_TargetId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_TARGETID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TargetId(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_TARGETID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETID + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_TargetId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetLUN
	
	public UnsignedInt64 get_TargetLUN() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TargetLUN(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_TargetLUN(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_TARGETLUN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SCSIController
	
	public CIMObjectPath get_CIM_SCSIController() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SCSIController.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER + " is not of expected type CIM_SCSIController.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SCSIController(CIM_SCSIController newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER + " could not be found");
    		
		} else if (!CIM_SCSIInterfaceHelper.isValid_CIM_SCSIController(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SCSIController.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIInterface.CIM_PROPERTY_CIM_SCSICONTROLLER + " is not of expected type CIM_SCSIController.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SCSIController.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
