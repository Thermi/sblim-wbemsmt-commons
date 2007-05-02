 /** 
  * FcoHelper.java
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
  * Description: Helper class to handle actions on FCOs
  * 
  */
package org.sblim.wbemsmt.schema.cim29.tools;

import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectCreatorIf;
import org.sblim.wbemsmt.bl.fco.FcoHelperIf;
import org.sblim.wbemsmt.bl.fco.FcoHelperListener;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.WbemSmtException;

public class FcoHelper implements FcoHelperIf
{
	
	static Logger logger = Logger.getLogger(FcoHelper.class.getName());
	private org.sblim.wbemsmt.bl.fco.FcoHelper helper; 
	
	public FcoHelper()
	{
		helper = new org.sblim.wbemsmt.bl.fco.FcoHelper(new CIM_ObjectCreator());
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#delete(java.util.Collection, org.sblim.wbem.client.CIMClient)
	 */
	public  void delete(Collection c, CIMClient cimClient) throws ObjectDeletionException
	{
		helper.delete(c, cimClient);
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#delete(java.lang.Object, org.sblim.wbem.client.CIMClient)
	 */
	public  void delete(Object fco, CIMClient cimClient) throws ObjectDeletionException 
	{
		helper.delete(fco,cimClient);
	}
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#delete(java.lang.Object, org.sblim.wbem.client.CIMClient, boolean)
	 */
	public  void delete(Object fco, CIMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws ObjectDeletionException 
	{
		helper.delete(fco,cimClient,testIfObjectRemovedAfterDeletion);	
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#delete(java.lang.Class, java.util.Vector, org.sblim.wbem.client.CIMClient)
	 */
	public  void delete(Class fcoClass, Vector keyProperties, CIMClient cimClient) throws ObjectDeletionException  {
		helper.delete(fcoClass, keyProperties, cimClient);
	}	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#delete(java.lang.Class, java.util.Vector, org.sblim.wbem.client.CIMClient, boolean)
	 */
	public  void delete(Class fcoClass, Vector keyProperties, CIMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws ObjectDeletionException  {
		helper.delete(fcoClass, keyProperties,cimClient,testIfObjectRemovedAfterDeletion);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#create(java.util.Collection, org.sblim.wbem.client.CIMClient)
	 */

	public  Collection create(Collection c, CIMClient cimClient) throws ObjectCreationException 
	{
		return helper.create(c,cimClient);
	}
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#create(java.lang.Object, org.sblim.wbem.client.CIMClient)
	 */

	public  Object create(Object fco, CIMClient cimClient) throws ObjectCreationException 
	{
		return helper.create(fco,cimClient);
		
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#create(java.lang.Object, org.sblim.wbem.client.CIMClient, boolean)
	 */

	public  Object create(Object fco, CIMClient cimClient, boolean testIfObjectExists) throws ObjectCreationException 
	{
		return helper.create(fco,cimClient,testIfObjectExists);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#create(java.lang.Class, org.sblim.wbem.client.CIMClient, java.util.Vector)
	 */
	public  Object create(Class fcoClass, CIMClient cimClient, Vector keyProperties) throws ObjectCreationException {
		return helper.create(fcoClass,cimClient,keyProperties,true);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#create(java.lang.Class, org.sblim.wbem.client.CIMClient, java.util.Vector, boolean)
	 */
	public  Object create(Class fcoClass, CIMClient cimClient, Vector keyProperties, boolean b) throws ObjectCreationException {
		return helper.create(fcoClass,cimClient,keyProperties,b);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#save(java.util.Collection, org.sblim.wbem.client.CIMClient)
	 */

	public  void save(Collection c, CIMClient cimClient) throws ObjectSaveException 
	{
		helper.save(c, cimClient);
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#save(java.lang.Object, org.sblim.wbem.client.CIMClient)
	 */

	public  Object save(Object o, CIMClient cimClient) throws ObjectSaveException 
	{
		return helper.save(o, cimClient);
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#reload(org.sblim.wbemsmt.schema.cim_2_14.CIM_ManagedElement, org.sblim.wbem.client.CIMClient)
	 */
	public  Object reload(Object fcoToReload, CIMClient cimClient) throws ModelLoadException {
		
		try {
			return helper.reload(CIM_Object.create(fcoToReload), cimClient);
		} catch (WbemSmtException e) {
			throw new ModelLoadException(e);
		}
		
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#reload(java.lang.Class, org.sblim.wbem.cim.CIMObjectPath, org.sblim.wbem.client.CIMClient)
	 */
	public  Object reload(Class helperClass, CIMObjectPath path, CIMClient cimClient) throws ModelLoadException {
		return helper.reload(helperClass, path, cimClient);
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#getInstance(java.lang.Class, java.util.Vector, org.sblim.wbem.client.CIMClient)
	 */
	public  Object getInstance(Class helperClass, Vector keys, CIMClient cimClient) throws ModelLoadException {
		return helper.getInstance(helperClass, keys, cimClient);
	}
	
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#getPath(java.lang.Class, java.lang.String, java.lang.Object, org.sblim.wbem.client.CIMClient)
	 */
	public  CIMObjectPath getPath(Class fcoClass, String keyFieldName, Object keyFieldValue, CIMClient cimClient) throws ObjectNotFoundException {
		return helper.getPath(fcoClass,new String[]{keyFieldName},new Object[]{keyFieldValue},cimClient);
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#getPath(java.lang.Class, java.lang.String[], java.lang.Object[], org.sblim.wbem.client.CIMClient)
	 */
	public  CIMObjectPath getPath(Class fcoClass, String[] keyFieldNames, Object[] keyFieldValues, CIMClient cimClient) throws ObjectNotFoundException {

		return helper.getPath(fcoClass, keyFieldNames, keyFieldValues,cimClient);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#getPath(java.util.List, java.lang.String, java.lang.String)
	 */
	public  CIMObjectPath getPath(List objectPathList, String keyFieldName, String keyFieldValue) throws ObjectNotFoundException {
		return helper.getPath(objectPathList, keyFieldName, keyFieldValue);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#getPath(java.util.List, java.lang.String[], java.lang.Object[])
	 */
	public  CIMObjectPath getPath(List objectPathList, String[] keyFieldNames, Object[] keyFieldValues) throws ObjectNotFoundException {
		return helper.getPath(objectPathList, keyFieldNames, keyFieldValues);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#addFcoHelperListener(java.lang.Class, org.sblim.wbemsmt.bl.fco.FcoHelperListener)
	 */
	public  void addFcoHelperListener(Class fcoClass, FcoHelperListener listener)
	{
		helper.addFcoHelperListener(fcoClass, listener);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.schema.cim_2_14.tools.FcoHelperIf#removeFcoHelperListener(java.lang.Class, org.sblim.wbemsmt.bl.fco.FcoHelperListener)
	 */
	public  void removeFcoHelperListener(Class fcoClass, FcoHelperListener listener)
	{
		helper.removeFcoHelperListener(fcoClass, listener);
	}
	
	public CIM_ObjectCreatorIf getCIM_ObjectCreator() {
		return helper.getCIM_ObjectCreator();
	}
	

}
