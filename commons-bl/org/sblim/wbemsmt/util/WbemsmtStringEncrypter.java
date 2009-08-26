 /** 
  * WbemsmtStringEncrypter.java
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
  * Description: Class to decrypt/encrypt Strings
  * 
  */
package org.sblim.wbemsmt.util;

import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.xmlbeans.impl.util.Base64;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class WbemsmtStringEncrypter
{
     
     private static final String DES_TRANSFORMATION = "DES/ECB/PKCS5Padding";
	 private static final String DES_ENCRYPTION_SCHEME = "DES";
     
	 public static final String DEFAULT_ENCRYPTION_KEY     = "This is a fairly long phrase used to encrypt";
     
     private KeySpec              keySpec;
     private SecretKeyFactory     keyFactory;
     private Cipher               cipher;
     
     private static final String     UNICODE_FORMAT               = "UTF8";

     public WbemsmtStringEncrypter( String encryptionKey )
               throws WbemsmtException
     {

          if ( encryptionKey == null )
                    throw new IllegalArgumentException( "encryption key was null" );
          if ( encryptionKey.trim().length() < 24 )
                    throw new IllegalArgumentException("encryption key was less than 24 characters" );

          try
          {
               byte[] keyAsBytes = encryptionKey.getBytes( UNICODE_FORMAT );
               cipher = Cipher.getInstance( DES_TRANSFORMATION );
               keySpec = new DESKeySpec( keyAsBytes );
               keyFactory = SecretKeyFactory.getInstance( DES_ENCRYPTION_SCHEME );

          }
          catch (Exception e)
          {
              throw new WbemsmtException(WbemsmtException.ERR_CRYPTO, e );
          }

     }

     public String encrypt( String unencryptedString ) throws WbemsmtException
     {
          if ( unencryptedString == null || unencryptedString.trim().length() == 0 )
                    throw new IllegalArgumentException(
                              "unencrypted string was null or empty" );

          try
          {
               SecretKey key = keyFactory.generateSecret( keySpec );
               cipher.init( Cipher.ENCRYPT_MODE, key );
               
               byte[] cleartext = unencryptedString.getBytes( UNICODE_FORMAT );
               byte[] ciphertext = cipher.doFinal( cleartext );

               return new String(Base64.encode( ciphertext ));
          }
          catch (Exception e)
          {
              throw new WbemsmtException(WbemsmtException.ERR_CRYPTO, e );
          }
     }

     public String decrypt( String encryptedString ) throws WbemsmtException
     {
          if ( encryptedString == null || encryptedString.trim().length() <= 0 )
                    throw new IllegalArgumentException( "encrypted string was null or empty" );

          try
          {
               SecretKey key = keyFactory.generateSecret( keySpec );
               cipher.init( Cipher.DECRYPT_MODE, key );
               byte[] cleartext = Base64.decode(encryptedString.getBytes());
               byte[] ciphertext = cipher.doFinal( cleartext );

               String result = bytes2String( ciphertext );
               return result;
               
          }
          catch (Exception e)
          {
               throw new WbemsmtException(WbemsmtException.ERR_CRYPTO, e );
          }
     }

     private static String bytes2String( byte[] bytes )
     {
          StringBuffer stringBuffer = new StringBuffer();
          for (int i = 0; i < bytes.length; i++)
          {
               stringBuffer.append( (char) bytes[i] );
          }
          return stringBuffer.toString();
     }

}