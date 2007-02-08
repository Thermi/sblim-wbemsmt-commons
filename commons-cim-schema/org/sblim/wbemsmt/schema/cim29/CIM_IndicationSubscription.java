/** 
 * CIM_IndicationSubscription.java
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
 * Description: CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_IndicationSubscription  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_IndicationSubscription";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_INDICATIONFILTER = "Filter"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_LISTENERDESTINATION = "Handler"; //$NON-NLS-1$
	
	
	/**
	*	The FailureTriggerTimeInterval is used by the client to specify a recommended minimum delay before the OnFatalErrorPolicy is implemented.
	*/
	public final static String CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL = "FailureTriggerTimeInterval"; //$NON-NLS-1$
	/**
	*	Defines the desired behavior for a subscription when a fatal error occurs in one of the Indication processing subcomponents (e.g., Indication processor, Indication or instance provider, or Indication handler) and the Indication cannot be successfully sent. Specifically, a failure implies that some aspect of Indication generation, processing or dispatch is no longer functioning and Indications may be lost. If the value of OnFatalErrorPolicy is 2 ("Ignore") or not set (NULL), the subscription MUST continue to be processed in a 'best effort' mode. This mode of operation can lead to unpredictable, and potentially misleading results, because Indications may be lost. If the value is 3 ("Disable"), the subscription MUST be disabled. With this policy, no new Indications will be generated or dispatched until the subscription is explicitly enabled. This is accomplished via the property, SubscriptionState. If the value is 4 ("Remove"), the subscription MUST be deleted. Selecting this policy has the same effect as issuing a DeleteInstance operation on this subscription instance.
	*/
	public final static String CIM_PROPERTY_ONFATALERRORPOLICY = "OnFatalErrorPolicy"; //$NON-NLS-1$
	/**
	*	A string defining "Other" values for OnFatalErrorPolicy. This value MUST be set to a non NULL value when OnFatalErrorPolicy is set to a value of 1 ("Other"). For all other values, the OtherOnFatalErrorPolicy MUST be NULL.
	*/
	public final static String CIM_PROPERTY_OTHERONFATALERRORPOLICY = "OtherOnFatalErrorPolicy"; //$NON-NLS-1$
	/**
	*	A string defining "Other" values for RepeatNotificationPolicy. This value MUST be set to a non NULL value when RepeatNotificationPolicy is set to a value of 1 ("Other"). For all other values, the OtherRepeatNotificationPolicy MUST be NULL.
	*/
	public final static String CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY = "OtherRepeatNotificationPolicy"; //$NON-NLS-1$
	/**
	*	A string defining "Other" values for SubscriptionState. This value MUST be set to a non NULL value when SubscriptionState is set to a value of 1 ("Other"). For all other values, the OtherSubscriptionState MUST be NULL.
	*/
	public final static String CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE = "OtherSubscriptionState"; //$NON-NLS-1$
	/**
	*	Defines the count property for the repeat notification policy calculation.
	*/
	public final static String CIM_PROPERTY_REPEATNOTIFICATIONCOUNT = "RepeatNotificationCount"; //$NON-NLS-1$
	/**
	*	Defines the gap interval for the repeat notification policy calculation.
	*/
	public final static String CIM_PROPERTY_REPEATNOTIFICATIONGAP = "RepeatNotificationGap"; //$NON-NLS-1$
	/**
	*	Defines the time interval for the repeat notification policy calculation.
	*/
	public final static String CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL = "RepeatNotificationInterval"; //$NON-NLS-1$
	/**
	*	The RepeatNotificationPolicy property defines the desired behavior for handling Indications that report the occurrence of the same underlying event (e.g., the disk is still generating I/O errors and has not yet been repaired). The defined semantics for the RepeatNotificationCount, RepeatNotificationInterval, and RepeatNotificationGap properties depend on the value of RepeatNotificationPolicy, but values for these properties MUST be set if the property is defined for the selected policy. If the value of RepeatNotificationPolicy is 0 ("Unknown") or not set, no special processing for repeat Indications is defined by the subscription. The semantics associated with the handling of repeat Indications MAY be defined by the Indication processing subcomponents. If the value of RepeatNotificationPolicy is 2 ("None"), special processing of repeat Indications MUST NOT be performed. If the value is 3 ("Suppress") the first RepeatNotificationCount Indications, describing the same event, MUST be sent and all subsequent Indications for this event suppressed for the remainder of the time interval RepeatNotificationInterval. A new interval starts when the next Indication for this event is received. If the value of RepeatNotificationPolicy is 4 ("Delay") and an Indication is received, this Indication MUST be suppressed if, including this Indication, RepeatNoticationCount or fewer Indications for this event have been received during the prior time interval defined by RepeatNotificationInterval. If this Indication is the RepeatNotificationCount + 1 Indication, this Indication MUST be sent and all subsequent Indications for this event ignored until the RepeatNotificationGap has elapsed. A RepeatNotificationInterval MAY NOT overlap a RepeatNotificationGap time interval.
	*/
	public final static String CIM_PROPERTY_REPEATNOTIFICATIONPOLICY = "RepeatNotificationPolicy"; //$NON-NLS-1$
	/**
	*	SubscriptionDuration defines the desired length of the subscription. Indications generated after the duration of the subscription has exceeded SubscriptionDuration MUST NOT be sent. The duration of a subscription MAY be changed by modifying this property. An expired subscription MAY be deleted and MUST NOT be modified. If the value of SubscriptionDuration is not set, the subscription MUST be treated as having no expiration date.
	*/
	public final static String CIM_PROPERTY_SUBSCRIPTIONDURATION = "SubscriptionDuration"; //$NON-NLS-1$
	/**
	*	SubscriptionStartTime is the time the subscription was started. The value of this property is computed based on the notion of date and time of the ManagedSystemElement running the Indication processing subcomponents.
	*/
	public final static String CIM_PROPERTY_SUBSCRIPTIONSTARTTIME = "SubscriptionStartTime"; //$NON-NLS-1$
	/**
	*	Indicates the current processing state of the subscription.
	*/
	public final static String CIM_PROPERTY_SUBSCRIPTIONSTATE = "SubscriptionState"; //$NON-NLS-1$
	/**
	*	SubscriptionTimeRemaining is a computed value that provides a snapshot of the time remaining in the Subscription.
	*/
	public final static String CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING = "SubscriptionTimeRemaining"; //$NON-NLS-1$
	/**
	*	Date and time of the last state change. This value is based on the notion of local date and time of the Managed System Element running the Indication processing subcomponents.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTSTATECHANGE = "TimeOfLastStateChange"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_ONFATALERRORPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERONFATALERRORPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPEATNOTIFICATIONCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPEATNOTIFICATIONGAP);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPEATNOTIFICATIONPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBSCRIPTIONDURATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBSCRIPTIONSTARTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBSCRIPTIONSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_INDICATIONFILTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LISTENERDESTINATION);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ONFATALERRORPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERONFATALERRORPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPEATNOTIFICATIONCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPEATNOTIFICATIONGAP, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPEATNOTIFICATIONPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBSCRIPTIONDURATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBSCRIPTIONSTARTTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBSCRIPTIONSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTSTATECHANGE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_INDICATIONFILTER, new CIMValue(null, new CIMDataType(CIM_IndicationFilter.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LISTENERDESTINATION, new CIMValue(null, new CIMDataType(CIM_ListenerDestination.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_ONFATALERRORPOLICY = {"Other","Ignore","Disable","Remove"};
	public final static String[] CIM_VALUEMAP_REPEATNOTIFICATIONPOLICY = {"Unknown","Other","None","Suppress","Delay"};
	public final static String[] CIM_VALUEMAP_SUBSCRIPTIONSTATE = {"Unknown","Other","Enabled","Enabled Degraded","Disabled"};
	
	
	public final static int ONFATALERRORPOLICY_OTHER = 1;
	public final static int ONFATALERRORPOLICY_IGNORE = 2;
	public final static int ONFATALERRORPOLICY_DISABLE = 3;
	public final static int ONFATALERRORPOLICY_REMOVE = 4;
	
	public final static int REPEATNOTIFICATIONPOLICY_UNKNOWN = 0;
	public final static int REPEATNOTIFICATIONPOLICY_OTHER = 1;
	public final static int REPEATNOTIFICATIONPOLICY_NONE = 2;
	public final static int REPEATNOTIFICATIONPOLICY_SUPPRESS = 3;
	public final static int REPEATNOTIFICATIONPOLICY_DELAY = 4;
	
	public final static int SUBSCRIPTIONSTATE_UNKNOWN = 0;
	public final static int SUBSCRIPTIONSTATE_OTHER = 1;
	public final static int SUBSCRIPTIONSTATE_ENABLED = 2;
	public final static int SUBSCRIPTIONSTATE_ENABLEDDEGRADED = 3;
	public final static int SUBSCRIPTIONSTATE_DISABLED = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IndicationSubscription() {

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
	public CIM_IndicationSubscription(Vector keyProperties){ 
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
	public CIM_IndicationSubscription(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IndicationSubscription)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IndicationSubscription)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IndicationSubscription)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IndicationSubscription)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IndicationSubscription)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IndicationSubscription)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IndicationSubscription)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IndicationSubscription)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IndicationSubscription)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IndicationSubscription)object).cimObjectPath)) {
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
	
	// Attribute FailureTriggerTimeInterval
	
	public UnsignedInt64 get_FailureTriggerTimeInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FailureTriggerTimeInterval(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_FailureTriggerTimeInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_FAILURETRIGGERTIMEINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OnFatalErrorPolicy
	
	public UnsignedInt16 get_OnFatalErrorPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OnFatalErrorPolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_OnFatalErrorPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_ONFATALERRORPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherOnFatalErrorPolicy
	
	public String get_OtherOnFatalErrorPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherOnFatalErrorPolicy(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_OtherOnFatalErrorPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERONFATALERRORPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherRepeatNotificationPolicy
	
	public String get_OtherRepeatNotificationPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherRepeatNotificationPolicy(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_OtherRepeatNotificationPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERREPEATNOTIFICATIONPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSubscriptionState
	
	public String get_OtherSubscriptionState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherSubscriptionState(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_OtherSubscriptionState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_OTHERSUBSCRIPTIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RepeatNotificationCount
	
	public UnsignedInt16 get_RepeatNotificationCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RepeatNotificationCount(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_RepeatNotificationCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RepeatNotificationGap
	
	public UnsignedInt64 get_RepeatNotificationGap() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RepeatNotificationGap(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_RepeatNotificationGap(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONGAP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RepeatNotificationInterval
	
	public UnsignedInt64 get_RepeatNotificationInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RepeatNotificationInterval(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_RepeatNotificationInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RepeatNotificationPolicy
	
	public UnsignedInt16 get_RepeatNotificationPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RepeatNotificationPolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_RepeatNotificationPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_REPEATNOTIFICATIONPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubscriptionDuration
	
	public UnsignedInt64 get_SubscriptionDuration() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubscriptionDuration(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_SubscriptionDuration(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONDURATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubscriptionStartTime
	
	public Calendar get_SubscriptionStartTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_SubscriptionStartTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_SubscriptionStartTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute SubscriptionState
	
	public UnsignedInt16 get_SubscriptionState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubscriptionState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_SubscriptionState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubscriptionTimeRemaining
	
	public UnsignedInt64 get_SubscriptionTimeRemaining() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubscriptionTimeRemaining(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_SubscriptionTimeRemaining(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_SUBSCRIPTIONTIMEREMAINING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastStateChange
	
	public Calendar get_TimeOfLastStateChange() {

		CIMProperty property = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastStateChange(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_TimeOfLastStateChange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute CIM_IndicationFilter
	
	public CIMObjectPath get_CIM_IndicationFilter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_IndicationFilter.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER + " is not of expected type CIM_IndicationFilter.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_IndicationFilter(CIM_IndicationFilter newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_CIM_IndicationFilter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_IndicationFilter.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_INDICATIONFILTER + " is not of expected type CIM_IndicationFilter.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_IndicationFilter.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ListenerDestination
	
	public CIMObjectPath get_CIM_ListenerDestination() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ListenerDestination.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION + " is not of expected type CIM_ListenerDestination.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ListenerDestination(CIM_ListenerDestination newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION + " could not be found");
    		
		} else if (!CIM_IndicationSubscriptionHelper.isValid_CIM_ListenerDestination(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ListenerDestination.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IndicationSubscription.CIM_PROPERTY_CIM_LISTENERDESTINATION + " is not of expected type CIM_ListenerDestination.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ListenerDestination.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
