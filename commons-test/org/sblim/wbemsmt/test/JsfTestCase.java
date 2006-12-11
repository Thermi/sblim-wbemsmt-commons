 /** 
  * JsfTestCase.java
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
  * Description: TestCase for JsfTests
  * 
  */
package org.sblim.wbemsmt.test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

import com.thoughtworks.selenium.DefaultSelenium;


public class JsfTestCase extends WbemSmtTestCase {

	public static final String SESSION_MAIN  = "main";
	
	/**
	 * Static because the sessions are stored between different testCases
	 * Key = String, value = 
	 */
	private static Map sessions = new HashMap();
	public JsfTestCase() {
		super();
	}
	public JsfTestCase(String arg0) {
		super(arg0);
	}

    protected void setSession(String key, WbemSmtWebSession selenium) {
		sessions .put(key,selenium);
	}
    
    protected WbemSmtWebSession getSession(String key)
    {
    	WbemSmtWebSession selenium = (WbemSmtWebSession) sessions.get(key);
    	if (selenium == null)
    	{
            selenium = new WbemSmtWebSession(new DefaultSelenium("localhost",4444, "*firefox", config.getWebserverUrl()));
            selenium.start();
            sessions.put(key,selenium);
    	}
    	return selenium;
    }
	
    protected WbemSmtWebSession removeSession(String key)
    {
    	return (WbemSmtWebSession) sessions.remove(key);
    }
    
    protected WbemSmtWebSession clearSession(String key)
    {
    	return (WbemSmtWebSession) sessions.remove(key);
    }

    protected void doLogin(WbemSmtWebSession selenium, String taskName) {
		
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","org.sblim.wbemsmt.webapp.jsf.webapp_messages"}, Locale.ENGLISH);		
		selenium = getSession(JsfTestCase.SESSION_MAIN);
		selenium.open("/wbemsmt-webapp/login.jsf?");
		selenium.click("langform:en");
		WbemSmtAssert.assertTextFound(selenium, bundle.getString("pleaseLogin"));
		selenium.type("connectFields:host", config.getHost());
		selenium.type("connectFields:port", config.getPort());
		selenium.type("connectFields:namespace", config.getNameSpace());
		selenium.type("connectFields:username", config.getUser());
		selenium.type("connectFields:password", config.getPassword());
		selenium.click("connectFields:login");
		WbemSmtAssert.assertTextNotFound(selenium, bundle.getString("error.while.execution"));
		WbemSmtAssert.assertTextFound(selenium, bundle.getString("task.supported", new Object[]{taskName,config.getHost()}));
		//TODO expand the tree
//		selenium.mouseOver("xpath=//div[@id='mainForm_navMenu_menu']/table/tbody/tr//td[2]");
//		selenium.mouseDown("xpath=//div[@id='mainForm_navMenu_menu']/table/tbody/tr//td[2]");
//		selenium.mouseOver("xpath=//div[@id='cmSubMenuID2']/table/tbody//tr[1]");
//		selenium.fireEvent("xpath=//div[@id='cmSubMenuID2']/table/tbody//tr[1]","onmouseup");
//		selenium.fireEvent("xpath=//div[@id='cmSubMenuID2']/table/tbody//tr[1	]","mouseup");
	}

    protected void doLogout(WbemSmtWebSession selenium) {
		
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesDns","org.sblim.wbemsmt.webapp.jsf.webapp_messages"}, Locale.ENGLISH);
		selenium.click("link=logout");
		selenium.click("langform:en");
		WbemSmtAssert.assertTextFound(selenium, bundle.getString("pleaseLogin"));

    }
    
}
