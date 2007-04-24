/** 
 * CIM_FibrePortEventCounters.java
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
 * Description:  The use of the FibrePortEventCounters class is deprecated, since FibrePort is
 * deprecated. FCPortStatistics should be used instead, but redefines the level
 * at which data is collected. This is why there is no direct translation of the
 * individual counters between the two classes. This object defines error
 * counters specific to a FibrePort.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



/**
 *  The use of the FibrePortEventCounters class is deprecated, since FibrePort is
 * deprecated. FCPortStatistics should be used instead, but redefines the level
 * at which data is collected. This is why there is no direct translation of the
 * individual counters between the two classes. This object defines error
 * counters specific to a FibrePort.
 */
public class CIM_FibrePortEventCounters extends CIM_DeviceStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_FibrePortEventCounters"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Number of frames received containing 'EOF Abort'.
	*/
	public final static String CIM_PROPERTY_EOFABORTSRECEIVED = "EOFAbortsReceived"; //$NON-NLS-1$
	/**
	*	Number of frames transmitted containing 'EOF Abort'.
	*/
	public final static String CIM_PROPERTY_EOFABORTSTRANSMITTED = "EOFAbortsTransmitted"; //$NON-NLS-1$
	/**
	*	The number of login frames received.
	*/
	public final static String CIM_PROPERTY_PLOGISRECEIVED = "PLOGIsReceived"; //$NON-NLS-1$
	/**
	*	The number of PLOGI frames sent where the response was LS_RJT.
	*/
	public final static String CIM_PROPERTY_PLOGISREJECTED = "PLOGIsRejected"; //$NON-NLS-1$
	/**
	*	The number of login frames sent.
	*/
	public final static String CIM_PROPERTY_PLOGISSENT = "PLOGIsSent"; //$NON-NLS-1$
	/**
	*	The number of logouts received from various targets.
	*/
	public final static String CIM_PROPERTY_PLOGOSRECEIVED = "PLOGOsReceived"; //$NON-NLS-1$
	/**
	*	The number of PLOGO frames sent where the response was LS_RJT.
	*/
	public final static String CIM_PROPERTY_PLOGOSREJECTED = "PLOGOsRejected"; //$NON-NLS-1$
	/**
	*	The number of logout frames sent.
	*/
	public final static String CIM_PROPERTY_PLOGOSSENT = "PLOGOsSent"; //$NON-NLS-1$
	
	
	/**
	*	Method to reset the Port event counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 through 8 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_RESETCOUNTER = "ResetCounter";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_EOFABORTSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_EOFABORTSTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PLOGISRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PLOGISREJECTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PLOGISSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PLOGOSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PLOGOSREJECTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PLOGOSSENT);
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EOFABORTSRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EOFABORTSTRANSMITTED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PLOGISRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PLOGISREJECTED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PLOGISSENT)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PLOGOSRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PLOGOSREJECTED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PLOGOSSENT)){
				continue;
			}
			
			CIM_FibrePortEventCounters.CIM_PropertyNameList.add(CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EOFABORTSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EOFABORTSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PLOGISRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PLOGISREJECTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PLOGISSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PLOGOSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PLOGOSREJECTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PLOGOSSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EOFABORTSRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EOFABORTSTRANSMITTED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PLOGISRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PLOGISREJECTED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PLOGISSENT)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PLOGOSRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PLOGOSREJECTED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PLOGOSSENT)){
				continue;
			}
			
			CIM_FibrePortEventCounters.CIM_PropertyList.add(CIM_DeviceStatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.Java_Package_List.size(); i++) {
			if (((String)CIM_DeviceStatisticalInformation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_DeviceStatisticalInformation.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FibrePortEventCounters() {

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
	public CIM_FibrePortEventCounters(Vector keyProperties){ 
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
	public CIM_FibrePortEventCounters(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FibrePortEventCounters)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FibrePortEventCounters)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FibrePortEventCounters)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FibrePortEventCounters)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FibrePortEventCounters)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FibrePortEventCounters)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FibrePortEventCounters)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FibrePortEventCounters)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FibrePortEventCounters)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FibrePortEventCounters)object).cimObjectPath)) {
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
	
	// Attribute EOFAbortsReceived
	
	public UnsignedInt64 get_EOFAbortsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EOFAbortsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_EOFAbortsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EOFAbortsTransmitted
	
	public UnsignedInt64 get_EOFAbortsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EOFAbortsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_EOFAbortsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_EOFABORTSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PLOGIsReceived
	
	public UnsignedInt64 get_PLOGIsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PLOGIsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_PLOGIsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PLOGIsRejected
	
	public UnsignedInt64 get_PLOGIsRejected() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PLOGIsRejected(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_PLOGIsRejected(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PLOGIsSent
	
	public UnsignedInt64 get_PLOGIsSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PLOGIsSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_PLOGIsSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGISSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PLOGOsReceived
	
	public UnsignedInt64 get_PLOGOsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PLOGOsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_PLOGOsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PLOGOsRejected
	
	public UnsignedInt64 get_PLOGOsRejected() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PLOGOsRejected(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_PLOGOsRejected(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PLOGOsSent
	
	public UnsignedInt64 get_PLOGOsSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PLOGOsSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT + " could not be found");
    		
		} else if (!CIM_FibrePortEventCountersHelper.isValid_PLOGOsSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortEventCounters.CIM_PROPERTY_PLOGOSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_resetCounter(CIMClient cimClient, UnsignedInt16 SelectedCounter) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_FibrePortEventCounters.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SelectedCounter = new CIMValue(SelectedCounter, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("SelectedCounter", cimValue_SelectedCounter));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RESETCOUNTER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_FibrePortEventCounters.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_FibrePortEventCounters.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_FibrePortEventCounters.CIM_METHOD_RESETCOUNTER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
