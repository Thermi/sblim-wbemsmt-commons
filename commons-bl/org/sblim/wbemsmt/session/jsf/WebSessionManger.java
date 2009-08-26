 /** 
  * WebSessionManger.java
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
  * Description: TODO Add class description
  * 
  */
package org.sblim.wbemsmt.session.jsf;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.sblim.wbemsmt.session.HttpSessionWrapper;
import org.sblim.wbemsmt.session.WebSession;

public class WebSessionManger {

	protected static final Logger logger = Logger.getLogger(WebSessionManger.class.getName());
	
	public static WebSession getCurrentWebSession() {
		Object session = FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		if (session instanceof HttpSession)
		{
			return new HttpSessionWrapper((HttpSession) session);
		}
		else 
		{
			try {
				Class<?> portletSessionClass = Class.forName("javax.portlet.PortletSession");
				if (portletSessionClass.isAssignableFrom(session.getClass()))
				{
						Class<?> wrapper = Class.forName("org.sblim.wbemsmt.session.PortletSessionWrapper");
						Constructor<?> constructor = wrapper.getConstructor(new Class[]{portletSessionClass});
						WebSession wrappedPortletSession = (WebSession) constructor.newInstance(new Object[]{session});
						return wrappedPortletSession;
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot create PortletSessionWrapper with session object " + session,e);
			}
		}
		return null;
	}

}
