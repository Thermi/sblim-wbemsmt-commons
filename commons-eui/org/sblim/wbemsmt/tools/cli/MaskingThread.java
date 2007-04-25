 /** 
  * MaskingThread.java
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
  * Description: MaskingThread for Masking Passwords on the System input
  * 
  */

package org.sblim.wbemsmt.tools.cli;

class MaskingThread extends Thread {
		   private volatile boolean run;
		   private char echochar = ' ';
		  /**
		   *@param prompt The prompt displayed to the user
		   */
		   public MaskingThread(String prompt) {
		      System.out.print(prompt);
		   }

		  /**
		   * Begin masking until asked to stop.
		   */
		   public void run() {

		      int priority = Thread.currentThread().getPriority();
		      Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		      try {
		         run = true;
		         while(run) {
		           System.out.print("\010" + echochar);
		           try {
		              // attempt masking at this rate
		              Thread.sleep(1);
		           }catch (InterruptedException iex) {
		              Thread.currentThread().interrupt();
		              return;
		           }
		         }
		      } finally { // restore the original priority
		         Thread.currentThread().setPriority(priority);
		      }
		   }

		  /**
		   * Instruct the thread to stop masking.
		   */
		   public void stopMasking() {
		      this.run = false;
		   }
}
