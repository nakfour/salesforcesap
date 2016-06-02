/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject IdeaComment
 */
@XStreamAlias("IdeaComment")
public class IdeaComment extends AbstractSObjectBase {

    // IdeaId
    private String IdeaId;

    @JsonProperty("IdeaId")
    public String getIdeaId() {
        return this.IdeaId;
    }

    @JsonProperty("IdeaId")
    public void setIdeaId(String IdeaId) {
        this.IdeaId = IdeaId;
    }

    // CommunityId
    private String CommunityId;

    @JsonProperty("CommunityId")
    public String getCommunityId() {
        return this.CommunityId;
    }

    @JsonProperty("CommunityId")
    public void setCommunityId(String CommunityId) {
        this.CommunityId = CommunityId;
    }

    // CommentBody
    private String CommentBody;

    @JsonProperty("CommentBody")
    public String getCommentBody() {
        return this.CommentBody;
    }

    @JsonProperty("CommentBody")
    public void setCommentBody(String CommentBody) {
        this.CommentBody = CommentBody;
    }

    // IsHtml
    private Boolean IsHtml;

    @JsonProperty("IsHtml")
    public Boolean getIsHtml() {
        return this.IsHtml;
    }

    @JsonProperty("IsHtml")
    public void setIsHtml(Boolean IsHtml) {
        this.IsHtml = IsHtml;
    }

    // CreatorFullPhotoUrl
    private String CreatorFullPhotoUrl;

    @JsonProperty("CreatorFullPhotoUrl")
    public String getCreatorFullPhotoUrl() {
        return this.CreatorFullPhotoUrl;
    }

    @JsonProperty("CreatorFullPhotoUrl")
    public void setCreatorFullPhotoUrl(String CreatorFullPhotoUrl) {
        this.CreatorFullPhotoUrl = CreatorFullPhotoUrl;
    }

    // CreatorSmallPhotoUrl
    private String CreatorSmallPhotoUrl;

    @JsonProperty("CreatorSmallPhotoUrl")
    public String getCreatorSmallPhotoUrl() {
        return this.CreatorSmallPhotoUrl;
    }

    @JsonProperty("CreatorSmallPhotoUrl")
    public void setCreatorSmallPhotoUrl(String CreatorSmallPhotoUrl) {
        this.CreatorSmallPhotoUrl = CreatorSmallPhotoUrl;
    }

    // CreatorName
    private String CreatorName;

    @JsonProperty("CreatorName")
    public String getCreatorName() {
        return this.CreatorName;
    }

    @JsonProperty("CreatorName")
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    // UpVotes
    private Integer UpVotes;

    @JsonProperty("UpVotes")
    public Integer getUpVotes() {
        return this.UpVotes;
    }

    @JsonProperty("UpVotes")
    public void setUpVotes(Integer UpVotes) {
        this.UpVotes = UpVotes;
    }

}
