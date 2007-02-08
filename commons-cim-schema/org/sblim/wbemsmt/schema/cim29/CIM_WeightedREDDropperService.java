/** 
 * CIM_WeightedREDDropperService.java
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
 * Description: This class represents a logical entity that resides in the data forwarding path of a network device. It describes the ability to drop network traffic using a Weighted Random Early Detection (WRED) algorithm. Like RED, the purpose of WRED is to avoid congestion (as opposed to managing congestion). This modification of the basic RED algorithm enables packets belonging to different traffic classes to be dropped at different queue depths. This algorithm also enables discard to be done based on different information contained in the packet header, such as IP Precedence, RSVP session parameters, or even on other factors not directly encoded in the packet header, such as the queue depth. 

Implementation of this class has shown that weighting should not be a property of the class (but on an association to it), and that there is insufficient data to process the drop metric. The class is deprecated pending further definition by the DMTF.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_WeightedREDDropperService extends CIM_DropperService  {
	
	public final static String CIM_CLASS_NAME = "CIM_WeightedREDDropperService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This property is an enumerated 16-bit unsigned integer, and defines the type of metric that is used to drop traffic. Values are: 

1: Other 
2: IP Precedence 
3: DSCP Value 
4: 802.1P Priority Value 
5: RSVP Session 
6: Queue Depth 
7: Packet Arrival Rate
	*/
	public final static String CIM_PROPERTY_DROPMETRIC = "DropMetric"; //$NON-NLS-1$
	/**
	*	This string property is used in conjunction with the DropMetric property. When the value of DropMetric is 1 (i.e., "Other"), then the type of metric to be used is defined in this property.
	*/
	public final static String CIM_PROPERTY_OTHERDROPMETRIC = "OtherDropMetric"; //$NON-NLS-1$
	/**
	*	This is a 32-bit real number that represents the weighting factor used to determine which queues get more service.
	*/
	public final static String CIM_PROPERTY_WEIGHT = "Weight"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DROPMETRIC);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDROPMETRIC);
		CIM_PropertyNameList.add(CIM_PROPERTY_WEIGHT);
				
		for (int i = 0; i < CIM_DropperService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DROPMETRIC)||
				((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDROPMETRIC)||
				((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WEIGHT)){
				continue;
			}
			
			CIM_WeightedREDDropperService.CIM_PropertyNameList.add(CIM_DropperService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DROPMETRIC, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDROPMETRIC, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WEIGHT, new CIMValue(null, new CIMDataType(CIMDataType.REAL32))));
				
		for (int i = 0; i < CIM_DropperService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DROPMETRIC)||
				((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDROPMETRIC)||
				((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WEIGHT)){
				continue;
			}
			
			CIM_WeightedREDDropperService.CIM_PropertyList.add(CIM_DropperService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_DropperService.Java_Package_List.size(); i++) {
			if (((String)CIM_DropperService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_DropperService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DROPMETRIC = {"Other","IP Precedence","DSCP Value","802.1P Priority Value","RSVP Session","Queue Depth","Packet Arrival Rate"};
	
	
	public final static int DROPMETRIC_OTHER = 1;
	public final static int DROPMETRIC_IPPRECEDENCE = 2;
	public final static int DROPMETRIC_DSCPVALUE = 3;
	public final static int DROPMETRIC_802_1PPRIORITYVALUE = 4;
	public final static int DROPMETRIC_RSVPSESSION = 5;
	public final static int DROPMETRIC_QUEUEDEPTH = 6;
	public final static int DROPMETRIC_PACKETARRIVALRATE = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_WeightedREDDropperService() {

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
	public CIM_WeightedREDDropperService(Vector keyProperties){ 
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
	public CIM_WeightedREDDropperService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_WeightedREDDropperService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_WeightedREDDropperService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_WeightedREDDropperService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_WeightedREDDropperService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_WeightedREDDropperService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_WeightedREDDropperService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_WeightedREDDropperService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_WeightedREDDropperService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_WeightedREDDropperService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_WeightedREDDropperService)object).cimObjectPath)) {
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
	
	// Attribute DropMetric
	
	public UnsignedInt16 get_DropMetric() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DropMetric(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC + " could not be found");
    		
		} else if (!CIM_WeightedREDDropperServiceHelper.isValid_DropMetric(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_DROPMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDropMetric
	
	public String get_OtherDropMetric() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDropMetric(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC + " could not be found");
    		
		} else if (!CIM_WeightedREDDropperServiceHelper.isValid_OtherDropMetric(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_OTHERDROPMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Weight
	
	public Float get_Weight() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Float)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Weight(Float newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT + " could not be found");
    		
		} else if (!CIM_WeightedREDDropperServiceHelper.isValid_Weight(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WeightedREDDropperService.CIM_PROPERTY_WEIGHT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
