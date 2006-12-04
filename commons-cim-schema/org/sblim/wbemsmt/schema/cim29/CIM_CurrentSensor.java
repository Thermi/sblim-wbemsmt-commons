/** 
 * CIM_CurrentSensor.java
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
 * Description: The use of this class is being deprecated in lieu of the additions to Sensor and NumericSensor. A CurrentSensor can be defined by setting the SensorType property, inherited from Sensor, to 4 ("Current").
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



public class CIM_CurrentSensor extends CIM_NumericSensor  {
	
	public final static String CIM_CLASS_NAME = "CIM_CurrentSensor";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYCURRENTSENSOR = "CIM_AssociatedSupplyCurrentSensor";
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_ACCURACY = "Accuracy"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_BASEUNITS = "BaseUnits"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_CURRENTREADING = "CurrentReading"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_LOWERTHRESHOLDCRITICAL = "LowerThresholdCritical"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_LOWERTHRESHOLDFATAL = "LowerThresholdFatal"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL = "LowerThresholdNonCritical"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_MAXREADABLE = "MaxReadable"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_MINREADABLE = "MinReadable"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_NOMINALREADING = "NominalReading"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_NORMALMAX = "NormalMax"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_NORMALMIN = "NormalMin"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_RATEUNITS = "RateUnits"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_RESOLUTION = "Resolution"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SENSORTYPE = "SensorType"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_TOLERANCE = "Tolerance"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_UNITMODIFIER = "UnitModifier"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_UPPERTHRESHOLDCRITICAL = "UpperThresholdCritical"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_UPPERTHRESHOLDFATAL = "UpperThresholdFatal"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL = "UpperThresholdNonCritical"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCURACY);
		CIM_PropertyNameList.add(CIM_PROPERTY_BASEUNITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTREADING);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOWERTHRESHOLDFATAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXREADABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINREADABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOMINALREADING);
		CIM_PropertyNameList.add(CIM_PROPERTY_NORMALMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_NORMALMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_RATEUNITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SENSORTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOLERANCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITMODIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERTHRESHOLDFATAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
				
		for (int i = 0; i < CIM_NumericSensor.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCURACY)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BASEUNITS)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTREADING)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERTHRESHOLDFATAL)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXREADABLE)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINREADABLE)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOMINALREADING)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NORMALMAX)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NORMALMIN)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RATEUNITS)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESOLUTION)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SENSORTYPE)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOLERANCE)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITMODIFIER)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERTHRESHOLDFATAL)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL)){
				continue;
			}
			
			CIM_CurrentSensor.CIM_PropertyNameList.add(CIM_NumericSensor.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCURACY, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BASEUNITS, new CIMValue(new UnsignedInt16("6"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTREADING, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERTHRESHOLDFATAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXREADABLE, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINREADABLE, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOMINALREADING, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NORMALMAX, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NORMALMIN, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RATEUNITS, new CIMValue(new UnsignedInt16("0"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SENSORTYPE, new CIMValue(new UnsignedInt16("4"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOLERANCE, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITMODIFIER, new CIMValue(new Integer("-3"), new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERTHRESHOLDFATAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
				
		for (int i = 0; i < CIM_NumericSensor.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCURACY)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BASEUNITS)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTREADING)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERTHRESHOLDFATAL)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXREADABLE)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINREADABLE)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOMINALREADING)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NORMALMAX)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NORMALMIN)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RATEUNITS)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESOLUTION)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SENSORTYPE)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOLERANCE)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITMODIFIER)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERTHRESHOLDFATAL)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL)){
				continue;
			}
			
			CIM_CurrentSensor.CIM_PropertyList.add(CIM_NumericSensor.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_NumericSensor.Java_Package_List.size(); i++) {
			if (((String)CIM_NumericSensor.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_NumericSensor.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CurrentSensor() {

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
	public CIM_CurrentSensor(Vector keyProperties){ 
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
	public CIM_CurrentSensor(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_CurrentSensor)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CurrentSensor)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CurrentSensor)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CurrentSensor)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CurrentSensor)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CurrentSensor)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CurrentSensor)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CurrentSensor)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CurrentSensor)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CurrentSensor)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PowerSupply_CIM_AssociatedSupplyCurrentSensors(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYCURRENTSENSOR, 
					CIM_PowerSupply.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_CurrentSensor.Java_Package_List.size(); i++) {
						if (!((String)(CIM_CurrentSensor.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_CurrentSensor.Java_Package_List.get(i))).endsWith(".")) {
							CIM_CurrentSensor.Java_Package_List.setElementAt((String)(CIM_CurrentSensor.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_CurrentSensor.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PowerSupply(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PowerSupply(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PowerSupply(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PowerSupply_CIM_AssociatedSupplyCurrentSensor_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYCURRENTSENSOR, 
					CIM_PowerSupply.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PowerSupply.CIM_CLASS_NAME)) {
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
	
	// Attribute Accuracy
	
	public Integer get_Accuracy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_ACCURACY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_ACCURACY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_ACCURACY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Accuracy(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_ACCURACY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_ACCURACY + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_Accuracy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_ACCURACY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_ACCURACY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BaseUnits
	
	public UnsignedInt16 get_BaseUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BaseUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_BaseUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_BASEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentReading
	
	public Integer get_CurrentReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentReading(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_CurrentReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowerThresholdCritical
	
	public Integer get_LowerThresholdCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerThresholdCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_LowerThresholdCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowerThresholdFatal
	
	public Integer get_LowerThresholdFatal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerThresholdFatal(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_LowerThresholdFatal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowerThresholdNonCritical
	
	public Integer get_LowerThresholdNonCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerThresholdNonCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_LowerThresholdNonCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxReadable
	
	public Integer get_MaxReadable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxReadable(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_MaxReadable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MAXREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinReadable
	
	public Integer get_MinReadable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinReadable(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_MinReadable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_MINREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NominalReading
	
	public Integer get_NominalReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NominalReading(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_NominalReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NOMINALREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NormalMax
	
	public Integer get_NormalMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NormalMax(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_NormalMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NormalMin
	
	public Integer get_NormalMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NormalMin(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_NormalMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_NORMALMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RateUnits
	
	public UnsignedInt16 get_RateUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RateUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_RateUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RATEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Resolution
	
	public UnsignedInt32 get_Resolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Resolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_Resolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SensorType
	
	public UnsignedInt16 get_SensorType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SensorType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_SensorType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_SENSORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Tolerance
	
	public Integer get_Tolerance() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Tolerance(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_Tolerance(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_TOLERANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitModifier
	
	public Integer get_UnitModifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitModifier(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_UnitModifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UNITMODIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperThresholdCritical
	
	public Integer get_UpperThresholdCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperThresholdCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_UpperThresholdCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperThresholdFatal
	
	public Integer get_UpperThresholdFatal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperThresholdFatal(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_UpperThresholdFatal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperThresholdNonCritical
	
	public Integer get_UpperThresholdNonCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperThresholdNonCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (!CIM_CurrentSensorHelper.isValid_UpperThresholdNonCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CurrentSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
