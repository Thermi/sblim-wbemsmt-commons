/** 
 * CIM_LogicalPort.java
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
 * Description:  The abstraction of a port or connection point of a Device. This object should
 * be instantiated when the Port has independent management characteristics from
 * the Device that includes it. Examples are a Fibre Channel Port and a USB
 * Port.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  The abstraction of a port or connection point of a Device. This object should
 * be instantiated when the Port has independent management characteristics from
 * the Device that includes it. Examples are a Fibre Channel Port and a USB
 * Port.
 */
public class CIM_LogicalPort extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_LogicalPort"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT = "CIM_PortImplementsEndpoint"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE = "CIM_PortOnDevice"; //$NON-NLS-1$
	
	
	/**
	*	The maximum bandwidth of the Port in Bits per Second.
	*/
	public final static String CIM_PROPERTY_MAXSPEED = "MaxSpeed"; //$NON-NLS-1$
	/**
	*	The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
	*/
	public final static String CIM_PROPERTY_REQUESTEDSPEED = "RequestedSpeed"; //$NON-NLS-1$
	/**
	*	The bandwidth of the Port in Bits per Second.
	*/
	public final static String CIM_PROPERTY_SPEED = "Speed"; //$NON-NLS-1$
	/**
	*	In some circumstances, a LogicalPort may be identifiable as a front end or back end port. An example of this would be a storage array which might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
	*/
	public final static String CIM_PROPERTY_USAGERESTRICTION = "UsageRestriction"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTEDSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_USAGERESTRICTION);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXSPEED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTEDSPEED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPEED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USAGERESTRICTION)){
				continue;
			}
			
			CIM_LogicalPort.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTEDSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USAGERESTRICTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXSPEED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTEDSPEED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPEED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USAGERESTRICTION)){
				continue;
			}
			
			CIM_LogicalPort.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_LogicalDevice.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_USAGERESTRICTION = {"Unknown","Front-end only","Back-end only","Not restricted"};
	
	
	public final static int USAGERESTRICTION_UNKNOWN = 0;
	public final static int USAGERESTRICTION_FRONT_ENDONLY = 2;
	public final static int USAGERESTRICTION_BACK_ENDONLY = 3;
	public final static int USAGERESTRICTION_NOTRESTRICTED = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_LogicalPort() {

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
	public CIM_LogicalPort(Vector keyProperties){ 
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
	public CIM_LogicalPort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_LogicalPort.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_LogicalPort.Java_Package_List.toArray(new String[CIM_LogicalPort.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_LogicalPort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LogicalPort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LogicalPort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LogicalPort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LogicalPort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LogicalPort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LogicalPort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LogicalPort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LogicalPort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LogicalPort)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoints(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, 
					CIM_ProtocolEndpoint.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_LogicalPortHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtocolEndpoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoint_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, 
					CIM_ProtocolEndpoint.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ProtocolEndpoint.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_PortOnDevices(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_LogicalPortHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_PortOnDevice_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
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
	
	// Attribute MaxSpeed
	
	public UnsignedInt64 get_MaxSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_MAXSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_MAXSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_MAXSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxSpeed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_MAXSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_MAXSPEED + " could not be found");
    		
		} else if (!CIM_LogicalPortHelper.isValid_MaxSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogicalPort.CIM_PROPERTY_MAXSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_MAXSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestedSpeed
	
	public UnsignedInt64 get_RequestedSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestedSpeed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED + " could not be found");
    		
		} else if (!CIM_LogicalPortHelper.isValid_RequestedSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_REQUESTEDSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Speed
	
	public UnsignedInt64 get_Speed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_SPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_SPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_SPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Speed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_SPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_SPEED + " could not be found");
    		
		} else if (!CIM_LogicalPortHelper.isValid_Speed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogicalPort.CIM_PROPERTY_SPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_SPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UsageRestriction
	
	public UnsignedInt16 get_UsageRestriction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UsageRestriction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION + " could not be found");
    		
		} else if (!CIM_LogicalPortHelper.isValid_UsageRestriction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalPort.CIM_PROPERTY_USAGERESTRICTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
