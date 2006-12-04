/** 
 * CIM_MediaPartition.java
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
 * Description: A MediaPartition is a presentation of a contiguous range of logical blocks and has identifying data written on/to it. It may include a signature written by the OS or by an application. This class is a common superclass for Disk and TapePartions. Partitions are directly realized by Physical Media (indicated by the RealizesExtent association) or built on StorageVolumes (indicated by the BasedOn association).
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_MediaPartition extends CIM_StorageExtent  {
	
	public final static String CIM_CLASS_NAME = "CIM_MediaPartition";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Boolean indicating that the Partition is available and may be allocated for use.
	*/
	public final static String CIM_PROPERTY_ALLOCATABLE = "Allocatable"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Partition is labeled as bootable. (Note that this does not mean that an Operating System is actually loaded on the Partition.) With the advent of bootable Tape and other bootable media, this property is included in the higher level MediaPartition class, rather than in a subclass such as DiskPartition.
	*/
	public final static String CIM_PROPERTY_BOOTABLE = "Bootable"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Partition can be grown/extended without reformatting.
	*/
	public final static String CIM_PROPERTY_EXTENDABLE = "Extendable"; //$NON-NLS-1$
	/**
	*	An identifying string written to the Partition. Additional information related to this 'Signature' may be found in the properties, SignatureState and SignatureAlgorithm.
	*/
	public final static String CIM_PROPERTY_SIGNATURE = "Signature"; //$NON-NLS-1$
	/**
	*	A free-form string describing the algorithm used to define the Partition Signature. The value of this property is dependent on the Signature's State.
	*/
	public final static String CIM_PROPERTY_SIGNATUREALGORITHM = "SignatureAlgorithm"; //$NON-NLS-1$
	/**
	*	An enumeration describing the state of the Partition's identifying Signature string. Information such as "Uninitialized" (value=2), or "Assigned by Owning Application" (value=5) are possible entries.
	*/
	public final static String CIM_PROPERTY_SIGNATURESTATE = "SignatureState"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALLOCATABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_BOOTABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENDABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNATURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNATUREALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNATURESTATE);
				
		for (int i = 0; i < CIM_StorageExtent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALLOCATABLE)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BOOTABLE)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENDABLE)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNATURE)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNATUREALGORITHM)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNATURESTATE)){
				continue;
			}
			
			CIM_MediaPartition.CIM_PropertyNameList.add(CIM_StorageExtent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALLOCATABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BOOTABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENDABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNATURE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNATUREALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNATURESTATE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_StorageExtent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALLOCATABLE)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BOOTABLE)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENDABLE)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNATURE)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNATUREALGORITHM)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNATURESTATE)){
				continue;
			}
			
			CIM_MediaPartition.CIM_PropertyList.add(CIM_StorageExtent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StorageExtent.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageExtent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageExtent.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SIGNATURESTATE = {"Unknown","Unimplemented","Uninitialized","Calculated by Operating System","Calculated by a Media Manager","Assigned by Owning Application"};
	
	
	public final static int SIGNATURESTATE_UNKNOWN = 0;
	public final static int SIGNATURESTATE_UNIMPLEMENTED = 1;
	public final static int SIGNATURESTATE_UNINITIALIZED = 2;
	public final static int SIGNATURESTATE_CALCULATEDBYOPERATINGSYSTEM = 3;
	public final static int SIGNATURESTATE_CALCULATEDBYAMEDIAMANAGER = 4;
	public final static int SIGNATURESTATE_ASSIGNEDBYOWNINGAPPLICATION = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MediaPartition() {

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
	public CIM_MediaPartition(Vector keyProperties){ 
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
	public CIM_MediaPartition(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_MediaPartition)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MediaPartition)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MediaPartition)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MediaPartition)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MediaPartition)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MediaPartition)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MediaPartition)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MediaPartition)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MediaPartition)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MediaPartition)object).cimObjectPath)) {
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
	
	// Attribute Allocatable
	
	public Boolean get_Allocatable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Allocatable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE + " could not be found");
    		
		} else if (!CIM_MediaPartitionHelper.isValid_Allocatable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_ALLOCATABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Bootable
	
	public Boolean get_Bootable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_BOOTABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_BOOTABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_BOOTABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Bootable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_BOOTABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_BOOTABLE + " could not be found");
    		
		} else if (!CIM_MediaPartitionHelper.isValid_Bootable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPartition.CIM_PROPERTY_BOOTABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_BOOTABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Extendable
	
	public Boolean get_Extendable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Extendable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE + " could not be found");
    		
		} else if (!CIM_MediaPartitionHelper.isValid_Extendable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_EXTENDABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Signature
	
	public String get_Signature() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_SIGNATURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Signature(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_SIGNATURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURE + " could not be found");
    		
		} else if (!CIM_MediaPartitionHelper.isValid_Signature(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SignatureAlgorithm
	
	public String get_SignatureAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SignatureAlgorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM + " could not be found");
    		
		} else if (!CIM_MediaPartitionHelper.isValid_SignatureAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATUREALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SignatureState
	
	public String get_SignatureState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SignatureState(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE + " could not be found");
    		
		} else if (!CIM_MediaPartitionHelper.isValid_SignatureState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPartition.CIM_PROPERTY_SIGNATURESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
