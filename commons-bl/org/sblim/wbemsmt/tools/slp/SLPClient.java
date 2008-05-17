/**
 * SLPClient.java
 *
 * © Copyright IBM Corp. 2005, 2006
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: Roberto Pineiro, IBM, roberto.pineiro@us.ibm.com  
 * @author: Chung-hao Tan, IBM ,chungtan@us.ibm.com
 * 
 * Change History
 * Flag       Date        Prog         Description
 *------------------------------------------------------------------------------- 
 * 1516246    2006-07-22  lupusalex    Integrate SLP client code
 */

package org.sblim.wbemsmt.tools.slp;

import java.net.InetAddress;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.slp.*;

/**
 * Sample simplified SLP client that provides methods to find wbem services and
 * others.
 */
public class SLPClient {

	protected static Logger logger = Logger.getLogger(SLPClient.class.getName());
	
	public static final String DEFAULT_SCOPE = "default";

	public static final Vector SCOPE = new Vector(Arrays.asList(new String[] { DEFAULT_SCOPE }));

	public static final String SERVICE_WBEM = "service:wbem";

	public static final String SERVICE_WBEM_HTTP = "service:wbem:http";

	public static final String SERVICE_WBEM_HTTPS = "service:wbem:https";

	private Vector directoryAgentAdresses;

	/**
	 * Ctor.
	 */
	public SLPClient() {
		directoryAgentAdresses = new Vector();
	}

	/**
	 * Finds all WBEM services
	 * 
	 * @return List of WBEM services
	 */
	public List findWbemServices() {
		return findService(SERVICE_WBEM);
	}

	/**
	 * Finds all services of a given type
	 * 
	 * @param pServiceType
	 *            The service type
	 * @return List of services
	 */
	public List findService(String pServiceType) {
		return findService(pServiceType, SCOPE);
	}

	/**
	 * Finds all services of a given type
	 * 
	 * @param pServiceType
	 *            The service type
	 * @param pScopeList
	 *            The scope
	 * @return List of services (ServiceURL objects)
	 */
	public List findService(String pServiceType, Vector pScopeList) {

		List result = new ArrayList();
		final Locator locator;

		try {
			locator = ServiceLocationManager.getLocator(Locale.US);
			ServiceType servicetype = new ServiceType(pServiceType);
			Enumeration enumeration;
			if (directoryAgentAdresses != null && directoryAgentAdresses.size() > 0)
			{
				enumeration = locator.findServices(servicetype, pScopeList, "",directoryAgentAdresses);
			}
			else
			{
				enumeration = locator.findServices(servicetype, pScopeList, "");
			}

			while (enumeration.hasMoreElements()) {
				ServiceURL serviceURL = (ServiceURL) enumeration.nextElement();
				result.add(serviceURL);
			}
		} catch (ServiceLocationException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Find the specified attributes of a given service url
	 * 
	 * @param pUrl
	 *            The service url
	 * @param pScopes
	 *            The scope
	 * @param pAttributeIds
	 *            List of attribute to look for, <code>null</code> represents
	 *            all attributes
	 * @return List of attributes (ServiceLocationAttribute-Objects)
	 */
	public List findAttributes(String pUrl, Vector pScopes, Vector pAttributeIds) {

		List result = new ArrayList();
		final Locator locator;

		try {
			locator = ServiceLocationManager.getLocator(Locale.US);

			ServiceURL servicetype = new ServiceURL(pUrl, -1);
			Enumeration enumeration;
			if (directoryAgentAdresses != null && directoryAgentAdresses.size() > 0)
			{
				enumeration = locator.findAttributes(servicetype, pScopes, pAttributeIds,directoryAgentAdresses);
			}
			else
			{
				enumeration = locator.findAttributes(servicetype, pScopes, pAttributeIds);
			}

			while (enumeration.hasMoreElements()) {
				ServiceLocationAttribute att = (ServiceLocationAttribute) enumeration.nextElement();
				result.add(att);
			}
		} catch (ServiceLocationException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Unescapes a attribute string
	 * 
	 * @param pString
	 *            The escaped string
	 * @return The unescaped string
	 */
	public static String unescape(String pString) {
		StringBuffer buf = new StringBuffer("");
		int i = pString.indexOf('\\');
		int prev = 0;
		int len = pString.length();
		while (i > -1) {
			buf.append(pString.substring(prev, i));
			if (i + 3 < len) {
				try {
					char ch = (char) (Integer.parseInt(pString.substring(i + 1, i + 3), 16) & 0xFF);
					buf.append(ch);
				} catch (Exception e) {
					buf.append(pString.substring(i, i + 3));
				}
				prev = i + 3;
			}
			i = pString.indexOf('\\', prev);
		}
		buf.append(pString.substring(prev));
		return buf.toString();
	}

	/**
	 * Test method.
	 * 
	 * @param args
	 *            Ignored
	 */
	public static void main(String[] args) {

		SLPClient client = new SLPClient();
		List wbemservices = client.findWbemServices();
		
		System.out.println("findWbemServices " + wbemservices.size());

		Iterator serviceIterator = wbemservices.iterator();
		while (serviceIterator.hasNext()) {
			String url = serviceIterator.next().toString();
			System.out.println(url);
			List attributes = client.findAttributes(url, SCOPE, new Vector());
			System.out.println("\nAttributes:\n");

			Iterator attributeIterator = attributes.iterator();
			while (attributeIterator.hasNext()) {
				System.out.println(attributeIterator.next());
			}
		}

	}

	/**
	 * Returns a List with ServiceLocationAttribute-Objects
	 * @param url
	 * @param scope2
	 * @param attributes
	 * @return
	 */
	public List findAttributes(ServiceURL url, Vector scope2, Vector attributes) {
		return findAttributes(url.toString(),scope2,attributes);
		
	}

	public List getDirectoryAgentAdresses() {
		return directoryAgentAdresses;
	}

	/**
	 * Converts the elements of the List to InetAddress-Objects. If there are elements that are not from type InetAddress.
	 * @param directoryAgentAdresses (Element should be of type InetAddress or of type String so that InetAddress.getByName(String) can be invoked.
	 * All other types are ignored 
	 */
	public void setDirectoryAgentAdresses(List directoryAgentAdresses) {
		this.directoryAgentAdresses = new Vector();

		for (Iterator iter = directoryAgentAdresses.iterator(); iter.hasNext();) {
			Object element = (Object) iter.next();
			logger.log(Level.INFO,"Adding as DirectoryAgent: " + element.toString());
			if (element instanceof InetAddress) {
				this.directoryAgentAdresses.add(element);
			}
			else if (element instanceof String) {
				try {
					this.directoryAgentAdresses.add(InetAddress.getByName(element.toString()));
				} catch (Exception e) {
					logger.log(Level.SEVERE,"Cannot resolve host " + element.toString(),e);
				}
			}
			else {
				logger.log(Level.SEVERE,"Cannot create InetAdress with object from type " + element.getClass().getName());
			}
		}
		
		
	}
	
	
}
