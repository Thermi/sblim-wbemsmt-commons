/** 
 * CIM_ParticipatingCS.java
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
 * Description:  A Cluster is composed of two or more ComputerSystems, operating together. A
 * ComputerSystem may participate in multiple Clusters. When first establishing
 * or bringing up a Cluster, only one ComputerSystem may be defined as
 * participating in it. Therfore, the cardinality of the association for the
 * ComputerSystem reference is Min (1).
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
 *  A Cluster is composed of two or more ComputerSystems, operating together. A
 * ComputerSystem may participate in multiple Clusters. When first establishing
 * or bringing up a Cluster, only one ComputerSystem may be defined as
 * participating in it. Therfore, the cardinality of the association for the
 * ComputerSystem reference is Min (1).
 */
public class CIM_ParticipatingCS extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_ParticipatingCS"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_COMPUTERSYSTEM = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_CLUSTER = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	RoleOfNode indicates whether the Cluster nodes are peers (value = 2), connected in a master-slave/primary- secondary relationship (values = 3 for primary, 4 for secondary), available in a standby configuration (5) or of some other (1) or unknown (0) relationship. In a System/390 environment, the nodes are identified as "Base Plex" (value=6) or "Enhanced Plex" (value=7).
	*/
	public final static String CIM_PROPERTY_ROLEOFNODE = "RoleOfNode"; //$NON-NLS-1$
	/**
	*	StateOfNode indicates the condition of the participating ComputerSystem in the Cluster. For example, one value is "Joining" (2).
	*/
	public final static String CIM_PROPERTY_STATEOFNODE = "StateOfNode"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ROLEOFNODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATEOFNODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_COMPUTERSYSTEM);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CLUSTER);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROLEOFNODE)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATEOFNODE)){
				continue;
			}
			
			CIM_ParticipatingCS.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROLEOFNODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATEOFNODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_COMPUTERSYSTEM, new CIMValue(null, new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CLUSTER, new CIMValue(null, new CIMDataType(CIM_Cluster.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROLEOFNODE)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATEOFNODE)){
				continue;
			}
			
			CIM_ParticipatingCS.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_Dependency.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_ROLEOFNODE = {"Unknown","Other","Peer","Primary","Secondary","Standby","Base Plex","Enhanced Plex"};
	public final static String[] CIM_VALUEMAP_STATEOFNODE = {"Unknown","Other","Joining","Paused","Available","Unavailable","Degraded"};
	
	
	public final static int ROLEOFNODE_UNKNOWN = 0;
	public final static int ROLEOFNODE_OTHER = 1;
	public final static int ROLEOFNODE_PEER = 2;
	public final static int ROLEOFNODE_PRIMARY = 3;
	public final static int ROLEOFNODE_SECONDARY = 4;
	public final static int ROLEOFNODE_STANDBY = 5;
	public final static int ROLEOFNODE_BASEPLEX = 6;
	public final static int ROLEOFNODE_ENHANCEDPLEX = 7;
	
	public final static int STATEOFNODE_UNKNOWN = 0;
	public final static int STATEOFNODE_OTHER = 1;
	public final static int STATEOFNODE_JOINING = 2;
	public final static int STATEOFNODE_PAUSED = 3;
	public final static int STATEOFNODE_AVAILABLE = 4;
	public final static int STATEOFNODE_UNAVAILABLE = 5;
	public final static int STATEOFNODE_DEGRADED = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ParticipatingCS() {

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
	public CIM_ParticipatingCS(Vector keyProperties){ 
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
	public CIM_ParticipatingCS(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_ParticipatingCS.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ParticipatingCS.Java_Package_List.toArray(new String[CIM_ParticipatingCS.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_ParticipatingCS)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ParticipatingCS)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ParticipatingCS)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ParticipatingCS)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ParticipatingCS)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ParticipatingCS)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ParticipatingCS)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ParticipatingCS)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ParticipatingCS)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ParticipatingCS)object).cimObjectPath)) {
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
	
	// Attribute RoleOfNode
	
	public UnsignedInt16 get_RoleOfNode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RoleOfNode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE + " could not be found");
    		
		} else if (!CIM_ParticipatingCSHelper.isValid_RoleOfNode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_ROLEOFNODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StateOfNode
	
	public UnsignedInt16 get_StateOfNode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StateOfNode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE + " could not be found");
    		
		} else if (!CIM_ParticipatingCSHelper.isValid_StateOfNode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_STATEOFNODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ComputerSystem
	
	public CIMObjectPath get_CIM_ComputerSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " is not of expected type CIM_ComputerSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ComputerSystem(CIM_ComputerSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " could not be found");
    		
		} else if (!CIM_ParticipatingCSHelper.isValid_CIM_ComputerSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " is not of expected type CIM_ComputerSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Cluster
	
	public CIMObjectPath get_CIM_Cluster() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER + " is not of expected type CIM_Cluster.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Cluster(CIM_Cluster newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER + " could not be found");
    		
		} else if (!CIM_ParticipatingCSHelper.isValid_CIM_Cluster(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ParticipatingCS.CIM_PROPERTY_CIM_CLUSTER + " is not of expected type CIM_Cluster.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Cluster.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
