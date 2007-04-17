/** 
 * CIM_SwitchPortSourceRouting.java
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
 * Description:  A switch capable of source routing maintains source-routing specific
 * information about each port. This association represents that information.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;


/**
 *  A switch capable of source routing maintains source-routing specific
 * information about each port. This association represents that information.
 */
public class CIM_SwitchPortSourceRouting extends CIM_ServiceSAPDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_SwitchPortSourceRouting"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_SWITCHPORT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	A bridge number uniquely identifies a bridge when more than one bridge is used to span the same two segments. Current source routing protocols limit this value to the range: 0 through 15. A value of 65535 signifies that no bridge number is assigned to this bridge.
	*/
	public final static String CIM_PROPERTY_BRIDGENUM = "BridgeNum"; //$NON-NLS-1$
	/**
	*	The maximum number of routing descriptors allowed in an All Paths or Spanning Tree Explorer frames.
	*/
	public final static String CIM_PROPERTY_HOPCOUNT = "HopCount"; //$NON-NLS-1$
	/**
	*	The segment number that uniquely identifies the segment to which this port is connected. Current source routing protocols limit this value to the range: 0 through 4095. (The value 0 is used by some management applications for special test cases.) A value of 65535 signifies that no segment number is assigned to this port.
	*/
	public final static String CIM_PROPERTY_LOCALSEGMENT = "LocalSegment"; //$NON-NLS-1$
	/**
	*	Determines how the port behaves when presented with a Spanning Tree Explorer frame. The value 'disabled(2)' indicates that the port will not accept or send Spanning Tree Explorer packets; any STE packets received will be silently discarded. The value 'forced(3)' indicates the port will always accept and propagate Spanning Tree Explorer frames. (This allows a manually configured Spanning Tree for this class of packet to be configured.) Note that unlike transparent bridging, it is not catastrophic to the network if there are loops. The value 'auto-span(1)' can only be returned by a bridge that both implements the Spanning Tree Protocol and has use of the protocol enabled on this port. 

The behavior of the port for Spanning Tree Explorer frames is determined by the value of the State property of the SwitchPortSpanningTree association for the port. If the port is in the 'forwarding' state, the frame will be accepted or propagated. Otherwise, it will be silently discarded.
	*/
	public final static String CIM_PROPERTY_STESPANMODE = "STESpanMode"; //$NON-NLS-1$
	/**
	*	The segment number that corresponds to the target segment to which this port is considered connected. Current source routing protocols limit this value to the range: 0 through 4095. (The value 0 is used by some management applications for special test cases.) A value of 65535 signifies that no target segment is assigned to this port.
	*/
	public final static String CIM_PROPERTY_TARGETSEGMENT = "TargetSegment"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BRIDGENUM);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOPCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALSEGMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_STESPANMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETSEGMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SWITCHPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE);
				
		for (int i = 0; i < CIM_ServiceSAPDependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BRIDGENUM)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOPCOUNT)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALSEGMENT)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STESPANMODE)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETSEGMENT)){
				continue;
			}
			
			CIM_SwitchPortSourceRouting.CIM_PropertyNameList.add(CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BRIDGENUM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOPCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALSEGMENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STESPANMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETSEGMENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SWITCHPORT, new CIMValue(null, new CIMDataType(CIM_SwitchPort.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE, new CIMValue(null, new CIMDataType(CIM_SourceRoutingService.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceSAPDependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BRIDGENUM)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOPCOUNT)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALSEGMENT)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STESPANMODE)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETSEGMENT)){
				continue;
			}
			
			CIM_SwitchPortSourceRouting.CIM_PropertyList.add(CIM_ServiceSAPDependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ServiceSAPDependency.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceSAPDependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceSAPDependency.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_STESPANMODE = {"Auto-Span","Disabled","Forced"};
	
	
	public final static int STESPANMODE_AUTO_SPAN = 1;
	public final static int STESPANMODE_DISABLED = 2;
	public final static int STESPANMODE_FORCED = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SwitchPortSourceRouting() {

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
	public CIM_SwitchPortSourceRouting(Vector keyProperties){ 
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
	public CIM_SwitchPortSourceRouting(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SwitchPortSourceRouting)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SwitchPortSourceRouting)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SwitchPortSourceRouting)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SwitchPortSourceRouting)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SwitchPortSourceRouting)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SwitchPortSourceRouting)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SwitchPortSourceRouting)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SwitchPortSourceRouting)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SwitchPortSourceRouting)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SwitchPortSourceRouting)object).cimObjectPath)) {
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
	
	// Attribute BridgeNum
	
	public UnsignedInt16 get_BridgeNum() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BridgeNum(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_BridgeNum(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_BRIDGENUM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HopCount
	
	public UnsignedInt16 get_HopCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HopCount(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_HopCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_HOPCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalSegment
	
	public UnsignedInt16 get_LocalSegment() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalSegment(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_LocalSegment(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_LOCALSEGMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute STESpanMode
	
	public UnsignedInt16 get_STESpanMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_STESpanMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_STESpanMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_STESPANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetSegment
	
	public UnsignedInt16 get_TargetSegment() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TargetSegment(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_TargetSegment(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_TARGETSEGMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SwitchPort
	
	public CIMObjectPath get_CIM_SwitchPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT + " is not of expected type CIM_SwitchPort.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SwitchPort(CIM_SwitchPort newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_CIM_SwitchPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SWITCHPORT + " is not of expected type CIM_SwitchPort.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SwitchPort.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SourceRoutingService
	
	public CIMObjectPath get_CIM_SourceRoutingService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SourceRoutingService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE + " is not of expected type CIM_SourceRoutingService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SourceRoutingService(CIM_SourceRoutingService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE + " could not be found");
    		
		} else if (!CIM_SwitchPortSourceRoutingHelper.isValid_CIM_SourceRoutingService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SourceRoutingService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSourceRouting.CIM_PROPERTY_CIM_SOURCEROUTINGSERVICE + " is not of expected type CIM_SourceRoutingService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SourceRoutingService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
