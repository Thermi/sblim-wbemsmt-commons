/** 
 * CIM_FibreChannelAdapter.java
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
 * Description:  The use of the CIM_FibreChannelAdapter class is deprecated, consistent with the
 * deprecation of NetworkAdapter. Instead use CIM_FCPort. This class describes
 * the capabilities and management aspects of a Fibre Channel Adapter.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  The use of the CIM_FibreChannelAdapter class is deprecated, consistent with the
 * deprecation of NetworkAdapter. Instead use CIM_FCPort. This class describes
 * the capabilities and management aspects of a Fibre Channel Adapter.
 */
public class CIM_FibreChannelAdapter extends CIM_NetworkAdapter  {
	
	public final static String CIM_CLASS_NAME = "CIM_FibreChannelAdapter"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER = "CIM_FibrePortOnFCAdapter"; //$NON-NLS-1$
	
	
	/**
	*	Number of times that the Device has been without a buffer credit for a time longer than ErrorDetectTimeout.
	*/
	public final static String CIM_PROPERTY_BUFFERCREDITERRORS = "BufferCreditErrors"; //$NON-NLS-1$
	/**
	*	A list of the Capabilities of the Fibre Channel Adapter. For example, that the Adapter utilizes the Directory Server, or that it generates State Change Notifications can be indicated using the values 2 and 12, respectively.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the Adapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	Number of Class 1 sequences sent since last reset of the Device.
	*/
	public final static String CIM_PROPERTY_CLASS1SEQUENCESSENT = "Class1SequencesSent"; //$NON-NLS-1$
	/**
	*	Number of frames discarded by the Adapter when running Class 2 service.
	*/
	public final static String CIM_PROPERTY_CLASS2DISCARDFRAMES = "Class2DiscardFrames"; //$NON-NLS-1$
	/**
	*	Number of frames received by the Adapter when running Class 2 service.
	*/
	public final static String CIM_PROPERTY_CLASS2FRAMESRECEIVED = "Class2FramesReceived"; //$NON-NLS-1$
	/**
	*	Number of frames transmitted by the Adapter when running Class 2 service.
	*/
	public final static String CIM_PROPERTY_CLASS2FRAMESTRANSMITTED = "Class2FramesTransmitted"; //$NON-NLS-1$
	/**
	*	Number of octets received by the Adapter when running Class 2 service.
	*/
	public final static String CIM_PROPERTY_CLASS2OCTETSRECEIVED = "Class2OctetsReceived"; //$NON-NLS-1$
	/**
	*	Number of octets transmitted by the Adapter when running Class 2 service.
	*/
	public final static String CIM_PROPERTY_CLASS2OCTETSTRANSMITTED = "Class2OctetsTransmitted"; //$NON-NLS-1$
	/**
	*	Number of Class 2 sequences sent since last reset of the Device.
	*/
	public final static String CIM_PROPERTY_CLASS2SEQUENCESSENT = "Class2SequencesSent"; //$NON-NLS-1$
	/**
	*	Number of frames discarded by the Adapter when running Class 3 service.
	*/
	public final static String CIM_PROPERTY_CLASS3DISCARDFRAMES = "Class3DiscardFrames"; //$NON-NLS-1$
	/**
	*	Number of frames received by the Adapter when running Class 3 service.
	*/
	public final static String CIM_PROPERTY_CLASS3FRAMESRECEIVED = "Class3FramesReceived"; //$NON-NLS-1$
	/**
	*	Number of frames transmitted by the Adapter when running Class 3 service.
	*/
	public final static String CIM_PROPERTY_CLASS3FRAMESTRANSMITTED = "Class3FramesTransmitted"; //$NON-NLS-1$
	/**
	*	Number of octets received by the Adapter when running Class 3 service.
	*/
	public final static String CIM_PROPERTY_CLASS3OCTETSRECEIVED = "Class3OctetsReceived"; //$NON-NLS-1$
	/**
	*	Number of octets transmitted by the Adapter when running Class 3 service.
	*/
	public final static String CIM_PROPERTY_CLASS3OCTETSTRANSMITTED = "Class3OctetsTransmitted"; //$NON-NLS-1$
	/**
	*	Number of Class 3 sequences sent since last reset of the Device.
	*/
	public final static String CIM_PROPERTY_CLASS3SEQUENCESSENT = "Class3SequencesSent"; //$NON-NLS-1$
	/**
	*	Number of Class 4 sequences sent since last reset of the Device.
	*/
	public final static String CIM_PROPERTY_CLASS4SEQUENCESSENT = "Class4SequencesSent"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the Fibre Channel FC-4 protocols currently running on the Adapter. A list of all protocols supported by the Adapter is indicated in the FC4TypesSupported property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) that are currently running should be listed in the CurrentFC4VendorTypes property.
	*/
	public final static String CIM_PROPERTY_CURRENTFC4TYPES = "CurrentFC4Types"; //$NON-NLS-1$
	/**
	*	When the CurrentFC4Types array contains the value 255 ("Vendor Unique"), then the property, CurrentFC4 VendorTypes, lists all the vendor specific protocols running on the Adapter. These values are in the range, 0xE0 to 0xFF.
	*/
	public final static String CIM_PROPERTY_CURRENTFC4VENDORTYPES = "CurrentFC4VendorTypes"; //$NON-NLS-1$
	/**
	*	Number of times that the Device has been without an end credit for a time longer than ErrorDetectTimeout.
	*/
	public final static String CIM_PROPERTY_ENDCREDITERRORS = "EndCreditErrors"; //$NON-NLS-1$
	/**
	*	A 'short' timeout value (in milliseconds) for determining that an error has occurred. The default value is 10 seconds (10000 milliseconds).
	*/
	public final static String CIM_PROPERTY_ERRORDETECTTIMEOUT = "ErrorDetectTimeout"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the Fibre Channel FC-4 protocols supported by the Adapter. The protocols that are active and running are indicated in the CurrentFC4Types property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) should be listed in the FC4VendorUniqueTypes property.
	*/
	public final static String CIM_PROPERTY_FC4TYPESSUPPORTED = "FC4TypesSupported"; //$NON-NLS-1$
	/**
	*	When the FC4TypesSupported array contains the value 255 ("Vendor Unique"), then the property, FC4Vendor UniqueTypes, lists of all the vendor specific protocols supported by the Adapter. These values are in the range, 0xE0 to 0xFF.
	*/
	public final static String CIM_PROPERTY_FC4VENDORUNIQUETYPES = "FC4VendorUniqueTypes"; //$NON-NLS-1$
	/**
	*	Number of Class 1 or 2 frames that are not ACKed within the time indicated by ErrorDetectTimeout.
	*/
	public final static String CIM_PROPERTY_FRAMETIMEOUTS = "FrameTimeouts"; //$NON-NLS-1$
	/**
	*	The maximum frame size, in bytes, supported by the Adapter.
	*/
	public final static String CIM_PROPERTY_MAXFRAMESIZE = "MaxFrameSize"; //$NON-NLS-1$
	/**
	*	Number of frames received out of order.
	*/
	public final static String CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED = "OutOfOrderFramesReceived"; //$NON-NLS-1$
	/**
	*	Number of parity errors detected somewhere in the data path.
	*/
	public final static String CIM_PROPERTY_PARITYERRORS = "ParityErrors"; //$NON-NLS-1$
	/**
	*	The number of times that a frame was received but no buffer was available.
	*/
	public final static String CIM_PROPERTY_RECEIVEBUFFERERRORS = "ReceiveBufferErrors"; //$NON-NLS-1$
	/**
	*	The number of times that a frame was received but no end-to-end credit was available.
	*/
	public final static String CIM_PROPERTY_RECEIVEENDERRORS = "ReceiveEndErrors"; //$NON-NLS-1$
	/**
	*	A 'long' timeout value (in milliseconds) for determining when to reinstate a Recovery_Qualifier. The default value is 120 seconds (120000 milliseconds). It is typically set to the ErrorDetectTimeout value + 2*(fabric delay time).
	*/
	public final static String CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT = "ResourceAllocationTimeout"; //$NON-NLS-1$
	/**
	*	The Fibre Channel Classes of Service that are supported by the Adapter, on its Ports. The currently negotiated COS for a connection is a property (NegotiatedCOS) on the FibrePort ActiveLogin association.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDCOS = "SupportedCOS"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BUFFERCREDITERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS1SEQUENCESSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2DISCARDFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2FRAMESRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2FRAMESTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2OCTETSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2OCTETSTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS2SEQUENCESSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3DISCARDFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3FRAMESRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3FRAMESTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3OCTETSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3OCTETSTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS3SEQUENCESSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASS4SEQUENCESSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTFC4TYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTFC4VENDORTYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENDCREDITERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORDETECTTIMEOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_FC4TYPESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_FC4VENDORUNIQUETYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMETIMEOUTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXFRAMESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARITYERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVEBUFFERERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVEENDERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDCOS);
				
		for (int i = 0; i < CIM_NetworkAdapter.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUFFERCREDITERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS1SEQUENCESSENT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2DISCARDFRAMES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2FRAMESRECEIVED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2FRAMESTRANSMITTED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2OCTETSRECEIVED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2OCTETSTRANSMITTED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS2SEQUENCESSENT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3DISCARDFRAMES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3FRAMESRECEIVED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3FRAMESTRANSMITTED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3OCTETSRECEIVED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3OCTETSTRANSMITTED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS3SEQUENCESSENT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASS4SEQUENCESSENT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTFC4TYPES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTFC4VENDORTYPES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENDCREDITERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORDETECTTIMEOUT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FC4TYPESSUPPORTED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FC4VENDORUNIQUETYPES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMETIMEOUTS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXFRAMESIZE)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARITYERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVEBUFFERERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVEENDERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDCOS)){
				continue;
			}
			
			CIM_FibreChannelAdapter.CIM_PropertyNameList.add(CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUFFERCREDITERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS1SEQUENCESSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2DISCARDFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2FRAMESRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2FRAMESTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2OCTETSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2OCTETSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS2SEQUENCESSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3DISCARDFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3FRAMESRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3FRAMESTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3OCTETSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3OCTETSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS3SEQUENCESSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASS4SEQUENCESSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTFC4TYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTFC4VENDORTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENDCREDITERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORDETECTTIMEOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FC4TYPESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FC4VENDORUNIQUETYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMETIMEOUTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXFRAMESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARITYERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVEBUFFERERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVEENDERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDCOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_NetworkAdapter.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUFFERCREDITERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS1SEQUENCESSENT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2DISCARDFRAMES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2FRAMESRECEIVED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2FRAMESTRANSMITTED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2OCTETSRECEIVED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2OCTETSTRANSMITTED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS2SEQUENCESSENT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3DISCARDFRAMES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3FRAMESRECEIVED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3FRAMESTRANSMITTED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3OCTETSRECEIVED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3OCTETSTRANSMITTED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS3SEQUENCESSENT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASS4SEQUENCESSENT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTFC4TYPES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTFC4VENDORTYPES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENDCREDITERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORDETECTTIMEOUT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FC4TYPESSUPPORTED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FC4VENDORUNIQUETYPES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMETIMEOUTS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXFRAMESIZE)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARITYERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVEBUFFERERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVEENDERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDCOS)){
				continue;
			}
			
			CIM_FibreChannelAdapter.CIM_PropertyList.add(CIM_NetworkAdapter.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_NetworkAdapter.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Utilizes the Directory Server","Utilizes the Time Server","Utilizes the Management Server","Utilizes the Alias Server","Utilizes the Security Key Distribution Server","Utilizes the Clock Synchronization Server","Utilizes the Multicast Server","Utilizes QoS Facilitator","Utilizes Broadcast Services","Supports Fabric Login Server","Generates State Change Notifications","Registers for State Change Notifications","Responds to Read Connection Status","Supports Third Party Process Logout"};
	public final static String[] CIM_VALUEMAP_CURRENTFC4TYPES = {"Unknown","Other","ISO/IEC 8802 - 2 LLC","IP over FC","SCSI - FCP","SCSI - GPP","IPI - 3 Master","IPI - 3 Slave","IPI - 3 Peer","CP IPI - 3 Master","CP IPI - 3 Slave","CP IPI - 3 Peer","SBCCS Channel","SBCCS Control Unit","FC-SB-2 Channel","FC-SB-2 Control Unit","Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)","FC-SW","FC - SNMP","HIPPI - FP","BBL Control","BBL FDDI Encapsulated LAN PDU","BBL 802.3 Encapsulated LAN PDU","FC - VI","FC - AV","Vendor Unique"};
	public final static String[] CIM_VALUEMAP_FC4TYPESSUPPORTED = {"Unknown","Other","ISO/IEC 8802 - 2 LLC","IP over FC","SCSI - FCP","SCSI - GPP","IPI - 3 Master","IPI - 3 Slave","IPI - 3 Peer","CP IPI - 3 Master","CP IPI - 3 Slave","CP IPI - 3 Peer","SBCCS Channel","SBCCS Control Unit","FC-SB-2 Channel","FC-SB-2 Control Unit","Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)","FC-SW","FC - SNMP","HIPPI - FP","BBL Control","BBL FDDI Encapsulated LAN PDU","BBL 802.3 Encapsulated LAN PDU","FC - VI","FC - AV","Vendor Unique"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDCOS = {"Unknown","1","2","3","4","6","F"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_UTILIZESTHEDIRECTORYSERVER = 2;
	public final static int CAPABILITIES_UTILIZESTHETIMESERVER = 3;
	public final static int CAPABILITIES_UTILIZESTHEMANAGEMENTSERVER = 4;
	public final static int CAPABILITIES_UTILIZESTHEALIASSERVER = 5;
	public final static int CAPABILITIES_UTILIZESTHESECURITYKEYDISTRIBUTIONSERVER = 6;
	public final static int CAPABILITIES_UTILIZESTHECLOCKSYNCHRONIZATIONSERVER = 7;
	public final static int CAPABILITIES_UTILIZESTHEMULTICASTSERVER = 8;
	public final static int CAPABILITIES_UTILIZESQOSFACILITATOR = 9;
	public final static int CAPABILITIES_UTILIZESBROADCASTSERVICES = 10;
	public final static int CAPABILITIES_SUPPORTSFABRICLOGINSERVER = 11;
	public final static int CAPABILITIES_GENERATESSTATECHANGENOTIFICATIONS = 12;
	public final static int CAPABILITIES_REGISTERSFORSTATECHANGENOTIFICATIONS = 13;
	public final static int CAPABILITIES_RESPONDSTOREADCONNECTIONSTATUS = 14;
	public final static int CAPABILITIES_SUPPORTSTHIRDPARTYPROCESSLOGOUT = 15;
	
	public final static int CURRENTFC4TYPES_UNKNOWN = 0;
	public final static int CURRENTFC4TYPES_OTHER = 1;
	public final static int CURRENTFC4TYPES_ISO_IEC8802_2LLC = 4;
	public final static int CURRENTFC4TYPES_IPOVERFC = 5;
	public final static int CURRENTFC4TYPES_SCSI_FCP = 8;
	public final static int CURRENTFC4TYPES_SCSI_GPP = 9;
	public final static int CURRENTFC4TYPES_IPI_3MASTER = 17;
	public final static int CURRENTFC4TYPES_IPI_3SLAVE = 18;
	public final static int CURRENTFC4TYPES_IPI_3PEER = 19;
	public final static int CURRENTFC4TYPES_CPIPI_3MASTER = 21;
	public final static int CURRENTFC4TYPES_CPIPI_3SLAVE = 22;
	public final static int CURRENTFC4TYPES_CPIPI_3PEER = 23;
	public final static int CURRENTFC4TYPES_SBCCSCHANNEL = 25;
	public final static int CURRENTFC4TYPES_SBCCSCONTROLUNIT = 26;
	public final static int CURRENTFC4TYPES_FC_SB_2CHANNEL = 27;
	public final static int CURRENTFC4TYPES_FC_SB_2CONTROLUNIT = 28;
	public final static int CURRENTFC4TYPES_FIBRECHANNELSERVICESFC_GS_FC_GS_2_FC_GS_3 = 32;
	public final static int CURRENTFC4TYPES_FC_SW = 34;
	public final static int CURRENTFC4TYPES_FC_SNMP = 36;
	public final static int CURRENTFC4TYPES_HIPPI_FP = 64;
	public final static int CURRENTFC4TYPES_BBLCONTROL = 80;
	public final static int CURRENTFC4TYPES_BBLFDDIENCAPSULATEDLANPDU = 81;
	public final static int CURRENTFC4TYPES_BBL802_3ENCAPSULATEDLANPDU = 82;
	public final static int CURRENTFC4TYPES_FC_VI = 88;
	public final static int CURRENTFC4TYPES_FC_AV = 96;
	public final static int CURRENTFC4TYPES_VENDORUNIQUE = 255;
	
	public final static int FC4TYPESSUPPORTED_UNKNOWN = 0;
	public final static int FC4TYPESSUPPORTED_OTHER = 1;
	public final static int FC4TYPESSUPPORTED_ISO_IEC8802_2LLC = 4;
	public final static int FC4TYPESSUPPORTED_IPOVERFC = 5;
	public final static int FC4TYPESSUPPORTED_SCSI_FCP = 8;
	public final static int FC4TYPESSUPPORTED_SCSI_GPP = 9;
	public final static int FC4TYPESSUPPORTED_IPI_3MASTER = 17;
	public final static int FC4TYPESSUPPORTED_IPI_3SLAVE = 18;
	public final static int FC4TYPESSUPPORTED_IPI_3PEER = 19;
	public final static int FC4TYPESSUPPORTED_CPIPI_3MASTER = 21;
	public final static int FC4TYPESSUPPORTED_CPIPI_3SLAVE = 22;
	public final static int FC4TYPESSUPPORTED_CPIPI_3PEER = 23;
	public final static int FC4TYPESSUPPORTED_SBCCSCHANNEL = 25;
	public final static int FC4TYPESSUPPORTED_SBCCSCONTROLUNIT = 26;
	public final static int FC4TYPESSUPPORTED_FC_SB_2CHANNEL = 27;
	public final static int FC4TYPESSUPPORTED_FC_SB_2CONTROLUNIT = 28;
	public final static int FC4TYPESSUPPORTED_FIBRECHANNELSERVICESFC_GS_FC_GS_2_FC_GS_3 = 32;
	public final static int FC4TYPESSUPPORTED_FC_SW = 34;
	public final static int FC4TYPESSUPPORTED_FC_SNMP = 36;
	public final static int FC4TYPESSUPPORTED_HIPPI_FP = 64;
	public final static int FC4TYPESSUPPORTED_BBLCONTROL = 80;
	public final static int FC4TYPESSUPPORTED_BBLFDDIENCAPSULATEDLANPDU = 81;
	public final static int FC4TYPESSUPPORTED_BBL802_3ENCAPSULATEDLANPDU = 82;
	public final static int FC4TYPESSUPPORTED_FC_VI = 88;
	public final static int FC4TYPESSUPPORTED_FC_AV = 96;
	public final static int FC4TYPESSUPPORTED_VENDORUNIQUE = 255;
	
	public final static int SUPPORTEDCOS_UNKNOWN = 0;
	public final static int SUPPORTEDCOS_1 = 1;
	public final static int SUPPORTEDCOS_2 = 2;
	public final static int SUPPORTEDCOS_3 = 3;
	public final static int SUPPORTEDCOS_4 = 4;
	public final static int SUPPORTEDCOS_6 = 5;
	public final static int SUPPORTEDCOS_F = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FibreChannelAdapter() {

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
	public CIM_FibreChannelAdapter(Vector keyProperties){ 
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
	public CIM_FibreChannelAdapter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_FibreChannelAdapter.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_FibreChannelAdapter.Java_Package_List.toArray(new String[CIM_FibreChannelAdapter.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_FibreChannelAdapter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FibreChannelAdapter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FibreChannelAdapter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FibreChannelAdapter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FibreChannelAdapter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FibreChannelAdapter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FibreChannelAdapter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FibreChannelAdapter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FibreChannelAdapter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FibreChannelAdapter)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, 
					CIM_FibrePort.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_FibreChannelAdapterHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FibrePort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FibrePort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FibrePort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, 
					CIM_FibrePort.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FibrePort.CIM_CLASS_NAME)) {
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
	
	// Attribute BufferCreditErrors
	
	public UnsignedInt64 get_BufferCreditErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BufferCreditErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_BufferCreditErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_BUFFERCREDITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class1SequencesSent
	
	public UnsignedInt64 get_Class1SequencesSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class1SequencesSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class1SequencesSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS1SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2DiscardFrames
	
	public UnsignedInt64 get_Class2DiscardFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2DiscardFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class2DiscardFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2DISCARDFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2FramesReceived
	
	public UnsignedInt64 get_Class2FramesReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2FramesReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class2FramesReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2FramesTransmitted
	
	public UnsignedInt64 get_Class2FramesTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2FramesTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class2FramesTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2FRAMESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2OctetsReceived
	
	public UnsignedInt64 get_Class2OctetsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2OctetsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class2OctetsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2OctetsTransmitted
	
	public UnsignedInt64 get_Class2OctetsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2OctetsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class2OctetsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2OCTETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class2SequencesSent
	
	public UnsignedInt64 get_Class2SequencesSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class2SequencesSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class2SequencesSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS2SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3DiscardFrames
	
	public UnsignedInt64 get_Class3DiscardFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3DiscardFrames(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class3DiscardFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3DISCARDFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3FramesReceived
	
	public UnsignedInt64 get_Class3FramesReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3FramesReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class3FramesReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3FramesTransmitted
	
	public UnsignedInt64 get_Class3FramesTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3FramesTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class3FramesTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3FRAMESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3OctetsReceived
	
	public UnsignedInt64 get_Class3OctetsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3OctetsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class3OctetsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3OctetsTransmitted
	
	public UnsignedInt64 get_Class3OctetsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3OctetsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class3OctetsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3OCTETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class3SequencesSent
	
	public UnsignedInt64 get_Class3SequencesSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class3SequencesSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class3SequencesSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS3SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Class4SequencesSent
	
	public UnsignedInt64 get_Class4SequencesSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Class4SequencesSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_Class4SequencesSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CLASS4SEQUENCESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentFC4Types
	
	public UnsignedInt16[] get_CurrentFC4Types() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_CurrentFC4Types(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_CurrentFC4Types(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4TYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentFC4VendorTypes
	
	public UnsignedInt16[] get_CurrentFC4VendorTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_CurrentFC4VendorTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_CurrentFC4VendorTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_CURRENTFC4VENDORTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EndCreditErrors
	
	public UnsignedInt64 get_EndCreditErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EndCreditErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_EndCreditErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ENDCREDITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorDetectTimeout
	
	public UnsignedInt64 get_ErrorDetectTimeout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorDetectTimeout(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_ErrorDetectTimeout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_ERRORDETECTTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FC4TypesSupported
	
	public UnsignedInt16[] get_FC4TypesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_FC4TypesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_FC4TypesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4TYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FC4VendorUniqueTypes
	
	public UnsignedInt16[] get_FC4VendorUniqueTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_FC4VendorUniqueTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_FC4VendorUniqueTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FC4VENDORUNIQUETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrameTimeouts
	
	public UnsignedInt64 get_FrameTimeouts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrameTimeouts(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_FrameTimeouts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_FRAMETIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxFrameSize
	
	public UnsignedInt64 get_MaxFrameSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxFrameSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_MaxFrameSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_MAXFRAMESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OutOfOrderFramesReceived
	
	public UnsignedInt64 get_OutOfOrderFramesReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OutOfOrderFramesReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_OutOfOrderFramesReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_OUTOFORDERFRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ParityErrors
	
	public UnsignedInt64 get_ParityErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ParityErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_ParityErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_PARITYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveBufferErrors
	
	public UnsignedInt64 get_ReceiveBufferErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveBufferErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_ReceiveBufferErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEBUFFERERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveEndErrors
	
	public UnsignedInt64 get_ReceiveEndErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveEndErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_ReceiveEndErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RECEIVEENDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResourceAllocationTimeout
	
	public UnsignedInt64 get_ResourceAllocationTimeout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResourceAllocationTimeout(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_ResourceAllocationTimeout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_RESOURCEALLOCATIONTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedCOS
	
	public UnsignedInt16[] get_SupportedCOS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS + " could not be found");
    		
		} else if (!CIM_FibreChannelAdapterHelper.isValid_SupportedCOS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibreChannelAdapter.CIM_PROPERTY_SUPPORTEDCOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
