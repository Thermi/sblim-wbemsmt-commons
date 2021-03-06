 /** 
  * CimCommandlet.java
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
  * Description: BaseClass for alle CimCommandlets
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.wbem.CloseableIterator;
import javax.wbem.client.WBEMClient;

import org.apache.commons.cli.*;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageInputEvent;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.LoginException;
import org.sblim.wbemsmt.exception.impl.userobject.LoginUserObject;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;
import org.sblim.wbemsmt.tools.input.ActionComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class CimCommand {

	private static final String NO_DEFAULT_VALUE = "noDefaultValue";

	/**
	 * VM argument to switch to DEV_MODE which enables a richer tracing
	 */
	private static final String DEV_MODE = "DEV_MODE";
	
	/**
	 * VM argument to diabled confirmations
	 */
	private static final String NO_CONFIRMATIONS = "NO_CONFIRMATIONS";
	
	private int errorCount = 0;
	public Map<OptionDefinition, Option> optionsByKey = new HashMap<OptionDefinition, Option>();
	protected final String commandName;
	protected WbemSmtResourceBundle bundle;
	protected static Logger logger = Logger.getLogger(CimCommand.class.getName());
	private static CimCommand currentCommand = null;
	protected final Locale locale;
	protected CimCommandValues commandValues;
	
	/**
	 * executes the command
	 * to be implemented by the real commandlet
	 * @param values The values needed to execute a CimCommand 
	 * @throws WbemsmtException
	 */
	public abstract void execute(CimCommandValues values) throws WbemsmtException;

	public abstract Options getOptions() throws WbemsmtException;
	public abstract Options getLocalOptions() throws WbemsmtException;
	public abstract Options getGlobalWbemsmtCommonOptions() throws WbemsmtException;
	public abstract Options getGlobalWbemsmtCommunicationOptions() throws WbemsmtException;
	public abstract Options getGlobalTaskOptions() throws WbemsmtException;
	/**
	 * prepare the command
	 * to be implemented by the real commandlet
	 * @param args The argument from commandline (the first argument is the commandname and this argument has already been cut off) 
	 * @throws WbemsmtException
	 */
	public CimCommandValues prepare(String[] args) throws WbemsmtException
	{
		
		CimCommandValues values = new CimCommandValues();
		values.setIn(new InputStreamReader(System.in));
		values.setOut(new PrintWriter(System.out,true));
		values.setErr(new PrintWriter(System.err,true));
		values.setExecute(true);
		values.setArgs(args);
		
	    Options options = getOptions();
	    values.setOptions(options);
	    
		//check if the password is the only argument that is missing and query the user if thats the case
		CommandLineParser parser = new PosixParser();
		PasswordCheckResult result = checkPassword(parser,options,args,getLoginOptions(),values);
		args = result.getArgs();
		values.setArgs(args);
		
		if (!result.isPasswordEntered())
		{
			logger.info("No password entered. Stopping execution");
			return values;
		}
		
		CommandLine cmd = null;
		try {
			cmd = parser.parse( options, args);
			values.setCommandLine(cmd);
			values.setCimClient(getCimClient(System.out,cmd, getCimClientOptions()));
		} catch (ParseException e) {
			//handled later by the execute method
			values.setParseException(e);
		}
		return values;
	}
	
	protected abstract LoginOptionValues getLoginOptions();
	protected abstract CimClientOptionValues getCimClientOptions();

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
	 * @throws WbemsmtException 
	 */
	protected void setMultiValue(WbemSmtResourceBundle bundle, CommandLine cmd, LabeledBaseInputComponentIf ipc, OptionDefinition definition) throws WbemsmtException {
		String value = getOptionValue(cmd, definition);
		
		if (value != null && !NO_DEFAULT_VALUE.equals(value))
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
				throw new WbemsmtException(WbemsmtException.ERR_FAILED,bundle.getString("cannot.set.value",new Object[]{ipc.getLabelText(),value,possibleValues}));
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
	 * @throws WbemsmtException
	 */
	protected boolean pressButton(CommandLine cmd, AbstractBaseCimAdapter adapter, DataContainer dc, LabeledBaseInputComponentIf ipc, OptionDefinition definition) throws WbemsmtException {

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
					throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Cannot get the Confirmation for Component " + ipc.getLabelText(), e);
				}
			}
			
			if (cmd.hasOption(definition.getLongKey()))
			{
				adapter.updateModel(dc,ipc);
				return !MessageList.init(dc).hasErrors();
			}
			return true;
		}
		
		throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Component is no ActionComponent");
		
	}		
	
	protected void handleParseException(String[] args, Options options, ParseException e, OptionDefinition defPassword) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < args.length; i++) {
			if (i > 0 && args[i-1].equals("--" + defPassword.getLongKey()))
			{
				sb.append("**************").append(" ");
			}
			else
			{
				sb.append(args[i]).append(" ");
			}
		}
		showUsage(commandValues.getOut(),options);
		commandValues.getErr().println(bundle.getString("supplied.arguments" ,new Object[]{sb.toString()}));
		String key = null;
		
		if (e instanceof MissingOptionException) {
			key = "missing.options";
		}
		else if (e instanceof MissingArgumentException) {
			key = "missing.arguments";
		}
		else if (e instanceof UnrecognizedOptionException) {
			key = "unrecognized.options";
		}
		//AlreadySelectedException is not thrown becuase wbemsmt is not using options in option groups
		
		if (key != null)
		{
			String msg = e.getMessage().lastIndexOf(":") > -1 ? 
					e.getMessage().substring(e.getMessage().lastIndexOf(":") + 1)
					: e.getMessage();
					commandValues.getErr().println(bundle.getString(key ,new Object[]{msg}));
		}
		
	}

	protected void handleParseException(CimCommandValues values, OptionDefinition defPassword) {
		handleParseException(values.getArgs(), values.getOptions(), values.getParseException(), defPassword);
	}

	/**
	 * Gets the Value of an Option
	 * @param cmd
	 * @param definition containing the information which option to retrieve from the commandLine
	 * @return
	 */
	protected String getOptionValue(CommandLine cmd, OptionDefinition definition) {
		String value = null;
		
		String key = definition.getLongKey() != null ? definition.getLongKey() : definition.getShortKey(); 
		
		if (definition.isRequired())
		{
			value = cmd.getOptionValue(key);
		}
		else
		{
			if (cmd.hasOption(key))
			{
				value = cmd.getOptionValue(key);
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
	protected void showUsage(PrintWriter pw, Options options) {
		if (Cli.testMode) 
		{
			Cli.commandExecuted=false;
		}
		HelpFormatter formatter = new WbemsmtHelpFormatter();
		
		String msg = commandName + " ";
		String footer = "\n" + bundle.getString("commanddescription." + ClassUtils.getShortClassName(getClass())) + " \n";
		
		formatter.printHelp(pw,120,msg,"",options,0,0,footer,true);
	}

	protected Options createOptions(OptionDefinition[] optionDefinitions, WbemSmtResourceBundle bundle) {
		Options options = new Options();
		createOptions(options, optionDefinitions, bundle);
		return options;
	}	
	/**
	 * Create for all OptionDefinitions new Options for the Apache Commons CLI
	 * @param optionDefinitions
	 * @param bundle
	 * @return
	 */
	public Options createOptions(Options options, OptionDefinition[] optionDefinitions, WbemSmtResourceBundle bundle) {
		
		
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
	 * @param out 
	 * @param cmd
	 * @param hostName
	 * @param nameSpace
	 * @param user
	 * @param password
	 * @return
	 * @throws WbemsmtException 
	 */
	protected WBEMClient getCimClient(PrintStream out, CommandLine cmd, CimClientOptionValues clientOptions) throws WbemsmtException {

		String protocol;
		if (clientOptions.getProtocol() != null) {
			protocol = CliUtil.getOption(cmd, clientOptions.getProtocol());	
		} else {
			protocol = "http";
		}
			
		
		
		String server = CliUtil.getOption(cmd,clientOptions.getHost());
		String strPort = CliUtil.getOption(cmd,clientOptions.getPort());
		String namespace = CliUtil.getOption(cmd,clientOptions.getNamespace());
		String url = protocol + "://" + server + ":" + strPort + namespace;
		String userName = CliUtil.getOption(cmd,clientOptions.getUser());
		String strPassword = CliUtil.getOption(cmd,clientOptions.getPassword());
	
		namespace = CIMClientPool.cleanupNamespace(namespace);
		
		try {
			out.println(bundle.getString("connectToServer", new Object[]{url,userName}));
			
			WBEMClient cimClient = null;
			WbemsmtSession.getSession().createCIMClientPool(protocol,server,strPort,userName,strPassword);
			cimClient = WbemsmtSession.getSession().getCIMClientPool(server).getCIMClient(namespace);
			
			CloseableIterator it = cimClient.enumerateClasses(new javax.cim.CIMObjectPath("CIM_ManagedElement",namespace),false,false,false,false);
			if (it.hasNext()) {
				it.next();
			}

			return cimClient;
		} catch (Exception e) {
			WbemsmtException e1 = new LoginException(e, new LoginUserObject(userName + "@" + protocol +"://" + server + ":" + strPort + "/" + namespace));
            throw e1;
		}
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
		commandValues.getErr().println(bundle.getString(bundlekeyForCaption));
		if (messageList != null)
		{
	        for (Iterator<Message> iter = messageList.iterator(); iter.hasNext();) {
	        	Message msg = (Message) iter.next();
	        	commandValues.getErr().println(msg.toLocalizedString(bundle,true));
	        }
		}
        if (Cli.testMode)
		{
			Cli.commandExecuted=messageList == null || !messageList.hasErrors();
		}
	}

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceErrors(MessageList messageList)
	{
	    for (Iterator<Message> iter = messageList.iterator(); iter.hasNext();) {
        	Message msg = (Message) iter.next();
        	if (msg.isError() || msg.isWarning())
        	{
        		commandValues.getErr().println(msg.toLocalizedString(bundle,true));
        	}
        	else
        	{
        		commandValues.getOut().println(msg.toLocalizedString(bundle,true));
        	}
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
		if (messageList.size() > 0)
		{
			commandValues.getOut().println(bundle.getString(bundlekeyForCaption));
			for (Iterator<Message> iter = messageList.iterator(); iter.hasNext();) {
				Message msg = (Message) iter.next();
				commandValues.getOut().println(msg.toLocalizedString(bundle,true));
			}
			if (Cli.testMode)
			{
				Cli.commandExecuted=!messageList.hasErrors();
			}
		}
	}

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceMessages(Message caption, MessageList messageList)
	{
		if (messageList.size() > 0)
		{
			PrintWriter out = commandValues.getOut();
            out.println(caption.getMessageString());
			for (Iterator<Message> iter = messageList.iterator(); iter.hasNext();) {
				Message msg = (Message) iter.next();
				if (msg.isError())
				{
					out = commandValues.getErr();
				}
				else
				{
				    out = commandValues.getOut();
				}
				out.println(msg.getMessageString());
				
				if (msg.getRequiredInput() == Message.INPUT_YES_NO)
				{
                    queryInput(out, msg, bundle.getString("yes"), bundle.getString("no"));
				}
				else if (msg.getRequiredInput() == Message.INPUT_OK_CANCEL)
                {
                    queryInput(out, msg, bundle.getString("ok"), bundle.getString("cancel"));
                }
				
			}
			if (Cli.testMode)
			{
				Cli.commandExecuted=!messageList.hasErrors();
			}
		}
	}

    private void queryInput(PrintWriter out, Message msg, String positivAnswer, String negativeAnswer) {
        String line = "";
        while (!line.equalsIgnoreCase(positivAnswer) && !line.equalsIgnoreCase(negativeAnswer) )
        {
            out.println(positivAnswer + "/" + negativeAnswer);
            BufferedReader reader = new BufferedReader(commandValues.getIn());
            try {
                line = reader.readLine();
            }
            catch (IOException e) {
                //do nothing
                break;
            }
        }
        if (line.equalsIgnoreCase(positivAnswer) || line.equalsIgnoreCase(negativeAnswer))
        {
            int action = positivAnswer.equals(line) ? MessageInputEvent.YES : MessageInputEvent.NO; 
            MessageInputEvent event = new MessageInputEvent(action);
            msg.getMessageInputHandler().handleInput(event);
        }
    }

	/**
	 * traces the error Messages
	 * @param bundlekeyForCaption
	 * @param messageList
	 */
	public void traceMessages(MessageList messageList)
	{
        for (Iterator<Message> iter = messageList.iterator(); iter.hasNext();) {
        	Message msg = (Message) iter.next();
        	commandValues.getOut().println(msg.toLocalizedString(bundle,true));
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
	 * @param values 
	 * @param defPassword 
	 * @param defHost 
	 * @param defUser 
	 * @throws ParseException 
	 * @return The Arguments with the password added
	 */
	public PasswordCheckResult checkPassword(CommandLineParser parser, Options options, String[] args, LoginOptionValues loginOptionValues, CimCommandValues values) {
		
		PasswordCheckResult result = new PasswordCheckResult();
		result.setPasswordEntered(false);
		try
		{
			CommandLine line = parser.parse( options, args);
			if (line.getOptionValue(loginOptionValues.getPassword().getLongKey()) == null)
			{
				String host = line.getOptionValue(loginOptionValues.getHost().getLongKey());
				String user = line.getOptionValue(loginOptionValues.getUser().getLongKey());

				String loginInfo = user + "@" + host;
				
				WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"},locale);
				try {
					char [] password = PasswordField.getPassword(values.getIn(), bundle.getString("enter.password.for.cimom",new Object[]{loginInfo}));
					List<String> argList = new ArrayList<String>();
					argList.addAll(Arrays.asList(args));
					argList.add("--" + loginOptionValues.getPassword().getLongKey());

					if (password != null)
					{
						argList.add(String.valueOf(password));
					}
					else
					{
						argList.add("");
					}
					
					args = (String[]) argList.toArray(new String[argList.size()]);
					result.setPasswordEntered(true);
				} catch (Exception e1) {
					logger.log(Level.SEVERE,"Cannot get Password",e1);
				}
			}
			else
			{
				result.setPasswordEntered(true);	
			}
			
		} catch (ParseException e) {
			//do nothing handled by the subclass we just want the Missing options
			//password was entered directly on the commandline
			result.setPasswordEntered(true);
		}
		
		result.setArgs(args);
		
		return result;
	}

	public void handleException(Throwable t,String[] args, Options options,OptionDefinition defPassword) {
		
		
		if (t instanceof ParseException) {
			ParseException pEx = (ParseException) t;
			handleParseException(args, options, pEx,defPassword);
		}
		else if (isDevModeEnabled())
		{
			t.printStackTrace();
		}
		else if (Cli.testMode)
		{
			throw new RuntimeException(t);
		}
		else
		{
			ExceptionUtil.handleException(t,commandValues.getErr());
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

		if (Cli.testMode || isNoConfirmationEnabled())
		{
			return true;
		}
		else
		{
			BufferedReader in = new BufferedReader(commandValues.getIn());
			commandValues.getOut().print(msg + " ");
			commandValues.getOut().flush();
			String response = in.readLine();
			return yes.equalsIgnoreCase(response);
		}
	}
	
	/**
	 * Checks if the option was found in the arguments
	 * @param args
	 * @param option
	 * @return
	 */
	protected boolean hasOption(String[] args, String option)
	{
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if (arg != null && arg.equals(option))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * update the resource Bundle
	 * @param resourceBundle
	 */
	public void setResourceBundle(WbemSmtResourceBundle resourceBundle)
	{
		bundle = resourceBundle;
	}
	
	public boolean isDevModeEnabled()
	{
		return "true".equalsIgnoreCase(System.getProperty(CimCommand.DEV_MODE));
	}

	public boolean isNoConfirmationEnabled()
	{
		return "true".equalsIgnoreCase(System.getProperty(CimCommand.NO_CONFIRMATIONS));
	}
}
