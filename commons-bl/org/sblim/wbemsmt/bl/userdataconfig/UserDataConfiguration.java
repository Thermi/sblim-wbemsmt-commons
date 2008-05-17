 /** 
  * UserDataConfiguration.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: TODO Add class description
  * 
  */
package org.sblim.wbemsmt.bl.userdataconfig;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.UserdataDocument;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.Version;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.EntryDocument.Entry;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.UserdataDocument.Userdata;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.Version.Enum;

public class UserDataConfiguration {

    /**
     * The current version
     */
    private static final Enum CURRENT_VERSION = Version.VERSION_1_0;
    
    /**
     * The xml file containing the userdata
     */
    File f;
    /**
     * The document containing the userdata
     */
    UserdataDocument document;

    static Logger logger = Logger.getLogger(UserDataConfiguration.class.getName());        
    
    /**
     * Loads the UserdataDocument, creates a new one if there was none or the version is outdated;
     * @param f
     * @return
     * @throws XmlException
     * @throws IOException
     * @throws WbemsmtException 
     */
    public static UserDataConfiguration load(File f) throws WbemsmtException
    {
        UserDataConfiguration configuration = new UserDataConfiguration();
        configuration.f = f;
        if (f.exists())
        {
            try {
                configuration.document = UserdataDocument.Factory.parse(f);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED, "UserData in File " + f.getAbsolutePath() + " cannot be loaded",e);                
            }
            Enum version = configuration.document.getUserdata().getVersion();
            if (!CURRENT_VERSION.equals(version))
            {
                configuration.document = null;
                throw new WbemsmtException(WbemsmtException.ERR_FAILED, "UserData in File " + f.getAbsolutePath() + " is outdated. Current Version: " + CURRENT_VERSION.toString() + " should be used to create a new File");
            }
        }
        
        if (configuration.document == null)
        {
            configuration.document = UserdataDocument.Factory.newInstance();
            Userdata userdata = configuration.document.addNewUserdata();
            userdata.setVersion(CURRENT_VERSION);
        }
        
        return configuration;
    }
    
    /**
     * Loads the UserdataDocument, creates a new one if there was none or the version is outdated;
     * @param f
     * @return
     * @throws XmlException
     * @throws IOException
     * @throws WbemsmtException 
     */
    public static UserDataConfiguration create(File f) throws WbemsmtException
    {
        UserDataConfiguration configuration = new UserDataConfiguration();
        configuration.f = f;
        if (!f.exists())
        {
            configuration.document = UserdataDocument.Factory.newInstance();
            Userdata userdata = configuration.document.addNewUserdata();
            userdata.setVersion(CURRENT_VERSION);
        }
        else
        {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED, "UserData in File " + f.getAbsolutePath() + " already exists");            
        }
        
        
        return configuration;
    }    
    
    /**
     * save the userdataconfig
     * @param pretty TODO
     * @throws WbemsmtException
     */
    public void save(boolean pretty) throws WbemsmtException
    {
        try {
            XmlOptions opts = new XmlOptions();
            if (pretty)
            {
                opts.setSavePrettyPrint();
                opts.setSavePrettyPrintIndent(4);
            }
            document.save(f,opts);
        }
        catch (IOException e) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED, "UserData in File " + f.getAbsolutePath() + " cannot be saved",e);
        }
    }

    /**
     * create the userdataconfig with the given filename in System.getProperty("user.home")
     * @param filename
     * @return
     * @throws WbemsmtException
     */
    public static UserDataConfiguration createInUserHome(String filename) throws WbemsmtException
    {
        File f = getFileInUserHome(filename);
        return create(f);
    }

    /**
     * load the userdataconfig with the given filename from System.getProperty("user.home")
     * @param filename
     * @return
     * @throws WbemsmtException
     */
    public static UserDataConfiguration loadFromUserHome(String filename) throws WbemsmtException
    {
        File f = getFileInUserHome(filename);
        return load(f);
    }

    /**
     * create a filehandle by using  System.getProperty("user.home") as directory and filename as name of the file
     * @param filename
     * @return
     */
    private static File getFileInUserHome(String filename) {
        return new File(System.getProperty("user.home") + "/" + filename);
    }

    /**
     * get the filename
     * @return
     */
    public String getFilename() {
        return f.getAbsolutePath();
    }

    /**
     * Get the document
     * @return
     */
    public UserdataDocument getDocument() {
        return document;
    }
    
    /**
     * add a new New Entry
     * @param userdata object to add the entry
     * @param key
     * @param value
     * @return
     */
    public Entry addEntry(Userdata userdata, String key, String value) {
        Entry entry = userdata.addNewEntry();
        entry.setKey(key);
        entry.setValue(value);
        return entry;
    }

    /**
     * add a new New Entry
     * @param entry object to add the entry
     * @param key
     * @param value
     * @return
     */
    public Entry addEntry(Entry entry, String key, String value) {
        entry = entry.addNewEntry();
        entry.setKey(key);
        entry.setValue(value);
        return entry;
        
    }

    public Entry findEntry(Entry parent, String key, String value) {
        Entry[] entryArray = parent.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(key) && (value == null || value.equals(entry.getValue())))
            {
                return entry;
            }
        }
        return null;
    }

    /**
     * find an entry
     * @param parent
     * @param key
     * @param value can be null
     * @return
     */
    public Entry findEntry(Userdata parent, String key, String value) {
        Entry[] entryArray = parent.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(key) && (value == null || value.equals(entry.getValue())))
            {
                return entry;
            }
        }
        return null;
    }
    
    public void deleteEntry(Entry parent, Entry entry) throws WbemsmtException {
        Entry[] entryArray = parent.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry2 = entryArray[i];
            if (entry2.valueEquals(entry))
            {
                parent.removeEntry(i);
                return;
            }
        }
        throw new WbemsmtException(WbemsmtException.ERR_FAILED, "Entry with key " + entry.getKey() + " and value " + entry.getValue() + " was not found ");
    }

    public void deleteEntry(Userdata userdata, Entry entry) throws WbemsmtException {
        Entry[] entryArray = userdata.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry2 = entryArray[i];
            if (entry2.valueEquals(entry))
            {
                userdata.removeEntry(i);
                return;
            }
        }
        throw new WbemsmtException(WbemsmtException.ERR_FAILED, "Entry with key " + entry.getKey() + " and value " + entry.getValue() + " was not found ");
    }
    

        
    
}

