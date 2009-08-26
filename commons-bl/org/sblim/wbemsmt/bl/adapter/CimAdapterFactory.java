 /** 
  * CimAdapterFactory.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
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

import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
  * Description: Singleton Class who is creating and caching adapters on a per-session basis<br>
  * <br>
  * If the Method with the FacesContext is used the adapters are stored in the HttpSession<br> 
  * If the Method with Object is used the Adapters are stored in a MultiHashMap bound to this factory class<br>
  * @see #getAdapter(Class, FacesContext, WBEMClient)
  * @see #getAdapter(Class, Object, Locale, boolean)
  */
public final class CimAdapterFactory {

	private static CimAdapterFactory _instance;
	
	/**
	 * Stores all the adapters in a context which is having no own Session object. For example the commandline 
	 */

	private Map<Object, List<AbstractBaseCimAdapter>> adaptersByObject = new HashMap<Object, List<AbstractBaseCimAdapter>>();

	private static Logger logger = Logger.getLogger(CimAdapterFactory.class.getName());
	

	/**
	 * default constructor
	 */
	private CimAdapterFactory() {
	}

	/**
	 * get the instance
	 * @return the CimAdapterFactory instance
	 */
	public static synchronized CimAdapterFactory getInstance() {
		if (_instance == null) {
			_instance = new CimAdapterFactory();
		}
		return _instance;
	}

	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
	 * which is the the Session of the current FacesContext
	 * <br>
	 * createNew is set to true by default
	 * @param adapterClass the class of the Adapter
	 * @param fc the Faces context
	 * @param client the cim client
	 * @return the adapter instance
	 */
	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, FacesContext fc,WBEMClient client)
	{
		return getAdapter(adapterClass, fc,client,true);
	}

    /**
     * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
     * which is the the Session of the current FacesContext
     * <br>
     * @param createNew create new one if no instance was found
     * @param adapterClass the class of the Adapter
     * @param fc the Faces context
     * @param client the cim client
     * @return the adapter instance
     */
	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, FacesContext fc,WBEMClient client, boolean createNew)
	{
		try {
			AbstractBaseCimAdapter result = null;
			
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			String key = getKey(adapterClass,client);
			result = (AbstractBaseCimAdapter) session.getAttribute(key);
			if (result == null && createNew)
			{
				Constructor<?> constructor = adapterClass.getConstructor(new Class[]{Locale.class});
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
	 * get the adapter with the given taskname within the current session bound to the FacesContext.
	 * Uses FacesContext.getCurrentInstance() to retrieve the current instance.
	 * @param taskname name of the task - used to build the key to lookup the adapter
	 * @param client the CIMClient - used to build the key to lookup the adapter
	 * @return null if the adapter was not found or the current Runtime mode is not supported - Currently supported is only JSF
     * @see #getKey(String, WBEMClient)
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
     * @param taskname name of the task - used to build the key to lookup the adapter
     * @param client the CIMClient - used to build the key to lookup the adapter
     * @param fc the Faces context
	 * @return null if the adapter was not found
	 * @see #getKey(String, WBEMClient)
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
	 * @param taskName name of the task - used to build the key to lookup the adapter
	 * @param fc the FacesContext
	 * @param client the client - used to build the key to lookup the adapter
	 * @param adapter the adapter to cache
     * @see #getKey(String, WBEMClient)
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
	 * which is the the Session of the current FacesContext<br>
	 * if no adapter exists a new obe is created
	 * 
	 * @param adapterClass the class of the adapter
	 * @param client the cim client
	 * @return the instance of the adapter class
	 */
	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, WBEMClient client)
	{
		return getAdapter(adapterClass, client,true);
	}
	
	/**
	 * Retrieve the adapter belonging to the given adapter class and the bound to the HttpSession
	 * which is the the Session of the current FacesContext.<br>
	 * Combination of adapterClass and client is used for creating the key
	 * @see #getKey(Class, WBEMClient)
	 * 
	 * @param adapterClass class of the adapter
	 * @param client the server connection
	 * @param createNew Create a new One if no adapter was found
	 * @return the adapter instance
	 */	

	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, WBEMClient client, boolean createNew) {

		if (RuntimeUtil.getInstance().isJSF())
		{
			return getAdapter(adapterClass, FacesContext.getCurrentInstance(),client,createNew);
		}
		return null;
	}

	
    /**
     * Retrieve the adapter belonging to the given adapter class<br>
     * the object is used as key<br>
     * if the adapter doesn't exist a new one is created<br>
     * Switches the Locale to Locale.getDefault
     * @param adapterClass class of the adapter
     * @param object  the key
     * @return the adapter instance
     */ 
	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, Object object)
	{
		return getAdapter(adapterClass,object,Locale.getDefault());
	}	
    /**
     * Retrieve the adapter belonging to the given adapter class<br>
     * the object is used as key<br>
     * if the adapter doesn't exist a new one is created<br>
     * 
     * @param adapterClass class of the adapter
     * @param object  the key
     * @param locale the locale to be used for the container
     * @return the adapter instance
     */ 
	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, Object object, Locale locale)
	{
		return getAdapter(adapterClass, object,locale,true);
	}

    /**
     * Retrieve the adapter belonging to the given adapter class<br>
     * the object is used as key<br>
     * 
     * @param adapterClass class of the adapter
     * @param object  the key
     * @param locale the locale to be used for the container
     * @param createNew set to true if to create a new one if the adapter doesn't exist
     * @return the adapter instance
     */ 
	public AbstractBaseCimAdapter getAdapter(Class<?> adapterClass, Object object, Locale locale, boolean createNew)
	{
		try {
			List<AbstractBaseCimAdapter> adapters = (List<AbstractBaseCimAdapter>) adaptersByObject.get(object);
			
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
				Constructor<?> constructor = adapterClass.getConstructor(new Class[]{Locale.class});
				AbstractBaseCimAdapter  result = (AbstractBaseCimAdapter) constructor.newInstance(new Object[]{locale});
				adaptersByObject.get(object).add(result);
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
	 * @param adapterClass the class - adapterClass.getName() is used as part of the key
	 * @param client the client -  toString() is used as part of the key
	 * @return the key
	 */
	private String getKey(Class<?> adapterClass, WBEMClient client) {
		return "adapter." + adapterClass.getName() + ".for.client." + client;
	}

    /**
     * Get the key for the taskname and cimclient for storing the adapter in the cache
     * @param taskname used as part of the string
     * @param client the client -  toString() is used as part of the key
     * @return the key
     */
	private String getKey(String taskname, WBEMClient client) {
		return "adapter.for.task." + taskname + ".for.client." + client;
	}

	/**
	 * remove the adapter
	 * @param adapter adapter to remove
	 * @param client the client of the adapter
	 */
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
	
	/**
	 * remove the adapter from the object-based store
	 * @param adapter adapter to remove
	 * @see #adaptersByObject
	 * @see Cleanup
	 */
	public void removeAdapter(AbstractBaseCimAdapter adapter) {
		
		List<Object> keys = new ArrayList<Object>();
		Set<Object> set = adaptersByObject.keySet();
		for (Iterator<Object> iter = set.iterator(); iter.hasNext();) {
			Object key = (Object) iter.next();
			keys.add(key);
		}
		
		for (Iterator<Object> iter = keys.iterator(); iter.hasNext();) {
			Object key = (Object) iter.next();
			Object removed = adaptersByObject.get(key).remove(adapter);
			if (removed != null)
			{
				logger.info("Adapter " + adapter.getClass().getName() + " was removed from cache ");
			}
				
		}
	}
	
}
