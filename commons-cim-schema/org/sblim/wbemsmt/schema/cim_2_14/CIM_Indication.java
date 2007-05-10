/** 
 * CIM_Indication.java
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
 * Description:  CIM_Indication is the abstract root class for all notifications about changes
 * in schema, objects and their data, and about events detected by providers and
 * instrumentation. Subclasses represent specific types of notifications. To
 * receive an Indication, a consumer (or subscriber) must create an instance of
 * CIM_IndicationFilter describing the criteria of the notification, an instance
 * of CIM_ListenerDestination describing the delivery of the notification, and
 * an instance of CIM_IndicationSubscription associating the Filter and Handler.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


/**
 *  CIM_Indication is the abstract root class for all notifications about changes
 * in schema, objects and their data, and about events detected by providers and
 * instrumentation. Subclasses represent specific types of notifications. To
 * receive an Indication, a consumer (or subscriber) must create an instance of
 * CIM_IndicationFilter describing the criteria of the notification, an instance
 * of CIM_ListenerDestination describing the delivery of the notification, and
 * an instance of CIM_IndicationSubscription associating the Filter and Handler.
 */
public class CIM_Indication  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_Indication"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
	*/
	public final static String CIM_PROPERTY_CORRELATEDINDICATIONS = "CorrelatedIndications"; //$NON-NLS-1$
	/**
	*	An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array. To ensure uniqueness, the value of IndicationIdentifier should be constructed using the following "preferred" algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IndicationIdentifier or that is a recognized ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in IndicationIdentifier must appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. 
If the above "preferred" algorithm is not used, the defining entity should assure that the resulting IndicationIdentifier is not re-used across any IndicationIdentifiers that are produced by this or other providers for the NameSpace of this instance. 
For DMTF-defined instances, the "preferred" algorithm should be used with the <OrgID> set to CIM.
	*/
	public final static String CIM_PROPERTY_INDICATIONIDENTIFIER = "IndicationIdentifier"; //$NON-NLS-1$
	/**
	*	The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determining this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
	*/
	public final static String CIM_PROPERTY_INDICATIONTIME = "IndicationTime"; //$NON-NLS-1$
	/**
	*	Holds the value of the user defined severity value when 'PerceivedSeverity' is 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERSEVERITY = "OtherSeverity"; //$NON-NLS-1$
	/**
	*	An enumerated value that describes the severity of the Indication from the notifier's point of view: 
1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
5 - Major should be used to indicate action is needed NOW. 
6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
	*/
	public final static String CIM_PROPERTY_PERCEIVEDSEVERITY = "PerceivedSeverity"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CORRELATEDINDICATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INDICATIONIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INDICATIONTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSEVERITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCEIVEDSEVERITY);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CORRELATEDINDICATIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INDICATIONIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INDICATIONTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSEVERITY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCEIVEDSEVERITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
		};
			
	public final static String[] CIM_VALUEMAP_PERCEIVEDSEVERITY = {"Unknown","Other","Information","Degraded/Warning","Minor","Major","Critical","Fatal/NonRecoverable"};
	
	
	public final static int PERCEIVEDSEVERITY_UNKNOWN = 0;
	public final static int PERCEIVEDSEVERITY_OTHER = 1;
	public final static int PERCEIVEDSEVERITY_INFORMATION = 2;
	public final static int PERCEIVEDSEVERITY_DEGRADED_WARNING = 3;
	public final static int PERCEIVEDSEVERITY_MINOR = 4;
	public final static int PERCEIVEDSEVERITY_MAJOR = 5;
	public final static int PERCEIVEDSEVERITY_CRITICAL = 6;
	public final static int PERCEIVEDSEVERITY_FATAL_NONRECOVERABLE = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Indication() {

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
	public CIM_Indication(Vector keyProperties){ 
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
	public CIM_Indication(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_Indication.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_Indication.Java_Package_List.toArray(new String[CIM_Indication.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_Indication)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Indication)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Indication)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Indication)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Indication)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Indication)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Indication)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Indication)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Indication)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Indication)object).cimObjectPath)) {
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
	
	// Attribute CorrelatedIndications
	
	public String[] get_CorrelatedIndications() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CorrelatedIndications(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS + " could not be found");
    		
		} else if (!CIM_IndicationHelper.isValid_CorrelatedIndications(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_CORRELATEDINDICATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IndicationIdentifier
	
	public String get_IndicationIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IndicationIdentifier(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER + " could not be found");
    		
		} else if (!CIM_IndicationHelper.isValid_IndicationIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IndicationTime
	
	public Calendar get_IndicationTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_INDICATIONTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_IndicationTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_INDICATIONTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONTIME + " could not be found");
    		
		} else if (!CIM_IndicationHelper.isValid_IndicationTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Indication.CIM_PROPERTY_INDICATIONTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_INDICATIONTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute OtherSeverity
	
	public String get_OtherSeverity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_OTHERSEVERITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_OTHERSEVERITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_OTHERSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherSeverity(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_OTHERSEVERITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_OTHERSEVERITY + " could not be found");
    		
		} else if (!CIM_IndicationHelper.isValid_OtherSeverity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Indication.CIM_PROPERTY_OTHERSEVERITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_OTHERSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PerceivedSeverity
	
	public UnsignedInt16 get_PerceivedSeverity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PerceivedSeverity(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY + " could not be found");
    		
		} else if (!CIM_IndicationHelper.isValid_PerceivedSeverity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Indication.CIM_PROPERTY_PERCEIVEDSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}