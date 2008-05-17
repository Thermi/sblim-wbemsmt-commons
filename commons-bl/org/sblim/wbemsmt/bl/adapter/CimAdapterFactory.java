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
import java.util.*;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.wbem.client.WBEMClient;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
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
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, FacesContext fc,WBEMClient client)
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
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, FacesContext fc,WBEMClient client, boolean createNew)
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
	 * get the adapter with the given taskname within the current session bound to the FacesContext
	 * @param taskname
	 * @param fc
	 * @param client
	 * @param createNew
	 * @return null if the adapter was not found or the current Runtime mode is not supported - Currently supported is only JSF
	 */
	public AbstractBaseCimAdapter getAdapter(String taskname, WBEMClient client)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return getAdapter(taskname, FacesContext.getCurrentInstance(),client);
		}
		return null;
		
	}
	
	/**
	 * get the adapter with the given taskname within the current session bound to the FacesContext
	 * @param taskname
	 * @param fc
	 * @param client
	 * @param createNew
	 * @return null if the adapter was not found
	 */
	public AbstractBaseCimAdapter getAdapter(String taskname, FacesContext fc,WBEMClient client)
	{
		try {
			AbstractBaseCimAdapter result = null;
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			String key = getKey(taskname,client);
			result = (AbstractBaseCimAdapter) session.getAttribute(key);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	/**
	 * Set the adapter for the given taskname and the client
	 * @param taskName
	 * @param context
	 * @param cimClient
	 */
	public void setAdapter(String taskName, FacesContext fc, WBEMClient client, AbstractBaseCimAdapter adapter) {
		try {
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			String key = getKey(taskName,client);
			session.setAttribute(key,adapter);
		} catch (Exception e) {
			e.printStackTrace();
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
	public AbstractBaseCimAdapter getAdapter(Class adapterClass, WBEMClient client)
	{
		return getAdapter(adapterClass, client,true);
	}
	
	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
	 * which is the the Session of the current FacesContext
	 * 
	 * @param adapterClass
	 * @param fc
	 * @param createNew Create a new One if no adapter was found
	 * @return
	 */	

	public AbstractBaseCimAdapter getAdapter(Class adapterClass, WBEMClient client, boolean createNew) {

		if (RuntimeUtil.getInstance().isJSF())
		{
			return getAdapter(adapterClass, FacesContext.getCurrentInstance(),client,createNew);
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
	private String getKey(Class adapterClass, WBEMClient client) {
		return "adapter." + adapterClass.getName() + ".for.client." + client;
	}

	/**
	 * Get the key for the taskname and cimclient for storing the adapter in the cache
	 * @param adapterClass
	 * @param client
	 * @return
	 */
	private String getKey(String taskname, WBEMClient client) {
		return "adapter.for.task." + taskname + ".for.client." + client;
	}

	public void removeAdapter(AbstractBaseCimAdapter adapter, WBEMClient client)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			String key = getKey(adapter.getClass(),client);
			session.removeAttribute(key);
		}
		removeAdapter(adapter);
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
