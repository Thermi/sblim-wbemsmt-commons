/** 
 * CIM_NumericSensor.java
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
 * Description:  A Numeric Sensor is capable of returning numeric readings and optionally
 * supports thresholds settings.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;



/**
 *  A Numeric Sensor is capable of returning numeric readings and optionally
 * supports thresholds settings.
 */
public class CIM_NumericSensor extends CIM_Sensor  {
	
	public final static String CIM_CLASS_NAME = "CIM_NumericSensor"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	Indicates the accuracy of the Sensor for the measured property. Its value is recorded as plus/minus hundredths of a percent. Accuracy, along with Resolution, is used to calculate the actual value of the measured physical property. Accuracy may vary depending on whether the Device is linear over its dynamic range.
	*/
	public final static String CIM_PROPERTY_ACCURACY = "Accuracy"; //$NON-NLS-1$
	/**
	*	The base unit of the values returned by this Sensor. All the values returned by this Sensor are represented in the units obtained by (BaseUnits * 10 raised to the power of the UnitModifier). For example, if BaseUnits is Volts and the UnitModifier is -6, then the units of the values returned are MicroVolts. However, if the RateUnits property is set to a value other than "None", then the units are further qualified as rate units. In the above example, if RateUnits is set to "Per Second", then the values returned by the Sensor are in MicroVolts/Second. The units apply to all numeric properties of the Sensor, unless explicitly overridden by the Units qualifier.
	*/
	public final static String CIM_PROPERTY_BASEUNITS = "BaseUnits"; //$NON-NLS-1$
	/**
	*	The current value indicated by the Sensor.
	*/
	public final static String CIM_PROPERTY_CURRENTREADING = "CurrentReading"; //$NON-NLS-1$
	/**
	*	An array representing the thresholds that are currently enabled for this Sensor.
	*/
	public final static String CIM_PROPERTY_ENABLEDTHRESHOLDS = "EnabledThresholds"; //$NON-NLS-1$
	/**
	*	Indicates the margin built around the thresholds. This margin prevents unnecessary state changes when the Sensor reading may fluctuate very close to its thresholds. This could be due to the Sensor's tolerance/accuracy/resolution or due to environmental factors. Once a threshold is crossed, the state of the Sensor should change. However, the state should not fluctuate between the old and new states unless the Sensor's change in the reading exceeds the hysteresis value. The units for this measurement are determined by BaseUnit*UnitModifier/RateUnit.
	*/
	public final static String CIM_PROPERTY_HYSTERESIS = "Hysteresis"; //$NON-NLS-1$
	/**
	*	Indicates that the Sensor is linear over its dynamic range.
	*/
	public final static String CIM_PROPERTY_ISLINEAR = "IsLinear"; //$NON-NLS-1$
	/**
	*	The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is between LowerThresholdCritical and Lower ThresholdFatal, then the CurrentState is Critical.
	*/
	public final static String CIM_PROPERTY_LOWERTHRESHOLDCRITICAL = "LowerThresholdCritical"; //$NON-NLS-1$
	/**
	*	The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is below LowerThresholdFatal, then the Current State is Fatal.
	*/
	public final static String CIM_PROPERTY_LOWERTHRESHOLDFATAL = "LowerThresholdFatal"; //$NON-NLS-1$
	/**
	*	The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If Current Reading is between LowerThresholdNonCritical and Upper ThresholdNonCritical, then the Sensor is reporting a normal value. If CurrentReading is between LowerThresholdNonCritical and LowerThresholdCritical, then the CurrentState is NonCritical.
	*/
	public final static String CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL = "LowerThresholdNonCritical"; //$NON-NLS-1$
	/**
	*	MaxReadable indicates the largest value of the measured property that can be read by the NumericSensor.
	*/
	public final static String CIM_PROPERTY_MAXREADABLE = "MaxReadable"; //$NON-NLS-1$
	/**
	*	MinReadable indicates the smallest value of the measured property that can be read by the NumericSensor.
	*/
	public final static String CIM_PROPERTY_MINREADABLE = "MinReadable"; //$NON-NLS-1$
	/**
	*	NominalReading indicates the 'normal' or expected value for the NumericSensor.
	*/
	public final static String CIM_PROPERTY_NOMINALREADING = "NominalReading"; //$NON-NLS-1$
	/**
	*	NormalMax provides guidance for the user as to the normal maximum range for the NumericSensor.
	*/
	public final static String CIM_PROPERTY_NORMALMAX = "NormalMax"; //$NON-NLS-1$
	/**
	*	NormalMin provides guidance for the user as to the normal minimum range for the NumericSensor.
	*/
	public final static String CIM_PROPERTY_NORMALMIN = "NormalMin"; //$NON-NLS-1$
	/**
	*	Specifies if the units returned by this Sensor are rate units. All the values returned by this Sensor are represented in the units obtained by (BaseUnits * 10 raised to the power of the UnitModifier). This is true unless this property (RateUnits) has a value different than "None". For example, if BaseUnits is Volts and the UnitModifier is -6, then the units of the values returned are MicroVolts. But, if the RateUnits property is set to a value other than "None", then the units are further qualified as rate units. In the above example, if RateUnits is set to "Per Second", then the values returned by the Sensor are in MicroVolts/Second. The units apply to all numeric properties of the Sensor, unless explicitly overridden by the Units qualifier. Any implementation of CurrentReading should be qualified with either a Counter or a Gauge qualifier, depending on the characteristics of the sensor being modeled.
	*/
	public final static String CIM_PROPERTY_RATEUNITS = "RateUnits"; //$NON-NLS-1$
	/**
	*	Resolution indicates the ability of the Sensor to resolve differences in the measured property. The units for this measurement are determined by BaseUnit*UnitModifier/RateUnit.
	*/
	public final static String CIM_PROPERTY_RESOLUTION = "Resolution"; //$NON-NLS-1$
	/**
	*	An array representing the writable thresholds supported by Sensor.
	*/
	public final static String CIM_PROPERTY_SETTABLETHRESHOLDS = "SettableThresholds"; //$NON-NLS-1$
	/**
	*	An array representing the thresholds supported by this Sensor.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDTHRESHOLDS = "SupportedThresholds"; //$NON-NLS-1$
	/**
	*	This property is being deprecated in lieu of using the Resolution and Accuracy properties. 
Indicates the tolerance of the Sensor for the measured property. Tolerance, along with Resolution and Accuracy, is used to calculate the actual value of the measured physical property. Tolerance may vary depending on whether the Device is linear over its dynamic range.
	*/
	public final static String CIM_PROPERTY_TOLERANCE = "Tolerance"; //$NON-NLS-1$
	/**
	*	The unit multiplier for the values returned by this Sensor. All the values returned by this Sensor are represented in the units obtained by (BaseUnits * 10 raised to the power of the UnitModifier). For example, if BaseUnits is Volts and the Unit Modifier is -6, then the units of the values returned are MicroVolts. However, if the RateUnits property is set to a value other than "None", then the units are further qualified as rate units. In the above example, if RateUnits is set to "Per Second", then the values returned by the Sensor are in MicroVolts/Second. The units apply to all numeric properties of the Sensor, unless explicitly overridden by the Units qualifier.
	*/
	public final static String CIM_PROPERTY_UNITMODIFIER = "UnitModifier"; //$NON-NLS-1$
	/**
	*	The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is between UpperThresholdCritical and Upper ThresholdFatal, then the CurrentState is Critical.
	*/
	public final static String CIM_PROPERTY_UPPERTHRESHOLDCRITICAL = "UpperThresholdCritical"; //$NON-NLS-1$
	/**
	*	The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is above UpperThresholdFatal, then the Current State is Fatal.
	*/
	public final static String CIM_PROPERTY_UPPERTHRESHOLDFATAL = "UpperThresholdFatal"; //$NON-NLS-1$
	/**
	*	The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is between LowerThresholdNonCritical and UpperThresholdNonCritical, then the Sensor is reporting a normal value. If the CurrentReading is between UpperThreshold NonCritical and UpperThresholdCritical, then the CurrentState is NonCritical.
	*/
	public final static String CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL = "UpperThresholdNonCritical"; //$NON-NLS-1$
	
	
	/**
	*	The use of this method is being deprecated, since Current senor reading can be retrieved through the GetInstance operation. 
For a non-linear Sensor, the resolution, accuracy, tolerance and hysteresis vary as the current reading moves. This method can be used to get these factors for a given reading. It returns 0 if successful, 1 if unsupported, and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_GETNONLINEARFACTORS = "GetNonLinearFactors";
	/**
	*	This method resets the values of the thresholds to hardware defaults. This method returns 0 if successful, 1 if unsupported and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_RESTOREDEFAULTTHRESHOLDS = "RestoreDefaultThresholds";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCURACY);
		CIM_PropertyNameList.add(CIM_PROPERTY_BASEUNITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTREADING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDTHRESHOLDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HYSTERESIS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISLINEAR);
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
		CIM_PropertyNameList.add(CIM_PROPERTY_SETTABLETHRESHOLDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDTHRESHOLDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOLERANCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITMODIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERTHRESHOLDFATAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
				
		for (int i = 0; i < CIM_Sensor.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCURACY)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BASEUNITS)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTREADING)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDTHRESHOLDS)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HYSTERESIS)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISLINEAR)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERTHRESHOLDFATAL)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXREADABLE)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINREADABLE)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOMINALREADING)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NORMALMAX)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NORMALMIN)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RATEUNITS)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESOLUTION)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SETTABLETHRESHOLDS)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDTHRESHOLDS)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOLERANCE)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITMODIFIER)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERTHRESHOLDFATAL)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL)){
				continue;
			}
			
			CIM_NumericSensor.CIM_PropertyNameList.add(CIM_Sensor.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCURACY, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BASEUNITS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTREADING, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDTHRESHOLDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HYSTERESIS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISLINEAR, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERTHRESHOLDFATAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXREADABLE, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINREADABLE, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOMINALREADING, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NORMALMAX, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NORMALMIN, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RATEUNITS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SETTABLETHRESHOLDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDTHRESHOLDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOLERANCE, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITMODIFIER, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERTHRESHOLDFATAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL, new CIMValue(null, new CIMDataType(CIMDataType.SINT32))));
				
		for (int i = 0; i < CIM_Sensor.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCURACY)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BASEUNITS)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTREADING)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDTHRESHOLDS)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HYSTERESIS)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISLINEAR)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERTHRESHOLDCRITICAL)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERTHRESHOLDFATAL)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXREADABLE)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINREADABLE)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOMINALREADING)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NORMALMAX)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NORMALMIN)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RATEUNITS)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESOLUTION)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SETTABLETHRESHOLDS)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDTHRESHOLDS)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOLERANCE)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITMODIFIER)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERTHRESHOLDCRITICAL)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERTHRESHOLDFATAL)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL)){
				continue;
			}
			
			CIM_NumericSensor.CIM_PropertyList.add(CIM_Sensor.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Sensor.Java_Package_List.size(); i++) {
			if (((String)CIM_Sensor.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Sensor.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_BASEUNITS = {"Unknown","Other","Degrees C","Degrees F","Degrees K","Volts","Amps","Watts","Joules","Coulombs","VA","Nits","Lumens","Lux","Candelas","kPa","PSI","Newtons","CFM","RPM","Hertz","Seconds","Minutes","Hours","Days","Weeks","Mils","Inches","Feet","Cubic Inches","Cubic Feet","Meters","Cubic Centimeters","Cubic Meters","Liters","Fluid Ounces","Radians","Steradians","Revolutions","Cycles","Gravities","Ounces","Pounds","Foot-Pounds","Ounce-Inches","Gauss","Gilberts","Henries","Farads","Ohms","Siemens","Moles","Becquerels","PPM (parts/million)","Decibels","DbA","DbC","Grays","Sieverts","Color Temperature Degrees K","Bits","Bytes","Words (data)","DoubleWords","QuadWords","Percentage"};
	public final static String[] CIM_VALUEMAP_ENABLEDTHRESHOLDS = {"LowerThresholdNonCritical","UpperThresholdNonCritical","LowerThresholdCritical","UpperThresholdCritical","LowerThresholdFatal","UpperThresholdFatal"};
	public final static String[] CIM_VALUEMAP_RATEUNITS = {"None","Per MicroSecond","Per MilliSecond","Per Second","Per Minute","Per Hour","Per Day","Per Week","Per Month","Per Year"};
	public final static String[] CIM_VALUEMAP_SETTABLETHRESHOLDS = {"LowerThresholdNonCritical","UpperThresholdNonCritical","LowerThresholdCritical","UpperThresholdCritical","LowerThresholdFatal","UpperThresholdFatal"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDTHRESHOLDS = {"LowerThresholdNonCritical","UpperThresholdNonCritical","LowerThresholdCritical","UpperThresholdCritical","LowerThresholdFatal","UpperThresholdFatal"};
	
	
	public final static int BASEUNITS_UNKNOWN = 0;
	public final static int BASEUNITS_OTHER = 1;
	public final static int BASEUNITS_DEGREESC = 2;
	public final static int BASEUNITS_DEGREESF = 3;
	public final static int BASEUNITS_DEGREESK = 4;
	public final static int BASEUNITS_VOLTS = 5;
	public final static int BASEUNITS_AMPS = 6;
	public final static int BASEUNITS_WATTS = 7;
	public final static int BASEUNITS_JOULES = 8;
	public final static int BASEUNITS_COULOMBS = 9;
	public final static int BASEUNITS_VA = 10;
	public final static int BASEUNITS_NITS = 11;
	public final static int BASEUNITS_LUMENS = 12;
	public final static int BASEUNITS_LUX = 13;
	public final static int BASEUNITS_CANDELAS = 14;
	public final static int BASEUNITS_KPA = 15;
	public final static int BASEUNITS_PSI = 16;
	public final static int BASEUNITS_NEWTONS = 17;
	public final static int BASEUNITS_CFM = 18;
	public final static int BASEUNITS_RPM = 19;
	public final static int BASEUNITS_HERTZ = 20;
	public final static int BASEUNITS_SECONDS = 21;
	public final static int BASEUNITS_MINUTES = 22;
	public final static int BASEUNITS_HOURS = 23;
	public final static int BASEUNITS_DAYS = 24;
	public final static int BASEUNITS_WEEKS = 25;
	public final static int BASEUNITS_MILS = 26;
	public final static int BASEUNITS_INCHES = 27;
	public final static int BASEUNITS_FEET = 28;
	public final static int BASEUNITS_CUBICINCHES = 29;
	public final static int BASEUNITS_CUBICFEET = 30;
	public final static int BASEUNITS_METERS = 31;
	public final static int BASEUNITS_CUBICCENTIMETERS = 32;
	public final static int BASEUNITS_CUBICMETERS = 33;
	public final static int BASEUNITS_LITERS = 34;
	public final static int BASEUNITS_FLUIDOUNCES = 35;
	public final static int BASEUNITS_RADIANS = 36;
	public final static int BASEUNITS_STERADIANS = 37;
	public final static int BASEUNITS_REVOLUTIONS = 38;
	public final static int BASEUNITS_CYCLES = 39;
	public final static int BASEUNITS_GRAVITIES = 40;
	public final static int BASEUNITS_OUNCES = 41;
	public final static int BASEUNITS_POUNDS = 42;
	public final static int BASEUNITS_FOOT_POUNDS = 43;
	public final static int BASEUNITS_OUNCE_INCHES = 44;
	public final static int BASEUNITS_GAUSS = 45;
	public final static int BASEUNITS_GILBERTS = 46;
	public final static int BASEUNITS_HENRIES = 47;
	public final static int BASEUNITS_FARADS = 48;
	public final static int BASEUNITS_OHMS = 49;
	public final static int BASEUNITS_SIEMENS = 50;
	public final static int BASEUNITS_MOLES = 51;
	public final static int BASEUNITS_BECQUERELS = 52;
	public final static int BASEUNITS_PPMPARTS_MILLION = 53;
	public final static int BASEUNITS_DECIBELS = 54;
	public final static int BASEUNITS_DBA = 55;
	public final static int BASEUNITS_DBC = 56;
	public final static int BASEUNITS_GRAYS = 57;
	public final static int BASEUNITS_SIEVERTS = 58;
	public final static int BASEUNITS_COLORTEMPERATUREDEGREESK = 59;
	public final static int BASEUNITS_BITS = 60;
	public final static int BASEUNITS_BYTES = 61;
	public final static int BASEUNITS_WORDSDATA = 62;
	public final static int BASEUNITS_DOUBLEWORDS = 63;
	public final static int BASEUNITS_QUADWORDS = 64;
	public final static int BASEUNITS_PERCENTAGE = 65;
	
	public final static int ENABLEDTHRESHOLDS_LOWERTHRESHOLDNONCRITICAL = 0;
	public final static int ENABLEDTHRESHOLDS_UPPERTHRESHOLDNONCRITICAL = 1;
	public final static int ENABLEDTHRESHOLDS_LOWERTHRESHOLDCRITICAL = 2;
	public final static int ENABLEDTHRESHOLDS_UPPERTHRESHOLDCRITICAL = 3;
	public final static int ENABLEDTHRESHOLDS_LOWERTHRESHOLDFATAL = 4;
	public final static int ENABLEDTHRESHOLDS_UPPERTHRESHOLDFATAL = 5;
	
	public final static int RATEUNITS_NONE = 0;
	public final static int RATEUNITS_PERMICROSECOND = 1;
	public final static int RATEUNITS_PERMILLISECOND = 2;
	public final static int RATEUNITS_PERSECOND = 3;
	public final static int RATEUNITS_PERMINUTE = 4;
	public final static int RATEUNITS_PERHOUR = 5;
	public final static int RATEUNITS_PERDAY = 6;
	public final static int RATEUNITS_PERWEEK = 7;
	public final static int RATEUNITS_PERMONTH = 8;
	public final static int RATEUNITS_PERYEAR = 9;
	
	public final static int SETTABLETHRESHOLDS_LOWERTHRESHOLDNONCRITICAL = 0;
	public final static int SETTABLETHRESHOLDS_UPPERTHRESHOLDNONCRITICAL = 1;
	public final static int SETTABLETHRESHOLDS_LOWERTHRESHOLDCRITICAL = 2;
	public final static int SETTABLETHRESHOLDS_UPPERTHRESHOLDCRITICAL = 3;
	public final static int SETTABLETHRESHOLDS_LOWERTHRESHOLDFATAL = 4;
	public final static int SETTABLETHRESHOLDS_UPPERTHRESHOLDFATAL = 5;
	
	public final static int SUPPORTEDTHRESHOLDS_LOWERTHRESHOLDNONCRITICAL = 0;
	public final static int SUPPORTEDTHRESHOLDS_UPPERTHRESHOLDNONCRITICAL = 1;
	public final static int SUPPORTEDTHRESHOLDS_LOWERTHRESHOLDCRITICAL = 2;
	public final static int SUPPORTEDTHRESHOLDS_UPPERTHRESHOLDCRITICAL = 3;
	public final static int SUPPORTEDTHRESHOLDS_LOWERTHRESHOLDFATAL = 4;
	public final static int SUPPORTEDTHRESHOLDS_UPPERTHRESHOLDFATAL = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NumericSensor() {

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
	public CIM_NumericSensor(Vector keyProperties){ 
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
	public CIM_NumericSensor(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NumericSensor)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NumericSensor)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NumericSensor)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NumericSensor)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NumericSensor)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NumericSensor)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NumericSensor)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NumericSensor)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NumericSensor)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NumericSensor)object).cimObjectPath)) {
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
	
	// Attribute Accuracy
	
	public Integer get_Accuracy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_ACCURACY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_ACCURACY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_ACCURACY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Accuracy(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_ACCURACY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_ACCURACY + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_Accuracy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_ACCURACY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_ACCURACY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BaseUnits
	
	public UnsignedInt16 get_BaseUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_BASEUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_BASEUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_BASEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BaseUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_BASEUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_BASEUNITS + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_BaseUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_BASEUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_BASEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentReading
	
	public Integer get_CurrentReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentReading(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_CurrentReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledThresholds
	
	public UnsignedInt16[] get_EnabledThresholds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_EnabledThresholds(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_EnabledThresholds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_ENABLEDTHRESHOLDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Hysteresis
	
	public UnsignedInt32 get_Hysteresis() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Hysteresis(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_Hysteresis(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_HYSTERESIS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsLinear
	
	public Boolean get_IsLinear() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_ISLINEAR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_ISLINEAR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_ISLINEAR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsLinear(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_ISLINEAR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_ISLINEAR + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_IsLinear(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_ISLINEAR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_ISLINEAR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowerThresholdCritical
	
	public Integer get_LowerThresholdCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerThresholdCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_LowerThresholdCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowerThresholdFatal
	
	public Integer get_LowerThresholdFatal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerThresholdFatal(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_LowerThresholdFatal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LowerThresholdNonCritical
	
	public Integer get_LowerThresholdNonCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LowerThresholdNonCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_LowerThresholdNonCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_LOWERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxReadable
	
	public Integer get_MaxReadable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxReadable(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_MaxReadable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_MAXREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinReadable
	
	public Integer get_MinReadable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_MINREADABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_MINREADABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_MINREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinReadable(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_MINREADABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_MINREADABLE + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_MinReadable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_MINREADABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_MINREADABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NominalReading
	
	public Integer get_NominalReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NominalReading(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_NominalReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_NOMINALREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NormalMax
	
	public Integer get_NormalMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_NORMALMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NormalMax(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_NORMALMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMAX + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_NormalMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NormalMin
	
	public Integer get_NormalMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_NORMALMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NormalMin(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_NORMALMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMIN + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_NormalMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_NORMALMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RateUnits
	
	public UnsignedInt16 get_RateUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_RATEUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_RATEUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_RATEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RateUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_RATEUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_RATEUNITS + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_RateUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_RATEUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_RATEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Resolution
	
	public UnsignedInt32 get_Resolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_RESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Resolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_RESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_Resolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_RESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SettableThresholds
	
	public UnsignedInt16[] get_SettableThresholds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SettableThresholds(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_SettableThresholds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_SETTABLETHRESHOLDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedThresholds
	
	public UnsignedInt16[] get_SupportedThresholds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedThresholds(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_SupportedThresholds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_SUPPORTEDTHRESHOLDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Tolerance
	
	public Integer get_Tolerance() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_TOLERANCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_TOLERANCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_TOLERANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Tolerance(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_TOLERANCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_TOLERANCE + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_Tolerance(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_TOLERANCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_TOLERANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitModifier
	
	public Integer get_UnitModifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitModifier(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_UnitModifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UNITMODIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperThresholdCritical
	
	public Integer get_UpperThresholdCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperThresholdCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_UpperThresholdCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperThresholdFatal
	
	public Integer get_UpperThresholdFatal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperThresholdFatal(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_UpperThresholdFatal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDFATAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpperThresholdNonCritical
	
	public Integer get_UpperThresholdNonCritical() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpperThresholdNonCritical(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " could not be found");
    		
		} else if (!CIM_NumericSensorHelper.isValid_UpperThresholdNonCritical(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NumericSensor.CIM_PROPERTY_UPPERTHRESHOLDNONCRITICAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_getNonLinearFactors(CIMClient cimClient, Integer SensorReading, Integer Accuracy, UnsignedInt32 Resolution, Integer Tolerance, UnsignedInt32 Hysteresis) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_NumericSensor.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SensorReading = new CIMValue(SensorReading, new CIMDataType(CIMDataType.SINT32));
		CIMValue cimValue_Accuracy = new CIMValue(Accuracy, new CIMDataType(CIMDataType.SINT32));
		CIMValue cimValue_Resolution = new CIMValue(Resolution, new CIMDataType(CIMDataType.UINT32));
		CIMValue cimValue_Tolerance = new CIMValue(Tolerance, new CIMDataType(CIMDataType.SINT32));
		CIMValue cimValue_Hysteresis = new CIMValue(Hysteresis, new CIMDataType(CIMDataType.UINT32));
		
	  	inParameter.add(new CIMArgument("SensorReading", cimValue_SensorReading));
		inParameter.add(new CIMArgument("Accuracy", cimValue_Accuracy));
		inParameter.add(new CIMArgument("Resolution", cimValue_Resolution));
		inParameter.add(new CIMArgument("Tolerance", cimValue_Tolerance));
		inParameter.add(new CIMArgument("Hysteresis", cimValue_Hysteresis));
		
	  	outParameter.add(new CIMArgument("Accuracy", cimValue_Accuracy));
		outParameter.add(new CIMArgument("Resolution", cimValue_Resolution));
		outParameter.add(new CIMArgument("Tolerance", cimValue_Tolerance));
		outParameter.add(new CIMArgument("Hysteresis", cimValue_Hysteresis));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETNONLINEARFACTORS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_NumericSensor.CIM_METHOD_GETNONLINEARFACTORS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_NumericSensor.CIM_METHOD_GETNONLINEARFACTORS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_NumericSensor.CIM_METHOD_GETNONLINEARFACTORS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_restoreDefaultThresholds(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_NumericSensor.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RESTOREDEFAULTTHRESHOLDS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_NumericSensor.CIM_METHOD_RESTOREDEFAULTTHRESHOLDS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_NumericSensor.CIM_METHOD_RESTOREDEFAULTTHRESHOLDS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_NumericSensor.CIM_METHOD_RESTOREDEFAULTTHRESHOLDS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
