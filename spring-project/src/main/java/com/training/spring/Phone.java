package com.training.spring;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long     phId;
    private String   name;
    private String   number;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer customer;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    public Long getPhId() {
        return this.phId;
    }

    public void setPhId(final Long phIdParam) {
        this.phId = phIdParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }


}
