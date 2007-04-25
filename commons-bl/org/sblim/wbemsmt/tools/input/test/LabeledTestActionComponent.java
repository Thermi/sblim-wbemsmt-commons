 /** 
  * LabeledTestActionComponent.java
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
  * Description: InputComponent for TestClasses and CLI
  * 
  */

package org.sblim.wbemsmt.tools.input.test;


import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.ActionComponent;

public class LabeledTestActionComponent extends LabeledTestInputComponent implements ActionComponent {

	public LabeledTestActionComponent(DataContainer parent, String labelText, String value, Converter converter) {
		super(parent, labelText, value, converter);
	}

	
	


}
