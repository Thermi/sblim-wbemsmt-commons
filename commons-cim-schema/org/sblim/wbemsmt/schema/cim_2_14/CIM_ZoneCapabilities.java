/** 
 * CIM_ZoneCapabilities.java
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
 * Description:  ZoneCapabilities exposes the capabilities for zoning of an AdminDomain.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  ZoneCapabilities exposes the capabilities for zoning of an AdminDomain.
 */
public class CIM_ZoneCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_ZoneCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The maximum number of Zones that the AdminDomain is capable of supporting.
	*/
	public final static String CIM_PROPERTY_MAXNUMZONE = "MaxNumZone"; //$NON-NLS-1$
	/**
	*	The maximum number of ZoneAliases that the AdminDomain is capable of supporting.
	*/
	public final static String CIM_PROPERTY_MAXNUMZONEALIASES = "MaxNumZoneAliases"; //$NON-NLS-1$
	/**
	*	The maximum number of ZoneMembers that the AdminDomain is capable of supporting.
	*/
	public final static String CIM_PROPERTY_MAXNUMZONEMEMBERS = "MaxNumZoneMembers"; //$NON-NLS-1$
	/**
	*	The maximum number of ZoneSets that the AdminDomain is capable of supporting.
	*/
	public final static String CIM_PROPERTY_MAXNUMZONESETS = "MaxNumZoneSets"; //$NON-NLS-1$
	/**
	*	The maximum number of Zones per ZoneSet that the AdminDomain is capable of supporting.
	*/
	public final static String CIM_PROPERTY_MAXNUMZONESPERZONESET = "MaxNumZonesPerZoneSet"; //$NON-NLS-1$
	/**
	*	The ZoneNameFormat supported by the AdminDomain.
	*/
	public final static String CIM_PROPERTY_ZONENAMEFORMAT = "ZoneNameFormat"; //$NON-NLS-1$
	/**
	*	The maximum length for the Zone Name that the AdminDomain is capable of supporting.
	*/
	public final static String CIM_PROPERTY_ZONENAMEMAXLEN = "ZoneNameMaxLen"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMZONE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMZONEALIASES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMZONEMEMBERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMZONESETS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMZONESPERZONESET);
		CIM_PropertyNameList.add(CIM_PROPERTY_ZONENAMEFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ZONENAMEMAXLEN);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMZONE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMZONEALIASES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMZONEMEMBERS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMZONESETS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMZONESPERZONESET)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ZONENAMEFORMAT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ZONENAMEMAXLEN)){
				continue;
			}
			
			CIM_ZoneCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMZONE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMZONEALIASES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMZONEMEMBERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMZONESETS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMZONESPERZONESET, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ZONENAMEFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ZONENAMEMAXLEN, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMZONE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMZONEALIASES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMZONEMEMBERS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMZONESETS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMZONESPERZONESET)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ZONENAMEFORMAT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ZONENAMEMAXLEN)){
				continue;
			}
			
			CIM_ZoneCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ZONENAMEFORMAT = {"Unknown","Numeric","Alpha Numeric","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ZONENAMEFORMAT_UNKNOWN = "0";
	public final static String ZONENAMEFORMAT_NUMERIC = "2";
	public final static String ZONENAMEFORMAT_ALPHANUMERIC = "3";
	public final static String ZONENAMEFORMAT_DMTFRESERVED = "..";
	public final static String ZONENAMEFORMAT_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ZoneCapabilities() {

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
	public CIM_ZoneCapabilities(Vector keyProperties){ 
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
	public CIM_ZoneCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ZoneCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ZoneCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ZoneCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ZoneCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ZoneCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ZoneCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ZoneCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ZoneCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ZoneCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ZoneCapabilities)object).cimObjectPath)) {
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
	
	// Attribute MaxNumZone
	
	public UnsignedInt32 get_MaxNumZone() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumZone(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_MaxNumZone(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumZoneAliases
	
	public UnsignedInt32 get_MaxNumZoneAliases() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumZoneAliases(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_MaxNumZoneAliases(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEALIASES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumZoneMembers
	
	public UnsignedInt32 get_MaxNumZoneMembers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumZoneMembers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_MaxNumZoneMembers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONEMEMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumZoneSets
	
	public UnsignedInt32 get_MaxNumZoneSets() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumZoneSets(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_MaxNumZoneSets(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumZonesPerZoneSet
	
	public UnsignedInt32 get_MaxNumZonesPerZoneSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumZonesPerZoneSet(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_MaxNumZonesPerZoneSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_MAXNUMZONESPERZONESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ZoneNameFormat
	
	public UnsignedInt16 get_ZoneNameFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ZoneNameFormat(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_ZoneNameFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ZoneNameMaxLen
	
	public UnsignedInt32 get_ZoneNameMaxLen() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ZoneNameMaxLen(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN + " could not be found");
    		
		} else if (!CIM_ZoneCapabilitiesHelper.isValid_ZoneNameMaxLen(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneCapabilities.CIM_PROPERTY_ZONENAMEMAXLEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
