package org.sblim.wbemsmt.bl.fco;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import javax.cim.CIMObjectPath;
import javax.cim.CIMProperty;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;

public interface FcoHelperIf {

	/**
	 * Delete a list of FCO instances or instances of CIMObject If
	 * @param c a list of FCO instances which can be converted to a CIMObjectIf by the CIM_ObjectCreatorIf of the helper class
	 * or instances of CIMObject If
	 * @param cimClient
	 * @throws WbemsmtException
	 */
	public abstract void delete(Collection c, WBEMClient cimClient)
			throws WbemsmtException;

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 */
	public abstract void delete(AbstractWbemsmtFco fco, WBEMClient cimClient)
			throws WbemsmtException;

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 */
	public abstract void delete(AbstractWbemsmtFco fco, WBEMClient cimClient,
			boolean testIfObjectRemovedAfterDeletion)
			throws WbemsmtException;

	/**
	 * Creates a new FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param namespace TODO
	 * @param keyProperties
	 * @param cimClient
	 */
	public abstract void delete(Class fcoClass, String namespace,
			CIMProperty[] keyProperties, WBEMClient cimClient) throws WbemsmtException;

	/**
	 * Creates a new FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param namespace TODO
	 * @param keyProperties
	 * @param cimClient
	 */
	public abstract void delete(Class fcoClass, String namespace,
	        CIMProperty[] keyProperties, WBEMClient cimClient, boolean testIfObjectRemovedAfterDeletion)
			throws WbemsmtException;

	/**
	 * creates objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws WbemsmtException
	 */

	public abstract Collection create(Collection c, WBEMClient cimClient)
			throws WbemsmtException;

	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws WbemsmtException
	 */

	public abstract AbstractWbemsmtFco create(AbstractWbemsmtFco fco, WBEMClient cimClient)
			throws WbemsmtException;

	/**
	 * create a FCO with the given Properties
	 * @param fcoClass
	 * @param cimClient
	 * @param namespace
	 * @param keyProperties
	 * @return
	 * @throws WbemsmtException
	 */
	public abstract AbstractWbemsmtFco create(Class fcoClass, WBEMClient cimClient, String namespace, Vector keyProperties) throws WbemsmtException;


	/**
	 * saves objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 */

	public abstract void save(Collection c, WBEMClient cimClient)
			throws WbemsmtException;

	/**
	 * saves objects, if it was modified
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 * @return the modified instance - or the not modified instance if an event listener stopped the processing
	 */

	public abstract AbstractWbemsmtFco save(AbstractWbemsmtFco o, WBEMClient cimClient)
			throws WbemsmtException;

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws WbemsmtException 
	 */
	public abstract AbstractWbemsmtFco reload(AbstractWbemsmtFco fcoToReload,
			WBEMClient cimClient) throws WbemsmtException;

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws WbemsmtException 
	 */
	public abstract AbstractWbemsmtFco reload(Class helperClass, CIMObjectPath path,
			WBEMClient cimClient) throws WbemsmtException;

	/**
	 * gets an instance
	 * @param namespace TODO
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws WbemsmtException 
	 */
	public abstract AbstractWbemsmtFco getInstance(Class helperClass, String namespace,
			Vector keys, WBEMClient cimClient) throws WbemsmtException;

	public abstract CIMObjectPath getPath(Class fcoClass, String namespace,
			String keyFieldName, Object keyFieldValue, WBEMClient cimClient)
			throws WbemsmtException;

	public abstract CIMObjectPath getPath(Class fcoClass,
			String namespace, String[] keyFieldNames, Object[] keyFieldValues, WBEMClient cimClient)
			throws WbemsmtException;

	public abstract CIMObjectPath getPath(List objectPathList,
			String keyFieldName, String keyFieldValue)
			throws WbemsmtException;

	public abstract CIMObjectPath getPath(List objectPathList,
			String[] keyFieldNames, Object[] keyFieldValues)
			throws WbemsmtException;

	public abstract void addFcoHelperListener(Class fcoClass,
			FcoHelperListener listener);

	public abstract void removeFcoHelperListener(Class fcoClass,
			FcoHelperListener listener);
	
	/**
	 * Set the notifyChanges flag of modifyInstance and createInstance
	 * Default is true
	 * @param notifyChanges
	 */
	public abstract void setNotifyChanges(boolean notifyChanges);

}