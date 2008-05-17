/** 
 * CIM_FIFOPipeFile.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    michael.bauschert@de.ibm.com 
 * 
 * Description: FIFOPipeFile is a special type of LogicalFile that represents an interprocess FIFO (sometimes referred to as a "named pipe"). Operating systems use this convention to manage interprocess communication through processes reading and writing the FIFO. The FIFO can be accessed by unrelated processes, in contrast to the more well-known command line redirection mechanism (e.g. UNIX's 'ps -eaf | grep foo', also known as an "unnamed pipe"). An exemplary operating system implementation (using the FIFO concept) is the UNIX S_IFIFO file type.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_FIFOPipeFile extends CIM_LogicalFile {

    public final static String CIM_CLASS_NAME = "CIM_FIFOPipeFile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalFile.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   FIFOPipeFile is a special type of LogicalFile that represents an interprocess FIFO (sometimes referred to as a "named pipe"). Operating systems use this convention to manage interprocess communication through processes reading and writing the FIFO. The FIFO can be accessed by unrelated processes, in contrast to the more well-known command line redirection mechanism (e.g. UNIX's 'ps -eaf | grep foo', also known as an "unnamed pipe"). An exemplary operating system implementation (using the FIFO concept) is the UNIX S_IFIFO file type.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FIFOPipeFile(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   FIFOPipeFile is a special type of LogicalFile that represents an interprocess FIFO (sometimes referred to as a "named pipe"). Operating systems use this convention to manage interprocess communication through processes reading and writing the FIFO. The FIFO can be accessed by unrelated processes, in contrast to the more well-known command line redirection mechanism (e.g. UNIX's 'ps -eaf | grep foo', also known as an "unnamed pipe"). An exemplary operating system implementation (using the FIFO concept) is the UNIX S_IFIFO file type.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FIFOPipeFile(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected CIM_FIFOPipeFile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_FIFOPipeFile.CIM_CLASS_NAME;
    }

}