package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerManager {

    @Autowired
    private CustomerAddCounter customerAddCounter1;

    @Autowired
    private CustomerAddCounter customerAddCounter2;

    @Autowired
    private CustomerAddCounter customerAddCounter3;

    public CustomerManager() {
    }

    public void add(final Customer customerParam) {
        this.customerAddCounter1.increase();
        this.customerAddCounter2.increase();
        this.customerAddCounter3.increase();
        System.out.println("Alınan Müşteri  c1 : "
                           + this.customerAddCounter1.getCount()
                           + " c2 : "
                           + this.customerAddCounter2.getCount()
                           + " c3 : "
                           + this.customerAddCounter3.getCount()
                           + " "
                           + customerParam);
    }

}
