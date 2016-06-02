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
 * Salesforce DTO for SObject PushTopic
 */
@XStreamAlias("PushTopic")
public class PushTopic extends AbstractSObjectBase {

    // Query
    private String Query;

    @JsonProperty("Query")
    public String getQuery() {
        return this.Query;
    }

    @JsonProperty("Query")
    public void setQuery(String Query) {
        this.Query = Query;
    }

    // ApiVersion
    private Double ApiVersion;

    @JsonProperty("ApiVersion")
    public Double getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(Double ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // NotifyForFields
    @XStreamConverter(PicklistEnumConverter.class)
    private NotifyForFieldsEnum NotifyForFields;

    @JsonProperty("NotifyForFields")
    public NotifyForFieldsEnum getNotifyForFields() {
        return this.NotifyForFields;
    }

    @JsonProperty("NotifyForFields")
    public void setNotifyForFields(NotifyForFieldsEnum NotifyForFields) {
        this.NotifyForFields = NotifyForFields;
    }

    // NotifyForOperations
    @XStreamConverter(PicklistEnumConverter.class)
    private NotifyForOperationsEnum NotifyForOperations;

    @JsonProperty("NotifyForOperations")
    public NotifyForOperationsEnum getNotifyForOperations() {
        return this.NotifyForOperations;
    }

    @JsonProperty("NotifyForOperations")
    public void setNotifyForOperations(NotifyForOperationsEnum NotifyForOperations) {
        this.NotifyForOperations = NotifyForOperations;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // NotifyForOperationCreate
    private Boolean NotifyForOperationCreate;

    @JsonProperty("NotifyForOperationCreate")
    public Boolean getNotifyForOperationCreate() {
        return this.NotifyForOperationCreate;
    }

    @JsonProperty("NotifyForOperationCreate")
    public void setNotifyForOperationCreate(Boolean NotifyForOperationCreate) {
        this.NotifyForOperationCreate = NotifyForOperationCreate;
    }

    // NotifyForOperationUpdate
    private Boolean NotifyForOperationUpdate;

    @JsonProperty("NotifyForOperationUpdate")
    public Boolean getNotifyForOperationUpdate() {
        return this.NotifyForOperationUpdate;
    }

    @JsonProperty("NotifyForOperationUpdate")
    public void setNotifyForOperationUpdate(Boolean NotifyForOperationUpdate) {
        this.NotifyForOperationUpdate = NotifyForOperationUpdate;
    }

    // NotifyForOperationDelete
    private Boolean NotifyForOperationDelete;

    @JsonProperty("NotifyForOperationDelete")
    public Boolean getNotifyForOperationDelete() {
        return this.NotifyForOperationDelete;
    }

    @JsonProperty("NotifyForOperationDelete")
    public void setNotifyForOperationDelete(Boolean NotifyForOperationDelete) {
        this.NotifyForOperationDelete = NotifyForOperationDelete;
    }

    // NotifyForOperationUndelete
    private Boolean NotifyForOperationUndelete;

    @JsonProperty("NotifyForOperationUndelete")
    public Boolean getNotifyForOperationUndelete() {
        return this.NotifyForOperationUndelete;
    }

    @JsonProperty("NotifyForOperationUndelete")
    public void setNotifyForOperationUndelete(Boolean NotifyForOperationUndelete) {
        this.NotifyForOperationUndelete = NotifyForOperationUndelete;
    }

}
