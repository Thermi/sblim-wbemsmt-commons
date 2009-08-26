 /** 
  * CommandletDataLoader.java
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
  * Description: Interface for classes who are responsible for Loading Data for Commandlets
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import org.apache.commons.cli.CommandLine;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public interface CliDataLoader {
	
	/**
	 * Load the data. The Implementor should use the adapter.select(key) method to select the correct item
	 *
	 * Use CommandletUtil.getOption() to get a userentered command option. The herefore needed OptionDefinition is a Constant in the Corresponding Commandlet Class
	 *
	 * @param bundle the resourceBundle for Exceptions
	 * @param adapter the adapter for making the selection
	 * @param commandValues the Commandline
	 * @throws WbemsmtException
	 * 
	 * @see AbstractBaseCimAdapter#select(org.sblim.wbemsmt.bl.adapter.CimObjectKey)
	 * @see CliUtil#getOption(CommandLine, OptionDefinition)
	 */
	public void load(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, CimCommandValues commandValues) throws WbemsmtException ;
}
