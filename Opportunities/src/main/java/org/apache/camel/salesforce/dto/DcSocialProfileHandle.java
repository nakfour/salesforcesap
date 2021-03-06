/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject DcSocialProfileHandle
 */
@XStreamAlias("DcSocialProfileHandle")
public class DcSocialProfileHandle extends AbstractSObjectBase {

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // DcSocialProfileId
    private String DcSocialProfileId;

    @JsonProperty("DcSocialProfileId")
    public String getDcSocialProfileId() {
        return this.DcSocialProfileId;
    }

    @JsonProperty("DcSocialProfileId")
    public void setDcSocialProfileId(String DcSocialProfileId) {
        this.DcSocialProfileId = DcSocialProfileId;
    }

    // ProviderName
    private String ProviderName;

    @JsonProperty("ProviderName")
    public String getProviderName() {
        return this.ProviderName;
    }

    @JsonProperty("ProviderName")
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    // Handle
    private String Handle;

    @JsonProperty("Handle")
    public String getHandle() {
        return this.Handle;
    }

    @JsonProperty("Handle")
    public void setHandle(String Handle) {
        this.Handle = Handle;
    }

}
