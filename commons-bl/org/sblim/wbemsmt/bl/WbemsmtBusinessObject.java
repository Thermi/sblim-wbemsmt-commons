 /** 
  * WbemsmtBusinessObject.java
  *
  * Â© Copyright IBM Corp. 2005
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
  * Description: Base class for wbemsmt Business Objects
  * 
  */
package org.sblim.wbemsmt.bl;

import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.ModelLoadException;

/**
 * @author Bauschert
 *
 */
public abstract class WbemsmtBusinessObject {

	protected static Logger logger = Logger.getLogger(WbemsmtBusinessObject.class.getName());
	protected boolean reloadChilds = false;
	private final AbstractBaseCimAdapter baseCimAdapter;

	protected WbemsmtBusinessObject(AbstractBaseCimAdapter adapter)
	{
		this.baseCimAdapter = adapter;
	}
	
	protected Object getFirstChild(Class mustReturnThis, List list, boolean silent) throws ModelLoadException {
		return getFirstChild(mustReturnThis, list, silent, false, baseCimAdapter.getCimClient());
	}

	protected Object getFirstChild(Class mustReturnThis, List list, boolean silent,boolean createIfNotExists) throws ModelLoadException {
		return getFirstChild(mustReturnThis, list, silent, createIfNotExists, baseCimAdapter.getCimClient());
	}

	protected static Object getFirstChild(Class mustReturnThis, List list, boolean silent, boolean createIfNotExists, CIMClient client) throws ModelLoadException {
		if (!silent && list.size() != 1)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause not exact one element was found in List. Found: " + list.size());
			throw new ModelLoadException("Cannot load data model");
		}
		
		if (!silent && list.get(0) == null)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element was null");
			throw new ModelLoadException("Cannot load data model");
		}
	
		if (!silent && !list.get(0).getClass().equals(mustReturnThis) && !(list.get(0) instanceof CIMObjectPath) )
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element is not from type " + mustReturnThis.getName() + " is of type " + list.get(0).getClass());
			throw new ModelLoadException("Cannot load data model");
		}
		
		if (list.size() == 0 && createIfNotExists)
		{
			try {
				return mustReturnThis.newInstance();
			} catch (Exception e) {
				throw new ModelLoadException(e);
			}
		}
		
		if (silent && list.size() == 0)
		{
			return null;
		}
		else
		{
			Object o = list.get(0);
			if (o instanceof CIMObjectPath)
			{
				CIMObjectPath path = (CIMObjectPath) o;
				String helper = mustReturnThis.getName() + "Helper";
				Object fco = null;
				try {
					Class clsHelper = Class.forName(helper);
					Method method = clsHelper.getMethod("getInstance",new Class[]{CIMClient.class,CIMObjectPath.class});
					fco = method.invoke(null,new Object[]{client,path});
					return fco;
				} catch (Exception e) {
					throw new ModelLoadException("Cannot load element with path " + path, e);
				}
			}
			else
			{
				return o;
			}
		}
	}

	public AbstractBaseCimAdapter getBaseCimAdapter() {
		return baseCimAdapter;
	}
}
