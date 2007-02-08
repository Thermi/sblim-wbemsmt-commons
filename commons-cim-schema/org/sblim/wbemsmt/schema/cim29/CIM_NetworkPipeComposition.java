/** 
 * CIM_NetworkPipeComposition.java
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
 * Description: NetworkPipeComposition describes the makeup a pipe, based on lower-level ones. If the pipe is not composed of lower-level entities (i.e., its AggregationBehavior property is set to 2), then no instances of this association should be defined where the pipe has the role of GroupComponent. 

In the context of M.3100, this semantic is modeled as a Trail that is made up of one or more Connections. Both Trails and Connections are subclasses of M.3100's Pipe. Because of the flexibility of the NetworkPipeComposition association, there is no need to subclass NetworkPipe, as was done in M.3100, but merely to instantiate this association to describe the bundling of the lower-level pipes (connections), or the sequencing of them. How the lower-level pipes are aggregated is described by the property, AggregationBehavior, of NetworkPipe. If the pipes are combined in a sequence, the ordering is conveyed via the property, AggregationSequence, on this association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_NetworkPipeComposition extends CIM_Component  {
	
	public final static String CIM_CLASS_NAME = "CIM_NetworkPipeComposition";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_NETWORKPIPE_1 = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_NETWORKPIPE_2 = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	Indicates the ordering of the PartComponent pipes in the GroupComponent. If the AggregationBehavior property of the GroupComponent pipe is set to 0 or 3 ("Unknown" or "Combined In Parallel"), then this property MUST be set to 0. If the AggregationBehavior is set to 4 ("Combined In Sequence"), then this property SHOULD indicate the ordering of the component pipes. Ordering starts with 1 and larger numbers indicate subsequent pipes. The numbering does not have to be in sequence. The word SHOULD is used in this Description, since the specific ordering of all the component pipes may not be known. In these cases, a value of 0 would be placed in AggregationSequence to indicate that ordering information is not available.
	*/
	public final static String CIM_PROPERTY_AGGREGATIONSEQUENCE = "AggregationSequence"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AGGREGATIONSEQUENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_NETWORKPIPE_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_NETWORKPIPE_2);
				
		for (int i = 0; i < CIM_Component.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Component.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AGGREGATIONSEQUENCE)){
				continue;
			}
			
			CIM_NetworkPipeComposition.CIM_PropertyNameList.add(CIM_Component.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AGGREGATIONSEQUENCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_NETWORKPIPE_1, new CIMValue(null, new CIMDataType(CIM_NetworkPipe.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_NETWORKPIPE_2, new CIMValue(null, new CIMDataType(CIM_NetworkPipe.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Component.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Component.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AGGREGATIONSEQUENCE)){
				continue;
			}
			
			CIM_NetworkPipeComposition.CIM_PropertyList.add(CIM_Component.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Component.Java_Package_List.size(); i++) {
			if (((String)CIM_Component.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Component.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NetworkPipeComposition() {

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
	public CIM_NetworkPipeComposition(Vector keyProperties){ 
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
	public CIM_NetworkPipeComposition(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NetworkPipeComposition)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NetworkPipeComposition)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NetworkPipeComposition)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NetworkPipeComposition)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NetworkPipeComposition)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NetworkPipeComposition)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NetworkPipeComposition)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NetworkPipeComposition)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NetworkPipeComposition)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NetworkPipeComposition)object).cimObjectPath)) {
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
	
	// Attribute AggregationSequence
	
	public UnsignedInt16 get_AggregationSequence() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AggregationSequence(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE + " could not be found");
    		
		} else if (!CIM_NetworkPipeCompositionHelper.isValid_AggregationSequence(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_AGGREGATIONSEQUENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_NetworkPipe_1
	
	public CIMObjectPath get_CIM_NetworkPipe_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkPipe.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1 + " is not of expected type CIM_NetworkPipe.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_NetworkPipe_1(CIM_NetworkPipe newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1 + " could not be found");
    		
		} else if (!CIM_NetworkPipeCompositionHelper.isValid_CIM_NetworkPipe_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkPipe.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_1 + " is not of expected type CIM_NetworkPipe.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_NetworkPipe.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_NetworkPipe_2
	
	public CIMObjectPath get_CIM_NetworkPipe_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkPipe.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2 + " is not of expected type CIM_NetworkPipe.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_NetworkPipe_2(CIM_NetworkPipe newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2 + " could not be found");
    		
		} else if (!CIM_NetworkPipeCompositionHelper.isValid_CIM_NetworkPipe_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkPipe.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPipeComposition.CIM_PROPERTY_CIM_NETWORKPIPE_2 + " is not of expected type CIM_NetworkPipe.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_NetworkPipe.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
