package com.training.spring.di;

import org.springframework.stereotype.Component;

@Component
public class HelloEsp implements IHello {

    @Override
    public String hello(final String nameParam) {
        return "Ola " + nameParam;
    }

}
