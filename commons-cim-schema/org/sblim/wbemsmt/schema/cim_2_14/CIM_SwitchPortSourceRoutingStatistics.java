/** 
 * CIM_SwitchPortSourceRoutingStatistics.java
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
 * Description:  Statistical information regarding a SwitchPort supporting source routing.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  Statistical information regarding a SwitchPort supporting source routing.
 */
public class CIM_SwitchPortSourceRoutingStatistics extends CIM_SAPStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_SwitchPortSourceRoutingStatistics"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The number of All Paths Explorer frames, also referred to as All Routes Explorer frames, that have been received by the port from its segment.
	*/
	public final static String CIM_PROPERTY_APEINFRAMES = "ApeInFrames"; //$NON-NLS-1$
	/**
	*	The number of all Paths Explorer Frames, also referred to as All Routes Explorer frames, that have been transmitted by the port on its segment.
	*/
	public final static String CIM_PROPERTY_APEOUTFRAMES = "ApeOutFrames"; //$NON-NLS-1$
	/**
	*	The number of duplicate LAN IDs or Tree errors. This helps in detection of problems in networks containing older Source Routing Bridges.
	*/
	public final static String CIM_PROPERTY_DUPLANIDORTREEERRORS = "DupLanIdOrTreeErrors"; //$NON-NLS-1$
	/**
	*	The number of frames that have been discarded by the port because the routing descriptor field contained a duplicate segment identifier.
	*/
	public final static String CIM_PROPERTY_DUPLICATESEGMENTDISCARDS = "DuplicateSegmentDiscards"; //$NON-NLS-1$
	/**
	*	The number of explorer frames that have been discarded by the port because the Routing Information Field has exceeded the maximum route descriptor length.
	*/
	public final static String CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS = "HopCountExceedsDiscards"; //$NON-NLS-1$
	/**
	*	The number of ARE and STE frames that were discarded because the last LAN ID in the routing information field did not equal the LAN-in ID. This error can occur in implementations which do only a LAN-in ID and Bridge Number check instead of a LAN-in ID, Bridge Number, and LAN-out ID check before they forward broadcast frames.
	*/
	public final static String CIM_PROPERTY_LANIDMISMATCHES = "LanIdMismatches"; //$NON-NLS-1$
	/**
	*	The number of explorer frames that have been discarded by the port because the routing descriptor field contained an invalid adjacent segment value.
	*/
	public final static String CIM_PROPERTY_SEGMENTMISMATCHDISCARDS = "SegmentMismatchDiscards"; //$NON-NLS-1$
	/**
	*	The number of Specifically Routed frames, also referred to as Source Routed Frames, that have been received from the segment attached to the port.
	*/
	public final static String CIM_PROPERTY_SPECINFRAMES = "SpecInFrames"; //$NON-NLS-1$
	/**
	*	The number of Specifically Routed frames, also referred to as Source Routed Frames, that the port has transmitted on its segment.
	*/
	public final static String CIM_PROPERTY_SPECOUTFRAMES = "SpecOutFrames"; //$NON-NLS-1$
	/**
	*	The number of spanning tree explorer frames that have been received by the port from its segment.
	*/
	public final static String CIM_PROPERTY_STEINFRAMES = "SteInFrames"; //$NON-NLS-1$
	/**
	*	The number of spanning tree explorer frames that have been transmitted by the port on its segment.
	*/
	public final static String CIM_PROPERTY_STEOUTFRAMES = "SteOutFrames"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_APEINFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_APEOUTFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_DUPLANIDORTREEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DUPLICATESEGMENTDISCARDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANIDMISMATCHES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SEGMENTMISMATCHDISCARDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPECINFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPECOUTFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_STEINFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_STEOUTFRAMES);
				
		for (int i = 0; i < CIM_SAPStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_APEINFRAMES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_APEOUTFRAMES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DUPLANIDORTREEERRORS)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DUPLICATESEGMENTDISCARDS)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANIDMISMATCHES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SEGMENTMISMATCHDISCARDS)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPECINFRAMES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPECOUTFRAMES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STEINFRAMES)||
				((String)CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STEOUTFRAMES)){
				continue;
			}
			
			CIM_SwitchPortSourceRoutingStatistics.CIM_PropertyNameList.add(CIM_SAPStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APEINFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APEOUTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DUPLANIDORTREEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DUPLICATESEGMENTDISCARDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANIDMISMATCHES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SEGMENTMISMATCHDISCARDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPECINFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPECOUTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STEINFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STEOUTFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_SAPStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_APEINFRAMES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_APEOUTFRAMES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DUPLANIDORTREEERRORS)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DUPLICATESEGMENTDISCARDS)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANIDMISMATCHES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SEGMENTMISMATCHDISCARDS)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPECINFRAMES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPECOUTFRAMES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STEINFRAMES)||
				((CIMProperty)CIM_SAPStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STEOUTFRAMES)){
				continue;
			}
			
			CIM_SwitchPortSourceRoutingStatistics.CIM_PropertyList.add(CIM_SAPStatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SAPStatisticalInformation.Java_Package_List.size(); i++) {
			if (((String)CIM_SAPStatisticalInformation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
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
	public CIM_SwitchPortSourceRoutingStatistics() {

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
	public CIM_SwitchPortSourceRoutingStatistics(Vector keyProperties){ 
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
	public CIM_SwitchPortSourceRoutingStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SwitchPortSourceRoutingStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SwitchPortSourceRoutingStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SwitchPortSourceRoutingStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SwitchPortSourceRoutingStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SwitchPortSourceRoutingStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SwitchPortSourceRoutingStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SwitchPortSourceRoutingStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SwitchPortSourceRoutingStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SwitchPortSourceRoutingStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SwitchPortSourceRoutingStatistics)object).cimObjectPath)) {
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
	
	// Attribute ApeInFrames
	
	public UnsignedInt32 get_ApeInFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ApeInFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_ApeInFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEINFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ApeOutFrames
	
	public UnsignedInt32 get_ApeOutFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ApeOutFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_ApeOutFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_APEOUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DupLanIdOrTreeErrors
	
	public UnsignedInt32 get_DupLanIdOrTreeErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DupLanIdOrTreeErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_DupLanIdOrTreeErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLANIDORTREEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DuplicateSegmentDiscards
	
	public UnsignedInt32 get_DuplicateSegmentDiscards() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DuplicateSegmentDiscards(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_DuplicateSegmentDiscards(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_DUPLICATESEGMENTDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HopCountExceedsDiscards
	
	public UnsignedInt32 get_HopCountExceedsDiscards() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HopCountExceedsDiscards(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_HopCountExceedsDiscards(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_HOPCOUNTEXCEEDSDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LanIdMismatches
	
	public UnsignedInt32 get_LanIdMismatches() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LanIdMismatches(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_LanIdMismatches(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_LANIDMISMATCHES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SegmentMismatchDiscards
	
	public UnsignedInt32 get_SegmentMismatchDiscards() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SegmentMismatchDiscards(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_SegmentMismatchDiscards(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SEGMENTMISMATCHDISCARDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpecInFrames
	
	public UnsignedInt32 get_SpecInFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpecInFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_SpecInFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECINFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpecOutFrames
	
	public UnsignedInt32 get_SpecOutFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpecOutFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_SpecOutFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_SPECOUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SteInFrames
	
	public UnsignedInt32 get_SteInFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SteInFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_SteInFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEINFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SteOutFrames
	
	public UnsignedInt32 get_SteOutFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SteOutFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingStatisticsHelper.isValid_SteOutFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRoutingStatistics.CIM_PROPERTY_STEOUTFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
