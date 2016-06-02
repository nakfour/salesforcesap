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
 * Salesforce DTO for SObject ProcessInstanceNode
 */
@XStreamAlias("ProcessInstanceNode")
public class ProcessInstanceNode extends AbstractSObjectBase {

    // ProcessInstanceId
    private String ProcessInstanceId;

    @JsonProperty("ProcessInstanceId")
    public String getProcessInstanceId() {
        return this.ProcessInstanceId;
    }

    @JsonProperty("ProcessInstanceId")
    public void setProcessInstanceId(String ProcessInstanceId) {
        this.ProcessInstanceId = ProcessInstanceId;
    }

    // ProcessNodeId
    private String ProcessNodeId;

    @JsonProperty("ProcessNodeId")
    public String getProcessNodeId() {
        return this.ProcessNodeId;
    }

    @JsonProperty("ProcessNodeId")
    public void setProcessNodeId(String ProcessNodeId) {
        this.ProcessNodeId = ProcessNodeId;
    }

    // NodeStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private NodeStatusEnum NodeStatus;

    @JsonProperty("NodeStatus")
    public NodeStatusEnum getNodeStatus() {
        return this.NodeStatus;
    }

    @JsonProperty("NodeStatus")
    public void setNodeStatus(NodeStatusEnum NodeStatus) {
        this.NodeStatus = NodeStatus;
    }

    // CompletedDate
    private org.joda.time.DateTime CompletedDate;

    @JsonProperty("CompletedDate")
    public org.joda.time.DateTime getCompletedDate() {
        return this.CompletedDate;
    }

    @JsonProperty("CompletedDate")
    public void setCompletedDate(org.joda.time.DateTime CompletedDate) {
        this.CompletedDate = CompletedDate;
    }

    // LastActorId
    private String LastActorId;

    @JsonProperty("LastActorId")
    public String getLastActorId() {
        return this.LastActorId;
    }

    @JsonProperty("LastActorId")
    public void setLastActorId(String LastActorId) {
        this.LastActorId = LastActorId;
    }

    // ProcessNodeName
    private String ProcessNodeName;

    @JsonProperty("ProcessNodeName")
    public String getProcessNodeName() {
        return this.ProcessNodeName;
    }

    @JsonProperty("ProcessNodeName")
    public void setProcessNodeName(String ProcessNodeName) {
        this.ProcessNodeName = ProcessNodeName;
    }

    // ElapsedTimeInDays
    private Double ElapsedTimeInDays;

    @JsonProperty("ElapsedTimeInDays")
    public Double getElapsedTimeInDays() {
        return this.ElapsedTimeInDays;
    }

    @JsonProperty("ElapsedTimeInDays")
    public void setElapsedTimeInDays(Double ElapsedTimeInDays) {
        this.ElapsedTimeInDays = ElapsedTimeInDays;
    }

    // ElapsedTimeInHours
    private Double ElapsedTimeInHours;

    @JsonProperty("ElapsedTimeInHours")
    public Double getElapsedTimeInHours() {
        return this.ElapsedTimeInHours;
    }

    @JsonProperty("ElapsedTimeInHours")
    public void setElapsedTimeInHours(Double ElapsedTimeInHours) {
        this.ElapsedTimeInHours = ElapsedTimeInHours;
    }

    // ElapsedTimeInMinutes
    private Double ElapsedTimeInMinutes;

    @JsonProperty("ElapsedTimeInMinutes")
    public Double getElapsedTimeInMinutes() {
        return this.ElapsedTimeInMinutes;
    }

    @JsonProperty("ElapsedTimeInMinutes")
    public void setElapsedTimeInMinutes(Double ElapsedTimeInMinutes) {
        this.ElapsedTimeInMinutes = ElapsedTimeInMinutes;
    }

}
