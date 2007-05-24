 /** 
  * CimAdapterFactory.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Singleton Class who is creating and caching many adapters on a per-session
  * basis
  * 
  * If the Method with the FacesContext is used the adapters are stored in the HttpSession 
  * If the Method with Object is used the Adapters are stored in a MultiHashMap bound to this factory class
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class CimAdapterFactory {

	private static CimAdapterFactory _instance;
	private MultiMap adaptersByObject = new MultiHashMap();

	private static Logger logger = Logger.getLogger(CimAdapterFactory.class.getName());
	
	private CimAdapterFactory() {
	}

	public static synchronized CimAdapterFactory getInstance() {
		if (_instance == null) {
			_instance = new CimAdapterFactory();
		}
		return _instance;
	}

	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
	 * which is the the Session of the current FacesContext
	 * 
	 * @param adapterClass
	 * @param fc
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, FacesContext fc,CIMClient client)
	{
		return getAdapter(adapterClass, fc,client,true);
	}

	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
	 * which is the the Session of the current FacesContext
	 * @param adapterClass
	 * @param fc
	 * @param client
	 * @param createNew
	 * @return null if !createNew and the adapter was not found
	 */
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, FacesContext fc,CIMClient client, boolean createNew)
	{
		try {
			AbstractBaseCimAdapter result = null;
			
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			String key = getKey(adapterClass,client);
			result = (AbstractBaseCimAdapter) session.getAttribute(key);
			if (result == null && createNew)
			{
				Constructor constructor = adapterClass.getConstructor(new Class[]{Locale.class});
				result = (AbstractBaseCimAdapter) constructor.newInstance(new Object[]{LocaleManager.getCurrent(fc).getCurrentLocale()});
				session.setAttribute(key,result);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
	 * which is the the Session of the current FacesContext
	 * 
	 * @param adapterClass
	 * @param fc
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, CIMClient client)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return getAdapter(adapterClass, FacesContext.getCurrentInstance(),client);
		}
		return null;
	}

	
	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the session
	 * the given Oject belongs to
	 * @param adapterClass
	 * @param object
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, Object object)
	{
		return getAdapter(adapterClass,object,Locale.getDefault());
	}	
	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the session
	 * the given Oject belongs to
	 * @param adapterClass
	 * @param object
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, Object object, Locale locale)
	{
		return getAdapter(adapterClass, object,locale,true);
	}

	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the session
	 * the given Oject belongs to
	 * @param adapterClass
	 * @param object
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, Object object, Locale locale, boolean createNew)
	{
		try {
			List adapters = (List) adaptersByObject.get(object);
			
			for (int i=0; adapters != null && i < adapters.size(); i++)
			{
				if (adapters.get(i).getClass().equals(adapterClass))
				{
					AbstractBaseCimAdapter adapter = (AbstractBaseCimAdapter) adapters.get(i);
					if (!adapter.getBundle().getLocale().equals(locale))
					{
						adapter.localeChanged(locale);
					}
					return adapter;
				}
			}
			if (createNew)
			{
				Constructor constructor = adapterClass.getConstructor(new Class[]{Locale.class});
				AbstractBaseCimAdapter  result = (AbstractBaseCimAdapter) constructor.newInstance(new Object[]{locale});
				adaptersByObject.put(object,result);
				return result;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Get the key for the adapterclass and cimclient for storing the adapter in the cache
	 * @param adapterClass
	 * @param client
	 * @return
	 */
	private String getKey(Class adapterClass, CIMClient client) {
		return "adapter." + adapterClass.getName() + ".for.client." + client.getNameSpace().getHost();
	}

	public void removeAdapter(AbstractBaseCimAdapter adapter) {
		
		List keys = new ArrayList();
		Set set = adaptersByObject.keySet();
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			Object key = (Object) iter.next();
			keys.add(key);
		}
		
		for (Iterator iter = keys.iterator(); iter.hasNext();) {
			Object key = (Object) iter.next();
			Object removed = adaptersByObject.remove(key, adapter);
			if (removed != null)
			{
				logger.info("Adapter " + adapter.getClass().getName() + " was removed from cache ");
			}
				
		}
	}
	
}
