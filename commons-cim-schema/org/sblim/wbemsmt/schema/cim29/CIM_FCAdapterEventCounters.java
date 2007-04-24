/** 
 * CIM_FCAdapterEventCounters.java
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
 * Description:  The use of the FCAdapterEventCounters class is deprecated since
 * FibreChannelAdapter is deprecated. FCPortStatistics should be used instead,
 * but redefines the level at which data is collected. This is why there is no
 * direct translation of the individual counters between the two classes. This
 * object describes event counters specific to a FibreChannelAdapter.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



/**
 *  The use of the FCAdapterEventCounters class is deprecated since
 * FibreChannelAdapter is deprecated. FCPortStatistics should be used instead,
 * but redefines the level at which data is collected. This is why there is no
 * direct translation of the individual counters between the two classes. This
 * object describes event counters specific to a FibreChannelAdapter.
 */
public class CIM_FCAdapterEventCounters extends CIM_DeviceStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_FCAdapterEventCounters"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The number of Abort sequence frames received.
	*/
	public final static String CIM_PROPERTY_ABTSFRAMESRECEIVED = "ABTSFramesReceived"; //$NON-NLS-1$
	/**
	*	The number of Abort sequence frames sent where the response was BA_RJT.
	*/
	public final static String CIM_PROPERTY_ABTSFRAMESREJECTED = "ABTSFramesRejected"; //$NON-NLS-1$
	/**
	*	The number of Abort sequence frames sent.
	*/
	public final static String CIM_PROPERTY_ABTSFRAMESSENT = "ABTSFramesSent"; //$NON-NLS-1$
	/**
	*	The number of frames busied by the Fabric.
	*/
	public final static String CIM_PROPERTY_FBSYSRECEIVED = "FBSYsReceived"; //$NON-NLS-1$
	/**
	*	The number of frames rejected by the Fabric.
	*/
	public final static String CIM_PROPERTY_FRJTSRECEIVED = "FRJTsReceived"; //$NON-NLS-1$
	/**
	*	The number of frames busied by the receiving Node.
	*/
	public final static String CIM_PROPERTY_PBSYSRECEIVED = "PBSYsReceived"; //$NON-NLS-1$
	/**
	*	The number of frames busied by the Adapter itself.
	*/
	public final static String CIM_PROPERTY_PBSYSSENT = "PBSYsSent"; //$NON-NLS-1$
	/**
	*	The number of frames rejected by the receiving Node.
	*/
	public final static String CIM_PROPERTY_PRJTSRECEIVED = "PRJTsReceived"; //$NON-NLS-1$
	/**
	*	The number of frames rejected by the Adapter itself.
	*/
	public final static String CIM_PROPERTY_PRJTSSENT = "PRJTsSent"; //$NON-NLS-1$
	/**
	*	The number of PRLI frames sent where the response was LS_RJT.
	*/
	public final static String CIM_PROPERTY_PRLISREJECTED = "PRLIsRejected"; //$NON-NLS-1$
	/**
	*	The number of PRLO frames sent where the response was LS_RJT.
	*/
	public final static String CIM_PROPERTY_PRLOSREJECTED = "PRLOsRejected"; //$NON-NLS-1$
	
	
	/**
	*	Method to reset the Adapter event counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 through 11 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_RESETCOUNTER = "ResetCounter";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ABTSFRAMESRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ABTSFRAMESREJECTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ABTSFRAMESSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_FBSYSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRJTSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PBSYSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PBSYSSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRJTSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRJTSSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRLISREJECTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRLOSREJECTED);
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ABTSFRAMESRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ABTSFRAMESREJECTED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ABTSFRAMESSENT)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FBSYSRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRJTSRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PBSYSRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PBSYSSENT)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRJTSRECEIVED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRJTSSENT)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRLISREJECTED)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRLOSREJECTED)){
				continue;
			}
			
			CIM_FCAdapterEventCounters.CIM_PropertyNameList.add(CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ABTSFRAMESRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ABTSFRAMESREJECTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ABTSFRAMESSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FBSYSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRJTSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PBSYSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PBSYSSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRJTSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRJTSSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRLISREJECTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRLOSREJECTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ABTSFRAMESRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ABTSFRAMESREJECTED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ABTSFRAMESSENT)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FBSYSRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRJTSRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PBSYSRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PBSYSSENT)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRJTSRECEIVED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRJTSSENT)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRLISREJECTED)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRLOSREJECTED)){
				continue;
			}
			
			CIM_FCAdapterEventCounters.CIM_PropertyList.add(CIM_DeviceStatisticalInformation.CIM_PropertyList.elementAt(i));
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
	public CIM_FCAdapterEventCounters() {

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
	public CIM_FCAdapterEventCounters(Vector keyProperties){ 
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
	public CIM_FCAdapterEventCounters(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FCAdapterEventCounters)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FCAdapterEventCounters)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FCAdapterEventCounters)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FCAdapterEventCounters)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FCAdapterEventCounters)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FCAdapterEventCounters)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FCAdapterEventCounters)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FCAdapterEventCounters)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FCAdapterEventCounters)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FCAdapterEventCounters)object).cimObjectPath)) {
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
	
	// Attribute ABTSFramesReceived
	
	public UnsignedInt64 get_ABTSFramesReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ABTSFramesReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_ABTSFramesReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ABTSFramesRejected
	
	public UnsignedInt64 get_ABTSFramesRejected() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ABTSFramesRejected(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_ABTSFramesRejected(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ABTSFramesSent
	
	public UnsignedInt64 get_ABTSFramesSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ABTSFramesSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_ABTSFramesSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_ABTSFRAMESSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FBSYsReceived
	
	public UnsignedInt64 get_FBSYsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FBSYsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_FBSYsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FBSYSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FRJTsReceived
	
	public UnsignedInt64 get_FRJTsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FRJTsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_FRJTsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_FRJTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PBSYsReceived
	
	public UnsignedInt64 get_PBSYsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PBSYsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_PBSYsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PBSYsSent
	
	public UnsignedInt64 get_PBSYsSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PBSYsSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_PBSYsSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PBSYSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PRJTsReceived
	
	public UnsignedInt64 get_PRJTsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRJTsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_PRJTsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PRJTsSent
	
	public UnsignedInt64 get_PRJTsSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRJTsSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_PRJTsSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRJTSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PRLIsRejected
	
	public UnsignedInt64 get_PRLIsRejected() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRLIsRejected(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_PRLIsRejected(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLISREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PRLOsRejected
	
	public UnsignedInt64 get_PRLOsRejected() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRLOsRejected(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED + " could not be found");
    		
		} else if (!CIM_FCAdapterEventCountersHelper.isValid_PRLOsRejected(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCAdapterEventCounters.CIM_PROPERTY_PRLOSREJECTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
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
	  				CIM_FCAdapterEventCounters.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SelectedCounter = new CIMValue(SelectedCounter, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("SelectedCounter", cimValue_SelectedCounter));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RESETCOUNTER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_FCAdapterEventCounters.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_FCAdapterEventCounters.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_FCAdapterEventCounters.CIM_METHOD_RESETCOUNTER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
