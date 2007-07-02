/** 
 * WbemsmtCIMClient.java
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
 * Description: Wrapper for a CimClient to set the Namespace before executing actions on the CIMOM
 * 
 */
package org.sblim.wbemsmt.cim;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
import org.sblim.wbem.cim.CIMClass;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMNameSpace;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMQualifierType;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.client.BatchHandle;
import org.sblim.wbem.client.BatchResult;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.PasswordCredential;
import org.sblim.wbem.client.UserPrincipal;
import org.sblim.wbem.client.indications.CIMListener;
import org.sblim.wbem.util.SessionProperties;

public class WbemsmtCIMClientWrapper extends CIMClient {

	private CIMClient cimClient;

	private String namespace;

	private String oldNamespace;

	/**
	 * @param arg0
	 * @throws CIMException
	 */
	public WbemsmtCIMClientWrapper(CIMClient cimClient, String namespace)
			throws CIMException {
		super(new CIMNameSpace("127.0.0.1", "/root/cimv2"), new UserPrincipal(
				"anonymous"), new PasswordCredential("".toCharArray()));
		this.cimClient = cimClient;
		this.namespace = namespace;
	}

	public synchronized void addCIMListener(CIMListener arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.addCIMListener(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration associatorNames(CIMObjectPath arg0,
			String arg1, String arg2, String arg3, String arg4)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.associatorNames(arg0, arg1, arg2, arg3, arg4);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration associatorNames(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.associatorNames(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration associators(CIMObjectPath arg0,
			String arg1, String arg2, String arg3, String arg4, boolean arg5,
			boolean arg6, String[] arg7) throws CIMException {
		try {
			setNamespace();
			return cimClient.associators(arg0, arg1, arg2, arg3, arg4, arg5,
					arg6, arg7);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void close() throws CIMException {
		try {
			setNamespace();
			cimClient.close();
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void close(boolean arg0) throws CIMException {
		try {
			setNamespace();
			cimClient.close(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void createClass(CIMObjectPath arg0, CIMClass arg1)
			throws CIMException {
		try {
			setNamespace();
			cimClient.createClass(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMObjectPath createInstance(CIMObjectPath arg0,
			CIMInstance arg1) throws CIMException {
		try {
			setNamespace();
			return cimClient.createInstance(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void createNameSpace(CIMNameSpace arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.createNameSpace(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void createQualifierType(CIMObjectPath arg0,
			CIMQualifierType arg1) throws CIMException {
		try {
			setNamespace();
			cimClient.createQualifierType(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void deleteClass(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.deleteClass(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void deleteInstance(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.deleteInstance(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void deleteNameSpace(CIMNameSpace arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.deleteNameSpace(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void deleteQualifierType(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.deleteQualifierType(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumClass(CIMObjectPath arg0, boolean arg1,
			boolean arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumClass(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumClass(CIMObjectPath arg0, boolean arg1)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumClass(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumClass(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumClass(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClasses() throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClasses();
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClasses(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3, boolean arg4)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClasses(arg0, arg1, arg2, arg3, arg4);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClasses(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClasses(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClasses(CIMObjectPath arg0,
			boolean arg1, boolean arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClasses(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClasses(CIMObjectPath arg0,
			boolean arg1) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClasses(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClasses(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClasses(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClassNames() throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClassNames();
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClassNames(CIMObjectPath arg0,
			boolean arg1) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClassNames(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateClassNames(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateClassNames(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstanceNames(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstanceNames(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstances(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3, boolean arg4,
			String[] arg5) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstances(arg0, arg1, arg2, arg3, arg4,
					arg5);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstances(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3, boolean arg4)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstances(arg0, arg1, arg2, arg3, arg4);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstances(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstances(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstances(CIMObjectPath arg0,
			boolean arg1, boolean arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstances(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstances(CIMObjectPath arg0,
			boolean arg1) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstances(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumerateInstances(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumerateInstances(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumInstances(CIMObjectPath arg0,
			boolean arg1, boolean arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumInstances(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumInstances(CIMObjectPath arg0,
			boolean arg1) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumInstances(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumNameSpace(CIMObjectPath arg0,
			boolean arg1) throws CIMException {
		try {
			setNamespace();
			return cimClient.enumNameSpace(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration enumQualifierTypes(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.enumQualifierTypes(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration execQuery(CIMObjectPath arg0, String arg1,
			String arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.execQuery(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMClass getClass(CIMObjectPath arg0, boolean arg1,
			boolean arg2, boolean arg3, String[] arg4) throws CIMException {
		try {
			setNamespace();
			return cimClient.getClass(arg0, arg1, arg2, arg3, arg4);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMClass getClass(CIMObjectPath arg0, boolean arg1,
			boolean arg2, boolean arg3) throws CIMException {
		try {
			setNamespace();
			return cimClient.getClass(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMClass getClass(CIMObjectPath arg0, boolean arg1,
			boolean arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.getClass(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMClass getClass(CIMObjectPath arg0, boolean arg1)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getClass(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMClass getClass(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getClass(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getIndicationHandler(CIMListener arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getIndicationHandler(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getIndicationListener(CIMListener arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getIndicationListener(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getInstance(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3, String[] arg4)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getInstance(arg0, arg1, arg2, arg3, arg4);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getInstance(CIMObjectPath arg0,
			boolean arg1, boolean arg2, boolean arg3) throws CIMException {
		try {
			setNamespace();
			return cimClient.getInstance(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getInstance(CIMObjectPath arg0,
			boolean arg1, boolean arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.getInstance(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getInstance(CIMObjectPath arg0, boolean arg1)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getInstance(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMInstance getInstance(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getInstance(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Locale getLocale() {
		try {
			setNamespace();
			return cimClient.getLocale();
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMNameSpace getNameSpace() {
		try {
			setNamespace();
			return cimClient.getNameSpace();
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMValue getProperty(CIMObjectPath arg0, String arg1)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getProperty(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMQualifierType getQualifierType(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.getQualifierType(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized SessionProperties getSessionProperties() {
		try {
			setNamespace();
			return cimClient.getSessionProperties();
		} finally {
			restoreNamespace();
		}
	}

	/**
	 * @deprecated
	 */
	public synchronized CIMValue invokeMethod(CIMObjectPath arg0, String arg1,
			CIMArgument[] arg2, CIMArgument[] arg3) throws CIMException {
		try {
			setNamespace();
			return cimClient.invokeMethod(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized CIMValue invokeMethod(CIMObjectPath arg0, String arg1,
			Vector arg2, Vector arg3) throws CIMException {
		try {
			setNamespace();
			return cimClient.invokeMethod(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized BatchResult performBatchOperations(BatchHandle arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.performBatchOperations(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration referenceNames(CIMObjectPath arg0,
			String arg1, String arg2) throws CIMException {
		try {
			setNamespace();
			return cimClient.referenceNames(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration referenceNames(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.referenceNames(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration references(CIMObjectPath arg0, String arg1,
			String arg2, boolean arg3, boolean arg4, String[] arg5)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.references(arg0, arg1, arg2, arg3, arg4, arg5);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized Enumeration references(CIMObjectPath arg0)
			throws CIMException {
		try {
			setNamespace();
			return cimClient.references(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void removeCIMListener(CIMListener arg0)
			throws CIMException {
		try {
			setNamespace();
			cimClient.removeCIMListener(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setClass(CIMObjectPath arg0, CIMClass arg1)
			throws CIMException {
		try {
			setNamespace();
			cimClient.setClass(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setInstance(CIMObjectPath arg0, CIMInstance arg1,
			boolean arg2, String[] arg3) throws CIMException {
		try {
			setNamespace();
			cimClient.setInstance(arg0, arg1, arg2, arg3);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setInstance(CIMObjectPath arg0, CIMInstance arg1)
			throws CIMException {
		try {
			setNamespace();
			cimClient.setInstance(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setLocale(Locale arg0) {
		try {
			setNamespace();
			cimClient.setLocale(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setProperty(CIMObjectPath arg0, String arg1,
			CIMValue arg2) throws CIMException {
		try {
			setNamespace();
			cimClient.setProperty(arg0, arg1, arg2);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setProperty(CIMObjectPath arg0, String arg1)
			throws CIMException {
		try {
			setNamespace();
			cimClient.setProperty(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setQualifierType(CIMObjectPath arg0,
			CIMQualifierType arg1) throws CIMException {
		try {
			setNamespace();
			cimClient.setQualifierType(arg0, arg1);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void setSessionProperties(SessionProperties arg0) {
		try {
			setNamespace();
			cimClient.setSessionProperties(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void useHttp11(boolean arg0) {
		try {
			setNamespace();
			cimClient.useHttp11(arg0);
		} finally {
			restoreNamespace();
		}
	}

	public synchronized void useMPost(boolean arg0) {
		try {
			setNamespace();
			cimClient.useMPost(arg0);
		} finally {
			restoreNamespace();
		}
	}

	private void setNamespace() {
		oldNamespace = cimClient.getNameSpace().getNameSpace();
		cimClient.getNameSpace().setNameSpace(namespace);
	}

	private void restoreNamespace() {
		cimClient.getNameSpace().setNameSpace(oldNamespace);
	}

}
