/** 
 * CIM_AGPVideoController.java
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
 * Description: Capabilities and management of an AGPVideoController.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AGPVideoController extends CIM_VideoController  {
	
	public final static String CIM_CLASS_NAME = "CIM_AGPVideoController";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	A string containing the AGP specification version to which this graphics Controller conforms.
	*/
	public final static String CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE = "AGPSpecificationVersionConformance"; //$NON-NLS-1$
	/**
	*	An integer enumeration indicating the addressing mode of the graphics Controller.
	*/
	public final static String CIM_PROPERTY_ADDRESSINGMODE = "AddressingMode"; //$NON-NLS-1$
	/**
	*	This property has been incorporated into the inherited AcceleratorCapabilities property. Capabilities of the AGP Graphics Controller. For example, the Device may support multiple monitors, PCI Mastering and large memory addresses. In this case, the values 3, 4 and 6 would be written to the Capabilities array.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An integer enumeration indicating the data transfer rate of the graphics Controller.
	*/
	public final static String CIM_PROPERTY_DATATRANSFERRATE = "DataTransferRate"; //$NON-NLS-1$
	/**
	*	Size of the graphics aperture in KB.
	*/
	public final static String CIM_PROPERTY_GRAPHICSAPERTURESIZE = "GraphicsApertureSize"; //$NON-NLS-1$
	/**
	*	Width of the internal bus in the graphics Controller, in bits.
	*/
	public final static String CIM_PROPERTY_LOCALBUSWIDTH = "LocalBusWidth"; //$NON-NLS-1$
	/**
	*	The number of AGP Transaction that the core logic (chipset) can accept into its transaction request queue from the Controller.
	*/
	public final static String CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS = "MaxNumberOfPipelinedAGPTransactions"; //$NON-NLS-1$
	/**
	*	The maximum number of AGP Transaction requests that the master (AGP Graphics Controller) is allowed to enqueue into the target.
	*/
	public final static String CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH = "MaximumAGPCommandQueuePath"; //$NON-NLS-1$
	/**
	*	Size of the non-local video memory in KB.
	*/
	public final static String CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE = "NonlocalVideoMemorySize"; //$NON-NLS-1$
	/**
	*	An integer enumeration indicating the usage model of the graphics Controller. Usage model indicates how the Controller does manipulations of graphics surfaces, textures, etc. in memory. DMA indicates that the graphics Controller brings structures from the system memory to its local memory to perform needed manipulations or renderings. Execute specifies that the graphics Controller can directly access a specified region in main memory (called the graphics aperture) using GART - Graphics Aperture Remapping Table. It then performs manipulations in that range as if that whole graphics aperture were part of its local memory. A value of "Both" DMA and Execute models may also be specified.
	*/
	public final static String CIM_PROPERTY_USAGEMODEL = "UsageModel"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSINGMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATATRANSFERRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_GRAPHICSAPERTURESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALBUSWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH);
		CIM_PropertyNameList.add(CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_USAGEMODEL);
				
		for (int i = 0; i < CIM_VideoController.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSINGMODE)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATATRANSFERRATE)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GRAPHICSAPERTURESIZE)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALBUSWIDTH)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USAGEMODEL)){
				continue;
			}
			
			CIM_AGPVideoController.CIM_PropertyNameList.add(CIM_VideoController.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSINGMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATATRANSFERRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GRAPHICSAPERTURESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALBUSWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USAGEMODEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_VideoController.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSINGMODE)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATATRANSFERRATE)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GRAPHICSAPERTURESIZE)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALBUSWIDTH)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USAGEMODEL)){
				continue;
			}
			
			CIM_AGPVideoController.CIM_PropertyList.add(CIM_VideoController.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_VideoController.Java_Package_List.size(); i++) {
			if (((String)CIM_VideoController.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_VideoController.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSINGMODE = {"Unknown","Other","Sideband","Pipeline"};
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","PCI Fast Write","MultiMonitor Support","PCI Mastering","Second Monochrome Adapter Support","Large Memory Address Support"};
	public final static String[] CIM_VALUEMAP_DATATRANSFERRATE = {"Unknown","Other","1X","2X","4X"};
	public final static String[] CIM_VALUEMAP_USAGEMODEL = {"Unknown","Other","Execute","DMA","Both"};
	
	
	public final static int ADDRESSINGMODE_UNKNOWN = 0;
	public final static int ADDRESSINGMODE_OTHER = 1;
	public final static int ADDRESSINGMODE_SIDEBAND = 2;
	public final static int ADDRESSINGMODE_PIPELINE = 3;
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_PCIFASTWRITE = 2;
	public final static int CAPABILITIES_MULTIMONITORSUPPORT = 3;
	public final static int CAPABILITIES_PCIMASTERING = 4;
	public final static int CAPABILITIES_SECONDMONOCHROMEADAPTERSUPPORT = 5;
	public final static int CAPABILITIES_LARGEMEMORYADDRESSSUPPORT = 6;
	
	public final static int DATATRANSFERRATE_UNKNOWN = 0;
	public final static int DATATRANSFERRATE_OTHER = 1;
	public final static int DATATRANSFERRATE_1X = 2;
	public final static int DATATRANSFERRATE_2X = 3;
	public final static int DATATRANSFERRATE_4X = 4;
	
	public final static int USAGEMODEL_UNKNOWN = 0;
	public final static int USAGEMODEL_OTHER = 1;
	public final static int USAGEMODEL_EXECUTE = 2;
	public final static int USAGEMODEL_DMA = 3;
	public final static int USAGEMODEL_BOTH = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AGPVideoController() {

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
	public CIM_AGPVideoController(Vector keyProperties){ 
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
	public CIM_AGPVideoController(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AGPVideoController)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AGPVideoController)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AGPVideoController)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AGPVideoController)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AGPVideoController)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AGPVideoController)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AGPVideoController)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AGPVideoController)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AGPVideoController)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AGPVideoController)object).cimObjectPath)) {
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
	
	// Attribute AGPSpecificationVersionConformance
	
	public String get_AGPSpecificationVersionConformance() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AGPSpecificationVersionConformance(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_AGPSpecificationVersionConformance(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_AGPSPECIFICATIONVERSIONCONFORMANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AddressingMode
	
	public UnsignedInt16 get_AddressingMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressingMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_AddressingMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_ADDRESSINGMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataTransferRate
	
	public UnsignedInt16 get_DataTransferRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataTransferRate(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_DataTransferRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_DATATRANSFERRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GraphicsApertureSize
	
	public UnsignedInt32 get_GraphicsApertureSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GraphicsApertureSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_GraphicsApertureSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_GRAPHICSAPERTURESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalBusWidth
	
	public UnsignedInt32 get_LocalBusWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalBusWidth(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_LocalBusWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_LOCALBUSWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumberOfPipelinedAGPTransactions
	
	public UnsignedInt32 get_MaxNumberOfPipelinedAGPTransactions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberOfPipelinedAGPTransactions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_MaxNumberOfPipelinedAGPTransactions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXNUMBEROFPIPELINEDAGPTRANSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumAGPCommandQueuePath
	
	public UnsignedInt32 get_MaximumAGPCommandQueuePath() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumAGPCommandQueuePath(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_MaximumAGPCommandQueuePath(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_MAXIMUMAGPCOMMANDQUEUEPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NonlocalVideoMemorySize
	
	public UnsignedInt32 get_NonlocalVideoMemorySize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NonlocalVideoMemorySize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_NonlocalVideoMemorySize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_NONLOCALVIDEOMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UsageModel
	
	public UnsignedInt16 get_UsageModel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UsageModel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL + " could not be found");
    		
		} else if (!CIM_AGPVideoControllerHelper.isValid_UsageModel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPVideoController.CIM_PROPERTY_USAGEMODEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
