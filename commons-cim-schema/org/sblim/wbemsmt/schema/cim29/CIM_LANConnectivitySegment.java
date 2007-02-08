/** 
 * CIM_LANConnectivitySegment.java
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
 * Description: A collection of LAN Endpoints of a particular type (i.e., Ethernet or Token Ring), that are able to intercommunicate without the assistance of bridging or routing services.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_LANConnectivitySegment extends CIM_ConnectivityCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_LANConnectivitySegment";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	An enumeration that categorizes and classifies instances of this class. Instances SHOULD aggregate entities of the appropriate 'type', as defined by the value of this enumeration.
	*/
	public final static String CIM_PROPERTY_CONNECTIVITYTYPE = "ConnectivityType"; //$NON-NLS-1$
	/**
	*	A label or identifier for the LAN segment.
	*/
	public final static String CIM_PROPERTY_LANID = "LANID"; //$NON-NLS-1$
	/**
	*	A string describing the type of connectivity that is supported by this Collection, when the value of the Type property is set to 1 (i.e., "Other"). This property should be set to NULL when the Type property is any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERTYPEDESCRIPTION = "OtherTypeDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTIVITYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEDESCRIPTION);
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTIVITYTYPE)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANID)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_LANConnectivitySegment.CIM_PropertyNameList.add(CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTIVITYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTIVITYTYPE)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANID)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_LANConnectivitySegment.CIM_PropertyList.add(CIM_ConnectivityCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ConnectivityCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_ConnectivityCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConnectivityCollection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CONNECTIVITYTYPE = {"Unknown","Other","Ethernet","TokenRing","FDDI"};
	
	
	public final static int CONNECTIVITYTYPE_UNKNOWN = 0;
	public final static int CONNECTIVITYTYPE_OTHER = 1;
	public final static int CONNECTIVITYTYPE_ETHERNET = 2;
	public final static int CONNECTIVITYTYPE_TOKENRING = 3;
	public final static int CONNECTIVITYTYPE_FDDI = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_LANConnectivitySegment() {

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
	public CIM_LANConnectivitySegment(Vector keyProperties){ 
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
	public CIM_LANConnectivitySegment(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_LANConnectivitySegment)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LANConnectivitySegment)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LANConnectivitySegment)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LANConnectivitySegment)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LANConnectivitySegment)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LANConnectivitySegment)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LANConnectivitySegment)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LANConnectivitySegment)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LANConnectivitySegment)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LANConnectivitySegment)object).cimObjectPath)) {
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
	
	// Attribute ConnectivityType
	
	public UnsignedInt16 get_ConnectivityType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectivityType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE + " could not be found");
    		
		} else if (!CIM_LANConnectivitySegmentHelper.isValid_ConnectivityType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_CONNECTIVITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LANID
	
	public String get_LANID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANConnectivitySegment.CIM_PROPERTY_LANID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_LANID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_LANID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LANID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANConnectivitySegment.CIM_PROPERTY_LANID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_LANID + " could not be found");
    		
		} else if (!CIM_LANConnectivitySegmentHelper.isValid_LANID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANConnectivitySegment.CIM_PROPERTY_LANID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_LANID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeDescription
	
	public String get_OtherTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_LANConnectivitySegmentHelper.isValid_OtherTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LANConnectivitySegment.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
