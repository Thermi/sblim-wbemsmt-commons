/** 
 * CIM_UnixProcess.java
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
 * Description:  Each instance of the CIM_UnixProcess class represents a single instance of a
 * running program. A user of the Operating System will typically see a Process
 * as an application or task. Within an OperatingSystem, a Process is defined by
 * a workspace of memory resources and environmental settings that are allocated
 * to it. On a multitasking System, this workspace prevents intrusion of
 * resources by other Processes. Additionally, a Process can execute as multiple
 * Threads, all which run within the same workspace.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  Each instance of the CIM_UnixProcess class represents a single instance of a
 * running program. A user of the Operating System will typically see a Process
 * as an application or task. Within an OperatingSystem, a Process is defined by
 * a workspace of memory resources and environmental settings that are allocated
 * to it. On a multitasking System, this workspace prevents intrusion of
 * resources by other Processes. Additionally, a Process can execute as multiple
 * Threads, all which run within the same workspace.
 */
public class CIM_UnixProcess extends CIM_Process  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnixProcess"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	The executing process's command path.
	*/
	public final static String CIM_PROPERTY_MODULEPATH = "ModulePath"; //$NON-NLS-1$
	/**
	*	The operating system parameters provided to the executing process. These are the argv[] values.
	*/
	public final static String CIM_PROPERTY_PARAMETERS = "Parameters"; //$NON-NLS-1$
	/**
	*	The parent process ID of this executing process.
	*/
	public final static String CIM_PROPERTY_PARENTPROCESSID = "ParentProcessID"; //$NON-NLS-1$
	/**
	*	The Group ID of this currently executing process.
	*/
	public final static String CIM_PROPERTY_PROCESSGROUPID = "ProcessGroupID"; //$NON-NLS-1$
	/**
	*	The process's 'nice' value. Used to compute its priority.
	*/
	public final static String CIM_PROPERTY_PROCESSNICEVALUE = "ProcessNiceValue"; //$NON-NLS-1$
	/**
	*	If part of a group of processes are under the control of a session leader, this property holds the session ID for the group.
	*/
	public final static String CIM_PROPERTY_PROCESSSESSIONID = "ProcessSessionID"; //$NON-NLS-1$
	/**
	*	The TTY currently associated with this process.
	*/
	public final static String CIM_PROPERTY_PROCESSTTY = "ProcessTTY"; //$NON-NLS-1$
	/**
	*	A description of the event this process is currently sleeping for. The precise nature of this string is implementation defined, but is typically the address of a system data structure that will be modified when the event occurs. This string only has meaning when the ExecutionState is "Blocked" or "SuspendedBlocked".
	*/
	public final static String CIM_PROPERTY_PROCESSWAITINGFOREVENT = "ProcessWaitingForEvent"; //$NON-NLS-1$
	/**
	*	The Real User ID of this currently executing process.
	*/
	public final static String CIM_PROPERTY_REALUSERID = "RealUserID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MODULEPATH);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARAMETERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARENTPROCESSID);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROCESSGROUPID);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROCESSNICEVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROCESSSESSIONID);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROCESSTTY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROCESSWAITINGFOREVENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_REALUSERID);
				
		for (int i = 0; i < CIM_Process.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MODULEPATH)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARAMETERS)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARENTPROCESSID)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROCESSGROUPID)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROCESSNICEVALUE)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROCESSSESSIONID)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROCESSTTY)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROCESSWAITINGFOREVENT)||
				((String)CIM_Process.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REALUSERID)){
				continue;
			}
			
			CIM_UnixProcess.CIM_PropertyNameList.add(CIM_Process.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MODULEPATH, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARAMETERS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARENTPROCESSID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROCESSGROUPID, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROCESSNICEVALUE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROCESSSESSIONID, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROCESSTTY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROCESSWAITINGFOREVENT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REALUSERID, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_Process.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MODULEPATH)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARAMETERS)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARENTPROCESSID)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROCESSGROUPID)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROCESSNICEVALUE)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROCESSSESSIONID)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROCESSTTY)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROCESSWAITINGFOREVENT)||
				((CIMProperty)CIM_Process.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REALUSERID)){
				continue;
			}
			
			CIM_UnixProcess.CIM_PropertyList.add(CIM_Process.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Process.Java_Package_List.size(); i++) {
			if (((String)CIM_Process.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Process.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnixProcess() {

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
	public CIM_UnixProcess(Vector keyProperties){ 
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
	public CIM_UnixProcess(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ParentProcessID = this.cimInstance.getProperty(CIM_PROPERTY_PARENTPROCESSID);
		
		if (CIMProperty_ParentProcessID == null || CIMProperty_ParentProcessID.getValue().isEmpty() || CIMProperty_ParentProcessID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PARENTPROCESSID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProcessGroupID = this.cimInstance.getProperty(CIM_PROPERTY_PROCESSGROUPID);
		
		if (CIMProperty_ProcessGroupID == null || CIMProperty_ProcessGroupID.getValue().isEmpty() || CIMProperty_ProcessGroupID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PROCESSGROUPID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_RealUserID = this.cimInstance.getProperty(CIM_PROPERTY_REALUSERID);
		
		if (CIMProperty_RealUserID == null || CIMProperty_RealUserID.getValue().isEmpty() || CIMProperty_RealUserID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_REALUSERID, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_UnixProcess)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnixProcess)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnixProcess)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnixProcess)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnixProcess)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnixProcess)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnixProcess)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnixProcess)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnixProcess)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnixProcess)object).cimObjectPath)) {
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
	
	// Attribute ModulePath
	
	public String get_ModulePath() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_MODULEPATH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_MODULEPATH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_MODULEPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ModulePath(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_MODULEPATH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_MODULEPATH + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ModulePath(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_MODULEPATH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_MODULEPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Parameters
	
	public String[] get_Parameters() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PARAMETERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARAMETERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARAMETERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_Parameters(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PARAMETERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARAMETERS + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_Parameters(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PARAMETERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARAMETERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ParentProcessID
	
	public String get_ParentProcessID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ParentProcessID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ParentProcessID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PARENTPROCESSID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProcessGroupID
	
	public UnsignedInt64 get_ProcessGroupID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProcessGroupID(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ProcessGroupID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSGROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProcessNiceValue
	
	public UnsignedInt32 get_ProcessNiceValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProcessNiceValue(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ProcessNiceValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSNICEVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProcessSessionID
	
	public UnsignedInt64 get_ProcessSessionID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProcessSessionID(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ProcessSessionID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSSESSIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProcessTTY
	
	public String get_ProcessTTY() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProcessTTY(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ProcessTTY(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSTTY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProcessWaitingForEvent
	
	public String get_ProcessWaitingForEvent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProcessWaitingForEvent(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_ProcessWaitingForEvent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_PROCESSWAITINGFOREVENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RealUserID
	
	public UnsignedInt64 get_RealUserID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_REALUSERID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_REALUSERID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_REALUSERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RealUserID(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcess.CIM_PROPERTY_REALUSERID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcess.CIM_PROPERTY_REALUSERID + " could not be found");
    		
		} else if (!CIM_UnixProcessHelper.isValid_RealUserID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcess.CIM_PROPERTY_REALUSERID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcess.CIM_PROPERTY_REALUSERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
