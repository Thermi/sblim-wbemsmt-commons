 /** 
  * SLPUtil.java
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
  * Description: Helper class to handle action on the SlpLoader instances
  * 
  */
package org.sblim.wbemsmt.tools.slp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument.Cimom;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument.Tasklauncherconfig;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument.Treeconfig;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigReferenceDocument.TreeconfigReference;

public class SLPUtil {

	private static Logger logger = Logger.getLogger(SLPUtil.class.getName());
	
	/**
	 * Reads all data with the slp loader for the services defined in the given treeConfig. The treeConfig is added to the returned Document
	 * @param slpLoader
	 * @param tasklauncherconfig
	 * @return
	 */
	
	public static TasklauncherconfigDocument readFromSlp(SLPLoader slpLoader, Treeconfig[] treeconfigArray) {
    	TasklauncherconfigDocument result = TasklauncherconfigDocument.Factory.newInstance();
		Tasklauncherconfig launcherConfigFromSLP = result.addNewTasklauncherconfig();

		SLPHostDefinition[] allHostDefinitions = slpLoader.findHosts();
		for (int i = 0; i < allHostDefinitions.length; i++) {
			SLPHostDefinition definition = allHostDefinitions[i];
			addCimom(launcherConfigFromSLP,definition);
		}

		
		for (int i = 0; i < treeconfigArray.length; i++) {
			Treeconfig treeconfig = treeconfigArray[i];
			SLPHostDefinition[] agents = slpLoader.findHosts(treeconfig.getSlpServicename());
			addHostDefinitions(launcherConfigFromSLP,treeconfigArray, agents,treeconfig);
			//add the treeConfig from the param-given to the form-slp loaded
			launcherConfigFromSLP.addNewTreeconfig().set(treeconfig);
		}
		return result;
	}
	
	private static void addHostDefinitions(Tasklauncherconfig launcherConfig, Treeconfig[] treeconfigArray, SLPHostDefinition[] hostDefinitions, Treeconfig serviceConfig) {

		for (int i = 0; i < hostDefinitions.length; i++) {
			SLPHostDefinition agent = hostDefinitions[i];
			Cimom[] cimomArray = launcherConfig.getCimomArray();
			Cimom foundCimom = null;
			for (int j = 0; j < cimomArray.length && foundCimom == null; j++) {
				Cimom cimom = cimomArray[j];
				if (cimom.getHostname().equals(agent.getHostname()))
				{
					foundCimom = cimom;
				}
			}
			if (foundCimom == null)
			{
				foundCimom = addCimom(launcherConfig, agent);
			}
			
			TreeconfigReference[] treeconfigReferenceArray = foundCimom.getTreeconfigReferenceArray();
			TreeconfigReference treeconfigReference = null;
			boolean found = false;
			for (int j = 0; j < treeconfigArray.length && !found; j++) {
				Treeconfig treeconfig = treeconfigArray[j];
				for (int k = 0; k < treeconfigReferenceArray.length && !found; k++) {
					treeconfigReference = treeconfigReferenceArray[k];
					if (treeconfig.getName().equals(treeconfigReference.getName())
							&& treeconfig.getSlpServicename().equals(serviceConfig.getSlpServicename()))
						{
							found = true;
						}
				}
			}
			
			if (!found)
			{
				treeconfigReference = foundCimom.addNewTreeconfigReference();
				treeconfigReference.setName(serviceConfig.getName());
			}
			treeconfigReference.setNamespace(agent.getNamespace());
		}
		
	}

	/**
	 * Add the Cimom by the information of the SLPHostDefinition
	 * @param launcherConfig
	 * @param hostDefinition
	 * @return
	 */
	private static Cimom addCimom(Tasklauncherconfig launcherConfig, SLPHostDefinition hostDefinition) {
		Cimom foundCimom;
		foundCimom = launcherConfig.addNewCimom();
		foundCimom.setHostname(hostDefinition.getHostname());
		foundCimom.setPort(hostDefinition.getPort());
		foundCimom.setProtocol(hostDefinition.getProtocol());
		foundCimom.setUser("pegasus");
		return foundCimom;
	}

	/**
	 * checks if the task is supported ont the host
	 * @param slpLoader
	 * @param host
	 * @param slpServicename
	 * @return
	 */
	public static boolean getTaskIsSupported(SLPLoader slpLoader, String host, String slpServicename) {
		
		return getHostForSupportedTask(slpLoader, host, slpServicename) != null ;
	}

	/**
	 * Return the SLPHostDefinition if the Task is Supported
	 * @param slpLoader
	 * @param host
	 * @param slpServicename
	 * @see #getTaskIsSupported(SLPLoader, String, String)
	 * @return
	 */
	
	public static SLPHostDefinition getHostForSupportedTask(SLPLoader slpLoader, String host, String slpServicename) {
		
		boolean result = false;
		String lookup = "";
		
		try {
			lookup = host;
			InetAddress address1 = InetAddress.getByName(lookup);
			
			if (slpLoader.getCanFindHosts())
			{
				SLPHostDefinition[] definitions = slpLoader.findHosts(slpServicename);
				for (int i = 0; i < definitions.length && !result; i++) {
					SLPHostDefinition definition = definitions[i];
					lookup = definition.getHostname();
					InetAddress address2=null;
					try
					{
						address2 = InetAddress.getByName(lookup);
					} catch (UnknownHostException e) {
						logger.log(Level.WARNING,"Cannot find Host " + e.getMessage());
						
					}
					if (address2 != null && address1.getHostAddress().equals(address2.getHostAddress()))
					{
						return definition;
					}
				}
			}
		} catch (UnknownHostException e) {
			logger.log(Level.WARNING,"Cannot find Host " + e.getMessage());
		}
		
		return null ;
	}	
	
	/**
	 * Return the TreeConfig of the supported Tasks
	 * @param slpLoader
	 * @param host
	 * @param slpServicename
	 * @see #getTaskIsSupported(SLPLoader, String, String)
	 * @return
	 */
	
	public static Treeconfig[] getSupportedTasksForHost(SLPLoader slpLoader, String host, Treeconfig[] configs) {
		
		List result = new ArrayList();
		for (int i = 0; i < configs.length; i++) {
			Treeconfig treeconfig = configs[i];
			String slpServicename = treeconfig.getSlpServicename();
			if (getTaskIsSupported(slpLoader, host, slpServicename))
			{
				SLPHostDefinition hostForSupportedTask = getHostForSupportedTask(slpLoader, host, slpServicename);
				Treeconfig copy = Treeconfig.Factory.newInstance();
				copy.set(treeconfig.copy());
				copy.setNamespace(hostForSupportedTask.getNamespace());
				result.add(copy);
			}
		}
		Treeconfig[] newConfigs = (Treeconfig[]) result.toArray(new Treeconfig[result.size()]);
		return newConfigs;
	}

	/**
	 * Give back the list with all Hosts found via SLP
	 * @param slpLoader
	 * @return
	 */
	public static SLPHostDefinition[] getHosts(SLPLoader slpLoader) {
		SLPHostDefinition[] allHostDefinitions = slpLoader.findHosts();
		return allHostDefinitions;
	}		
}
