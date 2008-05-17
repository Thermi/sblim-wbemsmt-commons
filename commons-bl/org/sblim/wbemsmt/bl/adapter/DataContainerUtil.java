 /** 
  * DataContainerUtil.java
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
  * Description: UtilClass for DataContainers
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;


public class DataContainerUtil {

	private static Logger logger = Logger.getLogger(DataContainerUtil.class.getName());	

	public static DataContainer copyValues(DataContainer source, DataContainer target) throws WbemsmtException {
		target.copyFrom(source);
		return target;
	}
	
    public static void copyValues(LabeledBaseInputComponentIf source,
            LabeledBaseInputComponentIf target) {
        
        if (source.getClass() == target.getClass())
        {
            List classes = new ArrayList();
            classes.add(source.getClass());
            classes.addAll(ClassUtils.getAllInterfaces(source.getClass()));
            classes.addAll(ClassUtils.getAllSuperclasses(source.getClass()));
            
            for (Iterator iterator = classes.iterator(); iterator.hasNext();) {
                Class cls = (Class) iterator.next();
                if (!cls.getName().equals("java.lang.Object"))
                {
                    Field[] declaredFields = cls.getDeclaredFields();
                    for (int i = 0; i < declaredFields.length; i++) {
                        Field field = declaredFields[i];
                        if (isCopyEnabled(field))
                        {
                            try {
                                field.set(target, field.get(source));
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }                                
                        }
                    }
                }
            }
            
        }
        
        
    }
    
    /**
     * Checks if the field should be copied
     * @param field
     * @return true if it's okay to copy the field
     */

	private static boolean isCopyEnabled(Field field) {

	    String name = field.getName().toLowerCase();
	    String typename = field.getType().getName();
	    int modifiers = field.getModifiers();
        if (typename.indexOf("javax.faces") == -1
            && !name.equals("id")
            && !name.equals("converter")
            && !name.equals("parent")
            && !Modifier.isStatic(modifiers)
            && !Modifier.isFinal(modifiers)
        )
        {
            field.setAccessible(true);
            return true;
        }
        return false;
    }

    public static boolean validateEnteredValues(DataContainer container) {
		
		MessageList list = MessageList.init(container);
		
		int errors = 0;
		
		Method[] methods = container.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			method.setAccessible(true);
			if (method.getName().startsWith("get_") 
				&& LabeledBaseInputComponentIf.class.isAssignableFrom(method.getReturnType()))
			{
				try {
					LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) method.invoke(container, null);
					if (!field.getConverter().canConvert(field.getValue()))
					{
						if (errors == 0)
						{
							String msg = container.getAdapter().getBundle().getString(ErrCodes.MSG_CONVERSION_ERROR,"conversion.error");
							list.addMessage(new Message(ErrCodes.MSG_CONVERSION_ERROR,Message.ERROR, msg));
						}
						
						String msg = container.getAdapter().getBundle().getString(ErrCodes.MSG_CANNOT_CONVERT, "cannot.convert",new Object[]{field.getLabelText(),field.getConverter().getTypeForModel()});
						list.addMessage(new Message(ErrCodes.MSG_CANNOT_CONVERT,Message.ERROR, msg, field));
						errors++;
					}
				} catch (Exception e) {
					logger.log(Level.SEVERE, "Cannot check Field",e);
				}
			}
		}
		
		return errors == 0;
	}

	/**
	 * Check if some fields are marked as required. A field is only marked as required if the field has no error
	 * @param containers List with DataContainers
	 * @return true if a field within the containers or their childs is required
	 */
	public static boolean havingRequiredFields(List containers) {
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer container = (DataContainer) iter.next();
			boolean result = havingRequiredFields(container);
			if (result)
			{
				return true;
			}
		}
		return false;
	}

	public static boolean havingRequiredFields(DataContainer container) {
		List fields = container.getFields();
		for (Iterator iterator = fields.iterator(); iterator.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iterator.next();
			if (field.isRequired() && !field.hasErrors())
			{
				return true;
			}
		}
		List childContainers = container.getChildContainers();
		boolean result = havingRequiredFields(childContainers);
		return result;
	}	

	
	/**
	 * Check if some fields are required
	 * @param containers List with DataContainers
	 * @return true if a field within the containers or their childs is required
	 */
	public static boolean havingErrorFields(List containers) {
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer container = (DataContainer) iter.next();
			boolean result = havingErrorFields(container);
			if (result)
			{
				return true;
			}
		}
		return false;
	}

	public static boolean havingErrorFields(DataContainer container) {
		List fields = container.getFields();
		for (Iterator iterator = fields.iterator(); iterator.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iterator.next();
			if (field.hasErrors())
			{
				return true;
			}
		}
		List childContainers = container.getChildContainers();
		boolean result = havingErrorFields(childContainers);
		return result;
	}	
	
	public static boolean isModified(DataContainer container)
	{
		List fields = container.getFields();
		for (Iterator iter = fields.iterator(); iter.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iter.next();
			if (field.isModified())
			{
				return true;
			}
		}

		
		List childContainers = container.getChildContainers();
		for (Iterator iter = childContainers.iterator(); iter.hasNext();) {
			DataContainer child = (DataContainer) iter.next();
			if (child.isModified())
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean resetModifiedFlag(DataContainer container)
	{
		List fields = container.getFields();
		for (Iterator iter = fields.iterator(); iter.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iter.next();
			field.setModified(false);
		}

		
		List childContainers = container.getChildContainers();
		for (Iterator iter = childContainers.iterator(); iter.hasNext();) {
			DataContainer child = (DataContainer) iter.next();
			resetModifiedFlag(child);
		}
		return false;
	}

	
    /**
     * return all messages of all containers in that editBean
     * @return
     */
	public static MessageList getContainerMessages(List containers) {
		MessageList list = new MessageList();
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer container = (DataContainer) iter.next();
			list.addAll(container.getMessagesList());
		}
		return list;
	}

    /**
     * clear all messages of all containers in that editBean
     * @return
     */
	public static void clearContainerMessages(List containers) {
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer container = (DataContainer) iter.next();
			MessageList.init(container).clear();
		}
	}

	/**
	 * Gets the interface class of a dataContainer
	 * @param dataContainer
	 * @return
	 */
	public static Class getDataContainerInterface(DataContainer dataContainer) {
		Class[] interfaces = dataContainer.getClass().getInterfaces();
		Class interfaceClass = null;
		
		boolean found = false;
		
		for (int i = 0; i < interfaces.length; i++) {
			interfaceClass = interfaces[i];
			
			if (DataContainer.class.isAssignableFrom(interfaceClass))
			{
				found = true; 
				break;
			}
		}
		
		if (!found && interfaces.length > 1)
		{
			AbstractBaseCimAdapter.logger.warning("For the class " + dataContainer.getClass().getName() + " no Interface that ends with DataContainer was found");
		}
		
		return interfaceClass;
	}

	/**
	 * sets the visibility of the fields of the given Container
	 * @param container
	 * @param visible
	 */
	public static void setVisibilityOfFields(DataContainer container, boolean visible) {
		List fields = container.getFields();
		for (Iterator iter = fields.iterator(); iter.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iter.next();
			field.getProperties().setVisible(visible);
		}
	}


}
