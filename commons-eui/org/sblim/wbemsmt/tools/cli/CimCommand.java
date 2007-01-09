 /** 
  * CimCommandlet.java
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
  * Description: BaseClass for alle CimCommandlets
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMNameSpace;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.PasswordCredential;
import org.sblim.wbem.client.UserPrincipal;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.LoginException;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;
import org.sblim.wbemsmt.tools.input.ActionComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class CimCommand {

	private static final String DEV_MODE = "DEV_MODE";
	private int errorCount = 0;
	public Map optionsByKey = new HashMap();
	protected final String commandName;
	protected WbemSmtResourceBundle bundle;
	protected static Logger logger = Logger.getLogger(CimCommand.class.getName());
	private static CimCommand currentCommand = null;
	protected final Locale locale;
	
	/**
	 * executes the command
	 * to be implemented by the real commandlet
	 * @param args The argument from commandline (the first argument is the commandname and this argument has already been cut off) 
	 * @throws WbemSmtException
	 */
	public abstract void execute(String[] args) throws WbemSmtException;

	/**
	 * Called before the command is executed
	 */
	public void beforeExecute() {
		currentCommand = this;
	}

	/**
	 * Called after the command is executed
	 */
	public void afterExecute() {
		currentCommand = null;
		
	}
	
	
	
	/**
	 * Creates the Commandlet
	 * @param commandName
	 */

	protected CimCommand(String commandName,String[] bundleNames,Locale locale)
	{
		this.locale = locale;
		this.bundle = ResourceBundleManager.getResourceBundle(bundleNames,locale);
		this.commandName = commandName;
		if (!commandName.equals("main") && commandName.indexOf("{") > -1 && commandName.indexOf("}") > -1)
		{
			throw new IllegalArgumentException("Cannot init CommandLet command name not correct");
		}
	}
	
	/**
	 * Sets a value on the input component, if there is no value for the option, no value set is set
	 * <br>There is no converter used to set the Value
	 * @param cmd
	 * @param ipc
	 * @param definition
	 */
	protected void setValue(CommandLine cmd, LabeledBaseInputComponentIf ipc, OptionDefinition definition) {
		String value = getOptionValue(cmd, definition);
		
		if (value != null)
		{
			ipc.setValue(value);
		}
	}

	/**
	 * Sets a Value for a ComboBox, List etc.
	 * <br>There is no converter used to set the Value
	 * @param cmd
	 * @param ipc
	 * @param definition
	 * @throws WbemSmtException 
	 */
	protected void setMultiValue(WbemSmtResourceBundle bundle, CommandLine cmd, LabeledBaseInputComponentIf ipc, OptionDefinition definition) throws WbemSmtException {
		String value = getOptionValue(cmd, definition);
		
		if (value != null)
		{
			if (ipc.getConverter().canConvert(value))
			{
				ipc.setValue(value);
			}
			else
			{
				String possibleValues = "";
				if (ipc.getConverter() instanceof StringArrayConverter)
				{
					String[] values = ((StringArrayConverter)ipc.getConverter()).getValues();
					if (values != null && values.length > 0)
					{
						StringBuffer sb = new StringBuffer();
						for (int i = 0; i < values.length; i++) {
							String v = values[i];
							if (i > 0)
							{
								sb.append(",");
							}
							sb.append("[").append(v).append("]");
						}
						possibleValues = sb.toString();
					}
					else
					{
						possibleValues = bundle.getString("no.values.for.selection");
					}
				}
				throw new WbemSmtException(bundle.getString("cannot.set.value",new Object[]{ipc.getLabelText(),value,possibleValues}));
			}
			
		}
	}

	/***
	 * Set the value of a checkBox
	  *<br>There is no converter used to set the Value 
	 * @param cmd
	 * @param ipc
	 * @param definition
	 */
	protected void setCheckboxValue(CommandLine cmd, LabeledBaseInputComponentIf ipc, OptionDefinition definition) {
		String value = getOptionValue(cmd, definition);
		if (value != null)
		{
			ipc.setValue(value);
		}
	}

	/**
	 * Used for Field representing a button
	 * @param cmd
	 * @param adapter
	 * @param dc
	 * @param ipc
	 * @param definition
	 * @return true if the Button was pressed - Return false if the button was pressed and there were errors in the MessageList of the container or if the Confirmation
	 * was requested and the user had choosen to deny the action
	 * 
	 * So the calling commandline can abort the current action if the method returns false
	 * @throws ObjectUpdateException
	 */
	protected boolean pressButton(CommandLine cmd, AbstractBaseCimAdapter adapter, DataContainer dc, LabeledBaseInputComponentIf ipc, OptionDefinition definition) throws ObjectUpdateException {

		if (ipc instanceof ActionComponent)
		{
			
			ActionComponent actionComponent = (ActionComponent)ipc;
			
			if (actionComponent.isNeedConfirmation())
			{
				try {
					if (!getConfirmation())
					{
						logger.info("Current Action cancelled by User");
						return false;
					}
				} catch (IOException e) {
					throw new ObjectUpdateException("Cannot get the Confirmation for Component " + ipc.getLabelText(), e);
				}
			}
			
			if (cmd.hasOption(definition.getLongKey()))
			{
				adapter.updateModel(dc,ipc);
				return !MessageList.init(dc).hasErrors();
			}
			return true;
		}
		
		throw new ObjectUpdateException("Component is no ActionComponent");
		
	}		
	
	/**
	 * ExceptionHandlier for a ParseException (occurs while parsing invalid Commandline args)
	 * @param args the invalid args
	 * @param options the Options defined for Parsing
	 * @param the Exception
	 */
	protected void handleParseException(String[] args, Options options, ParseException e, OptionDefinition defPassword) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < args.length; i++) {
			if (i > 0 && args[i-1].equals("-" + defPassword.getLongKey()))
			{
				sb.append("**************").append(" ");
			}
			else
			{
				sb.append(args[i]).append(" ");
			}
		}
		showUsage(options);
		System.err.println("Supplied Arguments: " + sb.toString());
		System.err.println("Missing Arguments: " + e.getMessage());
	}

	/**
	 * Gets the Value of an Option
	 * @param cmd
	 * @param definition containing the information which option to retrieve from the commandLine
	 * @return
	 */
	protected String getOptionValue(CommandLine cmd, OptionDefinition definition) {
		String value = null;
		
		if (definition.isRequired())
		{
			value = cmd.getOptionValue(definition.getLongKey());
		}
		else
		{
			if (cmd.hasOption(definition.getLongKey()))
			{
				value = cmd.getOptionValue(definition.getLongKey());
			}
			else
			{
				value = definition.getDefaultValue();
			}
		}
		return value;
	}

	/**
	 * Show the Usage of the Command
	 * @param options
	 */
	protected void showUsage(Options options) {
		if (Cli.testMode)
		{
			Cli.commandExecuted=false;
		}
		HelpFormatter formatter = new HelpFormatter();
		
		String msg = commandName + "\n \n \n" + bundle.getString("commanddescription." + ClassUtils.getShortClassName(getClass())) + " \n \n";
		
		formatter.printHelp(120,msg,"", options,"",true);
		
	}

	/**
	 * Create for all OptionDefinitions new Options for the Apache Commons CLI
	 * @param optionDefinitions
	 * @param bundle
	 * @return
	 */
	protected Options createOptions(OptionDefinition[] optionDefinitions, WbemSmtResourceBundle bundle) {
		Options options = new Options();
		
		CliUtil util = CliUtil.getInstance();
		
		for (int i = 0; i < optionDefinitions.length; i++) {
			OptionDefinition def = optionDefinitions[i];
			util.checkAliases(this,def);
			Option option = CliUtil.createOption(bundle,def);
			optionsByKey.put(def,option);
			options.addOption(option);
		}
		return options;
	}

	/**
	 * Get the CimClient for Server Connection
	 * @param cmd
	 * @param hostName
	 * @param nameSpace
	 * @param user
	 * @param password
	 * @return
	 * @throws LoginException 
	 */
	protected CIMClient getCimClient(CommandLine cmd, 
			OptionDefinition hostName, 
			OptionDefinition port, 
			OptionDefinition nameSpace, 
			OptionDefinition user, 
			OptionDefinition password,
			OptionDefinition publicKeyFile,
			OptionDefinition privateKeyFile
			) throws LoginException {

		//TODO implement the connection with public/private-Keys
		String server = CliUtil.getOption(cmd,hostName);
		String strPort = CliUtil.getOption(cmd,port);
		String namespace = CliUtil.getOption(cmd,nameSpace);
		String url = "HTTP://" + server + ":" + strPort + namespace;
		String userName = CliUtil.getOption(cmd,user);
		String strPassword = CliUtil.getOption(cmd,password);
	
		UserPrincipal userPrincipal      = new UserPrincipal(userName);
		PasswordCredential passwordCredential = new PasswordCredential(strPassword.toCharArray());		
		CIMNameSpace cimNameSpace       = new CIMNameSpace(url);
					
		System.out.println(bundle.getString("connectToServer", new Object[]{url,userName}));
		
		CIMClient cimClient = new CIMClient(cimNameSpace, userPrincipal, passwordCredential);
		try {
			cimClient.enumerateClassNames();
		} catch (CIMException e) {
			throw new LoginException(e);
		}
		return cimClient;
	}

	/**
	 * Gets the commandName this Commandlet belongs to
	 * @return
	 */
	public String getCommandName() {
		return commandName;
	}

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceErrors(String bundlekeyForCaption, MessageList messageList)
	{
		System.err.println(bundle.getString(bundlekeyForCaption));
        for (Iterator iter = messageList.iterator(); iter.hasNext();) {
        	Message msg = (Message) iter.next();
        	System.err.println(msg.toLocalizedString(bundle,true));
        }

        if (Cli.testMode)
		{
			Cli.commandExecuted=!messageList.hasErrors();
		}
	}

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceErrors(MessageList messageList)
	{
	    for (Iterator iter = messageList.iterator(); iter.hasNext();) {
        	Message msg = (Message) iter.next();
        	System.err.println(msg.toLocalizedString(bundle,true));
        }
        if (Cli.testMode)
		{
			Cli.commandExecuted=!messageList.hasErrors();
		}
	}

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceMessages(String bundlekeyForCaption, MessageList messageList)
	{
		System.out.println(bundle.getString(bundlekeyForCaption));
        for (Iterator iter = messageList.iterator(); iter.hasNext();) {
        	Message msg = (Message) iter.next();
        	System.out.println(msg.toLocalizedString(bundle,true));
        }
        if (Cli.testMode)
		{
			Cli.commandExecuted=!messageList.hasErrors();
		}
	}

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceMessages(MessageList messageList)
	{
        for (Iterator iter = messageList.iterator(); iter.hasNext();) {
        	Message msg = (Message) iter.next();
        	System.out.println(msg.toLocalizedString(bundle,true));
        }
        if (Cli.testMode)
		{
			Cli.commandExecuted=!messageList.hasErrors();
		}
	}

	/**
	 * Checks if the password was set and if not ask the user to set the password
	 * @param parser
	 * @param options
	 * @param args
	 * @param defPassword 
	 * @param defHost 
	 * @param defUser 
	 * @throws ParseException 
	 * @return The Arguments with the password added
	 */
	public String[] checkPassword(CommandLineParser parser, Options options, String[] args, OptionDefinition defHost, OptionDefinition defUser, OptionDefinition defPassword) {
		
		try {
			parser.parse( options, args);
		} catch (MissingOptionException e) {
			
			//Only if password is the one and only thing that is mssing
			if (e.getMessage().equals("-" + defPassword.getLongKey()))
			{
				List argList = new ArrayList();
				argList.addAll(Arrays.asList(args));
				
				int hostIndex = argList.indexOf("-" + defHost.getLongKey());
				if (hostIndex > -1 && argList.size() > hostIndex+1)
				{
					int userIndex = argList.indexOf("-" + defUser.getLongKey());
					String user = "";
					if (userIndex > -1 && argList.size() > userIndex+1)
					{
						user = argList.get(userIndex+1) + "@";
					}
					WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"},locale);
					try {
						char [] password = PasswordField.getPassword(System.in, bundle.getString("enter.password.for.cimom",new Object[]{user + argList.get(hostIndex+1)}));
						argList.add("-" + defPassword.getLongKey());
						if (password != null)
						{
							argList.add(String.valueOf(password));
						}
						else
						{
							argList.add("");
						}
						
						args = (String[]) argList.toArray(new String[argList.size()]);
					} catch (Exception e1) {
						logger.log(Level.SEVERE,"Cannot get Password",e1);
					}
				}
				
			}
		} catch (ParseException e) {
			// do nothing handled by the subclass we just want the Missing options
			e.printStackTrace();
		}
		
		return args;
	}

	public void handleException(Throwable t,String[] args, Options options,OptionDefinition defPassword) {
		
		
		if (t instanceof ParseException) {
			ParseException pEx = (ParseException) t;
			handleParseException(args, options, pEx,defPassword);
		}
		else if ("true".equalsIgnoreCase(System.getProperty(CimCommand.DEV_MODE)))
		{
			t.printStackTrace();
		}
		else if (Cli.testMode)
		{
			throw new RuntimeException(t);
		}
		else
		{
			//first search for the deepest WbemSmtException
			WbemSmtException smtException = (WbemSmtException) ExceptionUtil.findDeepest(WbemSmtException.class, t);
			
			Message msg = ExceptionUtil.getEnduserExceptionText(t, locale, bundle, bundle, smtException, Level.FINE, "\n");
			
			System.err.println(bundle.getString("error.while.execution") + "\n" + msg.getMessageString());
		}
	}
	
	public static CimCommand getCurrentCommand()
	{
		return currentCommand ;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}
	
	public void addErrorCount() {
		this.errorCount++;
	}

	/**
	 * Asks the user for confirming an action
	 * if Cli.testMode == true the confirmations is set to true and the user is not asked
	 * @param msg
	 * @return
	 * @throws IOException
	 * @see {@link Cli#testMode}
	 */
	protected boolean getConfirmation() throws IOException
	{
		String msg = bundle.getString("continue.commandline");
		String yes = bundle.getString("continue.commandline.yes","y");

		if (Cli.testMode)
		{
			return true;
		}
		else
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(msg + " ");
			String response = in.readLine();
			return yes.equalsIgnoreCase(response);
		}
	}
	

}
