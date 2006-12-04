 /** 
  * ArgumentList.java
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
  * Description: Arguemntlist for testing Commandlets
  * 
  */
package org.sblim.wbemsmt.test.commandline;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList {
	List args = new ArrayList();
	
	public void add(String key, String value)
	{
		args.add(key);
		args.add(value);
	}
	
	public void add(String key)
	{
		args.add(key);
	}
	
	public String[] getStringArray()
	{
		String[] result = (String[]) args.toArray(new String[args.size()]);
		return result;
	}
	
}
