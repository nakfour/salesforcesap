/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CombinedAttachment
 */
@XStreamAlias("CombinedAttachment")
public class CombinedAttachment extends AbstractSObjectBase {

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

    // RecordType
    private String RecordType;

    @JsonProperty("RecordType")
    public String getRecordType() {
        return this.RecordType;
    }

    @JsonProperty("RecordType")
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // FileType
    private String FileType;

    @JsonProperty("FileType")
    public String getFileType() {
        return this.FileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    // ContentSize
    private Integer ContentSize;

    @JsonProperty("ContentSize")
    public Integer getContentSize() {
        return this.ContentSize;
    }

    @JsonProperty("ContentSize")
    public void setContentSize(Integer ContentSize) {
        this.ContentSize = ContentSize;
    }

    // FileExtension
    private String FileExtension;

    @JsonProperty("FileExtension")
    public String getFileExtension() {
        return this.FileExtension;
    }

    @JsonProperty("FileExtension")
    public void setFileExtension(String FileExtension) {
        this.FileExtension = FileExtension;
    }

    // ContentUrl
    private String ContentUrl;

    @JsonProperty("ContentUrl")
    public String getContentUrl() {
        return this.ContentUrl;
    }

    @JsonProperty("ContentUrl")
    public void setContentUrl(String ContentUrl) {
        this.ContentUrl = ContentUrl;
    }

    // ExternalDataSourceName
    private String ExternalDataSourceName;

    @JsonProperty("ExternalDataSourceName")
    public String getExternalDataSourceName() {
        return this.ExternalDataSourceName;
    }

    @JsonProperty("ExternalDataSourceName")
    public void setExternalDataSourceName(String ExternalDataSourceName) {
        this.ExternalDataSourceName = ExternalDataSourceName;
    }

}
