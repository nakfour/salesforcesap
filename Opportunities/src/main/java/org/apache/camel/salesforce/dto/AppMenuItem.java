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
 * Salesforce DTO for SObject AppMenuItem
 */
@XStreamAlias("AppMenuItem")
public class AppMenuItem extends AbstractSObjectBase {

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // Label
    private String Label;

    @JsonProperty("Label")
    public String getLabel() {
        return this.Label;
    }

    @JsonProperty("Label")
    public void setLabel(String Label) {
        this.Label = Label;
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

    // StartUrl
    private String StartUrl;

    @JsonProperty("StartUrl")
    public String getStartUrl() {
        return this.StartUrl;
    }

    @JsonProperty("StartUrl")
    public void setStartUrl(String StartUrl) {
        this.StartUrl = StartUrl;
    }

    // MobileStartUrl
    private String MobileStartUrl;

    @JsonProperty("MobileStartUrl")
    public String getMobileStartUrl() {
        return this.MobileStartUrl;
    }

    @JsonProperty("MobileStartUrl")
    public void setMobileStartUrl(String MobileStartUrl) {
        this.MobileStartUrl = MobileStartUrl;
    }

    // LogoUrl
    private String LogoUrl;

    @JsonProperty("LogoUrl")
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    @JsonProperty("LogoUrl")
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    // IconUrl
    private String IconUrl;

    @JsonProperty("IconUrl")
    public String getIconUrl() {
        return this.IconUrl;
    }

    @JsonProperty("IconUrl")
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    // InfoUrl
    private String InfoUrl;

    @JsonProperty("InfoUrl")
    public String getInfoUrl() {
        return this.InfoUrl;
    }

    @JsonProperty("InfoUrl")
    public void setInfoUrl(String InfoUrl) {
        this.InfoUrl = InfoUrl;
    }

    // IsUsingAdminAuthorization
    private Boolean IsUsingAdminAuthorization;

    @JsonProperty("IsUsingAdminAuthorization")
    public Boolean getIsUsingAdminAuthorization() {
        return this.IsUsingAdminAuthorization;
    }

    @JsonProperty("IsUsingAdminAuthorization")
    public void setIsUsingAdminAuthorization(Boolean IsUsingAdminAuthorization) {
        this.IsUsingAdminAuthorization = IsUsingAdminAuthorization;
    }

    // MobilePlatform
    @XStreamConverter(PicklistEnumConverter.class)
    private MobilePlatformEnum MobilePlatform;

    @JsonProperty("MobilePlatform")
    public MobilePlatformEnum getMobilePlatform() {
        return this.MobilePlatform;
    }

    @JsonProperty("MobilePlatform")
    public void setMobilePlatform(MobilePlatformEnum MobilePlatform) {
        this.MobilePlatform = MobilePlatform;
    }

    // MobileMinOsVer
    private String MobileMinOsVer;

    @JsonProperty("MobileMinOsVer")
    public String getMobileMinOsVer() {
        return this.MobileMinOsVer;
    }

    @JsonProperty("MobileMinOsVer")
    public void setMobileMinOsVer(String MobileMinOsVer) {
        this.MobileMinOsVer = MobileMinOsVer;
    }

    // MobileDeviceType
    private String MobileDeviceType;

    @JsonProperty("MobileDeviceType")
    public String getMobileDeviceType() {
        return this.MobileDeviceType;
    }

    @JsonProperty("MobileDeviceType")
    public void setMobileDeviceType(String MobileDeviceType) {
        this.MobileDeviceType = MobileDeviceType;
    }

    // IsRegisteredDeviceOnly
    private Boolean IsRegisteredDeviceOnly;

    @JsonProperty("IsRegisteredDeviceOnly")
    public Boolean getIsRegisteredDeviceOnly() {
        return this.IsRegisteredDeviceOnly;
    }

    @JsonProperty("IsRegisteredDeviceOnly")
    public void setIsRegisteredDeviceOnly(Boolean IsRegisteredDeviceOnly) {
        this.IsRegisteredDeviceOnly = IsRegisteredDeviceOnly;
    }

    // MobileAppVer
    private String MobileAppVer;

    @JsonProperty("MobileAppVer")
    public String getMobileAppVer() {
        return this.MobileAppVer;
    }

    @JsonProperty("MobileAppVer")
    public void setMobileAppVer(String MobileAppVer) {
        this.MobileAppVer = MobileAppVer;
    }

    // MobileAppInstalledDate
    private org.joda.time.DateTime MobileAppInstalledDate;

    @JsonProperty("MobileAppInstalledDate")
    public org.joda.time.DateTime getMobileAppInstalledDate() {
        return this.MobileAppInstalledDate;
    }

    @JsonProperty("MobileAppInstalledDate")
    public void setMobileAppInstalledDate(org.joda.time.DateTime MobileAppInstalledDate) {
        this.MobileAppInstalledDate = MobileAppInstalledDate;
    }

    // MobileAppInstalledVersion
    private String MobileAppInstalledVersion;

    @JsonProperty("MobileAppInstalledVersion")
    public String getMobileAppInstalledVersion() {
        return this.MobileAppInstalledVersion;
    }

    @JsonProperty("MobileAppInstalledVersion")
    public void setMobileAppInstalledVersion(String MobileAppInstalledVersion) {
        this.MobileAppInstalledVersion = MobileAppInstalledVersion;
    }

    // MobileAppBinaryId
    private String MobileAppBinaryId;

    @JsonProperty("MobileAppBinaryId")
    public String getMobileAppBinaryId() {
        return this.MobileAppBinaryId;
    }

    @JsonProperty("MobileAppBinaryId")
    public void setMobileAppBinaryId(String MobileAppBinaryId) {
        this.MobileAppBinaryId = MobileAppBinaryId;
    }

    // MobileAppInstallUrl
    private String MobileAppInstallUrl;

    @JsonProperty("MobileAppInstallUrl")
    public String getMobileAppInstallUrl() {
        return this.MobileAppInstallUrl;
    }

    @JsonProperty("MobileAppInstallUrl")
    public void setMobileAppInstallUrl(String MobileAppInstallUrl) {
        this.MobileAppInstallUrl = MobileAppInstallUrl;
    }

    // CanvasEnabled
    private Boolean CanvasEnabled;

    @JsonProperty("CanvasEnabled")
    public Boolean getCanvasEnabled() {
        return this.CanvasEnabled;
    }

    @JsonProperty("CanvasEnabled")
    public void setCanvasEnabled(Boolean CanvasEnabled) {
        this.CanvasEnabled = CanvasEnabled;
    }

    // CanvasReferenceId
    private String CanvasReferenceId;

    @JsonProperty("CanvasReferenceId")
    public String getCanvasReferenceId() {
        return this.CanvasReferenceId;
    }

    @JsonProperty("CanvasReferenceId")
    public void setCanvasReferenceId(String CanvasReferenceId) {
        this.CanvasReferenceId = CanvasReferenceId;
    }

    // CanvasUrl
    private String CanvasUrl;

    @JsonProperty("CanvasUrl")
    public String getCanvasUrl() {
        return this.CanvasUrl;
    }

    @JsonProperty("CanvasUrl")
    public void setCanvasUrl(String CanvasUrl) {
        this.CanvasUrl = CanvasUrl;
    }

    // CanvasAccessMethod
    @XStreamConverter(PicklistEnumConverter.class)
    private CanvasAccessMethodEnum CanvasAccessMethod;

    @JsonProperty("CanvasAccessMethod")
    public CanvasAccessMethodEnum getCanvasAccessMethod() {
        return this.CanvasAccessMethod;
    }

    @JsonProperty("CanvasAccessMethod")
    public void setCanvasAccessMethod(CanvasAccessMethodEnum CanvasAccessMethod) {
        this.CanvasAccessMethod = CanvasAccessMethod;
    }

    // CanvasSelectedLocations
    private String CanvasSelectedLocations;

    @JsonProperty("CanvasSelectedLocations")
    public String getCanvasSelectedLocations() {
        return this.CanvasSelectedLocations;
    }

    @JsonProperty("CanvasSelectedLocations")
    public void setCanvasSelectedLocations(String CanvasSelectedLocations) {
        this.CanvasSelectedLocations = CanvasSelectedLocations;
    }

    // CanvasOptions
    private String CanvasOptions;

    @JsonProperty("CanvasOptions")
    public String getCanvasOptions() {
        return this.CanvasOptions;
    }

    @JsonProperty("CanvasOptions")
    public void setCanvasOptions(String CanvasOptions) {
        this.CanvasOptions = CanvasOptions;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // ApplicationId
    private String ApplicationId;

    @JsonProperty("ApplicationId")
    public String getApplicationId() {
        return this.ApplicationId;
    }

    @JsonProperty("ApplicationId")
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

}
