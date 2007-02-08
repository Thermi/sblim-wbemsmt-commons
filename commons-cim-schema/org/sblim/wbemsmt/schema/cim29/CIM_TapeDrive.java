/** 
 * CIM_TapeDrive.java
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
 * Description: Capabilities and managment of a TapeDrive, a subtype of MediaAccessDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_TapeDrive extends CIM_MediaAccessDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_TapeDrive";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	EOTWarningZoneSize indicates the size, in bytes, of the area designated as 'end of tape'. Access in this area generates an 'end of tape' warning.
	*/
	public final static String CIM_PROPERTY_EOTWARNINGZONESIZE = "EOTWarningZoneSize"; //$NON-NLS-1$
	/**
	*	Maximum partition count for the TapeDrive.
	*/
	public final static String CIM_PROPERTY_MAXPARTITIONCOUNT = "MaxPartitionCount"; //$NON-NLS-1$
	/**
	*	Time in milliseconds to move from the most physically distant point on the tape to the beginning.
	*/
	public final static String CIM_PROPERTY_MAXREWINDTIME = "MaxRewindTime"; //$NON-NLS-1$
	/**
	*	Padding indicates the number of bytes inserted between blocks on a tape Media.
	*/
	public final static String CIM_PROPERTY_PADDING = "Padding"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_EOTWARNINGZONESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXPARTITIONCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXREWINDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_PADDING);
				
		for (int i = 0; i < CIM_MediaAccessDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EOTWARNINGZONESIZE)||
				((String)CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXPARTITIONCOUNT)||
				((String)CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXREWINDTIME)||
				((String)CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PADDING)){
				continue;
			}
			
			CIM_TapeDrive.CIM_PropertyNameList.add(CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EOTWARNINGZONESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXPARTITIONCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXREWINDTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PADDING, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_MediaAccessDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MediaAccessDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EOTWARNINGZONESIZE)||
				((CIMProperty)CIM_MediaAccessDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXPARTITIONCOUNT)||
				((CIMProperty)CIM_MediaAccessDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXREWINDTIME)||
				((CIMProperty)CIM_MediaAccessDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PADDING)){
				continue;
			}
			
			CIM_TapeDrive.CIM_PropertyList.add(CIM_MediaAccessDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MediaAccessDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_MediaAccessDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MediaAccessDevice.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_TapeDrive() {

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
	public CIM_TapeDrive(Vector keyProperties){ 
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
	public CIM_TapeDrive(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_TapeDrive)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_TapeDrive)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_TapeDrive)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_TapeDrive)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_TapeDrive)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_TapeDrive)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_TapeDrive)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_TapeDrive)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_TapeDrive)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_TapeDrive)object).cimObjectPath)) {
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
	
	// Attribute EOTWarningZoneSize
	
	public UnsignedInt32 get_EOTWarningZoneSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EOTWarningZoneSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE + " could not be found");
    		
		} else if (!CIM_TapeDriveHelper.isValid_EOTWarningZoneSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_EOTWARNINGZONESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxPartitionCount
	
	public UnsignedInt32 get_MaxPartitionCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxPartitionCount(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT + " could not be found");
    		
		} else if (!CIM_TapeDriveHelper.isValid_MaxPartitionCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXPARTITIONCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxRewindTime
	
	public UnsignedInt64 get_MaxRewindTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxRewindTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME + " could not be found");
    		
		} else if (!CIM_TapeDriveHelper.isValid_MaxRewindTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_MAXREWINDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Padding
	
	public UnsignedInt32 get_Padding() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_PADDING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_PADDING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_PADDING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Padding(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TapeDrive.CIM_PROPERTY_PADDING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TapeDrive.CIM_PROPERTY_PADDING + " could not be found");
    		
		} else if (!CIM_TapeDriveHelper.isValid_Padding(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TapeDrive.CIM_PROPERTY_PADDING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TapeDrive.CIM_PROPERTY_PADDING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
