/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CollaborationInvitation
 */
@XStreamAlias("CollaborationInvitation")
public class CollaborationInvitation extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // SharedEntityId
    private String SharedEntityId;

    @JsonProperty("SharedEntityId")
    public String getSharedEntityId() {
        return this.SharedEntityId;
    }

    @JsonProperty("SharedEntityId")
    public void setSharedEntityId(String SharedEntityId) {
        this.SharedEntityId = SharedEntityId;
    }

    // InviterId
    private String InviterId;

    @JsonProperty("InviterId")
    public String getInviterId() {
        return this.InviterId;
    }

    @JsonProperty("InviterId")
    public void setInviterId(String InviterId) {
        this.InviterId = InviterId;
    }

    // InvitedUserEmail
    private String InvitedUserEmail;

    @JsonProperty("InvitedUserEmail")
    public String getInvitedUserEmail() {
        return this.InvitedUserEmail;
    }

    @JsonProperty("InvitedUserEmail")
    public void setInvitedUserEmail(String InvitedUserEmail) {
        this.InvitedUserEmail = InvitedUserEmail;
    }

    // InvitedUserEmailNormalized
    private String InvitedUserEmailNormalized;

    @JsonProperty("InvitedUserEmailNormalized")
    public String getInvitedUserEmailNormalized() {
        return this.InvitedUserEmailNormalized;
    }

    @JsonProperty("InvitedUserEmailNormalized")
    public void setInvitedUserEmailNormalized(String InvitedUserEmailNormalized) {
        this.InvitedUserEmailNormalized = InvitedUserEmailNormalized;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // OptionalMessage
    private String OptionalMessage;

    @JsonProperty("OptionalMessage")
    public String getOptionalMessage() {
        return this.OptionalMessage;
    }

    @JsonProperty("OptionalMessage")
    public void setOptionalMessage(String OptionalMessage) {
        this.OptionalMessage = OptionalMessage;
    }

}
