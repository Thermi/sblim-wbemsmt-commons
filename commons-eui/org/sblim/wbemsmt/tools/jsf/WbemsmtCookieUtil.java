 /** 
  * WbemsmtCookieUtil.java
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
  * Description: Utility methods for handling WBEMSMT-COOKIES
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.util.WbemsmtStringEncrypter;

public class WbemsmtCookieUtil {

	public static final String COOKIE_PREFIX_UPDATE_INTERVAL = "updateInterval-";
	public static final String COOKIE_PREFIX_PASSWORD = "cim-";
	private static final String LOGIN_DATA = "cim-login-data";
	
	private static final Logger logger = Logger.getLogger(WbemsmtCookieUtil.class.getName());
	private static WbemsmtStringEncrypter encrypter;

	static
	{
		String encryptionKey = "43793rduskafhkdsf932468624kdb3dsdasfsadfsa";

        try {
			encrypter = new WbemsmtStringEncrypter( encryptionKey );
		} catch (WbemsmtException e) {
			logger.log(Level.SEVERE, "Cannot create encrypter", e);
		}
		
	}
	
	/**
	 * 
	 * The Max age for the Cookies saving the updateInterval 
	 * 65 years as default should be enough for every user :-)
	 */
	public static int DEFAULT_MAX_AGE = 60*60*24*30*12*65;

	public static Iterator getCookiesWithPrefix(String prefix) {

		Map map = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
		Set set = map.entrySet();
		
		List result = new ArrayList();
		
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			Cookie cookie = (Cookie) entry.getValue();
			
			if (key.startsWith(prefix))
			{
				result.add(cookie);
			}
		}
		return result.iterator();
	}
	
	public static Cookie getCookie(String name) {

		Map map = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
		Set set = map.entrySet();
		
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			Cookie cookie = (Cookie) entry.getValue();
			
			if (key.startsWith(name))
			{
				return cookie;
			}
		}
		return null;
	}

	
	public static void addCookie(String name, String value) {
		addCookie(name,value,DEFAULT_MAX_AGE);
	}	

	/**
	 * add a password cookie
	 * Stores the password in a encrypted string
	 * @param host
	 * @param user
	 * @param password
	 */
	public static void addMultiLogonCookie(String host, String user, MultiHostLoginData loginData) {
		try {
			if (encrypter != null)
			{
				String value = loginData.toXml();
				String encrypt = encrypt(decrypt(encrypt(value)));
				Cookie cookie = new Cookie(getKey(user, host),encrypt);
				cookie.setMaxAge(DEFAULT_MAX_AGE);
				((HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse()).addCookie(cookie);

			}
		} catch (WbemsmtException e) {
			logger.log(Level.SEVERE, "Cannot encrypt password - Cookie was not added", e);
		}
	}
	
	/**
	 * delete the cookie for the password
	 * @param host
	 * @param user
	 * @param password
	 */
	public static void removeMutliLogonCookie(String host, String user) {
		String key = getKey(user, host);
		deleteCookie(key);
	}

	/**
	 * Delete the cookie with the login Data
	 *
	 */
	public static void removeLoginDataCookie() {
		String key = LOGIN_DATA;
		deleteCookie(key);
	}

	/**
	 * deletes a cookie with the given name if the cookie was found
	 * @param name
	 */
	private static void deleteCookie(String name) {
		Cookie cookie = getCookie(name);
		if (cookie != null)
		{
			//0 = delete;
			cookie.setMaxAge(0);
			((HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse()).addCookie(cookie);
		}
	}	


	/**
	 * add a Cookie
	 * @param name
	 * @param value
	 * @param interval
	 */
	public static void addCookie(String name, String value, int interval) {
		Cookie cookie = new Cookie(name,value);
		cookie.setMaxAge(interval);
		//we want the cookie even if the user uses only http and not SSL
		cookie.setSecure(false);
		((HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse()).addCookie(cookie);
	} 
	
	/**
	 * get the decrypted password from the cookie
	 * @param user
	 * @param host
	 * @return
	 */
	public static MultiHostLoginData getMultiHostLoginDataFromCookie(String user, String host)
	{
		String key = getKey(user, host);
		
		Cookie cookie = getCookie(key);
		if (encrypter != null && cookie != null)
		{
			try {
				String value = cookie.getValue();
				//replace the "cookie's line break" - two spaces - by a regulare line break
				value = value.replaceAll("  ", "\r\n");
				return MultiHostLoginData.create(decrypt(value));
			} catch (WbemsmtException e) {
				logger.log(Level.SEVERE, "Cannot decrypt LoginData", e);
			}
		}
		return null;

	}

	/**
	 * get the decrypted LoginData from the cookie
	 * @param user
	 * @param host
	 * @return
	 */
	public static LoginData getLoginDataFromCookie()
	{
		Cookie cookie = getCookie(LOGIN_DATA);
		if (encrypter != null && cookie != null)
		{
			try {
				String value = cookie.getValue();
				value = value.replaceAll("  ", "\r\n");
				return LoginData.create(decrypt(value));
			} catch (WbemsmtException e) {
				logger.log(Level.SEVERE, "Cannot decrypt LoginData", e);
			}
		}
		return null;
	}	

	
	/**
	 * Set the loginData to a cookie
	 * @param loginData
	 */
	public static void addLoginDataCookie(LoginData loginData)
	{
		if (encrypter != null)
		{
			try {
				String value = loginData.toXml();
				String encrypt = encrypt(value);
				Cookie cookie = new Cookie(LOGIN_DATA,encrypt);
				cookie.setMaxAge(DEFAULT_MAX_AGE);
				((HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse()).addCookie(cookie);
			} 
			catch (WbemsmtException e) {
				logger.log(Level.SEVERE, "Cannot encrypt LoginData", e);
			}
		}		
	}
	
	private static String encrypt(String value) throws WbemsmtException {
        return value != null ? encrypter.encrypt( value ) : null;
	}

	private static String decrypt(String value) throws WbemsmtException {
		return value != null ? encrypter.decrypt( value ) : null;
	}
	
	private static String getKey(String user, String host) {
		return COOKIE_PREFIX_PASSWORD + user + "@" + host;
	}
	
	public static class LoginData implements Serializable
	{

		private static final long serialVersionUID = 7062726088746396360L;

		private String user;
		private String password;
		private String host;
		private String port;
		private String protocol;
		private boolean useSlp;

		public LoginData() {
			super();
		}

		public LoginData(String user, String password, String host, String port, String protocol, boolean useSlp) {
			this.user = user;
			this.password = password;
			this.host = host;
			this.port = port;
			this.protocol = protocol;
			this.useSlp = useSlp;
		}
		
		public static LoginData create(String xml)
		{
		       XMLDecoder e = new XMLDecoder(new ByteArrayInputStream(xml.getBytes()));
		       LoginData loginData = (LoginData) e.readObject();
		       return loginData;
		}
		
		public String toXml()
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(out);
			encoder.writeObject(this);
			encoder.flush();
			encoder.close();
			return new String(out.toByteArray());
		}

		public String getHost() {
			return host;
		}

		public String getPassword() {
			return password;
		}

		public String getPort() {
			return port;
		}

		public String getProtocol() {
			return protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getUser() {
			return user;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public boolean isUseSlp() {
			return useSlp;
		}

		public void setUseSlp(boolean useSlp) {
			this.useSlp = useSlp;
		}
	}

	public static class MultiHostLoginData implements Serializable
	{

		private static final long serialVersionUID = 7062726088746396360L;

		private boolean useSlp;
		private String password;
		private boolean useEmptyPassword;

		public MultiHostLoginData() {
			super();
		}

		public MultiHostLoginData(boolean useEmptyPassword, boolean useSlp, String password) {
			this.useEmptyPassword = useEmptyPassword;
			this.useSlp = useSlp;
			this.password = password;
		}
		
		public static MultiHostLoginData create(String xml)
		{
		       XMLDecoder e = new XMLDecoder(new ByteArrayInputStream(xml.getBytes()));
		       MultiHostLoginData loginData = (MultiHostLoginData) e.readObject();
		       return loginData;
		}
		
		public String toXml()
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(out);
			encoder.writeObject(this);
			encoder.flush();
			encoder.close();
			return new String(out.toByteArray());
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isUseSlp() {
			return useSlp;
		}

		public void setUseSlp(boolean useSlp) {
			this.useSlp = useSlp;
		}

		public boolean isUseEmptyPassword() {
			return useEmptyPassword;
		}

		public void setUseEmptyPassword(boolean useEmptyPassword) {
			this.useEmptyPassword = useEmptyPassword;
		}
		
		
	}

}
