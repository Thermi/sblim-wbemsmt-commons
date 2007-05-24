 /** 
  * WbemsmtSession.java
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
  * Description: Wbemsmt Session object
  * 
  */
package org.sblim.wbemsmt.session.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * @author Bauschert
 *
 */
public class WbemsmtSession {
	
	private static WbemsmtSession session;
	private Map sessionData = new HashMap();
	
	public void removeAttribute(String key)
	{
		sessionData.remove(key);
	}

	public void setAttribute(String key, Object value)
	{
		sessionData.put(key,value);
	}

	public Object getAttribute(String key)
	{
		return sessionData.get(key);
	}
	
	public void clear()
	{
		sessionData.clear();
	}
	
	/**
	 * Returns a iterator of Map.Entry Objects
	 * @return
	 */
	public Iterator getEntries()
	{
		return sessionData.entrySet().iterator();
	}
	
	/**
	 * Gets the Session
	 * if the application is run in jsf mode the managed bean WbemsmtSessionBean is return.
	 * Otherwise the static instance of WbemsmtSession is returned (can bee seen as a Singleton) 
	 * @return
	 */
	public static WbemsmtSession getSession()
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return (WbemsmtSession) BeanNameConstants.SESSION.getBoundValue(FacesContext.getCurrentInstance());
		}
		else if (RuntimeUtil.getInstance().isCommandline() || RuntimeUtil.getInstance().isSwing())
		{
			if (session == null)
			{
				session = new WbemsmtSession();
			}
			return session;
		}
		else
		{
			throw new IllegalStateException("Runtime mode " + RuntimeUtil.getInstance().getRuntime() + " is not supported");
		}
	}

	/**
	 * remove all the attribute with the key starting with the given prefix
	 * @param prefix
	 */
	public void removeAttributesWithPrefix(String prefix) {
		List toBeRemoved = new ArrayList();
		
		for (Iterator iter = sessionData.keySet().iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			if (key.startsWith(prefix))
			{
				toBeRemoved.add(key);
			}
		}

		for (Iterator iter = toBeRemoved.iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			removeAttribute(key);
		}
	}
	
}
