package com.training.spring.rest;

import com.training.spring.Customer;

public class CustomerResult {

    private String   description;
    private Integer  test;
    private Customer customer;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    public Integer getTest() {
        return this.test;
    }

    public void setTest(final Integer testParam) {
        this.test = testParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }


}
