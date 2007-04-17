/** 
 * CIM_BlockStatisticsCapabilities.java
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
 * Description:  A specialization of the StatisticsCapabilities class that describes the
 * capabilities of a BlockStatisticsService, which provides statistical data for
 * instances of BlockStatisticalData.
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
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  A specialization of the StatisticsCapabilities class that describes the
 * capabilities of a BlockStatisticsService, which provides statistical data for
 * instances of BlockStatisticalData.
 */
public class CIM_BlockStatisticsCapabilities extends CIM_StatisticsCapabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_BlockStatisticsCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	The asychronous mechanisms supported for retrieving statistics.
	*/
	public final static String CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED = "AsynchronousMethodsSupported"; //$NON-NLS-1$
	/**
	*	An internal clocking interval for all timers in the subsystem, measured in microseconds (Unit of measure in the timers, measured in microseconds). Time counters are monotanically increasing counters that contain 'ticks'. Each tick represents one ClockTickInterval. If ClockTickInterval contained a value of 32 then each time counter tick would represent 32 microseconds.
	*/
	public final static String CIM_PROPERTY_CLOCKTICKINTERVAL = "ClockTickInterval"; //$NON-NLS-1$
	/**
	*	The list of element types for which statistical data is available. The values of this array correspond to the values defined for the ElementType property of the BlockStatisticalData class.
	*/
	public final static String CIM_PROPERTY_ELEMENTTYPESSUPPORTED = "ElementTypesSupported"; //$NON-NLS-1$
	/**
	*	The synchronous mechanisms supported for retrieving statistics and defining and modifying filters for statistics retrieval.
	*/
	public final static String CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED = "SynchronousMethodsSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLOCKTICKINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTTYPESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED);
				
		for (int i = 0; i < CIM_StatisticsCapabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticsCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED)||
				((String)CIM_StatisticsCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLOCKTICKINTERVAL)||
				((String)CIM_StatisticsCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTTYPESSUPPORTED)||
				((String)CIM_StatisticsCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED)){
				continue;
			}
			
			CIM_BlockStatisticsCapabilities.CIM_PropertyNameList.add(CIM_StatisticsCapabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLOCKTICKINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTTYPESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_StatisticsCapabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticsCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED)||
				((CIMProperty)CIM_StatisticsCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLOCKTICKINTERVAL)||
				((CIMProperty)CIM_StatisticsCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTTYPESSUPPORTED)||
				((CIMProperty)CIM_StatisticsCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED)){
				continue;
			}
			
			CIM_BlockStatisticsCapabilities.CIM_PropertyList.add(CIM_StatisticsCapabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StatisticsCapabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticsCapabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticsCapabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ASYNCHRONOUSMETHODSSUPPORTED = {"GetStatisticsCollection","Indications","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_ELEMENTTYPESSUPPORTED = {"Computer System","Front-end Computer System","Peer Computer System","Back-end Computer System","Front-end Port","Back-end Port","Volume","Extent","Disk Drive","Arbitrary LUs","Remote Replica Group","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SYNCHRONOUSMETHODSSUPPORTED = {"Execute Query","Query Collection","GetStatisticsCollection","Manifest Creation","Manifest Modification","Manifest Removal","DMTF Reserved","Vendor Specific"};
	
	
	public final static String ASYNCHRONOUSMETHODSSUPPORTED_GETSTATISTICSCOLLECTION = "2";
	public final static String ASYNCHRONOUSMETHODSSUPPORTED_INDICATIONS = "3";
	public final static String ASYNCHRONOUSMETHODSSUPPORTED_DMTFRESERVED = "..";
	public final static String ASYNCHRONOUSMETHODSSUPPORTED_VENDORSPECIFIC = "0x8000..";
	
	public final static String ELEMENTTYPESSUPPORTED_COMPUTERSYSTEM = "2";
	public final static String ELEMENTTYPESSUPPORTED_FRONT_ENDCOMPUTERSYSTEM = "3";
	public final static String ELEMENTTYPESSUPPORTED_PEERCOMPUTERSYSTEM = "4";
	public final static String ELEMENTTYPESSUPPORTED_BACK_ENDCOMPUTERSYSTEM = "5";
	public final static String ELEMENTTYPESSUPPORTED_FRONT_ENDPORT = "6";
	public final static String ELEMENTTYPESSUPPORTED_BACK_ENDPORT = "7";
	public final static String ELEMENTTYPESSUPPORTED_VOLUME = "8";
	public final static String ELEMENTTYPESSUPPORTED_EXTENT = "9";
	public final static String ELEMENTTYPESSUPPORTED_DISKDRIVE = "10";
	public final static String ELEMENTTYPESSUPPORTED_ARBITRARYLUS = "11";
	public final static String ELEMENTTYPESSUPPORTED_REMOTEREPLICAGROUP = "12";
	public final static String ELEMENTTYPESSUPPORTED_DMTFRESERVED = "..";
	public final static String ELEMENTTYPESSUPPORTED_VENDORSPECIFIC = "0x8000..";
	
	public final static String SYNCHRONOUSMETHODSSUPPORTED_EXECUTEQUERY = "2";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_QUERYCOLLECTION = "3";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_GETSTATISTICSCOLLECTION = "4";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_MANIFESTCREATION = "5";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_MANIFESTMODIFICATION = "6";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_MANIFESTREMOVAL = "7";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_DMTFRESERVED = "..";
	public final static String SYNCHRONOUSMETHODSSUPPORTED_VENDORSPECIFIC = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BlockStatisticsCapabilities() {

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
	public CIM_BlockStatisticsCapabilities(Vector keyProperties){ 
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
	public CIM_BlockStatisticsCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ElementTypesSupported = this.cimInstance.getProperty(CIM_PROPERTY_ELEMENTTYPESSUPPORTED);
		
		if (CIMProperty_ElementTypesSupported == null || CIMProperty_ElementTypesSupported.getValue().isEmpty() || CIMProperty_ElementTypesSupported.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ELEMENTTYPESSUPPORTED, "Required"});
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
	    
	    if (!(object instanceof CIM_BlockStatisticsCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BlockStatisticsCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BlockStatisticsCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BlockStatisticsCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BlockStatisticsCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BlockStatisticsCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BlockStatisticsCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BlockStatisticsCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BlockStatisticsCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BlockStatisticsCapabilities)object).cimObjectPath)) {
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
	
	// Attribute AsynchronousMethodsSupported
	
	public UnsignedInt16[] get_AsynchronousMethodsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_AsynchronousMethodsSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED + " could not be found");
    		
		} else if (!CIM_BlockStatisticsCapabilitiesHelper.isValid_AsynchronousMethodsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClockTickInterval
	
	public UnsignedInt64 get_ClockTickInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClockTickInterval(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL + " could not be found");
    		
		} else if (!CIM_BlockStatisticsCapabilitiesHelper.isValid_ClockTickInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_CLOCKTICKINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElementTypesSupported
	
	public UnsignedInt16[] get_ElementTypesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ElementTypesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED + " could not be found");
    		
		} else if (!CIM_BlockStatisticsCapabilitiesHelper.isValid_ElementTypesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_ELEMENTTYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SynchronousMethodsSupported
	
	public UnsignedInt16[] get_SynchronousMethodsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SynchronousMethodsSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED + " could not be found");
    		
		} else if (!CIM_BlockStatisticsCapabilitiesHelper.isValid_SynchronousMethodsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsCapabilities.CIM_PROPERTY_SYNCHRONOUSMETHODSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
