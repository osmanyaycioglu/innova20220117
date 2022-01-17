package com.training.spring.configuration;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.training.spring.Customer;

@Component
@ConfigurationProperties(prefix = "app.store")
public class AppProperties {

    private String                language;
    private String                version;
    private String                desc;
    private String                location;
    private List<String>          phones;
    private Map<String, Customer> customerMap;
    private List<Customer>        customerList;
    private SubProperties         subProperties;

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(final String languageParam) {
        this.language = languageParam;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(final String versionParam) {
        this.version = versionParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(final String locationParam) {
        this.location = locationParam;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(final List<String> phonesParam) {
        this.phones = phonesParam;
    }

    public Map<String, Customer> getCustomerMap() {
        return this.customerMap;
    }

    public void setCustomerMap(final Map<String, Customer> customerMapParam) {
        this.customerMap = customerMapParam;
    }

    public List<Customer> getCustomerList() {
        return this.customerList;
    }

    public void setCustomerList(final List<Customer> customerListParam) {
        this.customerList = customerListParam;
    }

    @Override
    public String toString() {
        return "AppProperties [language="
               + this.language
               + ", version="
               + this.version
               + ", desc="
               + this.desc
               + ", location="
               + this.location
               + ", phones="
               + this.phones
               + ", customerMap="
               + this.customerMap
               + ", customerList="
               + this.customerList
               + "]";
    }

    public SubProperties getSubProperties() {
        return this.subProperties;
    }

    public void setSubProperties(final SubProperties subPropertiesParam) {
        this.subProperties = subPropertiesParam;
    }


}
