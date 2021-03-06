 /**
  * CliUtil.java
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
  * Description: Util class for commandlets and doing the alias mapping
  * 
  * The syntax of the alias-file is the following
  * 
  * &lt;CommandName&gt;.&lt;ShortOption&gt;=&lt;NewOnCharacterShortOption&gt;
  * &lt;CommandName&gt;.&lt;LongOption&gt;=&lt;NewLongOption&gt;
  *  
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public final class CliUtil {

	private static CliUtil instance = null;
	private Properties props = new Properties();
	private String filename;
	private static Logger logger = Logger.getLogger(CliUtil.class.getName());
	
	/**
	 * Constructor loads the alias-File defined by the VM-Argument alias.file
	 * The given alias-Filename is taken as it is to create a file. So if not absolute current working dir
	 * is used as parent dir
	 */
	private CliUtil()
	{
		filename = System.getProperty("alias.file");
		if (filename != null)
		{
			logger.fine("vm property alias.file set - reading alias data from default: " + filename);
			File f = new File(filename);
			if (f.exists())
			{
				try {
					logger.fine("Reading aliases from " + f.getAbsolutePath());
					props.load(new FileInputStream(f));
				} catch (Exception e) {
					logger.log(Level.SEVERE,"Cannot read from File " + f.getAbsolutePath(),e);
				}
			}
			else
			{
				logger.severe("File " + f.getAbsolutePath() + " doesn't exists. - Reading no aliases");
			}
		}
		else
		{
			logger.fine("vm property alias.file not set - reading no alias data");
		}
		
	}
	
	/**
	 * Gets the instance of the commandletUtil
	 * @return the instance
	 */
	public static synchronized CliUtil getInstance() {
		if (instance == null)
		{
			instance = new CliUtil();
		}
		return instance;
	}

	/**
	 * Checks if for the defined definition an entry is found in the alias file
	 * @param command the command
	 * @param definition the definition
	 */
	public void checkAliases(CimCommand command, OptionDefinition definition) {
		
		try {
			String longKey = definition.getLongKey();
			if (longKey != null)
			{
				String strLongKey = props.getProperty(command.getCommandName() + "." + longKey,""+longKey).trim();
				definition.setLongKey( strLongKey );
				
				if (longKey != null && longKey.length() > 0)
				{
					longKey = props.getProperty(command.getCommandName() + "." + longKey,""+longKey).trim();
					definition.setLongKey(longKey);
				}
			}

			String shortKey = definition.getShortKey();
			if (shortKey != null)
			{
				String strShortKey = props.getProperty(command.getCommandName() + "." + shortKey,""+shortKey).trim();
				definition.setShortKey( strShortKey );
				
				if (shortKey != null && shortKey.length() > 0)
				{
					shortKey = props.getProperty(command.getCommandName() + "." + shortKey,""+shortKey).trim();
					definition.setShortKey(shortKey);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Create an option
	 * @param bundle the ResourceBundle 
	 * @param definition the option definitin
	 * @return the option
	 * 
 	 */
	public static Option createOption(WbemSmtResourceBundle bundle, OptionDefinition definition) {

		boolean required = definition.isRequired();
		boolean defaultValue = definition.getDefaultValue() != null && definition.getDefaultValue().length() > 0;
		boolean readOnly = definition.isReadOnly();

		List<String> properties = new ArrayList<String>();

		
		if (bundle.keyExists(definition.getBundleKey(),true))
		{
			properties.add(bundle.getString(definition.getBundleKey()));
		}
		
		if (readOnly)
		{
			properties.add(bundle.getString("command.readonly"));
		}
		if (required)
		{
			properties.add(bundle.getString("command.required"));
		}
		else
		{
			properties.add(bundle.getString("command.optional"));
		}

		if (defaultValue && !required)
		{
			if (definition.getDefaultValue() == null)
			{
				properties.add(bundle.getString("command.noDefault"));
			}
			else
			{
				properties.add(bundle.getString("command.defaultIs", new Object[]{definition.getDefaultValue()}));
			}
		}
		
		StringBuffer description = new StringBuffer();
		for (int i=0; i < properties.size(); i++)
		{
			if (i > 0)
			{
				description.append(", ");
			}
			description.append(properties.get(i));
		}
		
		boolean hasArgs = definition.getArgName() != null;
		if (hasArgs)
		{
			OptionBuilder.hasArg(true);
			OptionBuilder.withArgName( bundle.getString(definition.getArgName()) );
		}
		else
		{
			OptionBuilder.hasArg(false);
		}
		OptionBuilder.isRequired(required);
		OptionBuilder.withDescription( description.toString() );
		
		if (definition.getLongKey() != null)
		{
			OptionBuilder.withLongOpt(definition.getLongKey());
		}
		
		Option result = null;
		
		if (definition.getShortKey() != null)
		{
			result = OptionBuilder.create( definition.getShortKey() );
		}
		else
		{
			result = OptionBuilder.create( );
		}
		
		return result;
		
	}
	
	/**
	 * returns true if the option is set - the default value is not taken into account
	 * @param cmd the parese commandline
	 * @param definition the option ot check
	 * @return true if the option is set
	 */
	public static boolean hasOption(CommandLine cmd, OptionDefinition definition)
	{
		return cmd.hasOption(definition.getLongKey());
	}
	
	/**
	 * Gets the option if the option is not set the defaultValue is returned
	 * @param cmd the parsed commandline
	 * @param definition the option to retrieve
	 * @return the option's value
	 */
	public static String getOption(CommandLine cmd, OptionDefinition definition)
	{
		boolean b = cmd.hasOption(definition.getLongKey());
		if (b)
		{
			return cmd.getOptionValue(definition.getLongKey());
		}
		else
		{
			return definition.getDefaultValue();
		}
	}
	
	
	/**
	 * Takes the parsed commandline from the commandvalues and gets the option
	 * defined by the the definition argument
	 * @param commandValues object containing the cimCommand
	 * @param definition the option
	 * @return the option value
	 */
	public static String getOption(CimCommandValues commandValues,
			OptionDefinition definition) {
		return getOption(commandValues.getCommandLine(), definition);
	}
	
	/**
	 * get the name of the class which is the current command
	 * @return the classname of the current command
	 */
	public static String getExecutingClassName() {
		StackTraceElement[] stackTrace;
		
		try {
			throw new Exception();
		} catch (Exception e1) {
			stackTrace = e1.getStackTrace();
		}		
		
		String className = stackTrace[stackTrace.length-2].getClassName();
		int index = className.lastIndexOf("."); 
		if (index > -1 )
		{
			className = className.substring(index+1);
		}
		return className;
	}


}
