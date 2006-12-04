 /** 
  * SLPDummyLoader.java
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
  * Description: SLP Loader using the file System.getProperty("user.dir") + "/sblim-wbemsmt/dummySLPConfig.xml"
  * to read the slp configuration from. 
  * 
  * The xml-File must be valid against wbemsmt-tools-bl/conf/tasklauncher-config.xsd
  * 
  */
package org.sblim.wbemsmt.tools.slp;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument.Cimom;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument.Treeconfig;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigReferenceDocument.TreeconfigReference;

public class SLPDummyLoader extends SLPLoader {

	private File slpDummyDefinitionFile;

	/**
	 * 
	 */
	public SLPDummyLoader() {
		super();
		slpDummyDefinitionFile = new File(System.getProperty("user.dir") + "/sblim-wbemsmt/dummySLPConfig.xml");
		System.out.println("Reading Dummy Config from " + slpDummyDefinitionFile.getAbsolutePath());
	}

	public void init()
	{
		
	}
	
	public SLPHostDefinition[] findHosts(String serviceName) {
		
		Set result = new HashSet();
		
    	try {
			if (slpDummyDefinitionFile.exists())
			{
				TasklauncherconfigDocument doc = TasklauncherconfigDocument.Factory.parse(slpDummyDefinitionFile);
				Cimom[] cimomArray = doc.getTasklauncherconfig().getCimomArray();
				for (int i = 0; i < cimomArray.length; i++) {
					Cimom cimom = cimomArray[i];
					TreeconfigReference[] treeconfigReferenceArray = cimom.getTreeconfigReferenceArray();
					Treeconfig[] treeconfigArray = doc.getTasklauncherconfig().getTreeconfigArray();
					for (int j = 0; j < treeconfigArray.length; j++) {
						Treeconfig treeconfig = treeconfigArray[j];
						for (int k = 0; k < treeconfigReferenceArray.length; k++) {
							TreeconfigReference treeconfigReference = treeconfigReferenceArray[k];
							if (treeconfig.getName().equals(treeconfigReference.getName())
								&& treeconfig.getSlpServicename().equalsIgnoreCase(serviceName))
							{
								result.add(new SLPHostDefinition(cimom.getHostname(),cimom.getPort(),cimom.getProtocol(),cimom.getNamespace()));
							}
						}
					}
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot load user-config.",e);
		}
		
		
		return (SLPHostDefinition[]) result.toArray(new SLPHostDefinition[result.size()]);
	}

	public boolean getCanFindHosts() {
		return slpDummyDefinitionFile.exists();
	}

	public SLPHostDefinition[] findHosts() {
		
		Set result = new HashSet();
		
    	try {
			if (slpDummyDefinitionFile.exists())
			{
				TasklauncherconfigDocument doc = TasklauncherconfigDocument.Factory.parse(slpDummyDefinitionFile);
				Cimom[] cimomArray = doc.getTasklauncherconfig().getCimomArray();
				for (int i = 0; i < cimomArray.length; i++) {
					Cimom cimom = cimomArray[i];
					result.add(new SLPHostDefinition(cimom.getHostname(),cimom.getPort(),cimom.getProtocol(),cimom.getNamespace()));
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot load user-config.",e);
		}
		
		
		return (SLPHostDefinition[]) result.toArray(new SLPHostDefinition[result.size()]);
	}

}
