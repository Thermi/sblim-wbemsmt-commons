/** 
 * CIM_UnixThread.java
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
 * Description: Threads represent the ability to execute units of a Process or task in parallel. A UnixThread inherits from the superclass, CIM_Thread, which is weak to the Process. The values used are defined in sched.h and psched.h.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_UnixThread extends CIM_Thread  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnixThread";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Indicates the thread's cancelability state.
	*/
	public final static String CIM_PROPERTY_CANCELSTATE = "CancelState"; //$NON-NLS-1$
	/**
	*	Indicates the thread's cancelability type.
	*/
	public final static String CIM_PROPERTY_CANCELTYPE = "CancelType"; //$NON-NLS-1$
	/**
	*	Indicates the thread's concurrency level.
	*/
	public final static String CIM_PROPERTY_CONCURRENCYLEVEL = "ConcurrencyLevel"; //$NON-NLS-1$
	/**
	*	Indicates the contention scope of the thread.
	*/
	public final static String CIM_PROPERTY_CONTENTIONSCOPE = "ContentionScope"; //$NON-NLS-1$
	/**
	*	Indicates the creation state of the thread.
	*/
	public final static String CIM_PROPERTY_DETACHSTATE = "DetachState"; //$NON-NLS-1$
	/**
	*	Indicates the size of the guard area for a created thread's stack.
	*/
	public final static String CIM_PROPERTY_GUARDSIZE = "GuardSize"; //$NON-NLS-1$
	/**
	*	Indicates how the scheduling attributes are to be set.
	*/
	public final static String CIM_PROPERTY_INHERITSCHED = "InheritSched"; //$NON-NLS-1$
	/**
	*	Indicates the thread's scheduling policy when SchedPolicy is set to "Other".
	*/
	public final static String CIM_PROPERTY_OTHERSCHEDPOLICY = "OtherSchedPolicy"; //$NON-NLS-1$
	/**
	*	Indicates the thread's scheduling policy. Set to "Other" when using OtherSchedPolicy to specifiy additional values. "Other" represents SCHED_OTHER as defined in sched.h.
	*/
	public final static String CIM_PROPERTY_SCHEDPOLICY = "SchedPolicy"; //$NON-NLS-1$
	/**
	*	Indicates the size of storage to be used for the thread's stack.
	*/
	public final static String CIM_PROPERTY_STACKSIZE = "StackSize"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CANCELSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CANCELTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONCURRENCYLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONTENTIONSCOPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DETACHSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_GUARDSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INHERITSCHED);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSCHEDPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCHEDPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_STACKSIZE);
				
		for (int i = 0; i < CIM_Thread.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CANCELSTATE)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CANCELTYPE)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONCURRENCYLEVEL)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONTENTIONSCOPE)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DETACHSTATE)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GUARDSIZE)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INHERITSCHED)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSCHEDPOLICY)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCHEDPOLICY)||
				((String)CIM_Thread.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STACKSIZE)){
				continue;
			}
			
			CIM_UnixThread.CIM_PropertyNameList.add(CIM_Thread.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CANCELSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CANCELTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONCURRENCYLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONTENTIONSCOPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DETACHSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GUARDSIZE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INHERITSCHED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSCHEDPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCHEDPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STACKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Thread.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CANCELSTATE)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CANCELTYPE)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONCURRENCYLEVEL)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONTENTIONSCOPE)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DETACHSTATE)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GUARDSIZE)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INHERITSCHED)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSCHEDPOLICY)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCHEDPOLICY)||
				((CIMProperty)CIM_Thread.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STACKSIZE)){
				continue;
			}
			
			CIM_UnixThread.CIM_PropertyList.add(CIM_Thread.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Thread.Java_Package_List.size(); i++) {
			if (((String)CIM_Thread.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Thread.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CANCELSTATE = {"Unknown","PTHREAD_CANCEL_ENABLE","PTHREAD_CANCEL_DISABLE"};
	public final static String[] CIM_VALUEMAP_CANCELTYPE = {"Unknown","PTHREAD_CANCEL_DEFERRED","PTHREAD_CANCEL_ASYNCHRONOUS"};
	public final static String[] CIM_VALUEMAP_CONTENTIONSCOPE = {"Unknown","PTHREAD_SCOPE_SYSTEM","PTHREAD_SCOPE_PROCESS"};
	public final static String[] CIM_VALUEMAP_DETACHSTATE = {"Unknown","PTHREAD_CREATE_DETACHED","PTHREAD_CREATE_JOINABLE"};
	public final static String[] CIM_VALUEMAP_INHERITSCHED = {"Unknown","PTHREAD_INHERIT_SCHED","PTHREAD_EXPLICIT_SCHED"};
	public final static String[] CIM_VALUEMAP_SCHEDPOLICY = {"Unknown","Other","SCHED_FIFO","SCHED_RR"};
	
	
	public final static int CANCELSTATE_UNKNOWN = 0;
	public final static int CANCELSTATE_PTHREAD_CANCEL_ENABLE = 2;
	public final static int CANCELSTATE_PTHREAD_CANCEL_DISABLE = 3;
	
	public final static int CANCELTYPE_UNKNOWN = 0;
	public final static int CANCELTYPE_PTHREAD_CANCEL_DEFERRED = 2;
	public final static int CANCELTYPE_PTHREAD_CANCEL_ASYNCHRONOUS = 3;
	
	public final static int CONTENTIONSCOPE_UNKNOWN = 0;
	public final static int CONTENTIONSCOPE_PTHREAD_SCOPE_SYSTEM = 2;
	public final static int CONTENTIONSCOPE_PTHREAD_SCOPE_PROCESS = 3;
	
	public final static int DETACHSTATE_UNKNOWN = 0;
	public final static int DETACHSTATE_PTHREAD_CREATE_DETACHED = 2;
	public final static int DETACHSTATE_PTHREAD_CREATE_JOINABLE = 3;
	
	public final static int INHERITSCHED_UNKNOWN = 0;
	public final static int INHERITSCHED_PTHREAD_INHERIT_SCHED = 2;
	public final static int INHERITSCHED_PTHREAD_EXPLICIT_SCHED = 3;
	
	public final static int SCHEDPOLICY_UNKNOWN = 0;
	public final static int SCHEDPOLICY_OTHER = 1;
	public final static int SCHEDPOLICY_SCHED_FIFO = 2;
	public final static int SCHEDPOLICY_SCHED_RR = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnixThread() {

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
	public CIM_UnixThread(Vector keyProperties){ 
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
	public CIM_UnixThread(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_UnixThread)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnixThread)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnixThread)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnixThread)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnixThread)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnixThread)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnixThread)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnixThread)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnixThread)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnixThread)object).cimObjectPath)) {
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
	
	// Attribute CancelState
	
	public UnsignedInt16 get_CancelState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CANCELSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CancelState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CANCELSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELSTATE + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_CancelState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_CANCELSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CancelType
	
	public UnsignedInt16 get_CancelType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CANCELTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CancelType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CANCELTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELTYPE + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_CancelType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_CANCELTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CANCELTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConcurrencyLevel
	
	public UnsignedInt64 get_ConcurrencyLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConcurrencyLevel(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_ConcurrencyLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CONCURRENCYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ContentionScope
	
	public UnsignedInt16 get_ContentionScope() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ContentionScope(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_ContentionScope(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_CONTENTIONSCOPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DetachState
	
	public UnsignedInt16 get_DetachState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_DETACHSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_DETACHSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_DETACHSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DetachState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_DETACHSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_DETACHSTATE + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_DetachState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_DETACHSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_DETACHSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GuardSize
	
	public String get_GuardSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_GUARDSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_GUARDSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_GUARDSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GuardSize(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_GUARDSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_GUARDSIZE + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_GuardSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_GUARDSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_GUARDSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InheritSched
	
	public UnsignedInt16 get_InheritSched() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_INHERITSCHED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_INHERITSCHED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_INHERITSCHED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InheritSched(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_INHERITSCHED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_INHERITSCHED + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_InheritSched(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_INHERITSCHED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_INHERITSCHED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSchedPolicy
	
	public String get_OtherSchedPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherSchedPolicy(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_OtherSchedPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_OTHERSCHEDPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SchedPolicy
	
	public UnsignedInt16 get_SchedPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SchedPolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_SchedPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_SCHEDPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StackSize
	
	public String get_StackSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_STACKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_STACKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_STACKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StackSize(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixThread.CIM_PROPERTY_STACKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixThread.CIM_PROPERTY_STACKSIZE + " could not be found");
    		
		} else if (!CIM_UnixThreadHelper.isValid_StackSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixThread.CIM_PROPERTY_STACKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixThread.CIM_PROPERTY_STACKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
