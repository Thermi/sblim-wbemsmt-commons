/** 
 * CIM_NFS.java
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
 * Description:  A class derived from RemoteFileSystem representing that the FileSystem is
 * mounted, using the NFS protocol, from a ComputerSystem. The properties of the
 * NFS object deal with the operational aspects of the mount and represent the
 * client-side configuration for NFS access. The FileSystemType (inherited from
 * FileSystem) should be set to indicate the type of this FileSystem as it
 * appears to the client.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  A class derived from RemoteFileSystem representing that the FileSystem is
 * mounted, using the NFS protocol, from a ComputerSystem. The properties of the
 * NFS object deal with the operational aspects of the mount and represent the
 * client-side configuration for NFS access. The FileSystemType (inherited from
 * FileSystem) should be set to indicate the type of this FileSystem as it
 * appears to the client.
 */
public class CIM_NFS extends CIM_RemoteFileSystem  {
	
	public final static String CIM_CLASS_NAME = "CIM_NFS"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	If set to true: Control attribute caching is enabled. 
If set to false: Control attribute caching is disabled.
	*/
	public final static String CIM_PROPERTY_ATTRIBUTECACHING = "AttributeCaching"; //$NON-NLS-1$
	/**
	*	Maximum number of seconds that cached attributes are held after directory update.
	*/
	public final static String CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX = "AttributeCachingForDirectoriesMax"; //$NON-NLS-1$
	/**
	*	Minimum number of seconds that cached attributes are held after directory update.
	*/
	public final static String CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN = "AttributeCachingForDirectoriesMin"; //$NON-NLS-1$
	/**
	*	Maximum number of seconds that cached attributes are held after file modification.
	*/
	public final static String CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX = "AttributeCachingForRegularFilesMax"; //$NON-NLS-1$
	/**
	*	Minimum number of seconds that cached attributes are held after file modification.
	*/
	public final static String CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN = "AttributeCachingForRegularFilesMin"; //$NON-NLS-1$
	/**
	*	If set to true: Retries are performed in the foreground. 
If set to false: If the first mount attempt fails, retries are performed in the background.
	*/
	public final static String CIM_PROPERTY_FOREGROUNDMOUNT = "ForegroundMount"; //$NON-NLS-1$
	/**
	*	If set to true: Once the FileSystem is mounted, NFS requests are retried until the hosting System responds. 
If set to false: Once the FileSystem is mounted, an error is returned if the hosting System does not respond.
	*/
	public final static String CIM_PROPERTY_HARDMOUNT = "HardMount"; //$NON-NLS-1$
	/**
	*	If set to true: Interrupts are permitted for hard mounts. 
If set to false : Interrupts are ignored for hard mounts.
	*/
	public final static String CIM_PROPERTY_INTERRUPT = "Interrupt"; //$NON-NLS-1$
	/**
	*	Maximum number of mount failure retries allowed.
	*/
	public final static String CIM_PROPERTY_MOUNTFAILURERETRIES = "MountFailureRetries"; //$NON-NLS-1$
	/**
	*	Read buffer size in bytes.
	*/
	public final static String CIM_PROPERTY_READBUFFERSIZE = "ReadBufferSize"; //$NON-NLS-1$
	/**
	*	Maximum number of NFS retransmissions allowed.
	*/
	public final static String CIM_PROPERTY_RETRANSMISSIONATTEMPTS = "RetransmissionAttempts"; //$NON-NLS-1$
	/**
	*	NFS timeout in tenths of a second.
	*/
	public final static String CIM_PROPERTY_RETRANSMISSIONTIMEOUT = "RetransmissionTimeout"; //$NON-NLS-1$
	/**
	*	The remote ComputerSystem's (ie, the NFS File 'Server's) UDP port number.
	*/
	public final static String CIM_PROPERTY_SERVERCOMMUNICATIONPORT = "ServerCommunicationPort"; //$NON-NLS-1$
	/**
	*	Write buffer size in bytes.
	*/
	public final static String CIM_PROPERTY_WRITEBUFFERSIZE = "WriteBufferSize"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTRIBUTECACHING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_FOREGROUNDMOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_HARDMOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERRUPT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MOUNTFAILURERETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_READBUFFERSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RETRANSMISSIONATTEMPTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RETRANSMISSIONTIMEOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVERCOMMUNICATIONPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEBUFFERSIZE);
				
		for (int i = 0; i < CIM_RemoteFileSystem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTRIBUTECACHING)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FOREGROUNDMOUNT)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HARDMOUNT)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERRUPT)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOUNTFAILURERETRIES)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READBUFFERSIZE)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RETRANSMISSIONATTEMPTS)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RETRANSMISSIONTIMEOUT)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVERCOMMUNICATIONPORT)||
				((String)CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEBUFFERSIZE)){
				continue;
			}
			
			CIM_NFS.CIM_PropertyNameList.add(CIM_RemoteFileSystem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTRIBUTECACHING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FOREGROUNDMOUNT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HARDMOUNT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERRUPT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOUNTFAILURERETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READBUFFERSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RETRANSMISSIONATTEMPTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RETRANSMISSIONTIMEOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVERCOMMUNICATIONPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEBUFFERSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_RemoteFileSystem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTRIBUTECACHING)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FOREGROUNDMOUNT)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HARDMOUNT)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERRUPT)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOUNTFAILURERETRIES)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READBUFFERSIZE)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RETRANSMISSIONATTEMPTS)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RETRANSMISSIONTIMEOUT)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVERCOMMUNICATIONPORT)||
				((CIMProperty)CIM_RemoteFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEBUFFERSIZE)){
				continue;
			}
			
			CIM_NFS.CIM_PropertyList.add(CIM_RemoteFileSystem.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_RemoteFileSystem.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NFS() {

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
	public CIM_NFS(Vector keyProperties){ 
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
	public CIM_NFS(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_NFS.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_NFS.Java_Package_List.toArray(new String[CIM_NFS.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_NFS)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NFS)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NFS)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NFS)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NFS)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NFS)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NFS)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NFS)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NFS)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NFS)object).cimObjectPath)) {
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
	
	// Attribute AttributeCaching
	
	public Boolean get_AttributeCaching() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttributeCaching(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_AttributeCaching(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttributeCachingForDirectoriesMax
	
	public UnsignedInt16 get_AttributeCachingForDirectoriesMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttributeCachingForDirectoriesMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_AttributeCachingForDirectoriesMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttributeCachingForDirectoriesMin
	
	public UnsignedInt16 get_AttributeCachingForDirectoriesMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttributeCachingForDirectoriesMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_AttributeCachingForDirectoriesMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttributeCachingForRegularFilesMax
	
	public UnsignedInt16 get_AttributeCachingForRegularFilesMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttributeCachingForRegularFilesMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_AttributeCachingForRegularFilesMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttributeCachingForRegularFilesMin
	
	public UnsignedInt16 get_AttributeCachingForRegularFilesMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttributeCachingForRegularFilesMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_AttributeCachingForRegularFilesMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ForegroundMount
	
	public Boolean get_ForegroundMount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ForegroundMount(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_ForegroundMount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_FOREGROUNDMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HardMount
	
	public Boolean get_HardMount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_HARDMOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_HARDMOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_HARDMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HardMount(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_HARDMOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_HARDMOUNT + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_HardMount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_HARDMOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_HARDMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Interrupt
	
	public Boolean get_Interrupt() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_INTERRUPT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_INTERRUPT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_INTERRUPT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Interrupt(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_INTERRUPT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_INTERRUPT + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_Interrupt(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_INTERRUPT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_INTERRUPT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MountFailureRetries
	
	public UnsignedInt16 get_MountFailureRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MountFailureRetries(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_MountFailureRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_MOUNTFAILURERETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadBufferSize
	
	public UnsignedInt64 get_ReadBufferSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_READBUFFERSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_READBUFFERSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_READBUFFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadBufferSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_READBUFFERSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_READBUFFERSIZE + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_ReadBufferSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_READBUFFERSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_READBUFFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RetransmissionAttempts
	
	public UnsignedInt16 get_RetransmissionAttempts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RetransmissionAttempts(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_RetransmissionAttempts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONATTEMPTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RetransmissionTimeout
	
	public UnsignedInt32 get_RetransmissionTimeout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RetransmissionTimeout(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_RetransmissionTimeout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_RETRANSMISSIONTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServerCommunicationPort
	
	public UnsignedInt32 get_ServerCommunicationPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServerCommunicationPort(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_ServerCommunicationPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_SERVERCOMMUNICATIONPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteBufferSize
	
	public UnsignedInt64 get_WriteBufferSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteBufferSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE + " could not be found");
    		
		} else if (!CIM_NFSHelper.isValid_WriteBufferSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NFS.CIM_PROPERTY_WRITEBUFFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
