 /** 
  * WbemsmtStringEncrypterTest.java
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
  * Description: Test for the StringEncrypter
  * 
  */
package org.sblim.wbemsmt.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WbemsmtStringEncrypterTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String encryptionKey = "43793rduskafhkdsf932468624kdb3dsdasfsadfsa";

		WbemsmtStringEncrypter encrypter = new WbemsmtStringEncrypter( encryptionKey );
		
		if (args.length == 1)
		{
			File f = new File(args[0]);
			
			String line = null;
			String all = "";
			BufferedReader in = new BufferedReader(new FileReader(f));
			
			int count=1;
			
			
			while ((line = in.readLine()) != null)
			{
				all = all + line;
				System.out.println("Encrypting: " + line);
				String encrypted = encrypter.encrypt(line);
				String decrypted = encrypter.decrypt(encrypted);
				
				System.out.println("Encrypting/Decrypting was ok: " + (line.equals(decrypted)));

				encrypted = encrypter.encrypt(all);
				decrypted = encrypter.decrypt(encrypted);
				
				System.out.println("Encrypting/Decrypting was ok: " + (all.equals(decrypted)));
				
				System.out.println("Execution count " + count++);
				System.out.println();
			}
		}
		else
		{
			System.err.println("java org.sblim.wbemsmt.util.WbemsmtStringEncrypterTest filename");
		}
		
		
	}

}
