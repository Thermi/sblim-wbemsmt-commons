 /** 
  * CimCommandlet.java
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
  * Description: Class needs one vmargument 
  * - -Dcommands the class containing the CommandletName-CommandletMapping (Instance of Commands with default constructor)
  * 
  * Call the Class with argument --usage or with --helpAll to get more information about correct syntax
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.sblim.wbemsmt.bl.messages.MessageUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class Cli {

	/**
	 * set to true if run from junit
	 */
	public static boolean testMode;
	public static boolean commandExecuted;

	public Cli(String[] args) throws Exception {
		
		RuntimeUtil.getInstance().setPlType(RuntimeUtil.PL_TYPE_CMD);
		
		String commandsClass = System.getProperty("commands");
		if (commandsClass == null)
		{
			System.err.println("Command-Class not defined with vm argument commands");
			printUsage();
			return;
		}
		Commands commands = (Commands) Class.forName(commandsClass).newInstance();

		if (args.length == 0)
		{
			printUsage();
			return;
		}

		Locale locale = getLocale(args);
		Locale.setDefault(locale);
		
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if (arg.equalsIgnoreCase("--helpAll"))
			{
				System.out.println("Commandsclass: " + commandsClass);
				System.out.println("\nSupplied Commands (specified as first argument when Calling Cli):\n");
				
				traceCommands(commands.getCimCommandArray(locale));
				return;
			}
			if (arg.equalsIgnoreCase("--usage"))
			{
				printUsage();
				return;
			}
		}

		try {
			
			String command = args[0];
			CimCommand commandlet = commands.getCimCommandByName(command,locale);
			
			List argList = Arrays.asList(args);
			argList = new ArrayList(argList.subList(1,argList.size()));
			args = (String[]) argList.toArray(new String[argList.size()]);
			commandlet.beforeExecute();
			CimCommandValues values = commandlet.prepare(args);
			if (values.isExecute())
			{
			    MessageUtil.setCliChannels(values.getOut(), values.getErr(), values.getIn());
				commandlet.execute(values);
			}
			commandlet.afterExecute();
		} catch (WbemsmtException e) {
		    if (e.getErrorCode() == WbemsmtException.ERR_COMMAND_NOT_FOUND)
		    {
	            System.err.println(e.getMessage());
	            printUsage();
		    }
		    else
		    {
		        throw e;
		    }
		}
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws Exception
	{
		new Cli(args);
	}

	private static void printUsage() {
		
		if (testMode)
		{
			commandExecuted = false;
		}

		System.out.println("Usage:");
		System.out.println("java <VMARGS> " + Cli.class.getName() + " <OPTIONS>");
		System.out.println("");
		System.out.println("VMARGS:");
		System.out.println("-Dcommands=<CommandsClassName> to specifiy the class containing the commands");
		System.out.println("");
		System.out.println("OPTIONS: --usage|--helpAll|<commandName> --help|<commandName> <commandOptions>");
		System.out.println("--usage           print this message");
		System.out.println("--helpAll         shows the usage of all registered commands");
		System.out.println("--help            shows the usage of the command given by VMOption commands");
		System.out.println("-locale <Locale> set the Locale (e.g. en_US or de_DE)");
		System.out.println("commandName       a Name registered within the given Commands-Class");  
		System.out.println("commandOptions    can be queried by supplying the command and using option --help");
		System.out.println("");
		System.out.println("For --usage no VMARGS are required");
		
	}

	private static void traceCommands(CimCommand[] commandlets) {
		
		if (testMode)
		{
			commandExecuted = false;
		}
		
		for (int i = 0; i < commandlets.length; i++) {
			CimCommand commandlet = commandlets[i];
			System.out.println();
			System.out.println(commandlet.getCommandName());
			try {
				commandlet.beforeExecute();
				CimCommandValues values = commandlet.prepare(new String[]{"-h"});
				commandlet.execute(values);
			} catch (WbemsmtException e) {
				System.err.println("Cannot get help for command " + commandlet.getCommandName());
				e.printStackTrace();
			} finally
			{
			   commandlet.afterExecute();
			}
		}
		
	}

	/**
	 * Creates the Commandlet
	 * @param commandName
	 * @return the Bundle
	 * @throws Exception 
	 */
	protected Locale getLocale(String[] args) throws Exception
	{
		Locale locale = null;
		
		String localeString = null;
		
		String[] options = new String[]{"--locale","-L"};
		for (int i = 0; i < args.length && localeString == null; i++) {
			String arg = args[i];
			for (int j = 0; j < options.length && localeString == null; j++) {
				String option = options[j];
//				handle --option Value
				if (arg.equals(option))
				{
					if (i+1 < args.length)
					{
						localeString=args[i+1];
					}
					else
					{
						throw new Exception("No locale Value provided for option " + args[i]); 
					}
				}
				//handle --optionValue
				else if (arg.startsWith(option))
				{
					localeString=arg.substring(option.length());
				}
			}
		}
		
		if (localeString != null)
		{
			System.out.println("Setting Locale to " + localeString);
			int indexOf_ = localeString.indexOf("_");
			if (indexOf_ > -1)
			{
				locale = new Locale(localeString.substring(0,indexOf_),localeString.substring(indexOf_+1));
			}
			else
			{
				locale = new Locale(localeString);
			}
		}
		else
		{
			locale = Locale.getDefault();
		}
		return locale;
	}

	public void execute(String[] args) throws WbemsmtException
	{
		// do nothing
	}
	
}
