/**
 *  FacesMessageHandler.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.ErrorManager;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesMessageHandler extends ConsoleHandler
{
    FacesContext context;
    
    public FacesMessageHandler()
    {
        super();
    }
    
    public void publish(LogRecord record)
    {
        if (!isLoggable(record)) {
            return;
        }
        String msg;
        try {
            msg = getFormatter().format(record);
        } catch (Exception ex) {
            // We don't want to throw an exception here, but we
            // report the exception to any registered ErrorManager.
            reportError(null, ex, ErrorManager.FORMAT_FAILURE);
            return;
        }

        try {

            context = FacesContext.getCurrentInstance();
            if(context != null)
            {
                FacesMessage message = new FacesMessage();
                message.setSummary(msg);
                message.setDetail("  ");
                if (record.getLevel().equals(Level.WARNING) ||  record.getLevel().equals(Level.SEVERE))
                {
                	message.setSeverity(FacesMessage.SEVERITY_ERROR);
                }
                else
                {
                	message.setSeverity(FacesMessage.SEVERITY_INFO);
                }
                context.addMessage(null, message);
            }
            
            
            
        } catch (Exception ex) {
            // We don't want to throw an exception here, but we
            // report the exception to any registered ErrorManager.
            reportError(null, ex, ErrorManager.WRITE_FAILURE);
        }
    }

}
