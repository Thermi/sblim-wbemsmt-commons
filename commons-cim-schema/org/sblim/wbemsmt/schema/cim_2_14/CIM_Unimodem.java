/** 
 * CIM_Unimodem.java
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
 * Description:  Unimodem is a POTSModem that supports the Unimodem 1.0 Specification.
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
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  Unimodem is a POTSModem that supports the Unimodem 1.0 Specification.
 */
public class CIM_Unimodem extends CIM_POTSModem  {
	
	public final static String CIM_CLASS_NAME = "CIM_Unimodem"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Current call setup result code.
	*/
	public final static String CIM_PROPERTY_CALLSETUPRESULTCODE = "CallSetupResultCode"; //$NON-NLS-1$
	/**
	*	Number of Call waiting events detected for the last or current call.
	*/
	public final static String CIM_PROPERTY_CALLWAITINGEVENTCOUNT = "CallWaitingEventCount"; //$NON-NLS-1$
	/**
	*	Carrier Rate renegotiation event count for the last or current call.
	*/
	public final static String CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT = "CarrierRenegotiationEventCount"; //$NON-NLS-1$
	/**
	*	The number of carrier retrains granted during the current or last call.
	*/
	public final static String CIM_PROPERTY_CARRIERRETRAINSGRANTED = "CarrierRetrainsGranted"; //$NON-NLS-1$
	/**
	*	The number of carrier retrains requested during the current or last call.
	*/
	public final static String CIM_PROPERTY_CARRIERRETRAINSREQUESTED = "CarrierRetrainsRequested"; //$NON-NLS-1$
	/**
	*	Current DTE-DCE interface mode of the Unimodem, such as asynchronous, V.80 transparent, or framed synchronous modes.
	*/
	public final static String CIM_PROPERTY_DTEDCEINTERFACEMODE = "DTEDCEInterfaceMode"; //$NON-NLS-1$
	/**
	*	Error Control frame size in bytes for the last or current call.
	*/
	public final static String CIM_PROPERTY_ERRORCONTROLFRAMESIZE = "ErrorControlFrameSize"; //$NON-NLS-1$
	/**
	*	Error control link NAKs received for the last or current call.
	*/
	public final static String CIM_PROPERTY_ERRORCONTROLLINKNAKS = "ErrorControlLinkNAKs"; //$NON-NLS-1$
	/**
	*	Error control link timeouts in transmission for the last or current call.
	*/
	public final static String CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS = "ErrorControlLinkTimeouts"; //$NON-NLS-1$
	/**
	*	Estimated noise level for the last or current call in -dBm. Values are in the range of 0-100.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDNOISELEVEL = "EstimatedNoiseLevel"; //$NON-NLS-1$
	/**
	*	Final receive carrier data rate of the current or last call, in bits per second.
	*/
	public final static String CIM_PROPERTY_FINALRECEIVECARRIERDATARATE = "FinalReceiveCarrierDataRate"; //$NON-NLS-1$
	/**
	*	Final transmit carrier data rate of the current or last call, in bits per second.
	*/
	public final static String CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE = "FinalTransmitCarrierDataRate"; //$NON-NLS-1$
	/**
	*	Initial receive carrier data rate for the current or last call, in bits per second.
	*/
	public final static String CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE = "InitialReceiveCarrierDataRate"; //$NON-NLS-1$
	/**
	*	Initial transmit carrier data rate for the current or last call, in bits per second.
	*/
	public final static String CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE = "InitialTransmitCarrierDataRate"; //$NON-NLS-1$
	/**
	*	Current multimedia mode of the Unimodem.
	*/
	public final static String CIM_PROPERTY_MULTIMEDIAMODE = "MultiMediaMode"; //$NON-NLS-1$
	/**
	*	Normalized mean squared error for the last or current call.
	*/
	public final static String CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR = "NormalizedMeanSquaredError"; //$NON-NLS-1$
	/**
	*	The active receive modulation scheme.
	*/
	public final static String CIM_PROPERTY_RECEIVECARRIERNEGOTIATION = "ReceiveCarrierNegotiation"; //$NON-NLS-1$
	/**
	*	Number of receive characters lost for the last or current call. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	*/
	public final static String CIM_PROPERTY_RECEIVECHARSLOST = "ReceiveCharsLost"; //$NON-NLS-1$
	/**
	*	Number of receive chars sent to the DTE for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32-bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	*/
	public final static String CIM_PROPERTY_RECEIVECHARSSENTTODTE = "ReceiveCharsSentToDTE"; //$NON-NLS-1$
	/**
	*	The flow control mechanism used in receiving data.
	*/
	public final static String CIM_PROPERTY_RECEIVEFLOWCONTROL = "ReceiveFlowControl"; //$NON-NLS-1$
	/**
	*	Number of I-Frames received for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32-bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	*/
	public final static String CIM_PROPERTY_RECEIVEIFRAMECOUNT = "ReceiveIFrameCount"; //$NON-NLS-1$
	/**
	*	Number of I-Frame errors detected for the last or current call, if error control protocol is running. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	*/
	public final static String CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT = "ReceivedIFrameErrorCount"; //$NON-NLS-1$
	/**
	*	Temporary carrier loss event count for the last or current call.
	*/
	public final static String CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT = "TemporaryCarrierLossEventCount"; //$NON-NLS-1$
	/**
	*	Cause of last call termination.
	*/
	public final static String CIM_PROPERTY_TERMINATIONCAUSE = "TerminationCause"; //$NON-NLS-1$
	/**
	*	The active transmit modulation scheme.
	*/
	public final static String CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION = "TransmitCarrierNegotiation"; //$NON-NLS-1$
	/**
	*	Number of transmit characters lost for the last or current call. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	*/
	public final static String CIM_PROPERTY_TRANSMITCHARSLOST = "TransmitCharsLost"; //$NON-NLS-1$
	/**
	*	Number of transmit chars sent from the DTE for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32-bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	*/
	public final static String CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE = "TransmitCharsSentFromDTE"; //$NON-NLS-1$
	/**
	*	The flow control mechanism used in transmitting data.
	*/
	public final static String CIM_PROPERTY_TRANSMITFLOWCONTROL = "TransmitFlowControl"; //$NON-NLS-1$
	/**
	*	Number of I-Frames transmitted for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32- bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	*/
	public final static String CIM_PROPERTY_TRANSMITIFRAMECOUNT = "TransmitIFrameCount"; //$NON-NLS-1$
	/**
	*	Number of I-Frame errors detected for the last or current call, if error control protocol is running. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	*/
	public final static String CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT = "TransmitIFrameErrorCount"; //$NON-NLS-1$
	/**
	*	Diagnostic Command Specification, Unimodem revision number.
	*/
	public final static String CIM_PROPERTY_UNIMODEMREVISION = "UnimodemRevision"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CALLSETUPRESULTCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CALLWAITINGEVENTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CARRIERRETRAINSGRANTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CARRIERRETRAINSREQUESTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_DTEDCEINTERFACEMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCONTROLFRAMESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCONTROLLINKNAKS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDNOISELEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_FINALRECEIVECARRIERDATARATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTIMEDIAMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVECARRIERNEGOTIATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVECHARSLOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVECHARSSENTTODTE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVEFLOWCONTROL);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVEIFRAMECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TERMINATIONCAUSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITCHARSLOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITFLOWCONTROL);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITIFRAMECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNIMODEMREVISION);
				
		for (int i = 0; i < CIM_POTSModem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CALLSETUPRESULTCODE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CALLWAITINGEVENTCOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CARRIERRETRAINSGRANTED)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CARRIERRETRAINSREQUESTED)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DTEDCEINTERFACEMODE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORCONTROLFRAMESIZE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORCONTROLLINKNAKS)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDNOISELEVEL)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FINALRECEIVECARRIERDATARATE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTIMEDIAMODE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVECARRIERNEGOTIATION)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVECHARSLOST)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVECHARSSENTTODTE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVEFLOWCONTROL)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVEIFRAMECOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TERMINATIONCAUSE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITCHARSLOST)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITFLOWCONTROL)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITIFRAMECOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT)||
				((String)CIM_POTSModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNIMODEMREVISION)){
				continue;
			}
			
			CIM_Unimodem.CIM_PropertyNameList.add(CIM_POTSModem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CALLSETUPRESULTCODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CALLWAITINGEVENTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CARRIERRETRAINSGRANTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CARRIERRETRAINSREQUESTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DTEDCEINTERFACEMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCONTROLFRAMESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCONTROLLINKNAKS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDNOISELEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FINALRECEIVECARRIERDATARATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTIMEDIAMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVECARRIERNEGOTIATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVECHARSLOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVECHARSSENTTODTE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVEFLOWCONTROL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVEIFRAMECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TERMINATIONCAUSE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITCHARSLOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITFLOWCONTROL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITIFRAMECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNIMODEMREVISION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_POTSModem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CALLSETUPRESULTCODE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CALLWAITINGEVENTCOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CARRIERRETRAINSGRANTED)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CARRIERRETRAINSREQUESTED)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DTEDCEINTERFACEMODE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORCONTROLFRAMESIZE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORCONTROLLINKNAKS)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDNOISELEVEL)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FINALRECEIVECARRIERDATARATE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTIMEDIAMODE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVECARRIERNEGOTIATION)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVECHARSLOST)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVECHARSSENTTODTE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVEFLOWCONTROL)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVEIFRAMECOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TERMINATIONCAUSE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITCHARSLOST)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITFLOWCONTROL)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITIFRAMECOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT)||
				((CIMProperty)CIM_POTSModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNIMODEMREVISION)){
				continue;
			}
			
			CIM_Unimodem.CIM_PropertyList.add(CIM_POTSModem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_POTSModem.Java_Package_List.size(); i++) {
			if (((String)CIM_POTSModem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_POTSModem.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CALLSETUPRESULTCODE = {"No Previous Call","No Dial Tone Detected","Reorder Signal Detected, Network Busy","Busy Signal Detected","No Recognized Signal Detected","Voice Detected","Text Telephone Detected","Data Answering Signal Detected","Data Calling Signal Detected","Fax Answering Signal Detected","Fax Calling Signal Detected","V.8bis Signal Detected"};
	public final static String[] CIM_VALUEMAP_DTEDCEINTERFACEMODE = {"Async Data","V.80 Transparent Synchronous Mode","V.80 Framed Synchronous Mode"};
	public final static String[] CIM_VALUEMAP_MULTIMEDIAMODE = {"Data Only","Fax Only","Voice Only","Voice View","ASVD V.61","ASVD V.34Q","DSVD Multi-Tech","DSVD 1.2","DSVD V.70","Video Telephony H.324","Other V.80 Call"};
	public final static String[] CIM_VALUEMAP_RECEIVECARRIERNEGOTIATION = {"V.17 (G3 Fax Call)","V.21","V.22","V.22bis","V.23 Constant Carrier (1200/75)","V.23 Switched Carrier (Half Duplex)","V.26bis","V.26ter","V.27ter (G3 Fax Call)","V.29 HD (G3 Fax Call)","V.32","V.32bis","V.34","V.34 HD (G3 Fax Call)","V.90 Issue 1 (Asymmetric)","V.90 Issue 2 (Symmetric)","Reserved (V.58)","X2","K56FLEX","V.FC","V.32terbo","Bell 212A","Bell 103","Reserved for Mfgs"};
	public final static String[] CIM_VALUEMAP_RECEIVEFLOWCONTROL = {"Unknown","Off","DC1/DC3","V.24 ckt 106/133"};
	public final static String[] CIM_VALUEMAP_TERMINATIONCAUSE = {"Cause Unidentified","No Previous Call","Call Is Still in Progress","Call Waiting Signal Detected","Delayed","NMS Initiated Dial Call","NMS Initiated Leased Line Restoral","NMS Initiated Redial","NMS Initiated Dial Disconnect","Power Loss","Equipment Failure","Front Panel Disconnect Requested","Front Panel Leased Line Restoral","Automatic Leased Line Restoral","Inactivity Timer Expired","cct116 Restoral Request","cct108 Is Off Inhibits Dial","cct108 Turned Off","No Number Provided","Blacklisted Number","Call Attempts Limit Exceeded","Extension Phone Off Hook","Call Setup Fail Timer Expired","Incoming Call Detected","Loop Current Interrupted","No Dial Tone","Voice Detected","Reorder Tone","Sit Tone","Engaged Tone","Long Space Disconnect","Carrier Lost","Training Failed","No Modulation in Common","Retrain Failed","Retrain Attempt Count Exceeded","GSTN Cleardown Received","Fax Detected","In Test Mode","Intrusive Self Test Initiated","Any Key Abort","DTE Hangup Command","DTE Reset Command","Frame Reject","No Error Control Established","Protocol Violation","n400 Exceeded","Negotiation Failed","Disconnect Frame Received","Sabme Frame Received","Loss Of Synchronization"};
	public final static String[] CIM_VALUEMAP_TRANSMITCARRIERNEGOTIATION = {"V.17 (G3 Fax Call)","V.21","V.22","V.22bis","V.23 Constant Carrier (1200/75)","V.23 Switched Carrier (Half Duplex)","V.26bis","V.26ter","V.27ter (G3 Fax Call)","V.29 HD (G3 Fax Call)","V.32","V.32bis","V.34","V.34 HD (G3 Fax Call)","V.90 Issue 1 (Asymmetric)","V.90 Issue 2 (Symmetric)","Reserved (V.58)","X2","K56FLEX","V.FC","V.32terbo","Bell 212A","Bell 103","Reserved for Mfgs"};
	public final static String[] CIM_VALUEMAP_TRANSMITFLOWCONTROL = {"Unknown","Off","DC1/DC3","V.24 ckt 106/133"};
	
	
	public final static int CALLSETUPRESULTCODE_NOPREVIOUSCALL = 0;
	public final static int CALLSETUPRESULTCODE_NODIALTONEDETECTED = 1;
	public final static int CALLSETUPRESULTCODE_REORDERSIGNALDETECTED_NETWORKBUSY = 2;
	public final static int CALLSETUPRESULTCODE_BUSYSIGNALDETECTED = 3;
	public final static int CALLSETUPRESULTCODE_NORECOGNIZEDSIGNALDETECTED = 4;
	public final static int CALLSETUPRESULTCODE_VOICEDETECTED = 5;
	public final static int CALLSETUPRESULTCODE_TEXTTELEPHONEDETECTED = 6;
	public final static int CALLSETUPRESULTCODE_DATAANSWERINGSIGNALDETECTED = 7;
	public final static int CALLSETUPRESULTCODE_DATACALLINGSIGNALDETECTED = 8;
	public final static int CALLSETUPRESULTCODE_FAXANSWERINGSIGNALDETECTED = 9;
	public final static int CALLSETUPRESULTCODE_FAXCALLINGSIGNALDETECTED = 10;
	public final static int CALLSETUPRESULTCODE_V_8BISSIGNALDETECTED = 11;
	
	public final static int DTEDCEINTERFACEMODE_ASYNCDATA = 0;
	public final static int DTEDCEINTERFACEMODE_V_80TRANSPARENTSYNCHRONOUSMODE = 1;
	public final static int DTEDCEINTERFACEMODE_V_80FRAMEDSYNCHRONOUSMODE = 2;
	
	public final static int MULTIMEDIAMODE_DATAONLY = 0;
	public final static int MULTIMEDIAMODE_FAXONLY = 1;
	public final static int MULTIMEDIAMODE_VOICEONLY = 2;
	public final static int MULTIMEDIAMODE_VOICEVIEW = 3;
	public final static int MULTIMEDIAMODE_ASVDV_61 = 4;
	public final static int MULTIMEDIAMODE_ASVDV_34Q = 5;
	public final static int MULTIMEDIAMODE_DSVDMULTI_TECH = 6;
	public final static int MULTIMEDIAMODE_DSVD1_2 = 7;
	public final static int MULTIMEDIAMODE_DSVDV_70 = 8;
	public final static int MULTIMEDIAMODE_VIDEOTELEPHONYH_324 = 9;
	public final static int MULTIMEDIAMODE_OTHERV_80CALL = 10;
	
	public final static String RECEIVECARRIERNEGOTIATION_V_17G3FAXCALL = "0";
	public final static String RECEIVECARRIERNEGOTIATION_V_21 = "1";
	public final static String RECEIVECARRIERNEGOTIATION_V_22 = "2";
	public final static String RECEIVECARRIERNEGOTIATION_V_22BIS = "3";
	public final static String RECEIVECARRIERNEGOTIATION_V_23CONSTANTCARRIER1200_75 = "4";
	public final static String RECEIVECARRIERNEGOTIATION_V_23SWITCHEDCARRIERHALFDUPLEX = "5";
	public final static String RECEIVECARRIERNEGOTIATION_V_26BIS = "6";
	public final static String RECEIVECARRIERNEGOTIATION_V_26TER = "7";
	public final static String RECEIVECARRIERNEGOTIATION_V_27TERG3FAXCALL = "8";
	public final static String RECEIVECARRIERNEGOTIATION_V_29HDG3FAXCALL = "9";
	public final static String RECEIVECARRIERNEGOTIATION_V_32 = "10";
	public final static String RECEIVECARRIERNEGOTIATION_V_32BIS = "11";
	public final static String RECEIVECARRIERNEGOTIATION_V_34 = "12";
	public final static String RECEIVECARRIERNEGOTIATION_V_34HDG3FAXCALL = "13";
	public final static String RECEIVECARRIERNEGOTIATION_V_90ISSUE1ASYMMETRIC = "14";
	public final static String RECEIVECARRIERNEGOTIATION_V_90ISSUE2SYMMETRIC = "15";
	public final static String RECEIVECARRIERNEGOTIATION_RESERVEDV_58 = "16";
	public final static String RECEIVECARRIERNEGOTIATION_X2 = "17";
	public final static String RECEIVECARRIERNEGOTIATION_K56FLEX = "18";
	public final static String RECEIVECARRIERNEGOTIATION_V_FC = "19";
	public final static String RECEIVECARRIERNEGOTIATION_V_32TERBO = "20";
	public final static String RECEIVECARRIERNEGOTIATION_BELL212A = "21";
	public final static String RECEIVECARRIERNEGOTIATION_BELL103 = "22";
	public final static String RECEIVECARRIERNEGOTIATION_RESERVEDFORMFGS = "23..65535";
	
	public final static int RECEIVEFLOWCONTROL_UNKNOWN = 0;
	public final static int RECEIVEFLOWCONTROL_OFF = 1;
	public final static int RECEIVEFLOWCONTROL_DC1_DC3 = 2;
	public final static int RECEIVEFLOWCONTROL_V_24CKT106_133 = 3;
	
	public final static int TERMINATIONCAUSE_CAUSEUNIDENTIFIED = 0;
	public final static int TERMINATIONCAUSE_NOPREVIOUSCALL = 1;
	public final static int TERMINATIONCAUSE_CALLISSTILLINPROGRESS = 2;
	public final static int TERMINATIONCAUSE_CALLWAITINGSIGNALDETECTED = 3;
	public final static int TERMINATIONCAUSE_DELAYED = 4;
	public final static int TERMINATIONCAUSE_NMSINITIATEDDIALCALL = 5;
	public final static int TERMINATIONCAUSE_NMSINITIATEDLEASEDLINERESTORAL = 6;
	public final static int TERMINATIONCAUSE_NMSINITIATEDREDIAL = 7;
	public final static int TERMINATIONCAUSE_NMSINITIATEDDIALDISCONNECT = 8;
	public final static int TERMINATIONCAUSE_POWERLOSS = 9;
	public final static int TERMINATIONCAUSE_EQUIPMENTFAILURE = 10;
	public final static int TERMINATIONCAUSE_FRONTPANELDISCONNECTREQUESTED = 11;
	public final static int TERMINATIONCAUSE_FRONTPANELLEASEDLINERESTORAL = 12;
	public final static int TERMINATIONCAUSE_AUTOMATICLEASEDLINERESTORAL = 13;
	public final static int TERMINATIONCAUSE_INACTIVITYTIMEREXPIRED = 14;
	public final static int TERMINATIONCAUSE_CCT116RESTORALREQUEST = 15;
	public final static int TERMINATIONCAUSE_CCT108ISOFFINHIBITSDIAL = 16;
	public final static int TERMINATIONCAUSE_CCT108TURNEDOFF = 17;
	public final static int TERMINATIONCAUSE_NONUMBERPROVIDED = 18;
	public final static int TERMINATIONCAUSE_BLACKLISTEDNUMBER = 19;
	public final static int TERMINATIONCAUSE_CALLATTEMPTSLIMITEXCEEDED = 20;
	public final static int TERMINATIONCAUSE_EXTENSIONPHONEOFFHOOK = 21;
	public final static int TERMINATIONCAUSE_CALLSETUPFAILTIMEREXPIRED = 22;
	public final static int TERMINATIONCAUSE_INCOMINGCALLDETECTED = 23;
	public final static int TERMINATIONCAUSE_LOOPCURRENTINTERRUPTED = 24;
	public final static int TERMINATIONCAUSE_NODIALTONE = 25;
	public final static int TERMINATIONCAUSE_VOICEDETECTED = 26;
	public final static int TERMINATIONCAUSE_REORDERTONE = 27;
	public final static int TERMINATIONCAUSE_SITTONE = 28;
	public final static int TERMINATIONCAUSE_ENGAGEDTONE = 29;
	public final static int TERMINATIONCAUSE_LONGSPACEDISCONNECT = 30;
	public final static int TERMINATIONCAUSE_CARRIERLOST = 31;
	public final static int TERMINATIONCAUSE_TRAININGFAILED = 32;
	public final static int TERMINATIONCAUSE_NOMODULATIONINCOMMON = 33;
	public final static int TERMINATIONCAUSE_RETRAINFAILED = 34;
	public final static int TERMINATIONCAUSE_RETRAINATTEMPTCOUNTEXCEEDED = 35;
	public final static int TERMINATIONCAUSE_GSTNCLEARDOWNRECEIVED = 36;
	public final static int TERMINATIONCAUSE_FAXDETECTED = 37;
	public final static int TERMINATIONCAUSE_INTESTMODE = 38;
	public final static int TERMINATIONCAUSE_INTRUSIVESELFTESTINITIATED = 39;
	public final static int TERMINATIONCAUSE_ANYKEYABORT = 40;
	public final static int TERMINATIONCAUSE_DTEHANGUPCOMMAND = 41;
	public final static int TERMINATIONCAUSE_DTERESETCOMMAND = 42;
	public final static int TERMINATIONCAUSE_FRAMEREJECT = 43;
	public final static int TERMINATIONCAUSE_NOERRORCONTROLESTABLISHED = 44;
	public final static int TERMINATIONCAUSE_PROTOCOLVIOLATION = 45;
	public final static int TERMINATIONCAUSE_N400EXCEEDED = 46;
	public final static int TERMINATIONCAUSE_NEGOTIATIONFAILED = 47;
	public final static int TERMINATIONCAUSE_DISCONNECTFRAMERECEIVED = 48;
	public final static int TERMINATIONCAUSE_SABMEFRAMERECEIVED = 49;
	public final static int TERMINATIONCAUSE_LOSSOFSYNCHRONIZATION = 50;
	
	public final static String TRANSMITCARRIERNEGOTIATION_V_17G3FAXCALL = "0";
	public final static String TRANSMITCARRIERNEGOTIATION_V_21 = "1";
	public final static String TRANSMITCARRIERNEGOTIATION_V_22 = "2";
	public final static String TRANSMITCARRIERNEGOTIATION_V_22BIS = "3";
	public final static String TRANSMITCARRIERNEGOTIATION_V_23CONSTANTCARRIER1200_75 = "4";
	public final static String TRANSMITCARRIERNEGOTIATION_V_23SWITCHEDCARRIERHALFDUPLEX = "5";
	public final static String TRANSMITCARRIERNEGOTIATION_V_26BIS = "6";
	public final static String TRANSMITCARRIERNEGOTIATION_V_26TER = "7";
	public final static String TRANSMITCARRIERNEGOTIATION_V_27TERG3FAXCALL = "8";
	public final static String TRANSMITCARRIERNEGOTIATION_V_29HDG3FAXCALL = "9";
	public final static String TRANSMITCARRIERNEGOTIATION_V_32 = "10";
	public final static String TRANSMITCARRIERNEGOTIATION_V_32BIS = "11";
	public final static String TRANSMITCARRIERNEGOTIATION_V_34 = "12";
	public final static String TRANSMITCARRIERNEGOTIATION_V_34HDG3FAXCALL = "13";
	public final static String TRANSMITCARRIERNEGOTIATION_V_90ISSUE1ASYMMETRIC = "14";
	public final static String TRANSMITCARRIERNEGOTIATION_V_90ISSUE2SYMMETRIC = "15";
	public final static String TRANSMITCARRIERNEGOTIATION_RESERVEDV_58 = "16";
	public final static String TRANSMITCARRIERNEGOTIATION_X2 = "17";
	public final static String TRANSMITCARRIERNEGOTIATION_K56FLEX = "18";
	public final static String TRANSMITCARRIERNEGOTIATION_V_FC = "19";
	public final static String TRANSMITCARRIERNEGOTIATION_V_32TERBO = "20";
	public final static String TRANSMITCARRIERNEGOTIATION_BELL212A = "21";
	public final static String TRANSMITCARRIERNEGOTIATION_BELL103 = "22";
	public final static String TRANSMITCARRIERNEGOTIATION_RESERVEDFORMFGS = "23..65535";
	
	public final static int TRANSMITFLOWCONTROL_UNKNOWN = 0;
	public final static int TRANSMITFLOWCONTROL_OFF = 1;
	public final static int TRANSMITFLOWCONTROL_DC1_DC3 = 2;
	public final static int TRANSMITFLOWCONTROL_V_24CKT106_133 = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Unimodem() {

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
	public CIM_Unimodem(Vector keyProperties){ 
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
	public CIM_Unimodem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Unimodem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Unimodem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Unimodem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Unimodem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Unimodem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Unimodem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Unimodem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Unimodem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Unimodem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Unimodem)object).cimObjectPath)) {
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
	
	// Attribute CallSetupResultCode
	
	public UnsignedInt16 get_CallSetupResultCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CallSetupResultCode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_CallSetupResultCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLSETUPRESULTCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CallWaitingEventCount
	
	public UnsignedInt8 get_CallWaitingEventCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CallWaitingEventCount(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_CallWaitingEventCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CALLWAITINGEVENTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CarrierRenegotiationEventCount
	
	public UnsignedInt8 get_CarrierRenegotiationEventCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CarrierRenegotiationEventCount(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_CarrierRenegotiationEventCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRENEGOTIATIONEVENTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CarrierRetrainsGranted
	
	public UnsignedInt8 get_CarrierRetrainsGranted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CarrierRetrainsGranted(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_CarrierRetrainsGranted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSGRANTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CarrierRetrainsRequested
	
	public UnsignedInt8 get_CarrierRetrainsRequested() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CarrierRetrainsRequested(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_CarrierRetrainsRequested(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_CARRIERRETRAINSREQUESTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DTEDCEInterfaceMode
	
	public UnsignedInt16 get_DTEDCEInterfaceMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DTEDCEInterfaceMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_DTEDCEInterfaceMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_DTEDCEINTERFACEMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorControlFrameSize
	
	public UnsignedInt16 get_ErrorControlFrameSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorControlFrameSize(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ErrorControlFrameSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLFRAMESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorControlLinkNAKs
	
	public UnsignedInt8 get_ErrorControlLinkNAKs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorControlLinkNAKs(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ErrorControlLinkNAKs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKNAKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorControlLinkTimeouts
	
	public UnsignedInt8 get_ErrorControlLinkTimeouts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorControlLinkTimeouts(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ErrorControlLinkTimeouts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ERRORCONTROLLINKTIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EstimatedNoiseLevel
	
	public UnsignedInt32 get_EstimatedNoiseLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedNoiseLevel(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_EstimatedNoiseLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_ESTIMATEDNOISELEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FinalReceiveCarrierDataRate
	
	public UnsignedInt32 get_FinalReceiveCarrierDataRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FinalReceiveCarrierDataRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_FinalReceiveCarrierDataRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALRECEIVECARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FinalTransmitCarrierDataRate
	
	public UnsignedInt32 get_FinalTransmitCarrierDataRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FinalTransmitCarrierDataRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_FinalTransmitCarrierDataRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_FINALTRANSMITCARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitialReceiveCarrierDataRate
	
	public UnsignedInt32 get_InitialReceiveCarrierDataRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialReceiveCarrierDataRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_InitialReceiveCarrierDataRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALRECEIVECARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitialTransmitCarrierDataRate
	
	public UnsignedInt32 get_InitialTransmitCarrierDataRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialTransmitCarrierDataRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_InitialTransmitCarrierDataRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_INITIALTRANSMITCARRIERDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MultiMediaMode
	
	public UnsignedInt16 get_MultiMediaMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MultiMediaMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_MultiMediaMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_MULTIMEDIAMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NormalizedMeanSquaredError
	
	public UnsignedInt32 get_NormalizedMeanSquaredError() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NormalizedMeanSquaredError(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_NormalizedMeanSquaredError(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_NORMALIZEDMEANSQUAREDERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveCarrierNegotiation
	
	public UnsignedInt16 get_ReceiveCarrierNegotiation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveCarrierNegotiation(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ReceiveCarrierNegotiation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECARRIERNEGOTIATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveCharsLost
	
	public UnsignedInt64 get_ReceiveCharsLost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveCharsLost(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ReceiveCharsLost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSLOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveCharsSentToDTE
	
	public UnsignedInt64 get_ReceiveCharsSentToDTE() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveCharsSentToDTE(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ReceiveCharsSentToDTE(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVECHARSSENTTODTE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveFlowControl
	
	public UnsignedInt16 get_ReceiveFlowControl() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveFlowControl(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ReceiveFlowControl(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEFLOWCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveIFrameCount
	
	public UnsignedInt64 get_ReceiveIFrameCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveIFrameCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ReceiveIFrameCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEIFRAMECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceivedIFrameErrorCount
	
	public UnsignedInt64 get_ReceivedIFrameErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceivedIFrameErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_ReceivedIFrameErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_RECEIVEDIFRAMEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TemporaryCarrierLossEventCount
	
	public UnsignedInt8 get_TemporaryCarrierLossEventCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TemporaryCarrierLossEventCount(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TemporaryCarrierLossEventCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TEMPORARYCARRIERLOSSEVENTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TerminationCause
	
	public UnsignedInt16 get_TerminationCause() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TerminationCause(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TerminationCause(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TERMINATIONCAUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmitCarrierNegotiation
	
	public UnsignedInt16 get_TransmitCarrierNegotiation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmitCarrierNegotiation(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TransmitCarrierNegotiation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCARRIERNEGOTIATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmitCharsLost
	
	public UnsignedInt64 get_TransmitCharsLost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmitCharsLost(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TransmitCharsLost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSLOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmitCharsSentFromDTE
	
	public UnsignedInt64 get_TransmitCharsSentFromDTE() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmitCharsSentFromDTE(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TransmitCharsSentFromDTE(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITCHARSSENTFROMDTE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmitFlowControl
	
	public UnsignedInt16 get_TransmitFlowControl() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmitFlowControl(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TransmitFlowControl(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITFLOWCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmitIFrameCount
	
	public UnsignedInt64 get_TransmitIFrameCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmitIFrameCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TransmitIFrameCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmitIFrameErrorCount
	
	public UnsignedInt64 get_TransmitIFrameErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmitIFrameErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_TransmitIFrameErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_TRANSMITIFRAMEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnimodemRevision
	
	public String get_UnimodemRevision() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnimodemRevision(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION + " could not be found");
    		
		} else if (!CIM_UnimodemHelper.isValid_UnimodemRevision(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Unimodem.CIM_PROPERTY_UNIMODEMREVISION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
