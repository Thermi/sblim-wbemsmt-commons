/** 
 * CIM_StorageReplicationCapabilities.java
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
 * Description:  This subclass defines the replication capabilities of a
 * StorageConfigurationService. Multiple instances of
 * StorageReplicationCapabilities may be associated with a
 * StorageConfigurationService using ElementCapabilities. A provider should
 * create one instance for each supported SynchronizationType.
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
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  This subclass defines the replication capabilities of a
 * StorageConfigurationService. Multiple instances of
 * StorageReplicationCapabilities may be associated with a
 * StorageConfigurationService using ElementCapabilities. A provider should
 * create one instance for each supported SynchronizationType.
 */
public class CIM_StorageReplicationCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageReplicationCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Remote replication provides StorageConfigurationService instances for source systems and target systems. A client determines that extrinsic methods of the service should be invoked to one instance or the other based on the value of this property. If the primary instance is unavailable, the provider may indicate an alternate instance. Values: 
None: no alternate exists. Source: invoke to source element service instance. Target: invoke to target element service instance. Proxy: find and invoke alternate proxy service instance.
	*/
	public final static String CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS = "AlternateReplicationServicePointAccess"; //$NON-NLS-1$
	/**
	*	True indicates peer-to-peer connections are bi-directional. False indicates connections are uni-directional.
	*/
	public final static String CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED = "BidirectionalConnectionsSupported"; //$NON-NLS-1$
	/**
	*	DeltaReplicaPool indicates that a specialized pool is required as a container for delta replica elements. Values: Any: delta replicas can be created in any pool. Exclusive: one specialized, exclusive pool must be created for each source element that has associated delta replicas. Shared: one specialized, shared pool must be created to be shared by all source elements with associated delta replicas.
	*/
	public final static String CIM_PROPERTY_DELTAREPLICAPOOLACCESS = "DeltaReplicaPoolAccess"; //$NON-NLS-1$
	/**
	*	Lists the replica synchronization states in which the provider allows host access to replicas. Accessibility does not guarantee replica contents are valid or consistent.
	*/
	public final static String CIM_PROPERTY_HOSTACCESSIBLESTATE = "HostAccessibleState"; //$NON-NLS-1$
	/**
	*	True indicates all delta replicas associated with the same source element can be incrementally dependent. Only the oldest replica in the set may be deleted or resynced.
	*/
	public final static String CIM_PROPERTY_INCREMENTALDELTASSUPPORTED = "IncrementalDeltasSupported"; //$NON-NLS-1$
	/**
	*	InitialReplicationState specifies which initial ReplicationState is supported by a particular provider. Values are: 
Initialized: The replication relationship is known and unsynchronized, but time required to synchronize may be long. 
Prepared: The replication relationship is known and unsynchronized and the time required to synchronize will be short. 
Synchronized: The replicas are synchronized. Idle: an UnSyncAssoc replica is ready to manage.
	*/
	public final static String CIM_PROPERTY_INITIALREPLICATIONSTATE = "InitialReplicationState"; //$NON-NLS-1$
	/**
	*	Start or do not start background copy when replica is created.
	*/
	public final static String CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT = "InitialSynchronizationDefault"; //$NON-NLS-1$
	/**
	*	True indicates local mirror can be snapshot source.
	*/
	public final static String CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED = "LocalMirrorSnapshotSupported"; //$NON-NLS-1$
	/**
	*	Warning threshold for generating an indication for RemainingManagedSpace. Value of zero means no warning generated. Triggered when RemainingManagedSpace <= (TotalManagedSpace*LowSpaceWarningThreshold)/100.
	*/
	public final static String CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT = "LowSpaceWarningThresholdDefault"; //$NON-NLS-1$
	/**
	*	Maximum number of peer-to-peer connections to which a port may be assigned.
	*/
	public final static String CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT = "MaximumConnectionsPerPort"; //$NON-NLS-1$
	/**
	*	Maximum local mirror replication depth allowed by this instance of StorageConfigurationService. Value 1 indicates multi-level replication not supported.
	*/
	public final static String CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH = "MaximumLocalReplicationDepth"; //$NON-NLS-1$
	/**
	*	Maximum number of peer connections supported by this instance of StorageConfigurationService.
	*/
	public final static String CIM_PROPERTY_MAXIMUMPEERCONNECTIONS = "MaximumPeerConnections"; //$NON-NLS-1$
	/**
	*	Maximum number of port pairs assigned to a peer-to-peer connection.
	*/
	public final static String CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION = "MaximumPortsPerConnection"; //$NON-NLS-1$
	/**
	*	Maximum remote mirror replication depth allowed by this instance of StorageConfigurationService. Value N means that remote replicas can span N linked peer-to-peer connections. Value 1 indicates multi-level replication not supported.
	*/
	public final static String CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH = "MaximumRemoteReplicationDepth"; //$NON-NLS-1$
	/**
	*	Maximum number of replicas that can be associated with one source element.
	*/
	public final static String CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE = "MaximumReplicasPerSource"; //$NON-NLS-1$
	/**
	*	Peer connection protocol is a private, vendor-specific protocol for replication data transport. A client verifies that two peers support the same protocol before establishing a peer-to-peer connection.
	*/
	public final static String CIM_PROPERTY_PEERCONNECTIONPROTOCOL = "PeerConnectionProtocol"; //$NON-NLS-1$
	/**
	*	True indicates replicas can persist during power off or system reset. False indicates replicas lost during these events.
	*/
	public final static String CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED = "PersistentReplicasSupported"; //$NON-NLS-1$
	/**
	*	Remote replication buffer elements are instances of CIM_Memory. A buffer element may be created from a component extent with a BasedOn association or in a storage pool with an AllocatedFromStoragePool association. The provider can also make the size and element type opaque to a client. Values: 
Not specified: client allows provider to determine size and container element type. 
InExtent: buffer must be created from passed component extent. 
InPool: buffer must be created in passed pool.
	*/
	public final static String CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE = "RemoteBufferElementType"; //$NON-NLS-1$
	/**
	*	Array provider may require multiple buffer elements per array instance as indicated by this property. Values: 
Array: one buffer element for the entire array. 
ComponentCS: one buffer element per ComputerSystem element in a clustered array. 
Pipe: one or two buffer elements per replication pipe.
	*/
	public final static String CIM_PROPERTY_REMOTEBUFFERHOST = "RemoteBufferHost"; //$NON-NLS-1$
	/**
	*	This property allows the provider to indicate the required location for remote buffer elements. Values: 
Source: buffer needed only on platforms hosting source elements. 
Target: buffer needed only on platforms hosting target elements. 
Both: buffers needed for both source and target platforms.
	*/
	public final static String CIM_PROPERTY_REMOTEBUFFERLOCATION = "RemoteBufferLocation"; //$NON-NLS-1$
	/**
	*	Peer may require a write buffer for remote replica elements with async I/O buffering. Typically used to increase remote mirror replication engine performance while maintaining high availability. Values: 
Required: must have buffer if any Async remote replicas are created. 
Optional: may have buffer if any Async remote replicas are created.
	*/
	public final static String CIM_PROPERTY_REMOTEBUFFERSUPPORTED = "RemoteBufferSupported"; //$NON-NLS-1$
	/**
	*	True indicates remote mirror can be snapshot source.
	*/
	public final static String CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED = "RemoteMirrorSnapshotSupported"; //$NON-NLS-1$
	/**
	*	Remote replication provides StorageConfigurationService instances for source systems and target systems. A client determines that extrinsic methods of the service should be invoked to one instance or the other based on the value of this property. Values: 
Not Specified: invoke a method to either system instance. Source: invoke to source element service instance. Target: invoke to target element service instance. Proxy: find and invoke to proxy service instance.
	*/
	public final static String CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS = "RemoteReplicationServicePointAccess"; //$NON-NLS-1$
	/**
	*	Indicates host access restrictions for replicas with these capabilities. Values: 
2 = not accessible. 
3 = no restrictions. Any host may access. 
4 = only accessible by associated source element hosts. 
5 = not accessible by source element hosts. Other hosts OK.
	*/
	public final static String CIM_PROPERTY_REPLICAHOSTACCESSIBILITY = "ReplicaHostAccessibility"; //$NON-NLS-1$
	/**
	*	ReplicationPriority allows the priority of background Replication I/O to be managed relative to host I/O. Default applies to initial or deferred background Replication operations. Value can be modified while in Replication-in-progress state. Values: Low: Replication engine I/O lower priority than host I/O. 
Same: Replication engine I/O has the same priority as host I/O. 
High: Replication engine I/O has higher priority than host I/O.
	*/
	public final static String CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT = "ReplicationPriorityDefault"; //$NON-NLS-1$
	/**
	*	True indicates space limits on allocation from StoragePools may be enforced.
	*/
	public final static String CIM_PROPERTY_SPACELIMITSUPPORTED = "SpaceLimitSupported"; //$NON-NLS-1$
	/**
	*	Warning threshold for instance modification indication for SpaceConsumed by a replica element. Value of zero means no warning generated. Triggered when SpaceConsumed >= (SpaceLimit*SpaceLimitWarningThreshold)/100.
	*/
	public final static String CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT = "SpaceLimitWarningThresholdDefault"; //$NON-NLS-1$
	/**
	*	True indicates space reserved for replicas can be from a specialized pool.
	*/
	public final static String CIM_PROPERTY_SPACERESERVATIONSUPPORTED = "SpaceReservationSupported"; //$NON-NLS-1$
	/**
	*	Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS = "SupportedAsynchronousActions"; //$NON-NLS-1$
	/**
	*	Enumeration indicating which ModifySynchronization operations are supported by this instance of StorageReplicationCapabilities.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS = "SupportedModifyOperations"; //$NON-NLS-1$
	/**
	*	Enumeration indicating which specialized storage element types are supported by this instance of StorageReplicationCapabilities. Specialized types are indicated by the value of the IntendedUsage in StorageSetting.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS = "SupportedSpecializedElements"; //$NON-NLS-1$
	/**
	*	SupportedSynchronizationType describes the type of Synchronization that is characterized by this instance of StorageReplicationCapabilities. Values are: 
Async: create a mirror that is nearly always synchronized. 
Sync: create a mirror that is always synchronized. 
UnSyncAssocFull: create a full size snapshot (Point In Time image). 
UnSyncAssocDelta: create a delta snapshot (Point In Time image). 
UnSyncUnAssoc: create a full size, independent replica.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE = "SupportedSynchronizationType"; //$NON-NLS-1$
	/**
	*	Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS = "SupportedSynchronousActions"; //$NON-NLS-1$
	/**
	*	Indicate if an async remote replica pair is allowed to use a write buffer for asynchronous write buffering. 
- Not Managed: use or not of the buffer is up to the implementation. 
- Use Buffer: use of a buffer is required. 
- Do Not Use Buffer: a buffer shall not be used.
	*/
	public final static String CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT = "UseReplicationBufferDefault"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTAREPLICAPOOLACCESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOSTACCESSIBLESTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCREMENTALDELTASSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALREPLICATIONSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMPEERCONNECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PEERCONNECTIONPROTOCOL);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEBUFFERHOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEBUFFERLOCATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEBUFFERSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLICAHOSTACCESSIBILITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPACELIMITSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPACERESERVATIONSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTAREPLICAPOOLACCESS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOSTACCESSIBLESTATE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCREMENTALDELTASSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALREPLICATIONSTATE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMPEERCONNECTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PEERCONNECTIONPROTOCOL)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEBUFFERHOST)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEBUFFERLOCATION)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEBUFFERSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLICAHOSTACCESSIBILITY)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPACELIMITSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPACERESERVATIONSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT)){
				continue;
			}
			
			CIM_StorageReplicationCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTAREPLICAPOOLACCESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOSTACCESSIBLESTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCREMENTALDELTASSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALREPLICATIONSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH, new CIMValue(new UnsignedInt16("1"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMPEERCONNECTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH, new CIMValue(new UnsignedInt16("1"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PEERCONNECTIONPROTOCOL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEBUFFERHOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEBUFFERLOCATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEBUFFERSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLICAHOSTACCESSIBILITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPACELIMITSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPACERESERVATIONSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTAREPLICAPOOLACCESS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOSTACCESSIBLESTATE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCREMENTALDELTASSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALREPLICATIONSTATE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMPEERCONNECTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PEERCONNECTIONPROTOCOL)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEBUFFERHOST)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEBUFFERLOCATION)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEBUFFERSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLICAHOSTACCESSIBILITY)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPACELIMITSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPACERESERVATIONSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT)){
				continue;
			}
			
			CIM_StorageReplicationCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALTERNATEREPLICATIONSERVICEPOINTACCESS = {"None","Source","Target","Proxy","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_DELTAREPLICAPOOLACCESS = {"Any","Exclusive","Shared","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_HOSTACCESSIBLESTATE = {"Initialized","Prepare In Progress","Prepared","Resync In Progress","Synchronized","Fracture In Progress","Quiesce In Progress","Quiesced","Restore In Progress","Idle","Broken","Fractured","Frozen","Copy In Progress","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_INITIALREPLICATIONSTATE = {"Initialized","Prepared","Synchronized","Idle","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_INITIALSYNCHRONIZATIONDEFAULT = {"Not Managed","Start","Do Not Start","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REMOTEBUFFERELEMENTTYPE = {"Not specified","InExtent","InPool","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REMOTEBUFFERHOST = {"Array","ComponentCS","Pipe","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REMOTEBUFFERLOCATION = {"Source","Target","Both","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REMOTEBUFFERSUPPORTED = {"Not Supported","Required","Optional","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REMOTEREPLICATIONSERVICEPOINTACCESS = {"Not Specified","Source","Target","Proxy","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REPLICAHOSTACCESSIBILITY = {"Not Accessible","No Restrictions","Source Hosts Only","Source Hosts Excluded","DMTF Reserved"};
	public final static String[] CIM_VALUEMAP_REPLICATIONPRIORITYDEFAULT = {"Not Managed","Low","Same","High","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDASYNCHRONOUSACTIONS = {"Local Replica Creation","Remote Replica Creation","Local Replica Modification","Remote Replica Modification","Local Replica Attachment","Remote Replica Attachment","Buffer Creation","DMTF Reserved"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDMODIFYOPERATIONS = {"Detach","Fracture","Resync","Restore","Prepare","Unprepare","Quiesce","Unquiesce","Reset To Sync","Reset To Async","Start Copy","Stop Copy","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSPECIALIZEDELEMENTS = {"Delta Pool","Delta Pool Component","Remote Mirror","Local Mirror","Full Snapshot","Delta Snapshot","Replication Buffer","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSYNCHRONIZATIONTYPE = {"Async","Sync","UnSyncAssoc-Full","UnSyncAssoc-Delta","UnSyncUnAssoc","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSYNCHRONOUSACTIONS = {"Local Replica Creation","Remote Replica Creation","Local Replica Modification","Remote Replica Modification","Local Replica Attachment","Remote Replica Attachment","Buffer Creation","NetworkPipe Creation","DMTF Reserved"};
	public final static String[] CIM_VALUEMAP_USEREPLICATIONBUFFERDEFAULT = {"Not Managed","Use Buffer","Do Not Use Buffer","DMTF Reserved","Vendor Specific"};
	
	
	public final static String ALTERNATEREPLICATIONSERVICEPOINTACCESS_NONE = "2";
	public final static String ALTERNATEREPLICATIONSERVICEPOINTACCESS_SOURCE = "3";
	public final static String ALTERNATEREPLICATIONSERVICEPOINTACCESS_TARGET = "4";
	public final static String ALTERNATEREPLICATIONSERVICEPOINTACCESS_PROXY = "5";
	public final static String ALTERNATEREPLICATIONSERVICEPOINTACCESS_DMTFRESERVED = "..";
	public final static String ALTERNATEREPLICATIONSERVICEPOINTACCESS_VENDORSPECIFIC = "0x8000..";
	
	public final static String DELTAREPLICAPOOLACCESS_ANY = "2";
	public final static String DELTAREPLICAPOOLACCESS_EXCLUSIVE = "3";
	public final static String DELTAREPLICAPOOLACCESS_SHARED = "4";
	public final static String DELTAREPLICAPOOLACCESS_DMTFRESERVED = "..";
	public final static String DELTAREPLICAPOOLACCESS_VENDORSPECIFIC = "0x8000..";
	
	public final static String HOSTACCESSIBLESTATE_INITIALIZED = "2";
	public final static String HOSTACCESSIBLESTATE_PREPAREINPROGRESS = "3";
	public final static String HOSTACCESSIBLESTATE_PREPARED = "4";
	public final static String HOSTACCESSIBLESTATE_RESYNCINPROGRESS = "5";
	public final static String HOSTACCESSIBLESTATE_SYNCHRONIZED = "6";
	public final static String HOSTACCESSIBLESTATE_FRACTUREINPROGRESS = "7";
	public final static String HOSTACCESSIBLESTATE_QUIESCEINPROGRESS = "8";
	public final static String HOSTACCESSIBLESTATE_QUIESCED = "9";
	public final static String HOSTACCESSIBLESTATE_RESTOREINPROGRESS = "10";
	public final static String HOSTACCESSIBLESTATE_IDLE = "11";
	public final static String HOSTACCESSIBLESTATE_BROKEN = "12";
	public final static String HOSTACCESSIBLESTATE_FRACTURED = "13";
	public final static String HOSTACCESSIBLESTATE_FROZEN = "14";
	public final static String HOSTACCESSIBLESTATE_COPYINPROGRESS = "15";
	public final static String HOSTACCESSIBLESTATE_DMTFRESERVED = "..";
	public final static String HOSTACCESSIBLESTATE_VENDORSPECIFIC = "0x8000..";
	
	public final static String INITIALREPLICATIONSTATE_INITIALIZED = "2";
	public final static String INITIALREPLICATIONSTATE_PREPARED = "3";
	public final static String INITIALREPLICATIONSTATE_SYNCHRONIZED = "4";
	public final static String INITIALREPLICATIONSTATE_IDLE = "5";
	public final static String INITIALREPLICATIONSTATE_DMTFRESERVED = "..";
	public final static String INITIALREPLICATIONSTATE_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static String INITIALSYNCHRONIZATIONDEFAULT_NOTMANAGED = "0";
	public final static String INITIALSYNCHRONIZATIONDEFAULT_START = "1";
	public final static String INITIALSYNCHRONIZATIONDEFAULT_DONOTSTART = "2";
	public final static String INITIALSYNCHRONIZATIONDEFAULT_DMTFRESERVED = "..";
	public final static String INITIALSYNCHRONIZATIONDEFAULT_VENDORSPECIFIC = "0x8000..";
	
	public final static String REMOTEBUFFERELEMENTTYPE_NOTSPECIFIED = "0";
	public final static String REMOTEBUFFERELEMENTTYPE_INEXTENT = "2";
	public final static String REMOTEBUFFERELEMENTTYPE_INPOOL = "3";
	public final static String REMOTEBUFFERELEMENTTYPE_DMTFRESERVED = "..";
	public final static String REMOTEBUFFERELEMENTTYPE_VENDORSPECIFIC = "0x8000..";
	
	public final static String REMOTEBUFFERHOST_ARRAY = "2";
	public final static String REMOTEBUFFERHOST_COMPONENTCS = "3";
	public final static String REMOTEBUFFERHOST_PIPE = "4";
	public final static String REMOTEBUFFERHOST_DMTFRESERVED = "..";
	public final static String REMOTEBUFFERHOST_VENDORSPECIFIC = "0x8000..";
	
	public final static String REMOTEBUFFERLOCATION_SOURCE = "2";
	public final static String REMOTEBUFFERLOCATION_TARGET = "3";
	public final static String REMOTEBUFFERLOCATION_BOTH = "4";
	public final static String REMOTEBUFFERLOCATION_DMTFRESERVED = "..";
	public final static String REMOTEBUFFERLOCATION_VENDORSPECIFIC = "0x8000..";
	
	public final static String REMOTEBUFFERSUPPORTED_NOTSUPPORTED = "0";
	public final static String REMOTEBUFFERSUPPORTED_REQUIRED = "2";
	public final static String REMOTEBUFFERSUPPORTED_OPTIONAL = "3";
	public final static String REMOTEBUFFERSUPPORTED_DMTFRESERVED = "..";
	public final static String REMOTEBUFFERSUPPORTED_VENDORSPECIFIC = "0x8000..";
	
	public final static String REMOTEREPLICATIONSERVICEPOINTACCESS_NOTSPECIFIED = "2";
	public final static String REMOTEREPLICATIONSERVICEPOINTACCESS_SOURCE = "3";
	public final static String REMOTEREPLICATIONSERVICEPOINTACCESS_TARGET = "4";
	public final static String REMOTEREPLICATIONSERVICEPOINTACCESS_PROXY = "5";
	public final static String REMOTEREPLICATIONSERVICEPOINTACCESS_DMTFRESERVED = "..";
	public final static String REMOTEREPLICATIONSERVICEPOINTACCESS_VENDORSPECIFIC = "0x8000..";
	
	public final static String REPLICAHOSTACCESSIBILITY_NOTACCESSIBLE = "2";
	public final static String REPLICAHOSTACCESSIBILITY_NORESTRICTIONS = "3";
	public final static String REPLICAHOSTACCESSIBILITY_SOURCEHOSTSONLY = "4";
	public final static String REPLICAHOSTACCESSIBILITY_SOURCEHOSTSEXCLUDED = "5";
	public final static String REPLICAHOSTACCESSIBILITY_DMTFRESERVED = "..";
	
	public final static String REPLICATIONPRIORITYDEFAULT_NOTMANAGED = "0";
	public final static String REPLICATIONPRIORITYDEFAULT_LOW = "1";
	public final static String REPLICATIONPRIORITYDEFAULT_SAME = "2";
	public final static String REPLICATIONPRIORITYDEFAULT_HIGH = "3";
	public final static String REPLICATIONPRIORITYDEFAULT_DMTFRESERVED = "..";
	public final static String REPLICATIONPRIORITYDEFAULT_VENDORSPECIFIC = "0x8000..";
	
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_LOCALREPLICACREATION = "2";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_REMOTEREPLICACREATION = "3";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_LOCALREPLICAMODIFICATION = "4";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_REMOTEREPLICAMODIFICATION = "5";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_LOCALREPLICAATTACHMENT = "6";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_REMOTEREPLICAATTACHMENT = "7";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_BUFFERCREATION = "8";
	public final static String SUPPORTEDASYNCHRONOUSACTIONS_DMTFRESERVED = "..";
	
	public final static String SUPPORTEDMODIFYOPERATIONS_DETACH = "2";
	public final static String SUPPORTEDMODIFYOPERATIONS_FRACTURE = "3";
	public final static String SUPPORTEDMODIFYOPERATIONS_RESYNC = "4";
	public final static String SUPPORTEDMODIFYOPERATIONS_RESTORE = "5";
	public final static String SUPPORTEDMODIFYOPERATIONS_PREPARE = "6";
	public final static String SUPPORTEDMODIFYOPERATIONS_UNPREPARE = "7";
	public final static String SUPPORTEDMODIFYOPERATIONS_QUIESCE = "8";
	public final static String SUPPORTEDMODIFYOPERATIONS_UNQUIESCE = "9";
	public final static String SUPPORTEDMODIFYOPERATIONS_RESETTOSYNC = "10";
	public final static String SUPPORTEDMODIFYOPERATIONS_RESETTOASYNC = "11";
	public final static String SUPPORTEDMODIFYOPERATIONS_STARTCOPY = "12";
	public final static String SUPPORTEDMODIFYOPERATIONS_STOPCOPY = "13";
	public final static String SUPPORTEDMODIFYOPERATIONS_DMTFRESERVED = "..";
	public final static String SUPPORTEDMODIFYOPERATIONS_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_DELTAPOOL = "2";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_DELTAPOOLCOMPONENT = "3";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_REMOTEMIRROR = "4";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_LOCALMIRROR = "5";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_FULLSNAPSHOT = "6";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_DELTASNAPSHOT = "7";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_REPLICATIONBUFFER = "8";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_DMTFRESERVED = "..";
	public final static String SUPPORTEDSPECIALIZEDELEMENTS_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_ASYNC = "2";
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_SYNC = "3";
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_UNSYNCASSOC_FULL = "4";
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_UNSYNCASSOC_DELTA = "5";
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_UNSYNCUNASSOC = "6";
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_DMTFRESERVED = "..";
	public final static String SUPPORTEDSYNCHRONIZATIONTYPE_VENDORSPECIFIC = "32768..65535";
	
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_LOCALREPLICACREATION = "2";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_REMOTEREPLICACREATION = "3";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_LOCALREPLICAMODIFICATION = "4";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_REMOTEREPLICAMODIFICATION = "5";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_LOCALREPLICAATTACHMENT = "6";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_REMOTEREPLICAATTACHMENT = "7";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_BUFFERCREATION = "8";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_NETWORKPIPECREATION = "9";
	public final static String SUPPORTEDSYNCHRONOUSACTIONS_DMTFRESERVED = "..";
	
	public final static String USEREPLICATIONBUFFERDEFAULT_NOTMANAGED = "0";
	public final static String USEREPLICATIONBUFFERDEFAULT_USEBUFFER = "1";
	public final static String USEREPLICATIONBUFFERDEFAULT_DONOTUSEBUFFER = "2";
	public final static String USEREPLICATIONBUFFERDEFAULT_DMTFRESERVED = "..";
	public final static String USEREPLICATIONBUFFERDEFAULT_VENDORSPECIFIC = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageReplicationCapabilities() {

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
	public CIM_StorageReplicationCapabilities(Vector keyProperties){ 
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
	public CIM_StorageReplicationCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageReplicationCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageReplicationCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageReplicationCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageReplicationCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageReplicationCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageReplicationCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageReplicationCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageReplicationCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageReplicationCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageReplicationCapabilities)object).cimObjectPath)) {
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
	
	// Attribute AlternateReplicationServicePointAccess
	
	public UnsignedInt16 get_AlternateReplicationServicePointAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlternateReplicationServicePointAccess(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_AlternateReplicationServicePointAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_ALTERNATEREPLICATIONSERVICEPOINTACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BidirectionalConnectionsSupported
	
	public Boolean get_BidirectionalConnectionsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BidirectionalConnectionsSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_BidirectionalConnectionsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_BIDIRECTIONALCONNECTIONSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReplicaPoolAccess
	
	public UnsignedInt16 get_DeltaReplicaPoolAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReplicaPoolAccess(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_DeltaReplicaPoolAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_DELTAREPLICAPOOLACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HostAccessibleState
	
	public UnsignedInt16[] get_HostAccessibleState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_HostAccessibleState(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_HostAccessibleState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_HOSTACCESSIBLESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncrementalDeltasSupported
	
	public Boolean get_IncrementalDeltasSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncrementalDeltasSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_IncrementalDeltasSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INCREMENTALDELTASSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitialReplicationState
	
	public UnsignedInt16 get_InitialReplicationState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialReplicationState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_InitialReplicationState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitialSynchronizationDefault
	
	public UnsignedInt16 get_InitialSynchronizationDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialSynchronizationDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_InitialSynchronizationDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_INITIALSYNCHRONIZATIONDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalMirrorSnapshotSupported
	
	public Boolean get_LocalMirrorSnapshotSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalMirrorSnapshotSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_LocalMirrorSnapshotSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOCALMIRRORSNAPSHOTSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowSpaceWarningThresholdDefault
	
	public UnsignedInt8 get_LowSpaceWarningThresholdDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowSpaceWarningThresholdDefault(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_LowSpaceWarningThresholdDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_LOWSPACEWARNINGTHRESHOLDDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumConnectionsPerPort
	
	public UnsignedInt16 get_MaximumConnectionsPerPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumConnectionsPerPort(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_MaximumConnectionsPerPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMCONNECTIONSPERPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumLocalReplicationDepth
	
	public UnsignedInt16 get_MaximumLocalReplicationDepth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumLocalReplicationDepth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_MaximumLocalReplicationDepth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMLOCALREPLICATIONDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumPeerConnections
	
	public UnsignedInt16 get_MaximumPeerConnections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumPeerConnections(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_MaximumPeerConnections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPEERCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumPortsPerConnection
	
	public UnsignedInt16 get_MaximumPortsPerConnection() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumPortsPerConnection(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_MaximumPortsPerConnection(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMPORTSPERCONNECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumRemoteReplicationDepth
	
	public UnsignedInt16 get_MaximumRemoteReplicationDepth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumRemoteReplicationDepth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_MaximumRemoteReplicationDepth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREMOTEREPLICATIONDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumReplicasPerSource
	
	public UnsignedInt16 get_MaximumReplicasPerSource() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumReplicasPerSource(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_MaximumReplicasPerSource(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_MAXIMUMREPLICASPERSOURCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PeerConnectionProtocol
	
	public String get_PeerConnectionProtocol() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PeerConnectionProtocol(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_PeerConnectionProtocol(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PEERCONNECTIONPROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PersistentReplicasSupported
	
	public Boolean get_PersistentReplicasSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PersistentReplicasSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_PersistentReplicasSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_PERSISTENTREPLICASSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteBufferElementType
	
	public UnsignedInt16 get_RemoteBufferElementType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteBufferElementType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_RemoteBufferElementType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteBufferHost
	
	public UnsignedInt16 get_RemoteBufferHost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteBufferHost(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_RemoteBufferHost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERHOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteBufferLocation
	
	public UnsignedInt16 get_RemoteBufferLocation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteBufferLocation(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_RemoteBufferLocation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERLOCATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteBufferSupported
	
	public UnsignedInt16 get_RemoteBufferSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteBufferSupported(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_RemoteBufferSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEBUFFERSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteMirrorSnapshotSupported
	
	public Boolean get_RemoteMirrorSnapshotSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteMirrorSnapshotSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_RemoteMirrorSnapshotSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEMIRRORSNAPSHOTSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteReplicationServicePointAccess
	
	public UnsignedInt16 get_RemoteReplicationServicePointAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteReplicationServicePointAccess(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_RemoteReplicationServicePointAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REMOTEREPLICATIONSERVICEPOINTACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReplicaHostAccessibility
	
	public UnsignedInt16 get_ReplicaHostAccessibility() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReplicaHostAccessibility(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_ReplicaHostAccessibility(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICAHOSTACCESSIBILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReplicationPriorityDefault
	
	public UnsignedInt16 get_ReplicationPriorityDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReplicationPriorityDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_ReplicationPriorityDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_REPLICATIONPRIORITYDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpaceLimitSupported
	
	public Boolean get_SpaceLimitSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpaceLimitSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SpaceLimitSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpaceLimitWarningThresholdDefault
	
	public UnsignedInt8 get_SpaceLimitWarningThresholdDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpaceLimitWarningThresholdDefault(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SpaceLimitWarningThresholdDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACELIMITWARNINGTHRESHOLDDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpaceReservationSupported
	
	public Boolean get_SpaceReservationSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpaceReservationSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SpaceReservationSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SPACERESERVATIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedAsynchronousActions
	
	public UnsignedInt16[] get_SupportedAsynchronousActions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedAsynchronousActions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SupportedAsynchronousActions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedModifyOperations
	
	public UnsignedInt16[] get_SupportedModifyOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedModifyOperations(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SupportedModifyOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDMODIFYOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedSpecializedElements
	
	public UnsignedInt16[] get_SupportedSpecializedElements() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedSpecializedElements(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SupportedSpecializedElements(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSPECIALIZEDELEMENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedSynchronizationType
	
	public UnsignedInt16 get_SupportedSynchronizationType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportedSynchronizationType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SupportedSynchronizationType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONIZATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedSynchronousActions
	
	public UnsignedInt16[] get_SupportedSynchronousActions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedSynchronousActions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_SupportedSynchronousActions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UseReplicationBufferDefault
	
	public UnsignedInt16 get_UseReplicationBufferDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UseReplicationBufferDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageReplicationCapabilitiesHelper.isValid_UseReplicationBufferDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageReplicationCapabilities.CIM_PROPERTY_USEREPLICATIONBUFFERDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
