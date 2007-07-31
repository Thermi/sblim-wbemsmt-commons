/** 
  * ComponentProperties.java
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
  * Description: Properties for a Component (Usually a LabeledBaseInputComponent)
  * 
  */
package org.sblim.wbemsmt.tools.input;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent.Size;

/**
 * Properties for a Component (Usually a LabeledBaseInputComponent)
 * @author Bauschert
 *
 * @see org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf#getProperties()
 */
public class ComponentProperties extends Hashtable
{
	public static String COLOR_GREEN = "green";
	public static String COLOR_RED = "red";
	public static String COLOR_BLUE = "blue";
	public static String COLOR_YELLOW = "yellow";
	public static String COLOR_ORANGE = "orange";
	public static String COLOR_BLACK = "black";
	public static String COLOR_WHITE = "white";
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6592972877782472931L;
	private static final String KEY_READ_ONLY = "readOnly";
	private static final String KEY_BG_COLOR = "bgColor";
	private static final String KEY_COLOR = "color";
	private static final String KEY_VISIBLE = "visibility";
	private static final String KEY_SIZE = "size";
	Set listeners = new HashSet();
	
	public String getBgColor() {
		return (String) (get(KEY_BG_COLOR) == null ? COLOR_WHITE : get(KEY_BG_COLOR));
	}
	public void setBgColor(String bgColor) {
		setProperty(KEY_BG_COLOR,bgColor);
	}

	public String getColor() {
		return (String) (get(KEY_COLOR) == null ? COLOR_BLACK : get(KEY_COLOR));
	}
	public void setColor(String color) {
		setProperty(KEY_COLOR,color);
	}
	
	public void setVisible(boolean visible) {
		setProperty(KEY_VISIBLE,new Boolean(visible));
	}
	
	public Size getSize() {
		return ((Size) (get(KEY_SIZE) == null ? LabeledBaseInputComponentIf.SIZE_M : get(KEY_SIZE)));
	}
	
	public void setSize(Size size) {
		setProperty(KEY_SIZE,size);
	}

	public boolean isReadOnly() {
		return get(KEY_READ_ONLY) == null ? false : ((Boolean)get(KEY_READ_ONLY)).booleanValue();
	}
	public void setReadOnly(boolean readOnly) {
		setProperty(KEY_READ_ONLY,new Boolean(readOnly));
	}

	private void setProperty(String key, Object newValue)
	{
		Object storedValue = get(key);
		if (storedValue != null && storedValue.equals(newValue))
		{
			//no change - no event
		}
		else
		{
			put(key,newValue);
			fireEvent(key,newValue);
		}
	}
	private void fireEvent(String key, Object newValue) {
		
		try {
			Method m = ComponentPropertyChangListener.class.getMethod(key + "Changed", new Class[]{newValue.getClass()});
			
			for (Iterator iter = listeners.iterator(); iter.hasNext();) {
				ComponentPropertyChangListener listener = (ComponentPropertyChangListener) iter.next();
				m.setAccessible(true);
				m.invoke(listener,new Object[]{newValue});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addComponentPropertyChangListener(ComponentPropertyChangListener listener)
	{
		listeners.add(listener);
	}

	public void removeComponentPropertyChangListener(ComponentPropertyChangListener listener)
	{
		listeners.remove(listener);
	}

}
