 /** 
  * WBEMClientWrapper.java
  *
  * © Copyright IBM Corp.  2009,2008
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
  * Description: Wrapper for a javax.wbem.client.WBEMClient to enable Wbem-smt to ask for configuration data like protocol or hostname
  * 
  */
package org.sblim.wbemsmt.cim;

import java.util.Locale;

import javax.cim.*;
import javax.security.auth.Subject;
import javax.wbem.CloseableIterator;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

public class WBEMClientWrapper implements WBEMClient {

    private final WBEMClient client;
    
    private String port,protocol,hostname,user;

    private String hostInfo;

    public WBEMClientWrapper(WBEMClient client)
    {
        this.client = client;
    }

    public CloseableIterator associatorNames(CIMObjectPath objectName, String associationClass,
            String resultClass, String role, String resultRole) throws WBEMException {
        return client.associatorNames(objectName, associationClass, resultClass, role, resultRole);
    }

    public CloseableIterator associators(CIMObjectPath objectName, String associationClass,
            String resultClass, String role, String resultRole, boolean includeQualifiers,
            boolean includeClassOrigin, String[] propertyList) throws WBEMException {
        return client.associators(objectName, associationClass, resultClass, role, resultRole,
                includeQualifiers, includeClassOrigin, propertyList);
    }

    public void close() {
        client.close();
    }

    public void createClass(CIMClass class1) throws WBEMException {
        client.createClass(class1);
    }

    public CIMObjectPath createInstance(CIMInstance instance) throws WBEMException {
        return client.createInstance(instance);
    }

    public void deleteClass(CIMObjectPath path) throws WBEMException {
        client.deleteClass(path);
    }

    public void deleteInstance(CIMObjectPath path) throws WBEMException {
        client.deleteInstance(path);
    }

    public void deleteQualifierType(CIMObjectPath path) throws WBEMException {
        client.deleteQualifierType(path);
    }

    public CloseableIterator enumerateClasses(CIMObjectPath path, boolean deep, boolean propagated,
            boolean includeQualifiers, boolean includeClassOrigin) throws WBEMException {
        return client.enumerateClasses(path, deep, propagated, includeQualifiers,
                includeClassOrigin);
    }

    public CloseableIterator enumerateClassNames(CIMObjectPath path, boolean deep)
            throws WBEMException {
        return client.enumerateClassNames(path, deep);
    }

    public CloseableIterator enumerateInstanceNames(CIMObjectPath path) throws WBEMException {
        return client.enumerateInstanceNames(path);
    }

    public CloseableIterator enumerateInstances(CIMObjectPath path, boolean deep,
            boolean propagated, boolean includeClassOrigin, String[] propertyList)
            throws WBEMException {
        return client.enumerateInstances(path, deep, propagated, includeClassOrigin, propertyList);
    }

    public CloseableIterator enumerateQualifierTypes(CIMObjectPath path) throws WBEMException {
        return client.enumerateQualifierTypes(path);
    }

    public CloseableIterator execQuery(CIMObjectPath path, String query, String queryLanguage)
            throws WBEMException {
        return client.execQuery(path, query, queryLanguage);
    }

    public CIMClass getClass(CIMObjectPath name, boolean propagated, boolean includeQualifiers,
            boolean includeClassOrigin, String[] propertyList) throws WBEMException {
        return client.getClass(name, propagated, includeQualifiers, includeClassOrigin,
                propertyList);
    }

    public CIMInstance getInstance(CIMObjectPath name, boolean propagated,
            boolean includeClassOrigin, String[] propertyList) throws WBEMException {
        return client.getInstance(name, propagated, includeClassOrigin, propertyList);
    }

    public String getProperty(String key) {
        return client.getProperty(key);
    }

    public CIMQualifierType getQualifierType(CIMObjectPath name) throws WBEMException {
        return client.getQualifierType(name);
    }

    public void initialize(CIMObjectPath name, Subject subject, Locale[] locales)
            throws IllegalArgumentException, WBEMException {
        client.initialize(name, subject, locales);
    }

    public Object invokeMethod(CIMObjectPath name, String methodName, CIMArgument[] inputArguments,
            CIMArgument[] outputArguments) throws WBEMException {
        return client.invokeMethod(name, methodName, inputArguments, outputArguments);
    }

    public void modifyClass(CIMClass class1) throws WBEMException {
        client.modifyClass(class1);
    }

    public void modifyInstance(CIMInstance ci, String[] propertyList) throws WBEMException {
        client.modifyInstance(ci, propertyList);
    }

    public CloseableIterator referenceNames(CIMObjectPath objectName, String resultClass,
            String role) throws WBEMException {
        return client.referenceNames(objectName, resultClass, role);
    }

    public CloseableIterator references(CIMObjectPath objectName, String resultClass, String role,
            boolean includeQualifiers, boolean includeClassOrigin, String[] propertyList)
            throws WBEMException {
        return client.references(objectName, resultClass, role, includeQualifiers,
                includeClassOrigin, propertyList);
    }

    public void setLocales(Locale[] locales) throws UnsupportedOperationException {
        client.setLocales(locales);
    }

    public void setProperty(String key, String value) {
        client.setProperty(key, value);
    }

    public void setQualifierType(CIMQualifierType qualifierType) throws WBEMException {
        client.setQualifierType(qualifierType);
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
        updateHostInfo();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
        updateHostInfo();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
        updateHostInfo();
    }

    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
        updateHostInfo();
    }
    
    private void updateHostInfo() {
        hostInfo = user +"@" + protocol + "://" + hostname + ":" + port;
    }

    public String getHostInfo() {
        return hostInfo;
    }

    
    

}
