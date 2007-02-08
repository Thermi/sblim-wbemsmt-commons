/** 
 * CIM_StorageSynchronized.java
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
 * Description: Indicates that two Storage objects were replicated at the specified point in time. If the CopyType property is set to 'Sync' (=3), then synchronization of the Storage objects is preserved.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_StorageSynchronized extends CIM_Synchronized  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageSynchronized";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT_1 = "SystemElement"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT_2 = "SyncedElement"; //$NON-NLS-1$
	
	
	/**
	*	CopyType describes the Replication Policy. Values are: 
Async: create and maintain an asynchronous copy of the source. 
Sync: create and maintain a synchronized copy of the source. 
UnSyncAssoc: create an unsynchronized copy and maintain an association to the source.
	*/
	public final static String CIM_PROPERTY_COPYTYPE = "CopyType"; //$NON-NLS-1$
	/**
	*	ReplicaType provides information on how the Replica is being maintained. Values are: 
Full Copy: This indicates that a full copy of the source object is (or will be) generated . 
Before Delta: This indicates that the source object will be maintained as a delta data from the replica. 
After Delta: This indicates that the replica will be maintained as delta data from the source object. 
Log: This indicates that the replica object is being maintained as a log of changes to the source. 
Not Specified: The method of maintaining the copy is not specified.
	*/
	public final static String CIM_PROPERTY_REPLICATYPE = "ReplicaType"; //$NON-NLS-1$
	/**
	*	SyncState describes the state of the association with respect to Replication activity. Values are: 
Initialized: The link to enable replication is established. 
PrepareInProgress: Preparation for Replication is in progress. 
Prepared: All necessary preparation has completed. 
ResyncInProgress: Synchronization or Resynchronization is in progress. 
This may be the initial 'copy' or subsequent changes being copied. 
Synchronized: An Async or Sync replication is currently synchronized. When this value is set, SyncMaintained will be true. 
FractureInProgress: An operation to fracture an Async or Sync replication is in progress. 
Fractured: An Async or Sync replication is fractured. 
QuiesceInProgress: A quiesce operation is in progress. 
Quiesced: The replication has been quiesced and is ready for a change. 
RestoreInProgress: An operation is in progress to copy the Synced object to the System object. 
Idle: The 'normal' state for an UnSyncAssoc replica. 
Broken: The relationship is non-functional due to errors in the source, the target, the path between the two or space constraints.
	*/
	public final static String CIM_PROPERTY_SYNCSTATE = "SyncState"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_COPYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLICATYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYNCSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
				
		for (int i = 0; i < CIM_Synchronized.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Synchronized.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COPYTYPE)||
				((String)CIM_Synchronized.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLICATYPE)||
				((String)CIM_Synchronized.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYNCSTATE)){
				continue;
			}
			
			CIM_StorageSynchronized.CIM_PropertyNameList.add(CIM_Synchronized.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COPYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLICATYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYNCSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT_1, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT_2, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Synchronized.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Synchronized.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COPYTYPE)||
				((CIMProperty)CIM_Synchronized.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLICATYPE)||
				((CIMProperty)CIM_Synchronized.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYNCSTATE)){
				continue;
			}
			
			CIM_StorageSynchronized.CIM_PropertyList.add(CIM_Synchronized.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Synchronized.Java_Package_List.size(); i++) {
			if (((String)CIM_Synchronized.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Synchronized.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_COPYTYPE = {"Async","Sync","UnSyncAssoc","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_REPLICATYPE = {"Not Specified","Full Copy","Before Delta","After Delta","Log","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SYNCSTATE = {"Initialized","PrepareInProgress","Prepared","ResyncInProgress","Synchronized","Fracture In Progress","QuiesceInProgress","Quiesced","Restore In Progresss","Idle","Broken","Fractured","DMTF Reserved","Vendor Specific"};
	
	
	public final static String COPYTYPE_ASYNC = "2";
	public final static String COPYTYPE_SYNC = "3";
	public final static String COPYTYPE_UNSYNCASSOC = "4";
	public final static String COPYTYPE_DMTFRESERVED = "..";
	public final static String COPYTYPE_VENDORSPECIFIC = "0x8000..";
	
	public final static String REPLICATYPE_NOTSPECIFIED = "0";
	public final static String REPLICATYPE_FULLCOPY = "2";
	public final static String REPLICATYPE_BEFOREDELTA = "3";
	public final static String REPLICATYPE_AFTERDELTA = "4";
	public final static String REPLICATYPE_LOG = "5";
	public final static String REPLICATYPE_DMTFRESERVED = "..";
	public final static String REPLICATYPE_VENDORSPECIFIC = "0x8000..";
	
	public final static String SYNCSTATE_INITIALIZED = "2";
	public final static String SYNCSTATE_PREPAREINPROGRESS = "3";
	public final static String SYNCSTATE_PREPARED = "4";
	public final static String SYNCSTATE_RESYNCINPROGRESS = "5";
	public final static String SYNCSTATE_SYNCHRONIZED = "6";
	public final static String SYNCSTATE_FRACTUREINPROGRESS = "7";
	public final static String SYNCSTATE_QUIESCEINPROGRESS = "8";
	public final static String SYNCSTATE_QUIESCED = "9";
	public final static String SYNCSTATE_RESTOREINPROGRESSS = "10";
	public final static String SYNCSTATE_IDLE = "11";
	public final static String SYNCSTATE_BROKEN = "12";
	public final static String SYNCSTATE_FRACTURED = "13";
	public final static String SYNCSTATE_DMTFRESERVED = "..";
	public final static String SYNCSTATE_VENDORSPECIFIC = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageSynchronized() {

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
	public CIM_StorageSynchronized(Vector keyProperties){ 
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
	public CIM_StorageSynchronized(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageSynchronized)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageSynchronized)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageSynchronized)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageSynchronized)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageSynchronized)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageSynchronized)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageSynchronized)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageSynchronized)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageSynchronized)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageSynchronized)object).cimObjectPath)) {
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
	
	// Attribute CopyType
	
	public UnsignedInt16 get_CopyType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CopyType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE + " could not be found");
    		
		} else if (!CIM_StorageSynchronizedHelper.isValid_CopyType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_COPYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReplicaType
	
	public UnsignedInt16 get_ReplicaType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReplicaType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE + " could not be found");
    		
		} else if (!CIM_StorageSynchronizedHelper.isValid_ReplicaType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_REPLICATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SyncState
	
	public UnsignedInt16 get_SyncState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SyncState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE + " could not be found");
    		
		} else if (!CIM_StorageSynchronizedHelper.isValid_SyncState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_SYNCSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement_1
	
	public CIMObjectPath get_CIM_ManagedElement_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement_1(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " could not be found");
    		
		} else if (!CIM_StorageSynchronizedHelper.isValid_CIM_ManagedElement_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_1 + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement_2
	
	public CIMObjectPath get_CIM_ManagedElement_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement_2(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " could not be found");
    		
		} else if (!CIM_StorageSynchronizedHelper.isValid_CIM_ManagedElement_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSynchronized.CIM_PROPERTY_CIM_MANAGEDELEMENT_2 + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
