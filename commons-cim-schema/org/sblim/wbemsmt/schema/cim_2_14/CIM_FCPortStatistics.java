/** 
 * CIM_FCPortStatistics.java
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
 * Description:  FCPortStatistics is the statistics for the FCPort.
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
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  FCPortStatistics is the statistics for the FCPort.
 */
public class CIM_FCPortStatistics extends CIM_NetworkPortStatistics  {
	
	public final static String CIM_CLASS_NAME = "CIM_FCPortStatistics"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Count of frames received with unknown addressing. An example is an unknown SID or DID. The SID or DID is not known to the routing algorithm.
	*/
	public final static String CIM_PROPERTY_ADDRESSERRORS = "AddressErrors"; //$NON-NLS-1$
	/**
	*	Count of occurrences when all input buffers of a port were full and outbound buffer-to-buffer credit was transitioned to zero. There is no credit to provide to the other side.
	*/
	public final static String CIM_PROPERTY_BUFFERCREDITNOTPROVIDED = "BufferCreditNotProvided"; //$NON-NLS-1$
	/**
	*	Count of transitions in or out of BBcredit zero state. The other side is not providing any credit.
	*/
	public final static String CIM_PROPERTY_BUFFERCREDITNOTRECEIVED = "BufferCreditNotReceived"; //$NON-NLS-1$
	/**
	*	Number of times that the CRC in a frame does not match the CRC that is computed by the receiver. This count is part of the Link Error Status Block (LESB).
	*/
	public final static String CIM_PROPERTY_CRCERRORS = "CRCErrors"; //$NON-NLS-1$
	/**
	*	Class1FBSY is the number of times that FBSY was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS1FBSY = "Class1FBSY"; //$NON-NLS-1$
	/**
	*	Class1FRJT is the number of times that FRJT was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS1FRJT = "Class1FRJT"; //$NON-NLS-1$
	/**
	*	Class1PBSY is the number of times that PBSY was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS1PBSY = "Class1PBSY"; //$NON-NLS-1$
	/**
	*	Class1PRJT is the number of times that PRJT was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS1PRJT = "Class1PRJT"; //$NON-NLS-1$
	/**
	*	Class2FBSY is the number of times that FBSY was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS2FBSY = "Class2FBSY"; //$NON-NLS-1$
	/**
	*	Class2FRJT is the number of times that FRJT was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS2FRJT = "Class2FRJT"; //$NON-NLS-1$
	/**
	*	Class2PBSY is the number of times that PBSY was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS2PBSY = "Class2PBSY"; //$NON-NLS-1$
	/**
	*	Class2PRJT is the number of times that PRJT was returned to the port.
	*/
	public final static String CIM_PROPERTY_CLASS2PRJT = "Class2PRJT"; //$NON-NLS-1$
	/**
	*	Class3FramesDiscarded is the number of class 3 frames that were discarded upon reception.
	*/
	public final static String CIM_PROPERTY_CLASS3FRAMESDISCARDED = "Class3FramesDiscarded"; //$NON-NLS-1$
	/**
	*	Count of invalid frame delimiters that are received at this port. An example is a frame with a class 2 start and a class 3 at the end.
	*/
	public final static String CIM_PROPERTY_DELIMITERERRORS = "DelimiterErrors"; //$NON-NLS-1$
	/**
	*	DumpedFrames is the number of frames that were lost due to a lack of host buffers available.
	*/
	public final static String CIM_PROPERTY_DUMPEDFRAMES = "DumpedFrames"; //$NON-NLS-1$
	/**
	*	Count of disparity errors that are received at this port.
	*/
	public final static String CIM_PROPERTY_ENCODINGDISPARITYERRORS = "EncodingDisparityErrors"; //$NON-NLS-1$
	/**
	*	ErrorFrames is the number of frames that have been received in error.
	*/
	public final static String CIM_PROPERTY_ERRORFRAMES = "ErrorFrames"; //$NON-NLS-1$
	/**
	*	FBSYFrames is the number of times that FBSY was returned to the port.
	*/
	public final static String CIM_PROPERTY_FBSYFRAMES = "FBSYFrames"; //$NON-NLS-1$
	/**
	*	FRJTFrames is the number of times that FRJT was returned to the port.
	*/
	public final static String CIM_PROPERTY_FRJTFRAMES = "FRJTFrames"; //$NON-NLS-1$
	/**
	*	The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
	*/
	public final static String CIM_PROPERTY_FRAMESTOOLONG = "FramesTooLong"; //$NON-NLS-1$
	/**
	*	The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes, which are not data.
	*/
	public final static String CIM_PROPERTY_FRAMESTOOSHORT = "FramesTooShort"; //$NON-NLS-1$
	/**
	*	The number of transmission words that had an invalid character (8b10b code violation) in one or more of its characters, had a K28.5 (8b10b control) in its second, third, or fourth character position, or had an incorrect Beginning Running Disparity. This count is part of the Link Error Status Block (LESB).
	*/
	public final static String CIM_PROPERTY_INVALIDTRANSMISSIONWORDS = "InvalidTransmissionWords"; //$NON-NLS-1$
	/**
	*	LIPCount is the number of LIP events that have occurred on an arbitrated loop.
	*/
	public final static String CIM_PROPERTY_LIPCOUNT = "LIPCount"; //$NON-NLS-1$
	/**
	*	LinkFailure is the number of times that a link error has occurred. This count is part of the Link Error Status Block (LESB).
	*/
	public final static String CIM_PROPERTY_LINKFAILURES = "LinkFailures"; //$NON-NLS-1$
	/**
	*	Count of Link resets. This count is the number of LRs received.
	*/
	public final static String CIM_PROPERTY_LINKRESETSRECEIVED = "LinkResetsReceived"; //$NON-NLS-1$
	/**
	*	Count of Link resets. This count is the number of LRs transmitted.
	*/
	public final static String CIM_PROPERTY_LINKRESETSTRANSMITTED = "LinkResetsTransmitted"; //$NON-NLS-1$
	/**
	*	Number of times the signal is lost on the Port since the last reset of the Device. This count is part of the Link Error Status Block (LESB).
	*/
	public final static String CIM_PROPERTY_LOSSOFSIGNALCOUNTER = "LossOfSignalCounter"; //$NON-NLS-1$
	/**
	*	Number of times that synchronization is lost on the Port since the last reset of the Device. Synchronization is assumed lost after a timeout period (identified by the Receiver TransmitterTimeout property) is exceeded. This count is part of the Link Error Status Block (LESB).
	*/
	public final static String CIM_PROPERTY_LOSSOFSYNCCOUNTER = "LossOfSyncCounter"; //$NON-NLS-1$
	/**
	*	Count of Multicast Frames or Packets received.
	*/
	public final static String CIM_PROPERTY_MULTICASTFRAMESRECEIVED = "MulticastFramesReceived"; //$NON-NLS-1$
	/**
	*	Count of Multicast Frames or Packets transmitted.
	*/
	public final static String CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED = "MulticastFramesTransmitted"; //$NON-NLS-1$
	/**
	*	NOSCount is the number of NOS events that have occurred on the switched fabric.
	*/
	public final static String CIM_PROPERTY_NOSCOUNT = "NOSCount"; //$NON-NLS-1$
	/**
	*	PBSYFrames is the number of times that PBSY was returned to the port.
	*/
	public final static String CIM_PROPERTY_PBSYFRAMES = "PBSYFrames"; //$NON-NLS-1$
	/**
	*	PRJTFrames is the number of times that PRJT was returned to the port.
	*/
	public final static String CIM_PROPERTY_PRJTFRAMES = "PRJTFrames"; //$NON-NLS-1$
	/**
	*	Count of primitive sequence protocol errors that are detected at this port. This count is part of the Link Error Status Block (LESB).
	*/
	public final static String CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT = "PrimitiveSeqProtocolErrCount"; //$NON-NLS-1$
	/**
	*	RXBroadcastFrames is the number of broadcast frames or packets received.
	*/
	public final static String CIM_PROPERTY_RXBROADCASTFRAMES = "RXBroadcastFrames"; //$NON-NLS-1$
	/**
	*	RXClass1Frames is the number of class 1 frames received.
	*/
	public final static String CIM_PROPERTY_RXCLASS1FRAMES = "RXClass1Frames"; //$NON-NLS-1$
	/**
	*	RXClass2Frames is the number of class 2 frames received.
	*/
	public final static String CIM_PROPERTY_RXCLASS2FRAMES = "RXClass2Frames"; //$NON-NLS-1$
	/**
	*	RXClass3Frames is the number of class 3 frames received.
	*/
	public final static String CIM_PROPERTY_RXCLASS3FRAMES = "RXClass3Frames"; //$NON-NLS-1$
	/**
	*	TXBroadcastFrames is the number of broadcast frames or packets transmitted.
	*/
	public final static String CIM_PROPERTY_TXBROADCASTFRAMES = "TXBroadcastFrames"; //$NON-NLS-1$
	/**
	*	TXClass1Frames is the number of class 1 frames transmitted.
	*/
	public final static String CIM_PROPERTY_TXCLASS1FRAMES = "TXClass1Frames"; //$NON-NLS-1$
	/**
	*	TXClass2Frames is the number of class 2 frames transmitted.
	*/
	public final static String CIM_PROPERTY_TXCLASS2FRAMES = "TXClass2Frames"; //$NON-NLS-1$
	/**
	*	TXClass3Frames is the number of class 3 frames transmitted.
	*/
	public final static String CIM_PROPERTY_TXCLASS3FRAMES = "TXClass3Frames"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BUFFERCREDITNOTPROVIDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_BUFFERCREDITNOTRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CRCERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS1FBSY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS1FRJT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS1PBSY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS1PRJT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2FBSY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2FRJT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2PBSY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2PRJT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3FRAMESDISCARDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELIMITERERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DUMPEDFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENCODINGDISPARITYERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FBSYFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRJTFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMESTOOLONG);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMESTOOSHORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LIPCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKRESETSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKRESETSTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOSSOFSYNCCOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTICASTFRAMESRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOSCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PBSYFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRJTFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_RXBROADCASTFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_RXCLASS1FRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_RXCLASS2FRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_RXCLASS3FRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TXBROADCASTFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TXCLASS1FRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TXCLASS2FRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TXCLASS3FRAMES);
				
		for (int i = 0; i < CIM_NetworkPortStatistics.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUFFERCREDITNOTPROVIDED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUFFERCREDITNOTRECEIVED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRCERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS1FBSY)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS1FRJT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS1PBSY)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS1PRJT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2FBSY)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2FRJT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2PBSY)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2PRJT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3FRAMESDISCARDED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELIMITERERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DUMPEDFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENCODINGDISPARITYERRORS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FBSYFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRJTFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMESTOOLONG)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMESTOOSHORT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LIPCOUNT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKFAILURES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKRESETSRECEIVED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKRESETSTRANSMITTED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOSSOFSIGNALCOUNTER)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOSSOFSYNCCOUNTER)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTICASTFRAMESRECEIVED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOSCOUNT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PBSYFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRJTFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RXBROADCASTFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RXCLASS1FRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RXCLASS2FRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RXCLASS3FRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TXBROADCASTFRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TXCLASS1FRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TXCLASS2FRAMES)||
				((String)CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TXCLASS3FRAMES)){
				continue;
			}
			
			CIM_FCPortStatistics.CIM_PropertyNameList.add(CIM_NetworkPortStatistics.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUFFERCREDITNOTPROVIDED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUFFERCREDITNOTRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRCERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS1FBSY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS1FRJT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS1PBSY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS1PRJT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2FBSY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2FRJT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2PBSY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2PRJT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3FRAMESDISCARDED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELIMITERERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DUMPEDFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENCODINGDISPARITYERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FBSYFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRJTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMESTOOLONG, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMESTOOSHORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LIPCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKRESETSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKRESETSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOSSOFSIGNALCOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOSSOFSYNCCOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTICASTFRAMESRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOSCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PBSYFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRJTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RXBROADCASTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RXCLASS1FRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RXCLASS2FRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RXCLASS3FRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TXBROADCASTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TXCLASS1FRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TXCLASS2FRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TXCLASS3FRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_NetworkPortStatistics.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUFFERCREDITNOTPROVIDED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUFFERCREDITNOTRECEIVED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRCERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS1FBSY)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS1FRJT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS1PBSY)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS1PRJT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2FBSY)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2FRJT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2PBSY)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2PRJT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3FRAMESDISCARDED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELIMITERERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DUMPEDFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENCODINGDISPARITYERRORS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FBSYFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRJTFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMESTOOLONG)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMESTOOSHORT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INVALIDTRANSMISSIONWORDS)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LIPCOUNT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKFAILURES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKRESETSRECEIVED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKRESETSTRANSMITTED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOSSOFSIGNALCOUNTER)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOSSOFSYNCCOUNTER)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTICASTFRAMESRECEIVED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOSCOUNT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PBSYFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRJTFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RXBROADCASTFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RXCLASS1FRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RXCLASS2FRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RXCLASS3FRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TXBROADCASTFRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TXCLASS1FRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TXCLASS2FRAMES)||
				((CIMProperty)CIM_NetworkPortStatistics.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TXCLASS3FRAMES)){
				continue;
			}
			
			CIM_FCPortStatistics.CIM_PropertyList.add(CIM_NetworkPortStatistics.CIM_PropertyList.elementAt(i));
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
	public CIM_FCPortStatistics() {

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
	public CIM_FCPortStatistics(Vector keyProperties){ 
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
	public CIM_FCPortStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FCPortStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FCPortStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FCPortStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FCPortStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FCPortStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FCPortStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FCPortStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FCPortStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FCPortStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FCPortStatistics)object).cimObjectPath)) {
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
	
	// Attribute AddressErrors
	
	public UnsignedInt64 get_AddressErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_AddressErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ADDRESSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BufferCreditNotProvided
	
	public UnsignedInt64 get_BufferCreditNotProvided() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BufferCreditNotProvided(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_BufferCreditNotProvided(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTPROVIDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BufferCreditNotReceived
	
	public UnsignedInt64 get_BufferCreditNotReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BufferCreditNotReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_BufferCreditNotReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_BUFFERCREDITNOTRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CRCErrors
	
	public UnsignedInt64 get_CRCErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CRCErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_CRCErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CRCERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class1FBSY
	
	public UnsignedInt64 get_Class1FBSY() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class1FBSY(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class1FBSY(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class1FRJT
	
	public UnsignedInt64 get_Class1FRJT() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class1FRJT(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class1FRJT(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1FRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class1PBSY
	
	public UnsignedInt64 get_Class1PBSY() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class1PBSY(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class1PBSY(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class1PRJT
	
	public UnsignedInt64 get_Class1PRJT() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class1PRJT(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class1PRJT(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS1PRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2FBSY
	
	public UnsignedInt64 get_Class2FBSY() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2FBSY(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class2FBSY(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2FRJT
	
	public UnsignedInt64 get_Class2FRJT() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2FRJT(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class2FRJT(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2FRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2PBSY
	
	public UnsignedInt64 get_Class2PBSY() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2PBSY(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class2PBSY(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PBSY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2PRJT
	
	public UnsignedInt64 get_Class2PRJT() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2PRJT(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class2PRJT(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS2PRJT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3FramesDiscarded
	
	public UnsignedInt64 get_Class3FramesDiscarded() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3FramesDiscarded(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_Class3FramesDiscarded(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_CLASS3FRAMESDISCARDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DelimiterErrors
	
	public UnsignedInt64 get_DelimiterErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DelimiterErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_DelimiterErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DELIMITERERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DumpedFrames
	
	public UnsignedInt64 get_DumpedFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DumpedFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_DumpedFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_DUMPEDFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EncodingDisparityErrors
	
	public UnsignedInt64 get_EncodingDisparityErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EncodingDisparityErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_EncodingDisparityErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ENCODINGDISPARITYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorFrames
	
	public UnsignedInt64 get_ErrorFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_ErrorFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_ERRORFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FBSYFrames
	
	public UnsignedInt64 get_FBSYFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FBSYFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_FBSYFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FBSYFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FRJTFrames
	
	public UnsignedInt64 get_FRJTFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FRJTFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_FRJTFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRJTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FramesTooLong
	
	public UnsignedInt64 get_FramesTooLong() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FramesTooLong(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_FramesTooLong(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOLONG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FramesTooShort
	
	public UnsignedInt64 get_FramesTooShort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FramesTooShort(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_FramesTooShort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_FRAMESTOOSHORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InvalidTransmissionWords
	
	public UnsignedInt64 get_InvalidTransmissionWords() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InvalidTransmissionWords(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_InvalidTransmissionWords(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_INVALIDTRANSMISSIONWORDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LIPCount
	
	public UnsignedInt64 get_LIPCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LIPCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_LIPCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LIPCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LinkFailures
	
	public UnsignedInt64 get_LinkFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_LinkFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LinkResetsReceived
	
	public UnsignedInt64 get_LinkResetsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkResetsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_LinkResetsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LinkResetsTransmitted
	
	public UnsignedInt64 get_LinkResetsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkResetsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_LinkResetsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LINKRESETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LossOfSignalCounter
	
	public UnsignedInt64 get_LossOfSignalCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LossOfSignalCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_LossOfSignalCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSIGNALCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LossOfSyncCounter
	
	public UnsignedInt64 get_LossOfSyncCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LossOfSyncCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_LossOfSyncCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_LOSSOFSYNCCOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MulticastFramesReceived
	
	public UnsignedInt64 get_MulticastFramesReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MulticastFramesReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_MulticastFramesReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MulticastFramesTransmitted
	
	public UnsignedInt64 get_MulticastFramesTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MulticastFramesTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_MulticastFramesTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_MULTICASTFRAMESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NOSCount
	
	public UnsignedInt64 get_NOSCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NOSCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_NOSCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_NOSCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PBSYFrames
	
	public UnsignedInt64 get_PBSYFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PBSYFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_PBSYFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PBSYFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PRJTFrames
	
	public UnsignedInt64 get_PRJTFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRJTFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_PRJTFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRJTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimitiveSeqProtocolErrCount
	
	public UnsignedInt64 get_PrimitiveSeqProtocolErrCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimitiveSeqProtocolErrCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_PrimitiveSeqProtocolErrCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_PRIMITIVESEQPROTOCOLERRCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RXBroadcastFrames
	
	public UnsignedInt64 get_RXBroadcastFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RXBroadcastFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_RXBroadcastFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXBROADCASTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RXClass1Frames
	
	public UnsignedInt64 get_RXClass1Frames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RXClass1Frames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_RXClass1Frames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS1FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RXClass2Frames
	
	public UnsignedInt64 get_RXClass2Frames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RXClass2Frames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_RXClass2Frames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS2FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RXClass3Frames
	
	public UnsignedInt64 get_RXClass3Frames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RXClass3Frames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_RXClass3Frames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_RXCLASS3FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TXBroadcastFrames
	
	public UnsignedInt64 get_TXBroadcastFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TXBroadcastFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_TXBroadcastFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXBROADCASTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TXClass1Frames
	
	public UnsignedInt64 get_TXClass1Frames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TXClass1Frames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_TXClass1Frames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS1FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TXClass2Frames
	
	public UnsignedInt64 get_TXClass2Frames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TXClass2Frames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_TXClass2Frames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS2FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TXClass3Frames
	
	public UnsignedInt64 get_TXClass3Frames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TXClass3Frames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES + " could not be found");
    		
		} else if (!CIM_FCPortStatisticsHelper.isValid_TXClass3Frames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCPortStatistics.CIM_PROPERTY_TXCLASS3FRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
