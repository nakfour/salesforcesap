/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type EmailServicesAddress
 */
public class QueryRecordsEmailServicesAddress extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<EmailServicesAddress> records;

    public List<EmailServicesAddress> getRecords() {
        return records;
    }

    public void setRecords(List<EmailServicesAddress> records) {
        this.records = records;
    }
}
