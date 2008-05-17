 /** 
  * CimCommandValues.java
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
  * Description: ValueObject for Objects related for the exection of a command
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.io.PrintWriter;
import java.io.Reader;
import java.util.Locale;

import javax.wbem.client.WBEMClient;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * @author Bauschert
 *
 */
public class CimCommandValues {
	private boolean execute;
	private WBEMClient cimClient;
	private String[] args;
	private CommandLine commandLine;
	private Options options;
	private Locale locale;
	private Reader in;
	private PrintWriter out;
	private PrintWriter err;
	private ParseException parseException;
	
	
	public boolean isExecute() {
		return execute;
	}

	public void setExecute(boolean execute) {
		this.execute = execute;
	}

	public WBEMClient getCimClient() {
		return cimClient;
	}

	public void setCimClient(WBEMClient cimClient) {
		this.cimClient = cimClient;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	public CommandLine getCommandLine() {
		return commandLine;
	}

	public void setCommandLine(CommandLine commandLine) {
		this.commandLine = commandLine;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public PrintWriter getErr() {
		return err;
	}

	public void setErr(PrintWriter err) {
		this.err = err;
	}

	public Reader getIn() {
		return in;
	}

	public void setIn(Reader in) {
		this.in = in;
	}

	public PrintWriter getOut() {
		return out;
	}

	public void setOut(PrintWriter out) {
		this.out = out;
	}

	public ParseException getParseException() {
		return parseException;
	}

	public void setParseException(ParseException parseException) {
		this.parseException = parseException;
	}


	/**
	 * Shortcut:Takes the commandline from this object and calls a getOptionValue
	 * @param key
	 * @return
	 */
	public String getOptionValue(String key) {
		return getCommandLine().getOptionValue(key);
	}

	/**
	 * Shortcut:Takes the commandline from this object and calls a getOptionValue
	 * @param key
	 * @return
	 */
	public String getOptionValue(char c) {
		return getCommandLine().getOptionValue(c);
	}
	
	
	
	
	
	
}
