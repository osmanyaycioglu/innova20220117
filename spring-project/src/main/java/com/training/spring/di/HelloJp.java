package com.training.spring.di;

public class HelloJp implements IHello {

    @Override
    public String hello(final String nameParam) {
        return "Koniciva " + nameParam;
    }

}
