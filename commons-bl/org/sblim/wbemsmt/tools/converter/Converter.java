/** 
 * Converter.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Interface for Converters that are used to convert model values to components and vice versa
 * 
 */

package org.sblim.wbemsmt.tools.converter;
/**
 * Interface for Converters that are used to convert model values to components and vice versa
 */
public interface Converter {
    
    /**
     * convert the object for display in the ui
     * @param value the object to convert
     * @return the converted object
     */
	public Object convertForGui(Object value);

	/**
     * convert the object for being used in the business logic
     * @param guiElement the object to convert for the model
     * @return the converted object
     */
	public Object convertForModel(Object guiElement);
	
	/**
	 * checks if the value can be converted
	 * @param guiElement the object to check
	 * @return true if conversion is possible
	 */
	public boolean canConvert(Object guiElement);
	
	/**
	 * get the Type for the model
	 * @return the classname used in the model (the classname withou
	 */
	public Class getTypeForModel();
	
}
