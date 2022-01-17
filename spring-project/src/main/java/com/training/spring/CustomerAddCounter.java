package com.training.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CustomerAddCounter {

    private int count = 0;

    public void increase() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

}
