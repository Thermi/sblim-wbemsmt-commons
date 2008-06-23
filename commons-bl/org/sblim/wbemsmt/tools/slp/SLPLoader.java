 /** 
  * SLPLoader.java
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
  * Description: Base class for all SLPLoader implemenations
  * 
  * 
  * 
  */
package org.sblim.wbemsmt.tools.slp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class SLPLoader {

	public static final int DEFAULT_CIM_XML_OVER_HTTP_PORT = 5988;
	public static final String DEFAULT_CIM_NAMESPACE = "/root/cimv2";
	
	protected static Logger logger = Logger.getLogger(SLPLoader.class.getName());
	
	/**
	 * Find for a serviceName the Hosts that are registered for that service<br>
	 * The registeredProfile is the value of the attribuite RegisteredProfilesSupported return by SLP:<br>
	 * <br>
	 * <br>
	 * RegisteredProfilesSupported defines the Profiles that<br> 
	 * a WBEM Server has support for. Each entry in this<br>
	 * attribute MUST be in the form of <br>
	 * <br>
	 * Organization:Profile Name{:Subprofile Name}<br> 
	 * <br>
	 * The Organization MUST be the CIM_RegisteredProfile.RegisteredOrganization property value.<br>
	 * The Profile Name MUST be the CIM_RegisteredProfile.RegisteredName property value. <br>
	 * The subprofile Name MUST be the CIM_RegisteredProfile.RegisteredName property value when it is used as a Dependent in the CIM_SubProfileRequiresProfile association for the specified Profile Name (used as the antecedent).<br>
	 * <br>
	 * @param registeredProfile
	 * @return
	 */
	public abstract SLPHostDefinition[] findHosts(String registeredProfile);

	/**
	 * Find all registered Hosts. Independent of the provided services
	 * @return
	 */
	public abstract SLPHostDefinition[] findHosts();

	/**
	 * check if retrieving the host list is possible
	 * @return true if retrieving the host list is possible
	 */
	public abstract boolean getCanFindHosts();

	public abstract void init();

	private Long sleepInterval = null;
	
	/**
	 * A List of Strings for InetAddress.getByName that specify the directory agents to look for.
	 */
	private List directoryAgentAdresses = new ArrayList();

	public Long getSleepInterval() {
		return sleepInterval;
	}

	public void setSleepInterval(Long sleepInterval) {
		this.sleepInterval = sleepInterval;
		if (directoryAgentAdresses != null)
		{
			init();
		}
	}

	public List getDirectoryAgentAdresses() {
		return directoryAgentAdresses;
	}

	public void setDirectoryAgentAdresses(List directoryAgentAdresses) {
		this.directoryAgentAdresses = directoryAgentAdresses;
		if (sleepInterval != null)
		{
			init();
		}
	}

	
	
}
