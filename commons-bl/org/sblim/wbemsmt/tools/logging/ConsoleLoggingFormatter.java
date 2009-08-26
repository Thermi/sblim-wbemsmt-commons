 /** 
  * ConsoleLoggingFormatter.java
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
  * Description: java.util.logging Formatter for the console
  * 
  */
package org.sblim.wbemsmt.tools.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class ConsoleLoggingFormatter extends Formatter {

	public ConsoleLoggingFormatter()
	{
		super();
	}
	
	/* (non-Javadoc)
	 * @see java.util.logging.Formatter#format(java.util.logging.LogRecord)
	 */
	public String format(LogRecord record) {
		return record.getMessage() + "\n";
	}

}
