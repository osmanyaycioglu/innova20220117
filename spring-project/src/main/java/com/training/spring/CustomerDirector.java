package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDirector {

    private final CustomerManager customerManager;

    //@Autowired(required = false)
    @Autowired
    private CustomerAddCounter cac;

    @Autowired
    public CustomerDirector(final CustomerManager customerManagerParam) {
        this.customerManager = customerManagerParam;
    }

    public void orginizeAdd(final Customer customerParam) {
        this.cac.increase();
        System.out.println("Directing to management " + this.cac.getCount());
        this.customerManager.add(customerParam);
    }

}
