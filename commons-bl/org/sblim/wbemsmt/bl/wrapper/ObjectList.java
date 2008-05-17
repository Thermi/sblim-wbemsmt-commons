 /** 
  * SambaObjectList.java
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
  * Description: Base class for objects representing a list of business objects
  * 
  */
package org.sblim.wbemsmt.bl.wrapper;

import java.util.*;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.WbemsmtBusinessObject;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.util.StringComparator;

public abstract class ObjectList {

	/**
	 * stores the users by CimObjectKey
	 */
	private Map objectsByCimObjectKey = new HashMap();
	/**
	 * stores the users by a given name
	 */
	private Map objectsByName = new HashMap();
	/**
	 * lazy loaded Array with all user names
	 */
	protected String[] nameArray;
	/**
	 * lazy loaded list with user objects
	 */
	private List list = new ArrayList();
	/**
	 * lazy loaded list with user fcos
	 */
	private List fcos = new ArrayList();
	
    protected static Logger logger = Logger.getLogger(ObjectList.class.getName());
	
	/**
	 * Set to true if reload from server is wanted (Flag can be queried by comsuming classes)
	 */
	protected boolean reloadFromServer = false;

	/**
	 * create the new ObjectList
	 */
	public ObjectList() {
		super();
	}

	/**
	 * Return the size of the list
	 * @return
	 * @throws WbemsmtException 
	 */
	public int size() throws WbemsmtException {
		return getList().size();
	}

	public boolean getHasItems() throws WbemsmtException {
		return size() > 0;
	}

	/**
	 * clear the list
	 *
	 */
	public void clear() throws WbemsmtException {
		objectsByCimObjectKey.clear();
	}

	/**
	 * returns a interator of the list
	 * @return
	 */
	public Iterator iterator() {
		return objectsByCimObjectKey.values().iterator();
	}

	/**
	 * Return a list with names to display for each item
	 * @return
	 * @throws WbemsmtException 
	 */
	public String[] getNameArray() throws WbemsmtException {
		if (nameArray == null) reloadListValues();
		return nameArray;
	}

	/**
	 * return the List of the FCOs of the items in the list 
	 * @return
	 * @throws WbemsmtException 
	 */
	public List getFCOs() throws WbemsmtException {
		if (fcos.size() == 0) reloadListValues();
		return fcos;
	}

	/**
	 * Get List with objects
	 * @return
	 * @throws WbemsmtException 
	 */
	public List getList() throws WbemsmtException {
		if (list.size() == 0) reloadListValues();
		return list;
	}

	/**
	 * Get the Objects byName
	 * @return
	 * @throws WbemsmtException 
	 */
	protected Map getObjectsByName() throws WbemsmtException {
		if (objectsByName.size() == 0) reloadListValues();
		return objectsByName;
	}

	/**
	 * reload the list values
	 * @throws WbemsmtException 
	 *
	 */
	public void reloadListValues() throws WbemsmtException {
		
		List names = new ArrayList();
		objectsByName.clear();
		for (Iterator iter = objectsByCimObjectKey.values().iterator(); iter.hasNext();) {
			Object o = iter.next();
			String key = getKey(o).toString();
			names.add(key);
			objectsByName.put(key,o);
		}
		Collections.sort(names,new StringComparator());
		nameArray = (String[]) names.toArray(new String[names.size()]);
		
		list.clear();
		fcos.clear();
		
		for (int i = 0; i < nameArray.length; i++) {
			String name = nameArray[i];
			Object o = objectsByName.get(name);
			list.add(o);
			fcos.add(getFco(o));
		}
	}
	
	/**
	 * Must return the value which used for adding the object to the internal HashMaps
	 * This key is also element of the nameArray
	 * 
	 * for example the sambaUsername of a SambaUser
	 * 
	 * @param value
	 * @return
	 */
	protected abstract Object getKey(Object value) throws WbemsmtException;
	
	/**
	 * Must return the fco belonging to this object
	 * 
	 * for example org.sblim.wbemsmt.samba.bl.wrapper.User.getUser()
	 * 
	 * @param value
	 * @return
	 */
	protected abstract Object getFco(Object value);

	/**
	 * returns true if reload from server was requested
	 * @return
	 */
	public boolean isReloadFromServer() {
		return reloadFromServer;
	}

	/**
	 * Set to true if reload from server is wanted (Flag can be queried by comsuming classes)
	 * @param reloadFromServer
	 */
	public void setReloadFromServer(boolean reloadFromServer) {
		this.reloadFromServer = reloadFromServer;
	}
	
	
	/**
	 * put a BusinessObject into the locale store by using the CimObjectKey of the businessObject as Key
	 * @param businessObject - if the method getCimObjectKey returns null the businessObject cannot be stored and the method returns a NullPointerException
	 * @throws WbemsmtException 
	 */
	protected void put(WbemsmtBusinessObject businessObject) throws WbemsmtException
	{
	    if (businessObject.getCimObjectKey() == null) 
	    {
	        throw new NullPointerException("getCimObjectKey of businessObject returned null");
	    }
		objectsByCimObjectKey.put(businessObject.getCimObjectKey(), businessObject);
		clearDependentObjects();
		
	}

	/**
	 * return a BusinessObject which corresponds to the given key
	 * @param businessObject
	 */
	protected WbemsmtBusinessObject get(CimObjectKey key)
	{
		return (WbemsmtBusinessObject) objectsByCimObjectKey.get(key);
	}

	/**
	 * remove a BusinessObject which corresponds to the given key
	 * @param businessObject
	 */
	protected WbemsmtBusinessObject remove(CimObjectKey key)
	{
		return (WbemsmtBusinessObject) objectsByCimObjectKey.remove(key);
	}

	/**
	 * remove a BusinessObject which corresponds to the given key of the object
	 * @param businessObject 
	 */
	protected WbemsmtBusinessObject remove(WbemsmtBusinessObject businessObject)
	{
		return remove(businessObject);
	}

	/**
	 * clear all dependent objects so that the lazy loading mechanism loads the objects again
	 *
	 */
	private void clearDependentObjects() {
		list.clear();
		fcos.clear();
		objectsByName.clear();
		nameArray = null;
	}	
	
}
