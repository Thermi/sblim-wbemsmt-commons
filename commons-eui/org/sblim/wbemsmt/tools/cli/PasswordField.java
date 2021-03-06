 /** 
  * PasswordField.java
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
  * Description: Field-Object for entering and masking passwords on the commandline
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.Arrays;

public class PasswordField {
	  /**
	   *@param input stream to be used (e.g. System.in)
	   *@param prompt The prompt to display to the user.
	   *@return The password as entered by the user.
	   */

	   public static final char[] getPassword(Reader in, String prompt) throws IOException {
	      MaskingThread maskingthread = new MaskingThread(prompt);
	      Thread thread = new Thread(maskingthread);
	      thread.start();
		
	      char[] lineBuffer;
	      char[] buf;

	      buf = lineBuffer = new char[128];

	      int room = buf.length;
	      int offset = 0;
	      int c;

	      loop:   while (true) {
	         switch (c = in.read()) {
	            case -1:
	            case '\n':
	               break loop;

	            case '\r':
	               int c2 = in.read();
	               if ((c2 != '\n') && (c2 != -1)) {
	                  if (!(in instanceof PushbackReader)) {
	                     in = new PushbackReader(in);
	                  }
	                  ((PushbackReader)in).unread(c2);
	                } else {
	                  break loop;
	                }

	                default:
	                   if (--room < 0) {
	                      buf = new char[offset + 128];
	                      room = buf.length - offset - 1;
	                      System.arraycopy(lineBuffer, 0, buf, 0, offset);
	                      Arrays.fill(lineBuffer, ' ');
	                      lineBuffer = buf;
	                   }
	                   buf[offset++] = (char) c;
	                   break;
	         }
	      }
	      maskingthread.stopMasking();
	      if (offset == 0) {
	         return null;
	      }
	      char[] ret = new char[offset];
	      System.arraycopy(buf, 0, ret, 0, offset);
	      Arrays.fill(buf, ' ');
	      return ret;
	   }
}
