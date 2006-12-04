 /** 
  * SblimSLPClientSLPLoader.java
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
  * Description: SLP Loader using the Sblim SLP Client
  */
package org.sblim.wbemsmt.tools.slp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import org.sblim.slp.ServiceLocationAttribute;
import org.sblim.slp.ServiceURL;

public class SblimSLPClientSLPLoader extends SLPLoader {

	private static final String ATTRIBUTE_REGISTERED_PROFILES_SUPPORTED = "RegisteredProfilesSupported";
	private static final String ATTRIBUTE_NAMESPACE = "Namespace";

	private SLPLoadThread loadThread = null;

	public static final Vector ATTRIBUTES = new Vector(Arrays.asList(new String[] { SblimSLPClientSLPLoader.ATTRIBUTE_REGISTERED_PROFILES_SUPPORTED, ATTRIBUTE_NAMESPACE }));

	/**
	 * 
	 */
	public SblimSLPClientSLPLoader() {
		super();
	}

	
	public static void main(String[] args) throws InterruptedException
	{
		String serviceName = args.length > 0 ? args[0] : null;
		
		Thread.sleep(10000);
			
		List addresses = new ArrayList();
		for (int i = 1; args.length > 1 && i < args.length; i++) {
			addresses.add(args[i]);
			System.out.println("DA Address: " + args[i]);
		}
		SblimSLPClientSLPLoader loader = new SblimSLPClientSLPLoader();
		loader.setDirectoryAgentAdresses(addresses);
		loader.setSleepInterval(new Long(1000));
		
		System.out.println("Servicname " + serviceName);
		
		SLPHostDefinition[] definitions;
		if (serviceName == null)
		{
			definitions = loader.findHosts();
		}
		else
		{
			definitions = loader.findHosts(serviceName);
		}
		
		System.out.println("Found " + definitions.length + " Hosts.");
		
		for (int i = 0; i < definitions.length; i++) {
			SLPHostDefinition definition = definitions[i];
			System.out.println(definition.toString() + "\n\n");
		}
		
		loader.loadThread.stopThread();		
	}
	

	public void init() {
		try {
			loadThread = new SLPLoadThread(getSleepInterval().longValue(),getDirectoryAgentAdresses());
			loadThread.start();
		} catch (RuntimeException e) {
			logger.log(Level.SEVERE,"Cannot do SLP lookup",e);
		}
	}







	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.slp.SLPLoader#findServiceAgents(java.lang.String)
	 */
	public SLPHostDefinition[] findHosts(String serviceName) {

		logger.fine("Find service Agents for service " + serviceName);

		//wait till the slp loading has finished
		while (loadThread.loaded == null)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (!loadThread.loaded.booleanValue())
		{
			logger.warning("Cannot load slp config");
			return new SLPHostDefinition[]{};
		}
		
		
		List result = new ArrayList();

		synchronized (loadThread.serviceWrappers) {
			List list = loadThread.serviceWrappers;
			for (Iterator iterWrappers = list.iterator(); iterWrappers.hasNext();) {
				ServiceWrapper wrapper = (ServiceWrapper) iterWrappers.next();
				ServiceURL url = wrapper.serviceUrl;

				ServiceLocationAttribute attributeNamespace = wrapper.namespaceAttribute;
				Vector namespaceValues = attributeNamespace.getValues();
				List namespaces = new ArrayList();
				for (Iterator iter = namespaceValues.iterator(); iter.hasNext();) {
					namespaces.add((String) iter.next());
				}
				
				if (namespaces.size() == 0)
				{
					namespaces.add(SLPLoader.DEFAULT_CIM_NAMESPACE);
					logger.warning("For URL no namespace was found taking " + SLPLoader.DEFAULT_CIM_NAMESPACE + " as default.");
				}

				ServiceLocationAttribute attributeRegisteredProfiles = wrapper.registeredProfileAttribute;
				logger.fine(attributeRegisteredProfiles.toString());
				Vector values = attributeRegisteredProfiles.getValues();
				for (Iterator iteratorValues = values.iterator(); iteratorValues.hasNext();) {
					String value = iteratorValues.next().toString();
					if (value.equalsIgnoreCase(serviceName))
					{
						String protocol = "http";
						if (url.toString().toLowerCase().indexOf(":https:") > -1)
						{
							protocol = "https";
						}
						int port = url.getPort();
						if (port == ServiceURL.NO_PORT)
						{
							port = SLPLoader.DEFAULT_CIM_XML_OVER_HTTP_PORT;
						}
						
						//Add a host definition for every namespace
						for (Iterator iter = namespaces.iterator(); iter.hasNext();) {
							String namespace = (String) iter.next();
							result.add(new SLPHostDefinition(url.getHost(),port,protocol,namespace));	
						}
						
						
					}
					
				}
			}
		}

		return (SLPHostDefinition[]) result.toArray(new SLPHostDefinition[result.size()]);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.slp.SLPLoader#findServiceAgents(java.lang.String)
	 */
	public SLPHostDefinition[] findHosts() {

		logger.fine("Find all service Agents");

		//wait till the slp loading has finished
		while (loadThread.loaded == null)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (!loadThread.loaded.booleanValue())
		{
			logger.warning("Cannot load slp config");
			return new SLPHostDefinition[]{};
		}
		
		
		List result = new ArrayList();

		synchronized (loadThread.serviceWrappers) {
			List list = loadThread.serviceWrappers;
			for (Iterator iterWrappers = list.iterator(); iterWrappers.hasNext();) {
				ServiceWrapper wrapper = (ServiceWrapper) iterWrappers.next();
				ServiceURL url = wrapper.serviceUrl;

				ServiceLocationAttribute attributeNamespace = wrapper.namespaceAttribute;
				Vector namespaceValues = attributeNamespace.getValues();
				List namespaces = new ArrayList();
				for (Iterator iter = namespaceValues.iterator(); iter.hasNext();) {
					namespaces.add((String) iter.next());
				}
				
				if (namespaces.size() == 0)
				{
					namespaces.add(SLPLoader.DEFAULT_CIM_NAMESPACE);
					logger.warning("For URL no namespace was found taking " + SLPLoader.DEFAULT_CIM_NAMESPACE + " as default.");
				}

				String protocol = "http";
				if (url.toString().toLowerCase().indexOf(":https:") > -1)
				{
					protocol = "https";
				}
				int port = url.getPort();
				if (port == ServiceURL.NO_PORT)
				{
					port = SLPLoader.DEFAULT_CIM_XML_OVER_HTTP_PORT;
				}
				
				//Add a host definition for every namespace
				for (Iterator iter = namespaces.iterator(); iter.hasNext();) {
					String namespace = (String) iter.next();
					result.add(new SLPHostDefinition(url.getHost(),port,protocol,namespace));	
				}
			}
		}

		return (SLPHostDefinition[]) result.toArray(new SLPHostDefinition[result.size()]);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.slp.SLPLoader#getCanFindServiceAgents()
	 */
	public boolean getCanFindHosts() {
		while (loadThread.loaded == null)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return loadThread.loaded.booleanValue(); 
	}
	
	public static class SLPLoadThread extends Thread
	{
		Boolean loaded = null;
		SLPClient client;
		List serviceWrappers = new ArrayList();
		private long sleepInterval;
		private boolean run;
		
		SLPLoadThread(long sleepInterval, List directoryAgentAdresses)
		{
			super("SLPLoadThread");
			this.sleepInterval = sleepInterval;
			client = new SLPClient();
			client.setDirectoryAgentAdresses(directoryAgentAdresses);
		}
		
		public void setSleepInterval(long sleepInterval) {
			this.sleepInterval = sleepInterval;
		}

		public void run()
		{
			run = true;
			logger.log(Level.INFO,"Running " + getName());

			while (run)
			{
				
				try {
					List list = client.findWbemServices();
					logger.log(Level.FINEST,"Find Services " + list.size());
					synchronized (serviceWrappers) {
						serviceWrappers.clear();
						for (Iterator iterUrls = list.iterator(); iterUrls.hasNext();) {
							ServiceURL url = (ServiceURL) iterUrls.next();
							ServiceWrapper wrapper = new ServiceWrapper();
							wrapper.serviceUrl = url;
							List attributes = client.findAttributes(url,SLPClient.SCOPE,ATTRIBUTES);
							for (Iterator iteratorAttributes = attributes.iterator(); iteratorAttributes.hasNext();)
							{
								ServiceLocationAttribute attribute = (ServiceLocationAttribute) iteratorAttributes.next();
								logger.fine(attribute.toString());
								if (attribute.getId().equals(ATTRIBUTE_NAMESPACE))
								{
									wrapper.namespaceAttribute = attribute;
								}
								else if (attribute.getId().equals(ATTRIBUTE_REGISTERED_PROFILES_SUPPORTED))
								{
									wrapper.registeredProfileAttribute = attribute;
								}
								else
								{
									logger.fine("Don't know how to handle " + attribute.toString());
								}
							}
							
							if (wrapper.registeredProfileAttribute == null)
							{
								logger.warning("Attribute " + ATTRIBUTE_REGISTERED_PROFILES_SUPPORTED + " not found for serviceUrl " + url + " - Service Url is ignored");
							}
							else if (wrapper.namespaceAttribute == null)
							{
								logger.warning("Attribute " + ATTRIBUTE_NAMESPACE + " not found for serviceUrl " + url + " - Service Url is ignored");
							}
							else
							{
								serviceWrappers.add(wrapper);
							}
							
						}
					}
					loaded = new Boolean(true);
				} catch (Exception e1) {
					logger.log(Level.SEVERE, "Cannot load config via slp",e1);
					loaded = new Boolean(false);
					run = false;
				}
				
				try {
					Thread.sleep(sleepInterval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			logger.info(getName() + " stopped");
		}
		
		public void stopThread() {
			run = false;
		}
		
	}
	
	public static class ServiceWrapper
	{
		ServiceURL serviceUrl;
		ServiceLocationAttribute registeredProfileAttribute;
		ServiceLocationAttribute namespaceAttribute;

		public ServiceWrapper() {
			super();
		}
		
	}

}
