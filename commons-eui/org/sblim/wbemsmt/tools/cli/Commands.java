 /** 
  * Commands.java
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
  * Description: Commands base class. The derivation can store the supported commands in this class
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.lang.reflect.Constructor;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.exception.WbemsmtException;
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
	private Map<String, Class<? extends CimCommand>> commands = new HashMap<String, Class<? extends CimCommand>>();
	
	/**
	 * Get a command by it's name
	 * @param name
	 * @return
	 * @throws WbemsmtException
	 */
	public CimCommand getCimCommandByName(String name, Locale locale) throws WbemsmtException {
		try {
			Class<CimCommand> cls = (Class<CimCommand>) commands.get(name);
			if (cls != null)
			{
				Constructor<CimCommand> constructor = cls.getConstructor(new Class[]{Locale.class});
				Object object = constructor.newInstance(new Object[]{locale});
				if (object instanceof CimCommand) {
					CimCommand cimCmd = (CimCommand) object;
					return cimCmd;
				}
				else
				{
					logger.severe("Class " + cls.getName() + " is no " + CimCommand.class.getName());
					throw new WbemsmtException(WbemsmtException.ERR_COMMAND_NOT_FOUND,"Class " + cls.getName() + " is no " + CimCommand.class.getName());
				}
			}
			else
			{
				logger.severe("Cannot find Command with name " + name);
				throw new WbemsmtException(WbemsmtException.ERR_COMMAND_NOT_FOUND,"Cannot find Command with name " + name);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot create CimCommand for Command " + name,e);
			throw new WbemsmtException(WbemsmtException.ERR_COMMAND_NOT_FOUND,"Cannot create CimCommand for Command " + name,e);
		}
	}

	/**
	 * Called by derived class to set the defined commands
	 * @param commandlets
	 */
	protected void addCommand(String command, Class<? extends CimCommand> commandClass) {
		this.commands.put(command,commandClass);
	}

	/**
	 * Returns all defined and loadable Commands as Array
	 * @param locale 
	 * @return
	 */
	public CimCommand[] getCimCommandArray(Locale locale)
	{
		List<CimCommand> result = new ArrayList<CimCommand>();
		
		Set<String> set = commands.keySet();
		for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String name = iter.next();
			try {
				CimCommand cimCmd = getCimCommandByName(name,locale);
				result.add(cimCmd);
			} catch (WbemsmtException e) {
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
		
		Set<String> set = commands.keySet();
		for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String name = iter.next();
			if (sb.length() > 0)
			{
				sb.append(", ");
			}
			sb.append(name);
		}
		
		return sb.toString();
	}
	
}
