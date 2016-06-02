/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CollaborationRole
 */
public enum CollaborationRoleEnum {

    // Admin
    ADMIN("Admin"),
    // Standard
    STANDARD("Standard");

    final String value;

    private CollaborationRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationRoleEnum fromValue(String value) {
        for (CollaborationRoleEnum e : CollaborationRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
