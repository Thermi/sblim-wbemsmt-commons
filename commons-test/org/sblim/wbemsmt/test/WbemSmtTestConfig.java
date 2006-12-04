/** 
 * WbemSmtTestConfig.java
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
 * Description: TestConfig-Object. Singleton
 * 
 */

package org.sblim.wbemsmt.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.test.ssh.Scp;
import org.sblim.wbemsmt.test.ssh.Shell;

public class WbemSmtTestConfig {

	private static WbemSmtTestConfig instance = null;
	private Properties properties = new Properties();
	
	private static Logger logger = Logger.getLogger("org.sblim.wbemsmt.test");
	
	private WbemSmtTestConfig() {
		
		String filename = System.getProperty("test.config");
		if (filename != null)
		{
			logger.info("Loading test.config from " + filename);
		}
		else
		{
			filename = "testconfig.properties";			
			logger.info("Loading test.config from default file " + filename);
		}
		try {
			properties.load(new FileInputStream(new File(filename)));
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot load test.config from " + filename, e);
		}
		
	}
	
	public static synchronized WbemSmtTestConfig getInstance() {
		if (instance == null)
		{
			instance = new WbemSmtTestConfig();
		}
		return instance;
	}
	
	public String getNameSpace()
	{
		return properties.getProperty(getActiveHostPrefix() + "namespace");
	}

	public String getUrl()
	{
		return properties.getProperty(getActiveHostPrefix() + "protocol") + "://" + properties.getProperty(getActiveHostPrefix() + "host") + ":" + properties.getProperty(getActiveHostPrefix() + "port");
	}

	public String getHost()
	{
		return properties.getProperty(getActiveHostPrefix() + "host");
	}

	public String getPort()
	{
		return properties.getProperty(getActiveHostPrefix() + "port");
	}

	public String getUser() {
		return properties.getProperty(getActiveHostPrefix() + "user","");
	}

	public String getPassword() {
		return properties.getProperty(getActiveHostPrefix() + "password","");
	}

	public Scp getSCP(String prefix) {
		String host = properties.getProperty(prefix + ".host",null);
		String user = properties.getProperty(prefix + ".user",null);
		String password = properties.getProperty(prefix + ".password",null);
		String port = properties.getProperty(prefix + ".port","22");
		String local = properties.getProperty(prefix + ".localFile",null);
		String remote = properties.getProperty(prefix + ".remoteFile",null);
		return new Scp(local, user, password, host, port, remote);
	}

	public Shell getShell(String prefix) {
		String host = properties.getProperty(prefix + ".host",null);
		String user = properties.getProperty(prefix + ".user",null);
		String password = properties.getProperty(prefix + ".password",null);
		String port = properties.getProperty(prefix + ".port","22");
		return new Shell(user, password, host, port);
	}

	public String getValue(String key) {
		return properties.getProperty(key,"");
	}

	public String getActiveHost() {
		
		return properties.getProperty("activeHost");
	}
	public String getActiveHostPrefix() {
		
		return properties.getProperty("activeHost") + ".";
	}

	public String getWebserverUrl() {
		return properties.getProperty(getActiveHostPrefix() + "webserverurl","http://127.0.0.1:8080/wbemsmt-webapp/login.jsf");
	}

}
