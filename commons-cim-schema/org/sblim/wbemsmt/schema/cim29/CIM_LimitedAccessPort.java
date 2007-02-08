/** 
 * CIM_LimitedAccessPort.java
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
 * Description: LimitedAccessPorts represent hardware that transports Physical Media into or out of a System, such as a StorageLibrary. They are identified as 'limited' since these Ports do not provide access to ALL the PhysicalMedia or StorageMediaLocations in a Library, but only to a subset.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_LimitedAccessPort extends CIM_MediaTransferDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_LimitedAccessPort";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	An enumeration expressing whether the Port is used for import into the Library/System which scopes and names it (value=1), export from the Library/System (value=2), or both (value=3).
	*/
	public final static String CIM_PROPERTY_DIRECTION = "Direction"; //$NON-NLS-1$
	/**
	*	The number of times that the LimitedAccessPort was used to move a PhysicalMedia out of the System/StorageLibrary.
	*/
	public final static String CIM_PROPERTY_EXPORTCOUNT = "ExportCount"; //$NON-NLS-1$
	/**
	*	When a LimitedAccessPort is 'Extended', all related media- transfer componentry may be stopped. The ExtendTimeout property provides a mechanism to event on a Port left open for a period of time (in seconds) exceeding the property's value.
	*/
	public final static String CIM_PROPERTY_EXTENDTIMEOUT = "ExtendTimeout"; //$NON-NLS-1$
	/**
	*	When a Port is 'Extended' or 'open' (value=TRUE), its Storage MediaLocations are accessible to a human operator. If not extended (value=FALSE), the Locations are accessible to a PickerElement.
	*/
	public final static String CIM_PROPERTY_EXTENDED = "Extended"; //$NON-NLS-1$
	/**
	*	The number of times that the LimitedAccessPort was used to move a PhysicalMedia into the System/StorageLibrary.
	*/
	public final static String CIM_PROPERTY_IMPORTCOUNT = "ImportCount"; //$NON-NLS-1$
	/**
	*	Date and time that the Port was last extended.
	*/
	public final static String CIM_PROPERTY_LASTEXTENDED = "LastExtended"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Port is 'locked' (TRUE) or 'unlocked' (FALSE). When the Port is locked, access its Media Locations is prevented without the use of a physical key, front panel activity or the issuance of a software unlock command.
	*/
	public final static String CIM_PROPERTY_LOCKED = "Locked"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPORTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENDTIMEOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_IMPORTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTEXTENDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCKED);
				
		for (int i = 0; i < CIM_MediaTransferDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTION)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPORTCOUNT)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENDTIMEOUT)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENDED)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IMPORTCOUNT)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTEXTENDED)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCKED)){
				continue;
			}
			
			CIM_LimitedAccessPort.CIM_PropertyNameList.add(CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPORTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENDTIMEOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENDED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IMPORTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTEXTENDED, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCKED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_MediaTransferDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTION)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPORTCOUNT)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENDTIMEOUT)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENDED)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IMPORTCOUNT)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTEXTENDED)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCKED)){
				continue;
			}
			
			CIM_LimitedAccessPort.CIM_PropertyList.add(CIM_MediaTransferDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MediaTransferDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_MediaTransferDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MediaTransferDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DIRECTION = {"Unknown","Import","Export","Both Import and Export"};
	
	
	public final static int DIRECTION_UNKNOWN = 0;
	public final static int DIRECTION_IMPORT = 1;
	public final static int DIRECTION_EXPORT = 2;
	public final static int DIRECTION_BOTHIMPORTANDEXPORT = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_LimitedAccessPort() {

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
	public CIM_LimitedAccessPort(Vector keyProperties){ 
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
	public CIM_LimitedAccessPort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_LimitedAccessPort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LimitedAccessPort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LimitedAccessPort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LimitedAccessPort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LimitedAccessPort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LimitedAccessPort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LimitedAccessPort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LimitedAccessPort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LimitedAccessPort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LimitedAccessPort)object).cimObjectPath)) {
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
	
	// Attribute Direction
	
	public UnsignedInt16 get_Direction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Direction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_Direction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_DIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExportCount
	
	public UnsignedInt64 get_ExportCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExportCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_ExportCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExtendTimeout
	
	public UnsignedInt32 get_ExtendTimeout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExtendTimeout(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_ExtendTimeout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDTIMEOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Extended
	
	public Boolean get_Extended() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Extended(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_Extended(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_EXTENDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ImportCount
	
	public UnsignedInt64 get_ImportCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ImportCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_ImportCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_IMPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastExtended
	
	public Calendar get_LastExtended() {

		CIMProperty property = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastExtended(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_LastExtended(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LASTEXTENDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute Locked
	
	public Boolean get_Locked() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Locked(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED + " could not be found");
    		
		} else if (!CIM_LimitedAccessPortHelper.isValid_Locked(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LimitedAccessPort.CIM_PROPERTY_LOCKED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
