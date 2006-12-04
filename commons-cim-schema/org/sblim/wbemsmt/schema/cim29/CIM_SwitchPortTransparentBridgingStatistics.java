/** 
 * CIM_SwitchPortTransparentBridgingStatistics.java
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
 * Description: Statistical information regarding a SwitchPort, at which transparent bridging is performed.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_SwitchPortTransparentBridgingStatistics extends CIM_SAPStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_SwitchPortTransparentBridgingStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Count of valid frames received which were discarded (i.e., filtered) by the forwarding process.
	*/
	public final static String CIM_PROPERTY_INDISCARDS = "InDiscards"; //$NON-NLS-1$
	/**
	*	The number of frames that have been received by the port from its segment. Note that a frame is only counted if and only if it is for a protocol being processed by the local bridging function, including bridge management frames.
	*/
	public final static String CIM_PROPERTY_INFRAMES = "InFrames"; //$NON-NLS-1$
	/**
	*	The number of frames that have been transmitted by the port to its segment. Note that a frame is only counted if and only if it is for a protocol being processed by the local bridging function, including bridge management frames.
	*/
	public final static String CIM_PROPERTY_OUTFRAMES = "OutFrames"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INDISCARDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OUTFRAMES);
				
		for (int i = 0; i < CIM_SAPStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INDISCARDS)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INFRAMES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OUTFRAMES)){
				continue;
			}
			
			CIM_SwitchPortTransparentBridgingStatistics.CIM_PropertyNameList.add(CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INDISCARDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OUTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_SAPStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INDISCARDS)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INFRAMES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OUTFRAMES)){
				continue;
			}
			
			CIM_SwitchPortTransparentBridgingStatistics.CIM_PropertyList.add(CIM_SAPStatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SAPStatisticalInformation.Java_Package_List.size(); i++) {
			if (((String)CIM_SAPStatisticalInformation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SAPStatisticalInformation.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SwitchPortTransparentBridgingStatistics() {

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
	public CIM_SwitchPortTransparentBridgingStatistics(Vector keyProperties){ 
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
	public CIM_SwitchPortTransparentBridgingStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SwitchPortTransparentBridgingStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SwitchPortTransparentBridgingStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SwitchPortTransparentBridgingStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SwitchPortTransparentBridgingStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SwitchPortTransparentBridgingStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SwitchPortTransparentBridgingStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SwitchPortTransparentBridgingStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SwitchPortTransparentBridgingStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SwitchPortTransparentBridgingStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SwitchPortTransparentBridgingStatistics)object).cimObjectPath)) {
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
	
	// Attribute InDiscards
	
	public UnsignedInt32 get_InDiscards() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InDiscards(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS + " could not be found");
    		
		} else if (!CIM_SwitchPortTransparentBridgingStatisticsHelper.isValid_InDiscards(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InFrames
	
	public UnsignedInt32 get_InFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortTransparentBridgingStatisticsHelper.isValid_InFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_INFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OutFrames
	
	public UnsignedInt32 get_OutFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OutFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortTransparentBridgingStatisticsHelper.isValid_OutFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortTransparentBridgingStatistics.CIM_PROPERTY_OUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
