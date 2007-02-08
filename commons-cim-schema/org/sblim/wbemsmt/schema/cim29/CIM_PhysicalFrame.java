/** 
 * CIM_PhysicalFrame.java
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
 * Description: PhysicalFrame is a superclass of Rack, Chassis and other frame enclosures, as they are defined in extension classes. Properties like visible or audible alarm, and data related to security breaches are in this superclass.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PhysicalFrame extends CIM_PhysicalPackage  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalFrame";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Boolean indicating whether the Frame is equipped with an audible alarm.
	*/
	public final static String CIM_PROPERTY_AUDIBLEALARM = "AudibleAlarm"; //$NON-NLS-1$
	/**
	*	BreachDescription is a free-form string providing more information if the SecurityBreach property indicates that a breach or some other security-related event occurred.
	*/
	public final static String CIM_PROPERTY_BREACHDESCRIPTION = "BreachDescription"; //$NON-NLS-1$
	/**
	*	CableManagementStrategy is a free-form string that contains information on how the various cables are connected and bundled for the Frame. With many networking, storage-related and power cables, cable management can be a complex and challenging endeavor. This string property contains information to aid in assembly and service of the Frame.
	*/
	public final static String CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY = "CableManagementStrategy"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Frame is currently locked.
	*/
	public final static String CIM_PROPERTY_ISLOCKED = "IsLocked"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the Frame is protected with a lock.
	*/
	public final static String CIM_PROPERTY_LOCKPRESENT = "LockPresent"; //$NON-NLS-1$
	/**
	*	SecurityBreach is an enumerated, integer-valued property indicating whether a physical breach of the Frame was attempted but unsuccessful (value=4) or attempted and successful (5). Also, the values, "Unknown", "Other" or "No Breach", can be specified.
	*/
	public final static String CIM_PROPERTY_SECURITYBREACH = "SecurityBreach"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the entries in the Service Philosophy array. Note, each entry of this array is related to the entry in ServicePhilosophy that is located at the same index.
	*/
	public final static String CIM_PROPERTY_SERVICEDESCRIPTIONS = "ServiceDescriptions"; //$NON-NLS-1$
	/**
	*	ServicePhilosophy is an enumerated, integer-valued array that indicates whether the Frame is serviced from the top (value=2), front (3), back (4) or side (5), whether it has sliding trays (6) or removable sides (7), and/or whether the Frame is moveable (8), for example, having rollers.
	*/
	public final static String CIM_PROPERTY_SERVICEPHILOSOPHY = "ServicePhilosophy"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the equipment includes a visible alarm.
	*/
	public final static String CIM_PROPERTY_VISIBLEALARM = "VisibleAlarm"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDIBLEALARM);
		CIM_PropertyNameList.add(CIM_PROPERTY_BREACHDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISLOCKED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCKPRESENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECURITYBREACH);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICEPHILOSOPHY);
		CIM_PropertyNameList.add(CIM_PROPERTY_VISIBLEALARM);
				
		for (int i = 0; i < CIM_PhysicalPackage.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDIBLEALARM)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BREACHDESCRIPTION)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISLOCKED)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCKPRESENT)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECURITYBREACH)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICEDESCRIPTIONS)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICEPHILOSOPHY)||
				((String)CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VISIBLEALARM)){
				continue;
			}
			
			CIM_PhysicalFrame.CIM_PropertyNameList.add(CIM_PhysicalPackage.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDIBLEALARM, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BREACHDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISLOCKED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCKPRESENT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECURITYBREACH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICEPHILOSOPHY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VISIBLEALARM, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_PhysicalPackage.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDIBLEALARM)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BREACHDESCRIPTION)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISLOCKED)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCKPRESENT)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECURITYBREACH)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICEDESCRIPTIONS)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICEPHILOSOPHY)||
				((CIMProperty)CIM_PhysicalPackage.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VISIBLEALARM)){
				continue;
			}
			
			CIM_PhysicalFrame.CIM_PropertyList.add(CIM_PhysicalPackage.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalPackage.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalPackage.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalPackage.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SECURITYBREACH = {"Other","Unknown","No Breach","Breach Attempted","Breach Successful"};
	public final static String[] CIM_VALUEMAP_SERVICEPHILOSOPHY = {"Unknown","Other","Service From Top","Service From Front","Service From Back","Service From Side","Sliding Trays","Removable Sides","Moveable"};
	
	
	public final static int SECURITYBREACH_OTHER = 1;
	public final static int SECURITYBREACH_UNKNOWN = 2;
	public final static int SECURITYBREACH_NOBREACH = 3;
	public final static int SECURITYBREACH_BREACHATTEMPTED = 4;
	public final static int SECURITYBREACH_BREACHSUCCESSFUL = 5;
	
	public final static int SERVICEPHILOSOPHY_UNKNOWN = 0;
	public final static int SERVICEPHILOSOPHY_OTHER = 1;
	public final static int SERVICEPHILOSOPHY_SERVICEFROMTOP = 2;
	public final static int SERVICEPHILOSOPHY_SERVICEFROMFRONT = 3;
	public final static int SERVICEPHILOSOPHY_SERVICEFROMBACK = 4;
	public final static int SERVICEPHILOSOPHY_SERVICEFROMSIDE = 5;
	public final static int SERVICEPHILOSOPHY_SLIDINGTRAYS = 6;
	public final static int SERVICEPHILOSOPHY_REMOVABLESIDES = 7;
	public final static int SERVICEPHILOSOPHY_MOVEABLE = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalFrame() {

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
	public CIM_PhysicalFrame(Vector keyProperties){ 
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
	public CIM_PhysicalFrame(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PhysicalFrame)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalFrame)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalFrame)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalFrame)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalFrame)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalFrame)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalFrame)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalFrame)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalFrame)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalFrame)object).cimObjectPath)) {
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
	
	// Attribute AudibleAlarm
	
	public Boolean get_AudibleAlarm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AudibleAlarm(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_AudibleAlarm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_AUDIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BreachDescription
	
	public String get_BreachDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BreachDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_BreachDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_BREACHDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CableManagementStrategy
	
	public String get_CableManagementStrategy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CableManagementStrategy(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_CableManagementStrategy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_CABLEMANAGEMENTSTRATEGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsLocked
	
	public Boolean get_IsLocked() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsLocked(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_IsLocked(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_ISLOCKED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LockPresent
	
	public Boolean get_LockPresent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LockPresent(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_LockPresent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_LOCKPRESENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecurityBreach
	
	public UnsignedInt16 get_SecurityBreach() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecurityBreach(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_SecurityBreach(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SECURITYBREACH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceDescriptions
	
	public String[] get_ServiceDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ServiceDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_ServiceDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServicePhilosophy
	
	public UnsignedInt16[] get_ServicePhilosophy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ServicePhilosophy(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_ServicePhilosophy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_SERVICEPHILOSOPHY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VisibleAlarm
	
	public Boolean get_VisibleAlarm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VisibleAlarm(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM + " could not be found");
    		
		} else if (!CIM_PhysicalFrameHelper.isValid_VisibleAlarm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalFrame.CIM_PROPERTY_VISIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
