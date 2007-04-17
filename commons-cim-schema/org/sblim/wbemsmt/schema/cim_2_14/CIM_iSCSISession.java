/** 
 * CIM_iSCSISession.java
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
 * Description:  iSCSISession is a network pipe between an initiator and target
 * SCSIProtocolEndpoints. An iSCSISession is composed of one or more TCP
 * connections which MUST be selected from a SystemSpecificCollection
 * representing an iSCSI Portal Group. NetworkPipeComposition aggregates
 * NetworkPipe instances representing iSCSI connections, which are associated to
 * TCPProtocolEndpoints. Only an iSCSI initiator can create an iSCSI Session, an
 * iSCSI Target MUST accept (or reject) a session request. EndOfNetworkPipe
 * associates iSCSISession with SCSIProtocolEndpoint.
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
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  iSCSISession is a network pipe between an initiator and target
 * SCSIProtocolEndpoints. An iSCSISession is composed of one or more TCP
 * connections which MUST be selected from a SystemSpecificCollection
 * representing an iSCSI Portal Group. NetworkPipeComposition aggregates
 * NetworkPipe instances representing iSCSI connections, which are associated to
 * TCPProtocolEndpoints. Only an iSCSI initiator can create an iSCSI Session, an
 * iSCSI Target MUST accept (or reject) a session request. EndOfNetworkPipe
 * associates iSCSISession with SCSIProtocolEndpoint.
 */
public class CIM_iSCSISession extends CIM_NetworkPipe  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSISession"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	The number of transport protocol connections that currently belong to this session.
	*/
	public final static String CIM_PROPERTY_CURRENTCONNECTIONS = "CurrentConnections"; //$NON-NLS-1$
	/**
	*	False indicates that iSCSI data PDUs within sequences MAY be in any order. True indicates that data PDUs within sequences MUST be at continuously increasing addresses, with no gaps or overlay between PDUs. Default is true.
	*/
	public final static String CIM_PROPERTY_DATAPDUINORDER = "DataPDUInOrder"; //$NON-NLS-1$
	/**
	*	False indicates that iSCSI data PDU sequences MAY be transferred in any order. True indicates that data PDU sequences MUST be transferred using continuously increasing offsets, except during error recovery.
	*/
	public final static String CIM_PROPERTY_DATASEQUENCEINORDER = "DataSequenceInOrder"; //$NON-NLS-1$
	/**
	*	The DefaultTime2Retain negotiated for this Session. This is the maximum time, in seconds after an initial wait (Time2Wait), before which an active iSCSI task reassignment is still possible after an unexpected connection termination or a connection reset.
	*/
	public final static String CIM_PROPERTY_DEFAULTTIMETORETAIN = "DefaultTimeToRetain"; //$NON-NLS-1$
	/**
	*	The DefaultTime2Wait negotiated for this Session. This is the minimum time, in seconds, to wait before attempting an explicit/implicit logout or active iSCSI task reassignment after an unexpected connection termination or a connection reset.
	*/
	public final static String CIM_PROPERTY_DEFAULTTIMETOWAIT = "DefaultTimeToWait"; //$NON-NLS-1$
	/**
	*	iSCSI sessions MUST be bidirectional.
	*/
	public final static String CIM_PROPERTY_DIRECTIONALITY = "Directionality"; //$NON-NLS-1$
	/**
	*	The iSCSI Port Name (iSCSIProtocolEndPoint.Name), of the device at the other end of this iSCSISession.
	*/
	public final static String CIM_PROPERTY_ENDPOINTNAME = "EndPointName"; //$NON-NLS-1$
	/**
	*	The level of error recovery negotiated between the initiator and the target. Higher numbers represent more detailed recovery schemes.
	*/
	public final static String CIM_PROPERTY_ERRORRECOVERYLEVEL = "ErrorRecoveryLevel"; //$NON-NLS-1$
	/**
	*	Indicates whether the initiator and target have agreed to support immediate data on this session.
	*/
	public final static String CIM_PROPERTY_IMMEDIATEDATA = "ImmediateData"; //$NON-NLS-1$
	/**
	*	If set to true, indicates that the initiator MUST wait for an R2T before sending to the target. If set to false, the initiator MAY send data immediately, within limits set by iscsiSsnFirstBurstLength and the expected data transfer length of the request.
	*/
	public final static String CIM_PROPERTY_INITIALR2T = "InitialR2T"; //$NON-NLS-1$
	/**
	*	The maximum number of connections allowed in this session.
	*/
	public final static String CIM_PROPERTY_MAXCONNECTIONSPERSESSION = "MaxConnectionsPerSession"; //$NON-NLS-1$
	/**
	*	The maximum number of bytes which can be sent within a single sequence of Data-In or Data-Out PDUs.
	*/
	public final static String CIM_PROPERTY_MAXDATABURSTLENGTH = "MaxDataBurstLength"; //$NON-NLS-1$
	/**
	*	The maximum number of outstanding request-to-transmit (R2T)s per iSCSI task within this session.
	*/
	public final static String CIM_PROPERTY_MAXOUTSTANDINGR2T = "MaxOutstandingR2T"; //$NON-NLS-1$
	/**
	*	The maximum length supported for unsolicited data sent within this session.
	*/
	public final static String CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH = "MaxUnsolicitedFirstDataBurstLength"; //$NON-NLS-1$
	/**
	*	iSCSI Session type.
	*/
	public final static String CIM_PROPERTY_SESSIONTYPE = "SessionType"; //$NON-NLS-1$
	/**
	*	The Target Session Identifying Handle (TSIH) for this session.
	*/
	public final static String CIM_PROPERTY_TSIH = "TSIH"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTCONNECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAPDUINORDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATASEQUENCEINORDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTTIMETORETAIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTTIMETOWAIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTIONALITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENDPOINTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORRECOVERYLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_IMMEDIATEDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALR2T);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATABURSTLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXOUTSTANDINGR2T);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_SESSIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TSIH);
				
		for (int i = 0; i < CIM_NetworkPipe.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTCONNECTIONS)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAPDUINORDER)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATASEQUENCEINORDER)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTTIMETORETAIN)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTTIMETOWAIT)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTIONALITY)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENDPOINTNAME)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORRECOVERYLEVEL)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IMMEDIATEDATA)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALR2T)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXCONNECTIONSPERSESSION)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATABURSTLENGTH)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXOUTSTANDINGR2T)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SESSIONTYPE)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TSIH)){
				continue;
			}
			
			CIM_iSCSISession.CIM_PropertyNameList.add(CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTCONNECTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAPDUINORDER, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATASEQUENCEINORDER, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTTIMETORETAIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTTIMETOWAIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTIONALITY, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENDPOINTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORRECOVERYLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IMMEDIATEDATA, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALR2T, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXCONNECTIONSPERSESSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATABURSTLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXOUTSTANDINGR2T, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SESSIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TSIH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_NetworkPipe.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTCONNECTIONS)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAPDUINORDER)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATASEQUENCEINORDER)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTTIMETORETAIN)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTTIMETOWAIT)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTIONALITY)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENDPOINTNAME)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORRECOVERYLEVEL)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IMMEDIATEDATA)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALR2T)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXCONNECTIONSPERSESSION)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATABURSTLENGTH)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXOUTSTANDINGR2T)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SESSIONTYPE)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TSIH)){
				continue;
			}
			
			CIM_iSCSISession.CIM_PropertyList.add(CIM_NetworkPipe.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_NetworkPipe.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkPipe.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_NetworkPipe.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DIRECTIONALITY = {"Bi-Directional"};
	public final static String[] CIM_VALUEMAP_SESSIONTYPE = {"Discovery","Normal"};
	
	
	public final static int DIRECTIONALITY_BI_DIRECTIONAL = 2;
	
	public final static int SESSIONTYPE_DISCOVERY = 2;
	public final static int SESSIONTYPE_NORMAL = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSISession() {

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
	public CIM_iSCSISession(Vector keyProperties){ 
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
	public CIM_iSCSISession(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSISession)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSISession)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSISession)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSISession)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSISession)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSISession)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSISession)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSISession)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSISession)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSISession)object).cimObjectPath)) {
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
	
	// Attribute CurrentConnections
	
	public UnsignedInt32 get_CurrentConnections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentConnections(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_CurrentConnections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_CURRENTCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataPDUInOrder
	
	public Boolean get_DataPDUInOrder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataPDUInOrder(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_DataPDUInOrder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATAPDUINORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataSequenceInOrder
	
	public Boolean get_DataSequenceInOrder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataSequenceInOrder(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_DataSequenceInOrder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DATASEQUENCEINORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultTimeToRetain
	
	public UnsignedInt32 get_DefaultTimeToRetain() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultTimeToRetain(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_DefaultTimeToRetain(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETORETAIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultTimeToWait
	
	public UnsignedInt32 get_DefaultTimeToWait() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultTimeToWait(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_DefaultTimeToWait(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DEFAULTTIMETOWAIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Directionality
	
	public UnsignedInt16 get_Directionality() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Directionality(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_Directionality(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_DIRECTIONALITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EndPointName
	
	public String get_EndPointName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EndPointName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_EndPointName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_ENDPOINTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorRecoveryLevel
	
	public UnsignedInt32 get_ErrorRecoveryLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorRecoveryLevel(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_ErrorRecoveryLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_ERRORRECOVERYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ImmediateData
	
	public Boolean get_ImmediateData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ImmediateData(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_ImmediateData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_IMMEDIATEDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitialR2T
	
	public Boolean get_InitialR2T() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_INITIALR2T);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_INITIALR2T + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_INITIALR2T + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialR2T(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_INITIALR2T);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_INITIALR2T + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_InitialR2T(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_INITIALR2T);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_INITIALR2T + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxConnectionsPerSession
	
	public UnsignedInt32 get_MaxConnectionsPerSession() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxConnectionsPerSession(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_MaxConnectionsPerSession(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataBurstLength
	
	public UnsignedInt32 get_MaxDataBurstLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataBurstLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_MaxDataBurstLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxOutstandingR2T
	
	public UnsignedInt32 get_MaxOutstandingR2T() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxOutstandingR2T(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_MaxOutstandingR2T(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXOUTSTANDINGR2T + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxUnsolicitedFirstDataBurstLength
	
	public UnsignedInt32 get_MaxUnsolicitedFirstDataBurstLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxUnsolicitedFirstDataBurstLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_MaxUnsolicitedFirstDataBurstLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SessionType
	
	public UnsignedInt16 get_SessionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SessionType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_SessionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_SESSIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TSIH
	
	public UnsignedInt32 get_TSIH() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_TSIH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_TSIH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_TSIH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TSIH(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISession.CIM_PROPERTY_TSIH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISession.CIM_PROPERTY_TSIH + " could not be found");
    		
		} else if (!CIM_iSCSISessionHelper.isValid_TSIH(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISession.CIM_PROPERTY_TSIH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISession.CIM_PROPERTY_TSIH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
