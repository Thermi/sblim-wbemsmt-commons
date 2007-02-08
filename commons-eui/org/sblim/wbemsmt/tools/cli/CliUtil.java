 /** 
  * CommandletUtil.java
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
  * Description: Util class for commandlets and doing the alias mapping
  * 
  * The syntax of the alias-file is the following
  * 
  * <CommandName>.<ShortOption>=<NewOnCharacterShortOption>
  * <CommandName>.<LongOption>=<NewLongOption>
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
import org.sblim.wbemsmt.bl.Constants;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CliUtil {

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
	 * @return
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
	 * @param commandlet
	 * @param definition
	 */
	public void checkAliases(CimCommand commandlet, OptionDefinition definition) {
		
		try {
			String longKey = definition.getLongKey();
			
			String strLongKey = props.getProperty(commandlet.getCommandName() + "." + longKey,""+longKey).trim();
			definition.setLongKey( strLongKey );
			
			if (longKey != null && longKey.length() > 0)
			{
				longKey = props.getProperty(commandlet.getCommandName() + "." + longKey,""+longKey).trim();
				definition.setLongKey(longKey);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static Option createOption(WbemSmtResourceBundle bundle, OptionDefinition definition) {

		boolean required = definition.isRequired();
		boolean defaultValue = definition.getDefaultValue() != null && definition.getDefaultValue().length() > 0;
		boolean readOnly = definition.isReadOnly();

		List properties = new ArrayList();

		
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
			if (definition.getDefaultValue().equals(Constants.NO_DEFAULT_VALUE))
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
		
		//Buttons havong no argNames
		if (definition.getArgName() == null)
		{
				OptionBuilder.isRequired(required);
				OptionBuilder.withDescription( description.toString() );
				return OptionBuilder.create( definition.getLongKey());
		}
		else
		{
				String arg = bundle.getString(definition.getArgName());
				OptionBuilder.withArgName( arg );
				OptionBuilder.isRequired(required);
				OptionBuilder.hasArg();
				OptionBuilder.withDescription( description.toString() );
				return OptionBuilder.create( definition.getLongKey());
				
		}
		
		
		
	}
	
	/**
	 * returns true if the option is set - the default value is not taken into account
	 * @param cmd
	 * @param definition
	 * @return
	 */
	public static boolean hasOption(CommandLine cmd, OptionDefinition definition)
	{
		return cmd.hasOption(definition.getLongKey());
	}
	
	/**
	 * Gets the option if the option is not set the defaultValue is returned
	 * @param cmd
	 * @param definition
	 * @return
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
	 * @return
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
