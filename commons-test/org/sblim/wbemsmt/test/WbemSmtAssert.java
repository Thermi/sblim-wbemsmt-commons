/** 
  * WbemSmtAssert.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Assert for wbemsmt tests with extra Assert-Functions
  * 
  */

package org.sblim.wbemsmt.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

import com.thoughtworks.selenium.Selenium;

/**
 * @author Bauschert
 *
 */
public class WbemSmtAssert extends Assert {
	
	private static Logger logger = Logger.getLogger("org.sblim.wbemsmt.test");	
	
	public static void fail(String msg, Throwable t) {
		logger.log(Level.SEVERE,"Test failed because of Exception " , t);
		fail(msg + " " + t.getMessage());
	}
	
	/**
	 * compare the if the 2 elemens have same properties
	 * @param string
	 * @param element1
	 * @param element2
	 */
	public static void assertEquals(String string, CIM_ManagedElement element1, CIM_ManagedElement element2) {
		assertEqualProperties(string,element1.getCimInstance().getProperties(),element2.getCimInstance().getProperties());
	}

	/**
	 * compare the if the 2 elemens have same properties
	 * @param string
	 * @param element1
	 * @param element2
	 */
	public static void assertEquals(String string, CIM_Component element1, CIM_Component element2) {
		assertEqualProperties(string,element1.getCimInstance().getProperties(),element2.getCimInstance().getProperties());
	}
		
	/**
	 * Compare two sorted lists 
	 * @param msg
	 * @param fieldname
	 * @param properties1
	 * @param properties2
	 */
	public static void assertEquals(String msg, String fieldname, List list1, List list2) {

		assertEquals("Lists are not from same size",list1.size(), list2.size());
		
		GenericFcoComparator comp = new GenericFcoComparator(fieldname,true);
		
		for (int i=0; i < list1.size(); i++)
		{
			Object o1 =  list1.get(i);
			Object o2 =  list2.get(i);
			assertTrue("Object is not the same. Object1 = " + o1 + " Object 2" + o2,comp.compare(o1,o2) == 0); 
		}

	}
	/**
	 * Compare if the CIMProperty entries of the vectors are the same 
	 * @param string
	 * @param properties1
	 * @param properties2
	 */
	public static void assertEqualProperties(String string, Vector properties1, Vector properties2) {
		
		assertEquals("Amount of properties not the same",properties1.size(),properties2.size());
		
		Map mapKey1 = new HashMap();
		Map mapKey2 = new HashMap();
		
		for (int i = 0; i < properties1.size(); i++) {
			CIMProperty property = (CIMProperty)properties1.get(i);
			mapKey1.put(property.getName(),property);
		}

		for (int i = 0; i < properties2.size(); i++) {
			CIMProperty property = (CIMProperty) properties2.get(i);
			mapKey2.put(property.getName(),property);
		}
		
		//search for same key and compare content
		for (Iterator iter = mapKey1.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry = (Entry) iter.next();
			String propertyName = (String)entry.getKey();
			CIMProperty property1 = (CIMProperty) entry.getValue();
			CIMProperty property2 = (CIMProperty) mapKey2.get(propertyName);
			assertNotNull("Property " + propertyName + " not exists in both CIMInstances");
			mapKey2.remove(propertyName);
			assertEqualProperty("Property " + propertyName + " has different values ",property1,property2);
			
		}
		for (Iterator iter = mapKey2.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry = (Entry) iter.next();
			String propertyName = (String)entry.getKey();
			CIMProperty property1 = (CIMProperty) entry.getValue();
			CIMProperty property2 = (CIMProperty) mapKey1.get(propertyName);
			assertNotNull("Property " + propertyName + " not exists in both CIMInstances");
			assertEqualProperty("Property " + propertyName + " has different values ",property1,property2);
		}
		
		
	}
	
	/**
	 * checks if the property content is the same
	 * @param string
	 * @param property1
	 * @param property2
	 */

	public static void assertEqualProperty(String string, CIMProperty property1, CIMProperty property2)
	{
		assertEquals("Names of Properties are not the same ",property1.getName(),property2.getName());
		String value1 = property1.getValue() != null ? property1.getValue().toString() : "no value";
		String value2 = property2.getValue() != null ? property2.getValue().toString() : "no value";
		assertEquals("Values of Properties" + property1.getName() + " are not the same ",value1,value2);
	}

	public static void assertTextFound(Selenium selenium, String textToBeFound) {
		
		assertTrue("Expected Text " + textToBeFound + " was not found",selenium.isTextPresent(textToBeFound));
		
	}

	public static void assertTextNotFound(Selenium selenium, String textNotToBeFound) {
		
		assertFalse("Not Allowed Text " + textNotToBeFound + " was found.",selenium.isTextPresent(textNotToBeFound));
		
	}

	/**
	 * checks if the confirmation is pending
	 * @param session
	 * @param expectedConfirmationString
	 */
	public static void assertConfirmation(WbemSmtWebSession session, String expectedConfirmationString) {
		String confirmationString = session.getConfirmation();
		assertEquals(expectedConfirmationString,confirmationString);
	}
	
}
