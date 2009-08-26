/** 
 * MessageHandlerBean.java
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
 * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 * 
 * Description: Own Implementation for showing the faces messages via a DataTable
 * 
 */
package org.sblim.wbemsmt.webapp.jsf;

import java.util.*;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.sblim.wbemsmt.bl.adapter.AsynchronousMessageHandler;
import org.sblim.wbemsmt.bl.cleanup.Cleanup;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.tools.jsf.WbemsmtFacesMessage;
import org.sblim.wbemsmt.tools.jsf.WbesmtFacesSeverity;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.webapp.jsf.style.StyleBean;

public class MessageHandlerBean extends WbemsmtWebAppBean implements Cleanup, AsynchronousMessageHandler {
    
    static Logger logger = Logger.getLogger(MessageHandlerBean.class.getName());

    private List<FacesMessage> successMessages = new ArrayList<FacesMessage>();
    private List<FacesMessage> infoMessages = new ArrayList<FacesMessage>();
    private List<FacesMessage> warningMessages = new ArrayList<FacesMessage>();
    private List<FacesMessage> errorMessages = new ArrayList<FacesMessage>();
    private Set<String> messageSummaries = new HashSet<String>();

    private boolean infos, errors,warnings,success = false;
    
    private String asyncMessageUpdateInterval = "10.0";
    
    private StyleBean style;

    private List<FacesMessage> directlyAddedMessages = new ArrayList<FacesMessage>();
    private List<Message> asynchronousMessages = new ArrayList<Message>();
    private Message newMessages = null; 
    
    
    public MessageHandlerBean() {
        super();
    }
    
    public List<FacesMessage> getErrorMessages() {
        return errorMessages;
    }
    public void setErrorMessages(List<FacesMessage> errorMessages) {
        this.errorMessages = errorMessages;
    }
    public List<FacesMessage> getInfoMessages() {
        return infoMessages;
    }
    public void setInfoMessages(List<FacesMessage> infoMessages) {
        this.infoMessages = infoMessages;
    }
    public List<FacesMessage> getSuccessMessages() {
        return successMessages;
    }
    public void setSuccessMessages(List<FacesMessage> successMessages) {
        this.successMessages = successMessages;
    }
    public List<FacesMessage> getWarningMessages() {
        return warningMessages;
    }
    public void setWarningMessages(List<FacesMessage> warningMessages) {
        this.warningMessages = warningMessages;
    }
    
    public void updateMessages() {
        successMessages.clear();
        infoMessages.clear();
        warningMessages.clear();
        errorMessages.clear();
        messageSummaries.clear();
        addMessages();
    }

    public void addMessages() {
        
        addMessages(directlyAddedMessages.iterator());
        addMessages(FacesContext.getCurrentInstance().getMessages());

        Collections.sort(successMessages, new FacesMessagesComparator());
        Collections.sort(infoMessages, new FacesMessagesComparator());
        Collections.sort(warningMessages, new FacesMessagesComparator());
        Collections.sort(errorMessages, new FacesMessagesComparator());
        
        success = successMessages.size() > 0;
        infos = infoMessages.size() > 0;
        warnings = warningMessages.size() > 0;
        errors = errorMessages.size() > 0;
        
        directlyAddedMessages.clear();
    }

    public String getUpdateMessages()
    {
        updateMessages();
        return "";
    }
    
    private void addMessages(Iterator<FacesMessage> iterator) {
        while (iterator.hasNext()) {
            FacesMessage msg = (FacesMessage) iterator.next();
            
            WbemsmtFacesMessage wbemsmtFacesMessage = null;
            if (msg instanceof WbemsmtFacesMessage) {
                wbemsmtFacesMessage = (WbemsmtFacesMessage) msg;
            }
            else
            {
                logger.severe(msg.getSummary());
                logger.severe(msg.getDetail());
                wbemsmtFacesMessage = new WbemsmtFacesMessage(Message.create(ErrCodes.MSGDEF_OTHER_EXCEPTION, bundle));
            }
            
            if (wbemsmtFacesMessage.getMessage() != null)
            {
                String txt = wbemsmtFacesMessage.getMessage().getMessage();
                txt = txt.replaceAll("\\n", "<br>");
                txt = txt.replaceAll("\\r", "");
                wbemsmtFacesMessage.getMessage().setMsg(txt);
            }
            
            if (!messageSummaries.contains(msg.getSummary())) {
                
                WbesmtFacesSeverity severity = new WbesmtFacesSeverity(msg);
                if (Message.isSuccess(severity.getSeverity()))
                {
                    successMessages.add(wbemsmtFacesMessage);   
                    messageSummaries.add(msg.getSummary());
                }
                else if (Message.isInfo(severity.getSeverity()))
                {
                    infoMessages.add(wbemsmtFacesMessage);  
                    messageSummaries.add(msg.getSummary());
                }
                else if (Message.isWarning(severity.getSeverity()))
                {
                    warningMessages.add(wbemsmtFacesMessage);   
                    messageSummaries.add(msg.getSummary());
                }
                else if (Message.isError(severity.getSeverity()))
                {
                    errorMessages.add(wbemsmtFacesMessage); 
                    messageSummaries.add(msg.getSummary());
                } else
                {
                    logger.severe(msg.getSummary() + " is from a not recognized type: " + severity.getSeverity());
                }
            }
        }
    }

    public void cleanup() {
        successMessages.clear();
        infoMessages.clear();
        warningMessages.clear();
        errorMessages.clear();
        directlyAddedMessages.clear();
    }

    public StyleBean getStyle() {
        return style;
    }

    public void setStyle(StyleBean style) {
        this.style = style;
    }

    public boolean isErrors() {
        return errors;
    }

    public boolean isInfos() {
        return infos;
    }

    public boolean isSuccess() {
        return success;
    }

    public boolean isWarnings() {
        return warnings;
    }
    
    public boolean isHavingMessages()
    {
        return warnings || success || infos || errors;
    }

    public void addMessage(WbemsmtFacesMessage msg)
    {
        directlyAddedMessages .add(msg);
    }
    
    public boolean isAsynchronousMessages() {
        return asynchronousMessages.size() > 0;
    }
    
    public void showAsynchronousMessages(ActionEvent event)
    {
        for (Iterator<Message> iterator = asynchronousMessages.iterator(); iterator.hasNext();) {
            Message message = (Message) iterator.next();
            directlyAddedMessages.add(new WbemsmtFacesMessage(message));
        }
        asynchronousMessages.clear();
    }

    public void addAsynchronousMessage(Message message, Object context) {
       asynchronousMessages.add(message);
    }

    public String getNewMessagesText()
    {
        Integer count = new Integer(asynchronousMessages.size());
        return ResourceBundleManager.getCommonResourceBundle().getString(ErrCodes.MSGDEF_NEW_MESSAGES.getResourceBundleKey(), new Object[]{count});
    }

    public String getNewMessagesCode()
    {
        if (newMessages == null)
        {
            newMessages = Message.create(ErrCodes.MSGDEF_NEW_MESSAGES, ResourceBundleManager.getCommonResourceBundle());
        }
        return newMessages.getMessageCode(); 
    }

    public String getAsynchronousMessageUpdateInterval() {
        return asyncMessageUpdateInterval;
    }

    public void setAsynchronousMessageUpdateInterval(String asyncMessageUpdateInterval) {
        this.asyncMessageUpdateInterval = asyncMessageUpdateInterval;
    }
    
    
}
