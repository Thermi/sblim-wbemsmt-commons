 /** 
  * GenericFcoComparator.java
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
  * Description: Comparator for FCO Object
  * 
  */
package org.sblim.wbemsmt.test;

import java.lang.reflect.Method;
import java.util.Comparator;

import org.sblim.wbem.cim.CIMObjectPath;

public class GenericFcoComparator implements Comparator {

	private final String fieldName;
	private final boolean ascending;

	/**
	 * 
	 */
	public GenericFcoComparator(String fieldName, boolean ascending) {
		super();
		this.fieldName = fieldName;
		this.ascending = ascending;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object o1, Object o2) {
		
		try {
			if (o1 == null || o2 == null)
			{
				throw new RuntimeException("Cannot compare. One of the objects was null");
			}
			Method method1 = o1.getClass().getDeclaredMethod("get_" + fieldName, new Class[]{});
			Method method2 = o2.getClass().getDeclaredMethod("get_" + fieldName, new Class[]{});
			
			method1.setAccessible(true);
			method2.setAccessible(true);
			
			o1 = method1.invoke(o1,new Object[]{});
			o2 = method1.invoke(o2,new Object[]{});
			
			if (!o1.getClass().getName().equals(o2.getClass().getName()))
			{
				throw new RuntimeException("Cannot compare. Objects are not from same type. " + o1.getClass().getName() + " and " + o2.getClass().getName());
			}

			if (o1 instanceof String) {
				String value1 = o1 == null ? "" : (String) o1;
				String value2 = o2 == null ? "" : (String) o2;
				return ascending ? value1.compareTo(value2) : value2.compareTo(value1);
			}
			else if (o1 instanceof Number) {
				Number value1 = o1 == null ? new Integer(0) : (Number) o1;
				Number value2 = o2 == null ? new Integer(0) : (Number) o2;
				return ascending ? (int)(value1.longValue() - value2.longValue()) : (int)(value2.longValue() - value1.longValue());
			}
			else if (o1 instanceof CIMObjectPath) {
				CIMObjectPath value1 = (CIMObjectPath) o1;
				CIMObjectPath value2 = (CIMObjectPath) o2;

				if (!value1.getObjectName().equals(value2.getObjectName()))
				{
					throw new RuntimeException("Cannot sort. The object names of both CIMObjectPathes of field " + fieldName + " are not the same. " + value1.getObjectName() + " / " + value2.getObjectName());
				}
				
				if (value1 == null && value2 != null)
				{
					return -1;
				}
				else if (value1 != null && value2 == null)
				{
					return 1;
				}
				else if (value1 == null && value2 == null)
				{
					return 0;
				}
				else
				{
					return ascending ? value1.toString().compareTo(value2.toString()) : value2.toString().compareTo(value1.toString());
				}
			}
			return 0;
		} catch (Exception e) {
			throw new RuntimeException("Cannot compare.",e);
		}
		
	}

}
