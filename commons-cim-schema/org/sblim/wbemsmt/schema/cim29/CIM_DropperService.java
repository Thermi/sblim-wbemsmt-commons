/** 
 * CIM_DropperService.java
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
 * Description: DropperService represents the ability to selectively drop network traffic, and/or to invoke another ConditioningService (indicated using the NextService association) for further processing of traffic that is not dropped. It is the base class for different types of droppers. Droppers are distinguished by the algorithm that they use to drop traffic. 

The NextService association has special semantics for droppers, in addition to conveying the general information of 'what happens next' (that apply to all Conditioning Services). The queue(s) from which a particular dropper drops packets are identified by following chain(s) of NextService associations 'rightwards' from the dropper, until they reach a queue.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DropperService extends CIM_ConditioningService  {
	
	public final static String CIM_CLASS_NAME = "CIM_DropperService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This property indicates whether the Dropper will always drop incoming packets (value=1) regardless of their type. It is deprecated since its information is conveyed by the DropperType property (value=4, 'Absolute Dropper').
	*/
	public final static String CIM_PROPERTY_ALWAYSDROP = "AlwaysDrop"; //$NON-NLS-1$
	/**
	*	This enumeration indicates the point in the associated queue (associated via the NextService relationship) from which packets should be dropped. If the value is 0 "Unknown", then packets MAY be dropped from any location in the queue.
	*/
	public final static String CIM_PROPERTY_DROPFROM = "DropFrom"; //$NON-NLS-1$
	/**
	*	This property is an enumerated unsigned 16-bit integer that defines the metric used to determine when ALL packets will be dropped REGARDLESS of the type of algorithm used by this Dropper. Values are: 

1: Other 
2: Queue Threshold 
3: Arrival Rate
	*/
	public final static String CIM_PROPERTY_DROPMAINTAINMETRIC = "DropMaintainMetric"; //$NON-NLS-1$
	/**
	*	This property is an enumerated unsigned 16-bit integer that defines the metric used to trigger the start of dropping packets. This does NOT mean that all packets will be dropped; it does mean that SOME packets will start to be dropped. The number and type of packets dropped is a function of the type of algorithm used by this Dropper. Values are: 

1: Other 
2: Queue Threshold 
3: Arrival Rate
	*/
	public final static String CIM_PROPERTY_DROPSTARTMETRIC = "DropStartMetric"; //$NON-NLS-1$
	/**
	*	This property is an enumerated 16-bit unsigned integer that defines the type of dropper. Its Values are: 
1: Other 
2: Random 
3: HeadTail 
4: Absolute Dropper 

Note: The DropperType property and the DropperService subclasses provide similar information. This property is defined for query purposes and to not require a subclass for all types of DropperServices (for example, to describe an Absolute Dropper in today's model). Therefore, DropperService can be instantiated directly and the Type property is needed.
	*/
	public final static String CIM_PROPERTY_DROPPERTYPE = "DropperType"; //$NON-NLS-1$
	/**
	*	This property contains a vendor-specific value for the type of dropping that is done. It is used when the value of the DropperType property is 1 (Other).
	*/
	public final static String CIM_PROPERTY_OTHERDROPPERTYPE = "OtherDropperType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALWAYSDROP);
		CIM_PropertyNameList.add(CIM_PROPERTY_DROPFROM);
		CIM_PropertyNameList.add(CIM_PROPERTY_DROPMAINTAINMETRIC);
		CIM_PropertyNameList.add(CIM_PROPERTY_DROPSTARTMETRIC);
		CIM_PropertyNameList.add(CIM_PROPERTY_DROPPERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDROPPERTYPE);
				
		for (int i = 0; i < CIM_ConditioningService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALWAYSDROP)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DROPFROM)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DROPMAINTAINMETRIC)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DROPSTARTMETRIC)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DROPPERTYPE)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDROPPERTYPE)){
				continue;
			}
			
			CIM_DropperService.CIM_PropertyNameList.add(CIM_ConditioningService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALWAYSDROP, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DROPFROM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DROPMAINTAINMETRIC, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DROPSTARTMETRIC, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DROPPERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDROPPERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ConditioningService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALWAYSDROP)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DROPFROM)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DROPMAINTAINMETRIC)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DROPSTARTMETRIC)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DROPPERTYPE)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDROPPERTYPE)){
				continue;
			}
			
			CIM_DropperService.CIM_PropertyList.add(CIM_ConditioningService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ConditioningService.Java_Package_List.size(); i++) {
			if (((String)CIM_ConditioningService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConditioningService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALWAYSDROP = {"Unknown","Always Drop","Do Not Always Drop"};
	public final static String[] CIM_VALUEMAP_DROPFROM = {"Unknown","Head","Tail"};
	public final static String[] CIM_VALUEMAP_DROPMAINTAINMETRIC = {"Other","Queue Threshold","Arrival Rate"};
	public final static String[] CIM_VALUEMAP_DROPSTARTMETRIC = {"Other","Queue Threshold","Arrival Rate"};
	public final static String[] CIM_VALUEMAP_DROPPERTYPE = {"Other","Random","HeadTail","Absolute Dropper"};
	
	
	public final static int ALWAYSDROP_UNKNOWN = 0;
	public final static int ALWAYSDROP_ALWAYSDROP = 1;
	public final static int ALWAYSDROP_DONOTALWAYSDROP = 2;
	
	public final static int DROPFROM_UNKNOWN = 0;
	public final static int DROPFROM_HEAD = 1;
	public final static int DROPFROM_TAIL = 2;
	
	public final static int DROPMAINTAINMETRIC_OTHER = 1;
	public final static int DROPMAINTAINMETRIC_QUEUETHRESHOLD = 2;
	public final static int DROPMAINTAINMETRIC_ARRIVALRATE = 3;
	
	public final static int DROPSTARTMETRIC_OTHER = 1;
	public final static int DROPSTARTMETRIC_QUEUETHRESHOLD = 2;
	public final static int DROPSTARTMETRIC_ARRIVALRATE = 3;
	
	public final static int DROPPERTYPE_OTHER = 1;
	public final static int DROPPERTYPE_RANDOM = 2;
	public final static int DROPPERTYPE_HEADTAIL = 3;
	public final static int DROPPERTYPE_ABSOLUTEDROPPER = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DropperService() {

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
	public CIM_DropperService(Vector keyProperties){ 
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
	public CIM_DropperService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DropperService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DropperService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DropperService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DropperService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DropperService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DropperService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DropperService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DropperService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DropperService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DropperService)object).cimObjectPath)) {
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
	
	// Attribute AlwaysDrop
	
	public UnsignedInt16 get_AlwaysDrop() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_ALWAYSDROP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_ALWAYSDROP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_ALWAYSDROP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlwaysDrop(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_ALWAYSDROP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_ALWAYSDROP + " could not be found");
    		
		} else if (!CIM_DropperServiceHelper.isValid_AlwaysDrop(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DropperService.CIM_PROPERTY_ALWAYSDROP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_ALWAYSDROP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DropFrom
	
	public UnsignedInt16 get_DropFrom() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPFROM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPFROM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPFROM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DropFrom(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPFROM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPFROM + " could not be found");
    		
		} else if (!CIM_DropperServiceHelper.isValid_DropFrom(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DropperService.CIM_PROPERTY_DROPFROM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPFROM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DropMaintainMetric
	
	public UnsignedInt16 get_DropMaintainMetric() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DropMaintainMetric(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC + " could not be found");
    		
		} else if (!CIM_DropperServiceHelper.isValid_DropMaintainMetric(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPMAINTAINMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DropStartMetric
	
	public UnsignedInt16 get_DropStartMetric() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DropStartMetric(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC + " could not be found");
    		
		} else if (!CIM_DropperServiceHelper.isValid_DropStartMetric(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPSTARTMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DropperType
	
	public UnsignedInt16 get_DropperType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPPERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPPERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DropperType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_DROPPERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_DROPPERTYPE + " could not be found");
    		
		} else if (!CIM_DropperServiceHelper.isValid_DropperType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DropperService.CIM_PROPERTY_DROPPERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_DROPPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDropperType
	
	public String get_OtherDropperType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDropperType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE + " could not be found");
    		
		} else if (!CIM_DropperServiceHelper.isValid_OtherDropperType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DropperService.CIM_PROPERTY_OTHERDROPPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
