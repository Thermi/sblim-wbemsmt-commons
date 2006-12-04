/** 
 * CIM_ChangerDevice.java
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
 * Description: ChangerDevices represent hardware that moves PhysicalMedia within a System, such as a StorageLibrary.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_ChangerDevice extends CIM_MediaTransferDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_ChangerDevice";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PICKERFORCHANGER = "CIM_PickerForChanger";
	
	
	/**
	*	Boolean set to TRUE if an audit is currently being performed by the Changer.
	*/
	public final static String CIM_PROPERTY_AUDITINPROGRESS = "AuditInProgress"; //$NON-NLS-1$
	/**
	*	A count of the number of audits performed by the Changer.
	*/
	public final static String CIM_PROPERTY_AUDITSPERFORMED = "AuditsPerformed"; //$NON-NLS-1$
	/**
	*	The maximum time in seconds between a PickerElement pick and place. It should be reported as the transit time between the two most physically distant StorageMedia Locations in a System. The maximum time interval for moving a Media from one point to another is the sum of the PickerElement's MaxPickTime, the ChangerDevice's Max TransitTime and the PickerElement's MaxPutTime.
	*/
	public final static String CIM_PROPERTY_MAXTRANSITTIME = "MaxTransitTime"; //$NON-NLS-1$
	/**
	*	Boolean set to TRUE if the Changer supports media flipping. Media needs to be flipped when multi-sided PhysicalMedia are placed into a MediaAccessDevice that does NOT support dual sided access.
	*/
	public final static String CIM_PROPERTY_MEDIAFLIPSUPPORTED = "MediaFlipSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDITINPROGRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDITSPERFORMED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXTRANSITTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIAFLIPSUPPORTED);
				
		for (int i = 0; i < CIM_MediaTransferDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDITINPROGRESS)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDITSPERFORMED)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXTRANSITTIME)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIAFLIPSUPPORTED)){
				continue;
			}
			
			CIM_ChangerDevice.CIM_PropertyNameList.add(CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDITINPROGRESS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDITSPERFORMED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXTRANSITTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIAFLIPSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_MediaTransferDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDITINPROGRESS)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDITSPERFORMED)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXTRANSITTIME)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIAFLIPSUPPORTED)){
				continue;
			}
			
			CIM_ChangerDevice.CIM_PropertyList.add(CIM_MediaTransferDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MediaTransferDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_MediaTransferDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MediaTransferDevice.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ChangerDevice() {

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
	public CIM_ChangerDevice(Vector keyProperties){ 
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
	public CIM_ChangerDevice(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ChangerDevice)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ChangerDevice)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ChangerDevice)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ChangerDevice)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ChangerDevice)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ChangerDevice)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ChangerDevice)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ChangerDevice)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ChangerDevice)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ChangerDevice)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PickerElement_CIM_PickerForChangers(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PICKERFORCHANGER, 
					CIM_PickerElement.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_ChangerDevice.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ChangerDevice.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_ChangerDevice.Java_Package_List.get(i))).endsWith(".")) {
							CIM_ChangerDevice.Java_Package_List.setElementAt((String)(CIM_ChangerDevice.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_ChangerDevice.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PickerElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PickerElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PickerElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_PickerElement_CIM_PickerForChanger_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PICKERFORCHANGER, 
					CIM_PickerElement.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PickerElement.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute AuditInProgress
	
	public Boolean get_AuditInProgress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuditInProgress(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS + " could not be found");
    		
		} else if (!CIM_ChangerDeviceHelper.isValid_AuditInProgress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITINPROGRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AuditsPerformed
	
	public UnsignedInt64 get_AuditsPerformed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuditsPerformed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED + " could not be found");
    		
		} else if (!CIM_ChangerDeviceHelper.isValid_AuditsPerformed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_AUDITSPERFORMED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxTransitTime
	
	public UnsignedInt32 get_MaxTransitTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxTransitTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME + " could not be found");
    		
		} else if (!CIM_ChangerDeviceHelper.isValid_MaxTransitTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MAXTRANSITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaFlipSupported
	
	public Boolean get_MediaFlipSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaFlipSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED + " could not be found");
    		
		} else if (!CIM_ChangerDeviceHelper.isValid_MediaFlipSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ChangerDevice.CIM_PROPERTY_MEDIAFLIPSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
