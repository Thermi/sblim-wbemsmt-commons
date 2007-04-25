 /** 
  * Commands.java
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
  * Description: Commands base class. The derivation can store the supported commands in this class
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.exception.CommandNotFoundException;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class Commands {

	protected Logger logger = Logger.getLogger(Commands.class.getName());
	protected WbemSmtResourceBundle applicationBundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"});
	/**
	 * The map where the commands are stored
	 * 
	 * Key is the commandName
	 * Value is the command class
	 */
	private Map commands = new HashMap();
	
	/**
	 * Get a command by it's name
	 * @param name
	 * @return
	 * @throws CommandNotFoundException
	 */
	public CimCommand getCimCommandByName(String name, Locale locale) throws CommandNotFoundException {
		try {
			Class cls = (Class) commands.get(name);
			if (cls != null)
			{
				Constructor constructor = cls.getConstructor(new Class[]{Locale.class});
				Object object = constructor.newInstance(new Object[]{locale});
				if (object instanceof CimCommand) {
					CimCommand cimCmd = (CimCommand) object;
					return cimCmd;
				}
				else
				{
					logger.severe("Class " + cls.getName() + " is no " + CimCommand.class.getName());
					throw new CommandNotFoundException("Class " + cls.getName() + " is no " + CimCommand.class.getName());
				}
			}
			else
			{
				logger.severe("Cannot find Command with name " + name + " defined in Class " + cls.getName());
				throw new CommandNotFoundException("Cannot find Command with name " + name + " defined in Class " + cls.getName());
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot create CimCommand for Command " + name,e);
			throw new CommandNotFoundException("Cannot create CimCommand for Command " + name,e);
		}
	}

	/**
	 * Called by derived class to set the defined commands
	 * @param commandlets
	 */
	protected void addCommand(String command, Class commandClass) {
		this.commands.put(command,commandClass);
	}

	/**
	 * Returns all defined and loadable Commands as Array
	 * @param locale 
	 * @return
	 */
	public CimCommand[] getCimCommandArray(Locale locale)
	{
		List result = new ArrayList();
		
		Set set = commands.keySet();
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			try {
				CimCommand cimCmd = getCimCommandByName(name,locale);
				result.add(cimCmd);
			} catch (CommandNotFoundException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		Collections.sort(result,new CimCommandComparator());
		
		return (CimCommand[]) result.toArray(new CimCommand[result.size()]);
	}
	
	/**
	 * Return the names of all CimCommands as String
	 * @return
	 */
	public String getCommandNames() {
		StringBuffer sb = new StringBuffer();
		
		Set set = commands.keySet();
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			if (sb.length() > 0)
			{
				sb.append(", ");
			}
			sb.append(name);
		}
		
		return sb.toString();
	}
	
}
